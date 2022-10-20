import { Tributavel } from "./Tributavel";

export class AuditoriaInterna {
  tributaveis: Tributavel[];

  constructor(tributaveis: Tributavel[]) {
    this.tributaveis = tributaveis;
  }

  adicionar(t: Tributavel): void {
    this.tributaveis.push(t);
  }

  calcularTributos(): number {
    return this.tributaveis
      .map((t) => t.calcularTributo())
      .reduce((sum, curr) => sum + curr);
  }
}
