package Package1;

public class ConstructorIntroduction {
	public ConstructorIntroduction() 
	{
		System.out.println("Default Constructor");
	}
	
	public ConstructorIntroduction(int a) 
	{
		System.out.println("One Parameterized Constructor");
	}
	
	public ConstructorIntroduction(int a, int b) 
	{
		System.out.println("Two Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		ConstructorIntroduction obj = new ConstructorIntroduction();
		ConstructorIntroduction obj1 = new ConstructorIntroduction(11,12);
		ConstructorIntroduction obj2 = new ConstructorIntroduction(10);	
		
	}



}
