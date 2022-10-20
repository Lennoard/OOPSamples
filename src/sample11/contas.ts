import { Tributavel } from "./Tributavel";

export class Conta {
  nome: string;
  saldo: number;

  constructor(nome: string, saldo: number) {
    this.nome = nome;
    this.saldo = saldo;
  }
}

export class ContaCorrente extends Conta implements Tributavel {
  calcularTributo(): number {
    return this.saldo * 0.5;
  }
}
