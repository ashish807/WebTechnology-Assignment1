public class Main
{
	public static void main(String[] args) {
		int n =1;
		int val_sum =1;
		while(n<Integer.MAX_VALUE){
		    if(val_sum==n*n){
		    System.out.println("Ans: "+n);
		}
		n+=1;
		val_sum+=n;
		
		    
		}
		System.out.println("Sum: "+ val_sum + "n: "+n);
	}
}
