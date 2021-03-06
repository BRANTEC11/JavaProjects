package myProjects;
import java.util.*;
public class CompleteTheSquare {

	public static void main(String[] args) {
		
		System.out.print("Are you solving for a, b or c? ");
		Scanner abc = new Scanner(System.in);
		String s = abc.next();
		
		if (s.equals("a")) {
			System.out.print("What is b? ");
			Scanner b = new Scanner(System.in);
			String bs = b.next();
			int b2 = Integer.parseInt(bs);
			
			System.out.print("What is c? ");
			Scanner c = new Scanner(System.in);
			String cs = c.next();
			int c2 = Integer.parseInt(cs);
			
			int a2 = (int) ((b2/2)/(Math.sqrt(c2))*((b2/2)/(Math.sqrt(c2))));
			System.out.println();
			System.out.println("Equation: " + a2 + "x^2 + " + b2 + "x + " + c2);
			
			int f1 = (int) Math.sqrt(a2);
			int f2 = (int) Math.sqrt(c2);
			
			if (b2 > 0) {
				System.out.println("Factored Equation: " + "(" + f1 + "x + " + f2 + ")^2");
			} else {
				System.out.println("Factored Equation: " + "(" + f1 + "x - " + f2 + ")^2");
			}
			
		} else if (s.equals("b")) {
			System.out.print("What is a? ");
			Scanner a = new Scanner(System.in);
			String as = a.next();
			int a2 = Integer.parseInt(as);
			
			System.out.print("What is c? ");
			Scanner c = new Scanner(System.in);
			String cs = c.next();
			int c2 = Integer.parseInt(cs);
			
			int b2 = (int) ((Math.sqrt(c2))*(Math.sqrt(a2))*2);
			System.out.println();
			System.out.println("Equation: " + a2 + "x^2 + " + b2 + "x + " + c2);
			
			int f1 = (int) Math.sqrt(a2);
			int f2 = (int) Math.sqrt(c2);
			
			if (b2 > 0) {
				System.out.println("Factored Equation: " + "(" + f1 + "x + " + f2 + ")^2");
			} else {
				System.out.println("Factored Equation: " + "(" + f1 + "x - " + f2 + ")^2");
			}
			
		} else if (s.equals("c")) {
			System.out.print("What is a? ");
			Scanner a = new Scanner(System.in);
			String as = a.next();
			int a2 = Integer.parseInt(as);
			
			System.out.print("What is b? ");
			Scanner b = new Scanner(System.in);
			String bs = b.next();
			int b2 = Integer.parseInt(bs);
			
			int c2 = (int) ((b2/2)/(Math.sqrt(a2))*((b2/2)/(Math.sqrt(a2))));
			
			System.out.println();
			System.out.println("Equation: " + a2 + "x^2 + " + b2 + "x + " + c2);
			
			int f1 = (int) Math.sqrt(a2);
			int f2 = (int) Math.sqrt(c2);
			
			if (b2 > 0) {
				System.out.println("Factored Equation: " + "(" + f1 + "x + " + f2 + ")^2");
			} else {
				System.out.println("Factored Equation: " + "(" + f1 + "x - " + f2 + ")^2");
			}
		} else {
			System.out.println("Error: Letter is not a, b or c");
		}
	}
}
