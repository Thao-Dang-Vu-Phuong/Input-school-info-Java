package lab4.bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chia {
	
	public static int phepChia(float a, float b) throws ArithmeticException
	{
		if (b == 0) {
			throw new ArithmeticException("b phải khác 0");
			
		}
		return (int)(a/b);
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);




try {
	System.out.println("Nhập số a");
	float a = scan.nextFloat();
	System.out.println("Nhập số b");
	float b = scan.nextFloat();
	int x = phepChia(a, b);
	System.out.println(x);
	
	
	
} catch (InputMismatchException e) {
	// TODO Auto-generated catch block
	System.err.println("a và b phải nhập số thực " + e);
}
catch (ArithmeticException e) {
	System.err.println(e);
	}



scan.close();
	}

}
