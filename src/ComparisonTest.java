
public class ComparisonTest {

	public static void main(String[] args) {
		
		String name1 = "Selenium";
		String name2 = "Selenium";
		
		String name_1 = new String("Janielle");
		String name_2 = new String("Janielle");
		
		int x = 100;
		int y = 100;
		
		/*System.out.println(name1 == name2);			//True
		System.out.println(name1.equals(name2));	//True
		
		System.out.println(x == y);*/
		
		/*System.out.println(name_1.equals(name_2));
		System.out.println(name_1 == name_2);*/
		
		SingleTonTest s1 = SingleTonTest.getInstance();
		SingleTonTest s2 = SingleTonTest.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
	}

}
