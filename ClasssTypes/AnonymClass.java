package ClasssTypes;

public class AnonymClass {

	public static void main(String[] args) {
		Calculator c = new Calculator() {

			@Override
			public void add(int a, int b) {
				System.out.println(a + b);

			}

		};

		c.add(10, 20);

	}

	
}

interface Calculator {
	public void add(int a, int b);
}