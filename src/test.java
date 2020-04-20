
public class test {

	public static void main(String[] args) {
		
		System.out.println("Before try block");
		
		try {
		System.out.println("Beginning");
		
		int divide = 10 / 0;
		System.out.println(divide);
		
		System.out.println("Ending");
		
		} catch(Exception e) {
			
			System.out.println("Error occured");
			e.printStackTrace();
		}
		System.out.println("After try catch block");

	}

}
