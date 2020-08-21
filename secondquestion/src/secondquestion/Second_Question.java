package secondquestion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Second_Question {

	 public static void result(String final_answer)
	    {
	    	System.out.print(final_answer);
	    	System.out.print("\n");
	    }
	    
	    public static void main(String args[])
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter word vector size : ");
	    	System.out.print("\n");
	    	
	    	int n = sc.nextInt();

	    	System.out.print("Enter the words to reduce : ");
	    	System.out.print("\n");
	    	
	    	Set<String> set = new HashSet<String>();
	    	
	    	for(int i = 0; i < n; i++)
	    	{
	    		set.add(sc.next());
	    	}

	    	System.out.print("Notice!!! Press 'Q' and enter if you'r done with paragraph");
	    	System.out.print("\n");

	    	System.out.print("Enter the paragraph : ");
	    	System.out.print("\n");

	    	String word = sc.next();
	    	StringBuffer para = new StringBuffer();

	    	while(!word.equals("Q"))
	    	{
	    		if(set.contains(word))
	    		{
	    			para.append(word.charAt(0)+"");
	    			for(int i = 1;i<word.length();i++)
	    			{
	    				para.append("*");
	    			}
	    			para.append(" ");
	    		}
	    		
	    		else
	    		{
	    			para.append(word + " ");
	    		}
	    		word = sc.next();
	    	}
	    	String s = para.toString().trim();
	        result(s);
	    	
	    	
	    }   
	
	
	
}
