# Java 8 Prático

https://www.casadocodigo.com.br/pages/sumario-java8

Lambdas, Streams e os novos recursos da linguagem 

## <a name="indice">Índice</a>

1. [Java 8](#parte1)     
2. [Olá, Lambda!](#parte2)     
3. [Interfaces funcionais](#parte3)     
4. [Default Methods](#parte4)     
5. [Ordenando no Java 8](#parte5)     
6. [Method References](#parte6)     
7. [Streams e Collectors](#parte7)     
8. [Mais operações com Streams](#parte8)     
9. [Mapeando, particionando, agrupando e paralelizando](#parte9)     
10. [Chega de Calendar! Nova API de datas](#parte10)     
11. [Um modelo de pagamentos com Java 8](#parte11)     
12. [Apêndice: mais Java 8 com reflection, JVM, APIs e limitações](#parte12)     
13. [Continuando seus estudos](#parte13)     
---


## <a name="parte1">1 - Java 8</a>

- http://www.oracle.com/technetwork/java/javase/downloads/

E pode acessar seu javadoc aqui:

- http://download.java.net/jdk8/docs/api/index.html

O código-fonte para cada capítulo pode ser encontrado aqui:

-https://github.com/peas/java8

Há uma lista de discussão por onde você pode conversar com a gente, mandar sugestões, críticas e melhorias:

- https://groups.google.com/forum/#!forum/java8-casadocodigo

Se preferir, você pode tirar dúvidas no fórum do GUJ:

- http://www.guj.com.br/

[Voltar ao Índice](#indice)

---


## <a name="parte2">2 - Olá, Lambda!</a>

- 2.1 Loops da maneira antiga e da maneira nova

```java
package cap2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Aplication {

	public static void main(String... args) {
		
		Usuario user1 = new Usuario("José Malcher Jr", 200);
		Usuario user2 = new Usuario("Luciana Barbosa", 400);
		Usuario user3 = new Usuario("Mario", 140);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		for(Usuario u: usuarios) {
			System.out.println(u.getNome());
		}
		
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});
		
	}

}

```

- 2.2 Que entre Lambda!

```java
package cap2;

import java.util.function.Consumer;

public class Aplication {

	public static void main(String... args) {

		Usuario user1 = new Usuario("José Malcher Jr", 200);
		Usuario user2 = new Usuario("Luciana Barbosa", 400);
		Usuario user3 = new Usuario("Mario", 140);

		//List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		/*
		 * for(Usuario u: usuarios) { System.out.println(u.getNome()); }
		 * 
		 * usuarios.forEach(new Consumer<Usuario>() { public void accept(Usuario u) {
		 * System.out.println(u.getNome()); } });
		 */

		/*Consumer<Usuario> mostrador = (Usuario u) -> {
			System.out.println(u.getNome());
		};*/
		
		//Consumer<Usuario> mostrador = u->{System.out.println(u.getNome());};
		
		Consumer<Usuario> mostrador = u -> System.out.println(u.getNome()); 
		
		
	}
}

```


[Voltar ao Índice](#indice)

---


## <a name="parte3">3 - Interfaces funcionais</a>



[Voltar ao Índice](#indice)

---


## <a name="parte4">4 - Default Methods</a>



[Voltar ao Índice](#indice)

---


## <a name="parte5">5 - Ordenando no Java 8</a>



[Voltar ao Índice](#indice)

---


## <a name="parte6">6 - Method References</a>



[Voltar ao Índice](#indice)

---


## <a name="parte7">7 - Streams e Collectors</a>



[Voltar ao Índice](#indice)

---


## <a name="parte8">8 - Mais operações com Streams</a>



[Voltar ao Índice](#indice)

---


## <a name="parte9">9 - Mapeando, particionando, agrupando e paralelizando</a>



[Voltar ao Índice](#indice)

---


## <a name="parte10">10 - Chega de Calendar! Nova API de datas</a>



[Voltar ao Índice](#indice)

---


## <a name="parte11">11 - Um modelo de pagamentos com Java 8</a>



[Voltar ao Índice](#indice)

---


## <a name="parte12">12 - Apêndice: mais Java 8 com reflection, JVM, APIs e limitações</a>



[Voltar ao Índice](#indice)

---


## <a name="parte13">13 - Continuando seus estudos</a>



[Voltar ao Índice](#indice)

---
