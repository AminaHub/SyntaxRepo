
public class Task {

	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign true 
		 * create int variable day assign it to 1 
		 */
  
		boolean workDay=true;
		int day=1;
		
		while (workDay) {
			//System.out.println("I need a day off");
			if (day==6) {
				System.out.println("I don't need a day off");
				workDay=false;
				//day++;
				
			}else {
				System.out.println("I need a day off");
			}
			day++;
			//System.out.println("I need a day off");
		
			//day++;
		}	
		
		
	}

}
