import { Conta } from "./conta/Conta";
import { Poupanca } from "./conta/Poupanca";
import { ContaInexistenteError, PoupancaInvalidaError } from "./conta/Errors";

export class Banco {
  private _contas: Conta[] = [];

  inserir(conta: Conta): void {
    this.consultar(conta.numero);
    this._contas.push(conta);
  }

  consultar(numero: String): Conta {
    let contaConsultada: Conta | null = null;
    for (let conta of this._contas) {
      if (conta.numero == numero) {
        contaConsultada = conta;
        break;
      }
    }

    if (!contaConsultada) {
      throw new ContaInexistenteError();
    }
    return contaConsultada;
  }

  private consultarPorIndice(numero: String): number {
    let indice: number = -1;
    for (let i = 0; i < this._contas.length; i++) {
      if (this._contas[i].numero == numero) {
        indice = i;
        break;
      }
    }
    return indice;
  }

  alterar(conta: Conta): void {
    let indice = this.consultarPorIndice(conta.numero);
    this._contas[indice] = conta;
  }

  excluir(numero: string): void {
    let indice: number = this.consultarPorIndice(numero);

    if (indice != -1) {
      for (let i: number = indice; i < this._contas.length; i++) {
        this._contas[i] = this._contas[i + 1];
      }

      this._contas.pop();
    }
  }

  depositar(numero: String, valor: number): void {
    let contaConsultada = this.consultar(numero);
    contaConsultada.depositar(valor);
  }

  sacar(numero: String, valor: number): void {
    let contaConsultada = this.consultar(numero);
    contaConsultada.sacar(valor);
  }

  transferir(numeroDebito: string, numeroCredito: string, valor: number) {
    let contaCredito: Conta = this.consultar(numeroCredito);
    let contaDebito: Conta = this.consultar(numeroDebito);
    contaDebito.transferir(contaCredito, valor);
  }

  calcularQuantidadeContas(): number {
    return this._contas.length;
  }

  calcularTotalSaldos(): number {
    let totalSaldo: number = 0;
    for (let conta of this._contas) {
      totalSaldo += conta.saldo;
    }

    return totalSaldo;
  }

  calcularMediaSaldos() {
    return this.calcularTotalSaldos() / this.calcularQuantidadeContas();
  }

  renderJuros(numero: String) {
    let contaConsultada: Conta = this.consultar(numero);
    console.log(contaConsultada instanceof Poupanca)

    if (!(contaConsultada instanceof Poupanca)) {
      throw new PoupancaInvalidaError();
    }

    if (contaConsultada instanceof Poupanca) {
      let poupanca: Poupanca = <Poupanca>contaConsultada;
      poupanca.renderJuros();
    }
  }
}
