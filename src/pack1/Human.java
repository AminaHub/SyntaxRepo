package pack1;

public class Human {
	//these are instance variable
	static String eyeColour="Brown";
	int height=6;
	int weight=180;
	String gender="F";
	
	String programmingLanguage="Java";
	
	void speak() {
		String language ="English";
		System.out.println("Humans can speak"+language);
	}
	
	void coding() {
		System.out.println("Syntax students can code"+programmingLanguage);
	}
	
	void print() {
		System.out.println(eyeColour);
	}

}
