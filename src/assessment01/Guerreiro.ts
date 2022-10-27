// who won, loop thru arrays

import { Defensivel } from "./Defensivel";
import { JaEliminadoException } from "./utils/errors";

export class Guerreiro implements Defensivel {
  id: number;
  descricao: string;
  forcaAtaque: number;
  private life: number = 10;

  constructor(id: number, descicao: string, forca: number) {
    this.id = id;
    this.descricao = descicao;
    this.forcaAtaque = forca;
  }

  estaEliminado(): boolean {
    return this.life == 0;
  }

  defenderAtaque(valorAtaque: number): void {
    if (valorAtaque > this.life) {
      this.life = 0;
      return;
    }

    this.life -= valorAtaque;
  }

  atacar(defensivel: Defensivel) {
    if (defensivel.estaEliminado()) {
      throw new JaEliminadoException();
    }
    defensivel.defenderAtaque(this.forcaAtaque)
  }
}
