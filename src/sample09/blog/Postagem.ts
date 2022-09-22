export class Postagem {
  id: number;
  texto: String;
  quantidadeCurtidas: number;

  constructor(id: number, texto: String, quantidadeCurtidas: number) {
    this.id = id;
    this.texto = texto;
    this.quantidadeCurtidas = quantidadeCurtidas;
  }

  curtir(): void {
    this.quantidadeCurtidas++;
  }

  toString(): String {
    return this.texto + " /likes: " + this.quantidadeCurtidas;
  }
}
