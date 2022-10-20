import { IComparavel } from "./comparable";

export interface FiguraGeometrica extends IComparavel {
  calcularArea(): number;
  calcularPerimetro(): number;
}

export class Quadrado implements FiguraGeometrica {
  private lado: number;

  constructor(l: number) {
    this.lado = l;
  }

  calcularArea(): number {
    return Math.pow(this.lado, 2);
  }

  calcularPerimetro(): number {
    return 4 * this.lado;
  }

  comparar(f: FiguraGeometrica): number {
    let thisArea = this.calcularArea();
    let thatArea = f.calcularArea();

    if (thisArea === thatArea) return 0;
    if (thisArea > thatArea) return 1;
    return -1;
  }
}

export class Circulo implements FiguraGeometrica {
  private r: number;

  constructor(r: number) {
    this.r = r;
  }

  calcularArea(): number {
    return Math.PI * Math.pow(this.r, 2);
  }

  calcularPerimetro(): number {
    return 2 * Math.PI * this.r;
  }

  comparar(f: FiguraGeometrica): number {
    let thisArea = this.calcularArea();
    let thatArea = f.calcularArea();

    if (thisArea === thatArea) return 0;
    if (thisArea > thatArea) return 1;
    return -1;
  }
}
