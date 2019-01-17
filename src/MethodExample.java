import java.util.Scanner;

public class MethodExample 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your name: ");
		
		String name = scan.nextLine();
		greeting(name);
		
		System.out.println(sumThree(2, 4, 6));
		int whatsTheAwnser = sumThree(sumThree(1, 2, 3), sumThree(4, 5, 6), sumThree(7, 8, 9));
		System.out.println(whatsTheAwnser);
		
		System.out.print("First Double: ");
		double double1 = scan.nextDouble();
		System.out.print("Second Double: ");
		double double2 = scan.nextDouble();
		System.out.print("Third Double: ");
		double double3 = scan.nextDouble();
		System.out.print("Fourth Double: ");
		double double4 = scan.nextDouble();
		System.out.print(averageFour(double1, double2, double3, double4));
	}

	public static void greeting(String arg1)
	{   //arg1 = "Max"
		System.out.println("hello, " + arg1);
	}
	
	public static int sumThree(int int1, int int2, int int3)
	{
		int sum = int1 + int2 + int3;
		return sum;
	}
	
	public static double averageFour(double double1, double double2, double double3, double double4)
	{
		double average = (double1 + double2 + double3 + double4) / 4;
		return average;		
	}
	
}
