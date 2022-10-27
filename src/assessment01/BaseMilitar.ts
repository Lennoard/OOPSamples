import { Defensivel } from "./Defensivel";
import { Localizacao } from "./Localizacao";

export class BaseMilitar implements Defensivel {
  id: number;
  localizacao: Localizacao = new Localizacao(0, 0);
  percentualDano: number = 0;

  constructor(id: number, localizacao: Localizacao, dano: number) {
    this.id = id;
    this.localizacao = localizacao;
    this.percentualDano = dano;
  }
  
  estaEliminado(): boolean {
    return this.percentualDano >= 90;
  }

  defenderAtaque(valorAtaque: number): void {
    this.percentualDano += valorAtaque;
  }

}
