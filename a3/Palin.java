import java.util.Scanner;
 
class Palin
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println("True " +str+ " is a palindrome");
      else
         System.out.println("False " +str+ " is not a palindrome");
 
   }
}
