Proponha um exemplo onde haja a captura de dois tipos de exceção e ainda um
bloco finally conforme a estrutura abaixo:

```java
try {
    // executa até l onde ocorrer exceção
} catch (TipoExcecao1 ex) {
    // executa somente se ocorrer TipoExcecao1
} catch (TipoExcecao2 ex) {
    // executa somente se ocorrer TipoExcecao2
} finally {
    // executa sempre, mesmo sem exceção ...
}
```
---

```java
BufferedReader r = null;
URL url = new URL("http://www.google.com");
try {
    r = new BufferedReader(new InputStreamReader(url.openStream()));
    String l;
    while ((l = r.readLine()) != null) {
        System.out.println(l);
    }
} catch (MalformedURLException mfe) {
    System.err.println("URL invalida");
} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        if (r != null) {
            r.close();
        }
    } catch (Exception ignored) { }
}
```

---

No exemplo acima, caso TipoExcecao2 herde de TipoExcecao1, o que ocorrerá?

A execução nunca cairá no catch `TipoExecao2`