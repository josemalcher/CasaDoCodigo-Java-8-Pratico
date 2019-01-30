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
