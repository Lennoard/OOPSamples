Pesquise na internet prós e contras de exceções checadas e não checadas e
proponha um exemplo de cada uma.

###Exceções checadas
```java
try {
    Class<Classe> c = Class.forName("com.exemplo.Classe");
} catch (ClassNotFoundException e) {
    Logger.log(e); 
}
```

###Exceções não checadas
```java
double dividir(double x, double y) {
    if (Double.isNaN(x) || Double.isNaN(y)) {
        throw new RuntimeException("Valores invalidos");
    }
    if (y == 0) {
        throw new RuntimeException("Divisão por 0");    
    }
    return x / y; // ArithmeticException
}
```
---
Na aplicação bancária, caso a nossa
AplicacaoException herde da classe Exception em vez de RuntimeException.
Como os métodos deverão ser alterados para que sumam os erros de
compilação? Apenas teste a alteração e desfaça-a.

*Deverá ser usado `try-catch`* 