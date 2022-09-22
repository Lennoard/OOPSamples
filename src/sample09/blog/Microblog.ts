import { Postagem } from "./Postagem";

export class Microblog {
  postagens: Postagem[] = [];

  incluir(postagem: Postagem): void {
    this.postagens.push(postagem);
  }

  obterPostagemMaisCurtida(): Postagem | null {
    let postagem: Postagem | null = null;
    let maxCurtidas = 0;
    for (let i: number = 0; i < this.postagens.length; i++) {
      if (this.postagens[i].quantidadeCurtidas > maxCurtidas) {
        postagem = this.postagens[i];
      }
    }
    return postagem;
  }

  toString(): String {
    let postagensString: String = "";
    for (let i: number = 0; i < this.postagens.length; i++) {
      postagensString += this.postagens[i].toString() + "\n";
    }
    return postagensString;
  }

  consultar(id: number): Postagem | null {
    let postagemConsultada: Postagem | null = null;
    for (let postagem of this.postagens) {
      if (postagem.id == id) {
        postagemConsultada = postagem;
        break;
      }
    }
    return postagemConsultada;
  }

  curtir(id: number): void {
    let postagemConsultada: Postagem | null = this.consultar(id);

    if (postagemConsultada != null) {
      postagemConsultada.curtir();
    }
  }
}
