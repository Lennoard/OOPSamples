Considere as classes A e B abaixo para as 4 próximas questões:

```java
public class A {
    private int atributo1;
    public String metodo1() {
        return "metodo 1, classe A";
    }
}
```

```java
public class B extends A {
    public String metodo1() {
        return "metodo 1, classe B";
    }
    public String metodo2() {
        return "metodo 2, classe B";
    }
}
```


11. Marque V ou F:
    
```
(V) em uma instancia b da classe B, se fizermos b instanceof A retorna true
(V) em uma instancia a da classe A, se fizermos a instanceof B retorna false
(F) B possui o atributo1
(V) Em B o atributo não é visível
(V) Caso o atributo fosse modificado de private para protected, poderia ser
    acessado normalmente em B
```
---

12. Qual a exibição do código abaixo:
```java 
A a = new B();
System.out.println(a.metodo1());
```

*"metodo 1, classe B"*

---

13.Diga o que ocorre com o código abaixo e justifique:
```java 
A a = new B();
System.out.println(a.metodo2());
```

*Erro de compilação pois `método2()` não existe na classe `A`.*

---

14. Caso a classe B fosse reescrita conforme abaixo:
```java 
public class B extends A {
    public String metodo1() {
        return super.metodo1();
    }
}
```
Qual seria a nova saída do código da questão 2?


*"metodo 1, classe A"*


