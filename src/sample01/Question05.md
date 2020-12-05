> _**Explique detalhadamente qual a saída da execução do trecho de código abaixo e justifique::**_

```java
    public class Exemplo {
        public static void main(String args[]) {
            int a = 10;
            int b = 1;
            System.out.println("Soma: " + a + b);
        }
    }
```

---

```java
    public class Exemplo {
        public static void main(String args[]) {
            int a = 10;
            int b = 1;
            System.out.println("Soma: " + (a + b));
        }
    }
```

Ao adicionar parênteses clarificadores o compilador pode entender que não 
é a intenção fazer concatenação da string `Soma` com `a` e `b` e sim `Soma` com `a` somado de `b`.
