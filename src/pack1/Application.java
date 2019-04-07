package pack1;

public class Application {

	public static void main(String[] args) {
		
		Human person1=new Human();
		
		person1.print();
		
		person1.eyeColour="Pink";
		System.out.println(person1.eyeColour);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);
		person1.print();
		Human person2=new Human();
		//person1.eyeColour="Orange";
		System.out.println(person1.eyeColour);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);
		person2.print();

	}

}
