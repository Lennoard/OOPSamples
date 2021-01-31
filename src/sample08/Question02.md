###Explique o que é necessário para que a compilação da ClasseConcreta ocorra sem erros:

```java
public abstract class ClasseAbstrata {
    public abstract void imprimaAlgo() ;
}
```
---
```java
public class ClasseConcreta extends ClasseAbstrata {
    
}
```
---
`ClasseConcreta` herda de `ClasseAbstrata` portanto deve implementar o método `imprimaAlgo()`.
