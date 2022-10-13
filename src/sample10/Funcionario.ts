abstract class Funcionario {
  protected salario: number;

  constructor(s: number) {
    this.salario = s;
  }

  abstract getBonificacaio(): number;
}

class Gerente extends Funcionario {
  getBonificacaio(): number {
    return this.salario * 0.4;
  }
}

class Diretor extends Funcionario {
  getBonificacaio(): number {
    return this.salario * 0.6;
  }
}

class Presidente extends Funcionario {
  getBonificacaio(): number {
    return this.salario + 1000;
  }
}
