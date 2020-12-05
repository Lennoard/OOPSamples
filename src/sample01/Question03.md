> _**Explique detalhadamente o resultado após a execução abaixo do código:**_

```java
    public class Exemplo {
        public static void main(String[] args) {
            int a = 9;
            int b = 0;
            if ((a > 11) && (++b <= 100)){
                System.out.println(a*b);
            } else {
                System.out.println(a-b);
            }
        }
    }
```

---

 A expressão dentro de if será avaliada com verdadeira pois:
 - a (9) > 11 == true
 - ++b (1) <= 100 == true
 
 Será impresso no console `9` a partir do `9 * 1`