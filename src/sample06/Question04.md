> _**Dado o código abaixo, diga qual o problema e qual a solução para que se
possa definir a produção de leite.**_

```java
    Animal a = new Bovino();
    a.setProducaoLeite(5);
```

O tipo declarado de `a` é `Animal` que não possui o método `setProducaoLeite()`. Para solucionar deve-se declarar a variável com o tipo receptor `Bovino`.


---

> _**O código abaixo é possível? Justifique.**_
> 
```java
    Peixe p = new Animal();
```

Não é possível. `Animal` não é `Peixe` ou subclasse de `Peixe`.
