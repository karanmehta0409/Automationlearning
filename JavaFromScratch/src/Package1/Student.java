package Package1;

public class Student {
	//{} This represents the boundary (body) of the class
	int a; //a is a variable which will store some value which can be changed
	
	public void display() //display is the method name which will perform an operation
	{
	System.out.println("Welcome");
	}
	public static void main(String[] args) {
		Student obj=new Student(); //classname refrence variable=new classname (Syntax for object creation)
		obj.display();
		obj.a=222;
		System.out.println(obj.a);
		obj.a=223;
		System.out.println(obj.a);
	}

}

//4 Pillars of Java are mentioned below :
//1st piller : Class creation
//2nd piller : Defining Variable and method inside class
//3rd piller : Object creation
//4th piller : Calling method and variable through Reference variable
