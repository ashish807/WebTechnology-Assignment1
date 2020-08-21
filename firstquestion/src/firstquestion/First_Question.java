package firstquestion;

import java.util.Scanner;

public class First_Question {

	public static void printing(int final_answer)
    {
        System.out.println(final_answer);
    }

public static void main(String[] args)
{
    int z=0,ans=0;
   
	System.out.println("Enter string 1:");
	Scanner scan= new Scanner(System.in);
	String text,pattern;
	text=scan.nextLine();
	
	System.out.println("Enter string 2:");
	pattern=scan.next();
	int txt=text.length();
	int pat=pattern.length();
	
	if(txt<pat)
	System.out.println("0");
	else {
		int [] a;
		int [] b;
		a= new int[500];
		b=new int[500];
		for (int i=0;i<pat;i++)
			 b[(int)text.charAt(i)]++;
		for(int i=0;i<pat;i++){

	          int k=(int)text.charAt(i);
	          if(a[k]<b[k])
	            z++;
	          a[k]++;

	          if(z==pat)
	            ans++;}

	          for(int i=pat;i<txt;i++){

	          int k=(int)text.charAt(i);
	        int p=(int)text.charAt(i-pat);

	        if(a[p]<=b[p])
	        z--;

	        a[p]--;

	        if(a[k]<b[k])
	        z++;

	        a[k]++;

	        if(z==pat)
	        ans++;}

	        printing(ans);	
	}
		
}
	
}
