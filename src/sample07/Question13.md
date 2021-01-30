Sobre exceções, responda:

**A. Comente os pontos falhos sobre as 3 alternativas de controle de erros
explicadas em sala de aula;**

- Retornar boolean como resultado não dá muitas informações caso a operação falhe e seja retornado `false`, 
como exemplo o método `File.delete()`.
  
- Usar checked exceptions resolve esse problema, mas se usado corretamente eventualmente levará a um método
registrando inúmeras possíveis exceções que ele poderá lançar.

---

**B. Por que o uso de exceções deixa o código mais confiável?**

Em geral, tem-se o controle de possíveis erros e uma forma de manuseá-los. É possível também prevê-los com antecedência.

---

**C. Você concorda que muitos “ifs/else” somem quando se usam exceções?
Exemplifique;**

Sim. Mas muito embora if/else podem sumir, isso não significa que existirá menos código. 
É possível delegar o controle de erro a quem tiver interesse no resultado, e este decide o que fazer. 