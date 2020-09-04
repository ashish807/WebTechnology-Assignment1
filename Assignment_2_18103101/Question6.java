import java.util.Scanner;
import java.util.Arrays; 
public class Main
{
    public static void output(int hailstorm){
        System.out.print(hailstorm+ " ");
    }
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Your Lucky number");
		int i=scan.nextInt();
		if (i<0){
			System.out.println("Try again, Go for +ve number");
			return;
		}
		while (i!=1){
		    output(i);
			
			if (i%2==0)
				i=i/2;
			else
				i=3*i+1;
		}
		return;

	}
}