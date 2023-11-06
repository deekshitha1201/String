import java.util.Scanner;
public class Stringsum
  {
    public static void main(String[] args)
    {
      int sum=0;
      System.out.println("java program to calculate sum of integers in string");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>'0'&&str.charAt(i)<'9')
          {
            sum=sum+str.charAt(i)-'0';
          }
        }
      System.out.println("sum :"+sum);
    }
  }