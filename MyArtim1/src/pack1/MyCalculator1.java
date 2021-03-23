package pack1;

public class MyCalculator1 {
	double a,b,c;
	public double add(double a,double b)
	{
		c=a+b;
		return c;
	}
	public double sub(double a,double b)
	{
		c=a-b;
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator1 m=new MyCalculator1();
		double add=m.add(12.0,56.45);
		System.out.println("Add="+add);
		double sub=m.sub(12.0,14.7);
		System.out.println("Sub="+sub);
		

	}

}
