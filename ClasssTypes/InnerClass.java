package ClasssTypes;

public class InnerClass {
	
	public static void main(String[]args) {
		Car.Engine obj = new Car().new Engine("Rohan",10);
		Car c = new Car("BMW",obj);
		System.out.println(c);
	}

}

class Car{
	
	 class Engine{
		private String name;
        private int hp;
	public Engine(String name, int hp) {
			super();
			this.name = name;
			this.hp = hp;
			
		}
		@Override
		public String toString() {
			return "Engine [name=" + name + ", hp=" + hp + "]";
		}

		
	}
	
	private String Carname;
	public Engine eng;
	public Car() {};
	
	
	public Car(String carname, Engine eng) {
		super();
		Carname = carname;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Car [Carname=" + Carname + ", eng=" + eng + "]";
	}
	
	
}
