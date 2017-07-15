# LCM
import java.util.*;
import java.io.*;
public class LCM
{
  public static void main(String args[])throws IOException
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int a,b,i;
     int c=0;
     System.out.print("Enter the first number : ");
     a=Integer.parseInt(br.readLine());
     System.out.print("\n");
     System.out.print("Enter the second number : ");
     b=Integer.parseInt(br.readLine());
     System.out.print("\n");
     c=a*b;
     int d=c;
     for(i=1;i<=c;i++)
     {
         if(i%a==0 && i%b==0 && i<d)
         d=i;
        }
        System.out.println("The L.C.M : "+d);
    }
}
