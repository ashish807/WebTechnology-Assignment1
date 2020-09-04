import java.util.Scanner;

public class Main
{
        public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        String sort = scan.nextLine();
        char[] temp = sort.toCharArray();
        int size = temp.length;
      for (int i = 0 ;i< size-1; i++){
         int min = i;

         for (int j = i+1; j<size; j++){
            if (temp[j] < temp[min]){
            min = j;
            }
         }
         char array = temp[min];
         temp[min] = temp[i];
         temp[i] = array;
      }

      for (int i = 0 ;i< size; i++){
         System.out.print(" "+temp[i]);
      }
    }
}