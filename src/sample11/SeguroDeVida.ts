import { Tributavel } from "./Tributavel";

export class SeguroDeVida implements Tributavel {
  calcularTributo(): number {
    return 50;
  }
}
