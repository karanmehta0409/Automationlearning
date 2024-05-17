 package Package1;

public class Arithmetic2 {
	public int multiply (int a , int b)
	{
		
		int c ;
		c=a*b;
		System.out.println("mutiplyresult" +c);
		return c ;
		}
public int sum (int d , int e) 

{
	int f ;
	f=d+e;
	System.out.println("sumresult" +f);
	return f ;
	}
public int substract (int g ,int h) 
{
    int i ;
    i=g-h ;
    System.out.println("susbtractresult" +i);
    return i;
}
public int multiply1 (int j, int k) 
{
	int l;
	l=j*k;
	System.out.println("mutiply1result" +l);
	return l ;
	}
public void divide (int m , int n)
{
	int o ;
	o=m/n;
	System.out.println("finalresult" +o);
}
public static void main(String[] args) {
	Arithmetic2 obj = new Arithmetic2();
	int mutiplyresult = obj.multiply(10 , 2);
	int sumresult = obj.sum(mutiplyresult, 2);
	int subtractresult = obj.substract(sumresult, 2);
	int multiply1result = obj.multiply1(subtractresult, 2);
	obj.divide(multiply1result, 2);
	
	
}
}
