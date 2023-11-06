import java.util.Scanner;
public class Stringreverse
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String s=" ";
      for(int i=str.length()-1;i>=0;i--)
        {
        char c=str.charAt(i);
        s=s+c;
        }
      System.out.println("after reversing :"+s);
    }
  }