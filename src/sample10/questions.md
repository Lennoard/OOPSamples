
### 1. Podemos instanciar classes abstratas? Justifique.
Não. Classes abstratas só existem no conceito, a instanciação fica a cargo das implementações concretas.

### 2. Explique o que é necessário para que a compilação da ClasseConcreta ocorra sem erros:
```typescript
abstract  class  ClasseAbstrata {
	abstract  imprimaAlgo(): void ;
}

class  ClasseConcreta  extends  ClasseAbstrata {
	
}
```

A classe `ClasseConcreta` deve ser declarada a abstrata ou implementar o método `imprimaAlgo` da classe pai.

  

### 3. Se uma classe que herda de uma abstrata e não implementa os seus métodos, o que ocorre?
Considerando que os métodos em questão são métodos abstratos, erro de compilação (ts)

### 4. Imagine que você deve modelar várias figuras geométricas em TypeScript e que cada uma tem sua forma específica de calcular área e perímetro. Proponha e implemente uma hierarquia de classes usando uma classe abstrata chamada FiguraGeometrica e outras concretas: Quadrado, Triângulo, etc.		
```typescript
abstract  class  FiguraGeometrica {
	abstract  calcularArea(): number;
	abstract  calcularPerimetro(): number;
}

class  Quadrado  extends  FiguraGeometrica {
	private  lado: number;
	
	constructor(l: number) {
		super();
		this.lado = l;
	}

	calcularArea(): number {
		return  Math.pow(this.lado, 2);
	}

	calcularPerimetro(): number {
		return 4 * this.lado;
	}
}

class  Circulo  extends  FiguraGeometrica {
	private  r: number;
	
	constructor(r: number) {
		super();
		this.r = r;
	}

	calcularArea(): number {
		return  Math.PI * Math.pow(this.r, 2);
	}

	calcularPerimetro(): number {
		return  2 * Math.PI * this.r;
	}
}
```

### 5. Não podemos aplicar o operador new em FiguraGeometrica, mas por que então podemos dar new em FiguraGeometrica[10], por exemplo?
Não houve instanciação de verdade da classe FiguraGeometrica, apenas do array.