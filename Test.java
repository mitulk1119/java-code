package Switch;

public class Test {

	public static void main(String[] args) {
//		Car car = new Car();
//		car.setModel("porsche");
//		System.out.println("the  car model is " + car.getModel());
		// System.out.println("----------------------------------");

//		Arithmatic arithmatic = new Arithmatic();
//		arithmatic.setFirstNumber(10);
//		arithmatic.setSecondNumber(0);
//		System.out.println("the addition is " + arithmatic.getAdditionResult());
//		System.out.println("the subtraction is " + arithmatic.getSubtractionResult());
//		System.out.println("the multiplication is " + arithmatic.getMultiplicationResult());
//		System.out.println("the division is " + arithmatic.getDivisionResult());
		// System.out.println("----------------------------------");

//		Account john = new Account();// (12345, 100.0, "John Walker", "john@gmail.com", "(123)-123-4567");
//		System.out.println(john.getAccountNumber());
//		System.out.println(john.getAccountBalance());
//		System.out.println(john.getCustomerName());
//		System.out.println(john.getCustomerEmailAddress());
//		System.out.println(john.getCustomerPhoneNumber());
//		john.withdraw(100.0);
//		john.deposit(50);
//		john.withdraw(100.0);
//		john.deposit(51);
//		john.withdraw(100.0);
//		Account mike = new Account("mike", "mike@gmail.com", "(123)-987-6543");
//		System.out.println(mike.getCustomerPhoneNumber() + "name " + mike.getCustomerName());
		// System.out.println("----------------------------------");

//		VipCustomer person1 = new VipCustomer();
//		System.out.println(person1.getName());
//
//		VipCustomer person2 = new VipCustomer("mike", 1000);
//		System.out.println(person2.getName());
//
//		VipCustomer person3 = new VipCustomer("john", 100, "mike@email.com");
//		System.out.println(person3.getName());
		// System.out.println("----------------------------------");

		Wall wall1 = new Wall(-1.25, -1.25);
		System.out.println("area of wall 1= " + wall1.getArea());
		System.out.println("----------------------------------");

		Wall wall2 = new Wall(1.25, -1.0);
		System.out.println("area of wall 2= " + wall2.getArea());
		System.out.println("----------------------------------");

		Wall wall = new Wall(5, 4);
		System.out.println("area of wall= " + wall.getArea());
		System.out.println("----------------------------------");
		wall.setHeight(-1.5);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		System.out.println("area of wall= " + wall.getArea());

		System.out.println("----------------------------------");
		wall.setWidth(0);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		System.out.println("area of wall= " + wall.getArea());
		System.out.println("----------------------------------");

	}

}
