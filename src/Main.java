
public class Main {
	public static void main(String[] args) {
		String name = "Gabriel";
		int age = 26;
		double height = 1.77;
		boolean enrolled = true;
		String message = "Olá! Eu me chamo " + name + " e tenho " + age + " anos de idade e " + height + " metros de altura.";
		System.out.println(message);

		if (enrolled) {
			System.out.println("Estou matriculado no curso.");
		} else {
			System.out.println("Não estou matriculado no curso.");
		}

	}

}
