import { BaseMilitar } from "./BaseMilitar";
import { CenarioDeBatalha } from "./CenarioDeBatalha";
import { Guerreiro } from "./Guerreiro";
import { Localizacao } from "./Localizacao";

let g1 = new Guerreiro(0, "", 100);
let g2 = new Guerreiro(1, "", 15);
let g3 = new Guerreiro(2, "", 20);
let g4 = new Guerreiro(3, "", 25);

let b1 = new BaseMilitar(0, new Localizacao(0, 0), 20);
let b2 = new BaseMilitar(1, new Localizacao(0, 0), 40);
let b3 = new BaseMilitar(2, new Localizacao(0, 0), 5);
let b4 = new BaseMilitar(3, new Localizacao(0, 0), 30);

g1.atacar(b3);
try {
    g2.atacar(b3);
} catch(e) {
    console.log(`Não foi possível atacar: ${e}`)
}

b3.defenderAtaque(50);
g4.atacar(b1);
b1.defenderAtaque(12);
g3.atacar(b2);
g3.atacar(b1);
g3.atacar(b4);
g2.atacar(b4);
b4.defenderAtaque(100);
g3.atacar(b1);


let cenario = new CenarioDeBatalha();
let avaliacao = cenario.avaliar([g1, b2, g3, b4], [b1, g2, b3, g4])

console.log(avaliacao);