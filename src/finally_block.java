
public class finally_block {

	public static void main(String[] args) {
		
		try {
			
			// DB connection - successfully connected to the database
			// Executing some queries and exception occured
			// Validating the data and comparinng from websites
			// Closing connection
			
			/*int i[] = new int[4];
			
			i[5] = 100;
			System.out.println("Close DBConnection in try block");*/
			
		} catch(Exception e) {
			
			System.out.println("Error occured");
			
		} finally {
			
			System.out.println("Closing the DB Connection in finally block");
		}

	}

}
