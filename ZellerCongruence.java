package myProjects;
import java.util.*;
public class ZellerCongruence {
	public static void main(String[] args) {
		System.out.print("Please input the month: ");
		Scanner sc2 = new Scanner(System.in);
		String y = sc2.next();
		int m = Integer.parseInt(y);
		
		System.out.print("Please input the day: ");
		Scanner sc1 = new Scanner(System.in);
		String x = sc1.next();
		int q = Integer.parseInt(x);
		
		
		System.out.print("Please input the year: ");
		Scanner sc3 = new Scanner(System.in);
		String z = sc3.next();
		int jk = Integer.parseInt(z);
		
		int h = ((q + ( (13*(m+1)/5))  + (jk % 100) + ((jk % 100)/4) + ((jk / 100)/4) - (2 * ((jk / 100))))%7);
		
		if (h == 0) {
			System.out.println("Saturday");
		} else if ( h == 1) {
			System.out.println("Sunday");
		} else if ( h == 2) {
			System.out.println("Monday");
		} else if ( h == 3) {
			System.out.println("Tuesday");
		} else if ( h == 4) {
			System.out.println("Wednesday");
		} else if ( h == 5) {
			System.out.println("Thursday");
		} else {
			System.out.println("Friday");
		}
	}
}
