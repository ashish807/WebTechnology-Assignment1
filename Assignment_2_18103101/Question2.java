import java.util.Arrays; 
import java.util.Scanner;
public class Main
{
    public static void output(int input, int[] sorted){
        	System.out.println("Sorted : ");
	for (int i=0;i<input;i++){
		System.out.print(sorted[i]+" ");
	}
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input;
		int[] arr=new int [21];
		
		System.out.println("Enter the length of an array");
		input=scan.nextInt();
		int[] array = new int [input];
		int temp;
		int j=0;
	
		System.out.println("Enter the numbers");
		for (int i=0;i<input;i++){
		temp=scan.nextInt();
		arr[temp]=arr[temp]+1;
	}

	for (int i=0;i<21;i++){
		while (arr[i]>0){
			array[j]=i;
			j=j+1;
			arr[i]--;
		}
	}
	output(input, array);
	}

}
