package Package1;

public class ThisKeyword {
	public ThisKeyword() {
		this (10 , 11 , 12);
		System.out.println("Default Constructor");
	}
	public ThisKeyword(int a) {
		this (1 , 2 , 3 , 4);
		System.out.println("One Parameterized Constructor");
	}
	public ThisKeyword(int a , int b) {
		this (12);
		System.out.println("Two Parameterized Constructor");
	}
	public ThisKeyword(int a , int b , int c) {
		System.out.println("Three Parameterized Constructor");
	}
	public ThisKeyword(int a , int b , int c , int d) {
		this ();
		System.out.println("Four Parameterized Constructor");
	}
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword (12 , 13);
	}

}
