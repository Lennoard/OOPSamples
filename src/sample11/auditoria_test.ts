import { Conta, ContaCorrente } from "./contas";
import { Tributavel } from "./Tributavel";
import { SeguroDeVida } from "./SeguroDeVida";
import { AuditoriaInterna } from "./AuditoriaInterna";

let tributaveis: Tributavel[] = [];
for (let s = 100; s <= 120; s++) {
  tributaveis.push(new ContaCorrente('c', s));
}

for (let i = 0; i <= 10; i++) {
  tributaveis.push(new SeguroDeVida());
}

let auditoria: AuditoriaInterna = new AuditoriaInterna(tributaveis);
console.log("Trubutos:", auditoria.calcularTributos());