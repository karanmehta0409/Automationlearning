
package Package1;

public class Arithmetic1 {
public int sum (int a,int b) 
{
	int c ;
	c=a+b;
	System.out.println("Sumresult" +c);
	return c;
	}
public int subtract (int d, int e) 
{
	int f ;
	f=d-e;
	System.out.println("subtract" +f);
	return f;
}
public int Multiply (int g, int h)
{
	int i ;
	i=g *h;
	System.out.println("Multiply" +i);
	return i;
	}
public void Divide (int j , int k)
{
	int l;
	l=j/k;
	System.out.println("Finalresult" +l);
}
public static void main(String[] args) {
	Arithmetic1 obj = new Arithmetic1();
	int Sumresult = obj.sum(10, 2);
	int Sumresult1 = obj.sum (Sumresult,2);
	int Subtractresult = obj.subtract (Sumresult1,2);
	int Multiplyresult = obj.Multiply (Subtractresult,2);
	obj.Divide (Multiplyresult,2);
}
}
