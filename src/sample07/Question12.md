Descreva e justifique o que acontece no método main abaixo:

```java
public class Teste {
    public static void main(String args[]) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e2) {
                System.out.print("A");
            }
            System.out.print("B");
        }
        System.out.print("C");
    }
}
```
---

Quando o programa é executado, dentro de um bloco `try`, `RuntimeException`
é lançado pelo programa, e pego em um bloco `catch` especializado. Dentro deste, 
outra RuntimeException é lançada e pega em sequência, desta vez printando “A” no stream de saída. 
O processo se repete pritando “B”. Após isso, “C” é printado até que seja mostrado “ABC”. O programa então se encerra normalmente. 