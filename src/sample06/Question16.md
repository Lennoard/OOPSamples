> _**Dada a classe abaixo:.**_

```java
public class B {     
    public String metodo1() {
        return "metodo 1 da classe B";
    }
    public String metodo1() {
        return "metodo 1 da classe B, segunda versão";
    }
    ...
}
```
Justifique por que o código acima não é compilável.

*Foi feita uma redeclaração do `metodo1()` ao invés de uma sobrecarga*.
