import { BaseMilitar } from "./BaseMilitar";
import { Defensivel } from "./Defensivel";
import { Guerreiro } from "./Guerreiro";

interface DefensivelPeso {
  quantidade: number;
  peso: number;
}

export class CenarioDeBatalha {
  avaliar(d1: Defensivel[], d2: Defensivel[]): string {
    let d1Derrubados = d1.filter((d) => {
        return d.estaEliminado()
    });
    let d2Derrubados = d2.filter((d) => {
        return d.estaEliminado()
    });

    let d1Pesos = d1.map((d) => {
      return {
        quantidade: d1Derrubados.length,
        peso: d instanceof Guerreiro ? 1 : 2,
      } as DefensivelPeso;
    });

    let d2Pesos = d2.map((d) => {
      return {
        quantidade: d1Derrubados.length,
        peso: d instanceof Guerreiro ? 1 : 2,
      } as DefensivelPeso;
    });

    let d1Pontos = this.mediaPonderada(d1Pesos);
    let d2Pontos = this.mediaPonderada(d2Pesos);
    let empate = d1Pontos == d2Pontos;
    let vencedor = empate ? "Empate" : d1Pontos > d2Pontos ? "D1" : "D2";

    return `
        Pontos D1: ${d1Pontos}, derrubados: ${d1Derrubados.length}
        Pontos D2: ${d2Pontos}, derrubados: ${d2Derrubados.length}
       
        Vencedor: ${vencedor}
    `;
  }

  mediaPonderada(pesos: DefensivelPeso[]): number {
    let a = 0;
    let b = 0;
    pesos.forEach((peso, i) => {
      a += i * peso.peso;
      b += peso.peso;
    });

    return a / b;
  }
}
