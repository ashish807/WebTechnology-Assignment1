import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
    System.out.print("Enter First String   ");
    String firstString = scan.nextLine();
    System.out.print("Enter First String   ");
    String secondString = scan.nextLine();
    
   
    int result = compareString(firstString, secondString);
    
    if (result<0){ 
        System.out.print(firstString + " is smaller than "+ secondString +" Since Value is " +result);
    }
    if (result>0){
         System.out.print(firstString + " is greater than "+ secondString +" Since Value is " +result);
    }
    if (result==0){
        System.out.print(firstString + " is equal to "+ secondString +" Since Value is " +result);
    }
  }
  

  
  public static int compareString(String firstString, String secondString) {
    
    int len= Math.min(firstString.length(), secondString.length());
    
    int k=0;
    while(k<len) {
      if(firstString.charAt(k)!= secondString.charAt(k)) {
        return (int) firstString.charAt(k)- secondString.charAt(k);
      }
      k++;
    }
    return firstString.length() - secondString.length();
  }
}