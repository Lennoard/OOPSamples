import { Banco } from "./Banco";
import { Conta } from "./conta/Conta";
import { Poupanca } from "./conta/Poupanca";
import { AplicacaoError } from "./conta/Errors";

import * as readline from "readline";

let rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let banco: Banco = new Banco();

async function main() {
  var option: string = "";

  do {
    try {
      printMenu();
      option = await input("Insira a opção: ");
      switch (option) {
        case "1":
          insert();
          break;
        case "2":
          query();
          break;
        case "3":
          update();
          break;
        case "4":
          del();
          break;
        case "5":
          deposit();
          break;
        case "6":
          withdraw();
          break;
        case "7":
          transfer();
          break;
        case "8":
          accoutsCount();
          break;
        default:
          throw new AplicacaoError("Opção inválida");
      }
    } catch (e) {
      if (e instanceof AplicacaoError) {
        console.log(e.message);
      }

      if (e instanceof Error) {
        console.log("Erro no sistema. Contate o administrador.");
      }
    } finally {
      console.log("Operação finalizada. Digite 9 para sair");
    }
  } while (option != "12");
}

function printMenu() {
  console.log(`
        1 - Inserir
        2 - Consultar
        3 - Alterar
        4 - Excluir
        5 - Depositar
        6 - Sacar
        7 - Transferir
        8 - Total contas
        9 - Saldo total contas
        10 - Média de saldos
        11 - Render juros
        12 - Sair
    `);
}

async function getAccountByNumber() {
  let n = await input("Número: ");
  return banco.consultar(n);
}

async function insert() {
  let conta = await getAccountByNumber();
  banco.inserir(conta);
  console.log("Conta inserida");
}

async function query() {
  let conta = await getAccountByNumber();
  console.log("Conta ->", conta);
}

async function update() {
  let conta = await getAccountByNumber();
  banco.alterar(conta);
  console.log("Conta alterada ->", conta);
}

async function del() {
  let n = await input("Número: ");
  banco.excluir(n);
  console.log("Conta excluída ->", n);
}

async function deposit() {
  let n = await input("Número da conta: ");
  let valor = Number(await input("Valor do depósito: "));
  banco.depositar(n, valor);
}

async function withdraw() {
  let n = await input("Número da conta: ");
  let valor = Number(await input("Valor do saque: "));
  banco.sacar(n, valor);
}

async function transfer() {
  let n1 = await input("Número da conta debitada: ");
  let n2 = await input("Número da conta creditada: ");
  let valor = Number(await input("Valor da transferência: "));
  banco.transferir(n1, n2, valor);
}

async function accoutsCount() {
  console.log("Quantidade de contas: ", banco.calcularQuantidadeContas())
}

async function saldoContas() {
  console.log("Total saldos: ", banco.calcularTotalSaldos())
}

const input = (msg: string) =>
  new Promise<string>((resolve) => rl.question(msg, resolve)).finally(() =>
    rl.close()
  );

main();
