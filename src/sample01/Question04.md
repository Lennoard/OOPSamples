> _**Explique detalhadamente qual a saída da execução do trecho de código abaixo e justifique::**_

```java
    int op = 1;
    switch (op) {
         case 1: System.out.println(op);
         case 2: System.out.println(op);
         default:System.out.println(op);
    }
```

---

Saída:<br>
1 
<br>
1 
<br>
1 
<br> 
pois não há `break`'s em cada `case` dessa forma levando à execução de cada declaração dentro do `switch`. 
