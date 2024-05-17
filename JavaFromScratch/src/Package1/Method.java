package Package1;

public class Method {
	int a,b,c,d,e;
	public void Method1(int x1,int x2,int x3,int x4,int x5)
	{
	a=x1;
	b=x2;
	c=x3;
	d=x4;
	e=x5;

}
	public static void main(String[] args) {
		Method Obj = new Method();
		Obj.Method1(11,12,13,14,15);
		System.out.println(Obj.a);
		System.out.println(Obj.b);
		System.out.println(Obj.c);
		System.out.println(Obj.d);
		System.out.println(Obj.e);
	}
}
