## Questão 1
_Suponha uma classe Hotel que sirva apenas para guardar a quantidade de
solicitações de reservas feitas conforme a classe abaixo:_

```java
public class Hotel {
    int quantReservas;
    void adicionarReserva() {
        quantReservas++;
    }
} 
```
_Podemos afirmar que haverá um problema de compilação, pois a variável inteira não
foi inicializada previamente? Justifique_.

Não haverá erro de compilação pos a variável `quantReservas` será inicializada com 0.

---

## Questão 2
_Ainda sobre a classe do exemplo anterior, considere o método main abaixo:_

```java
public static void main(String args[]) {
    Hotel hotel = new Hotel(2);
    System.out.print(hotel.quantReservas);
}
```
_Qual o resultado da compilação e/ou execução da classe que tenha o método acima?
 Justifique_.

Haverá erro de compilação, pois a classe `Hotel` não possui um construtor que aceite um parâmetro do tipo `int`.

---

## Questão 3
_Qual o resultado da execução abaixo. Justifique._

```java
public class Teste {
    int b = 1;
    int a;

    Teste(int a) {
        a = b + a;
        System.out.print(this.a);
    }

    public static void main(String args[]) {
        Teste t = new Teste(2);
    }
}
```
Será mostrado `0` no console. A atribuição no construtor ocorre apenas ao objeto `a` 
passado como parâmetro, não sendo atrubuído ao objeto `a` da classo pois não foi utilizado o `this`.

---

## Questão 4
_Dado o seguinte trecho de código de acumulação de um atributo valor, explique a
 problemática envolvida e reescreva o método com uma solução._

```java
void x(double valor) {
    valor = valor + valor;
}
```
É possível reescrever o método usando o operador de atribuição.
```java
double x(double valor) {
    return valor += valor;
}
```

---

## Questão 5
_Considere as classes Radio e TestaRadio abaixo._

```java
public class Radio {
    int volume;
    Radio(int volume) {
        this.volume = volume;
    }
}
```
```java
public class TestaRadio {
    public static void main(String[] args) {
        Radio r = new Radio();
        r.volume = 10;
    }
}
```
_Justifique o erro de compilação na classe TestaRadio e proponha uma solução._

```java
public class TestaRadio {
    public static void main(String[] args) {
        Radio r = new Radio(10);
    }
}
```
O construtor padrão da Classe `Radio` requer um argumento do tipo `int`.

---

## Questão 6
_Considerando o uso da classe Conta abaixo em uma classe com o método main():_

```java
public static void main(String[] args) {
    Conta c1 = new Conta("1",100);
    Conta c2 = new Conta("2",100);
    c1 = c2;
    c1.sacar(10);
    c1.tranferir(c2,50);

    System.out.println(c1.saldo);
    System.out.println(c2.saldo);
}
```

Qual o resultado dos dois "prints"? Justifique sua resposta.
- Ambos vão mostar o valor 90.

O que acontece com o objeto para o qual a referência c1 aponta?
- Será processo pelo garbage collector.


---

