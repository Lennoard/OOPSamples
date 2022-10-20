import { FiguraGeometrica, Quadrado, Circulo } from "./geometrics";

let figuras: FiguraGeometrica[] = [];
for (let l = 1; l <= 6; l++) {
  figuras.push(new Quadrado(l));
}

for (let r = 2; r <= 12; r++) {
  figuras.push(new Circulo(r));
}

figuras.forEach((f) => {
  console.log("Área:", f.calcularArea());
  console.log("Perímetro:", f.calcularPerimetro());
});

console.log(figuras[0].comparar(figuras[1]));
console.log(figuras[5].comparar(figuras[2]));