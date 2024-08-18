import java.util.*;
public class Factorial {
	public static void main(String arg[]){
        long n,fact=1;
         Scanner in=new Scanner(System.in);
         System.out.println("enter number");
          n=in.nextLong();
          for(int i=1;i<=n;i++){
            fact=fact*i;
         }
         System.out.println("fact="+fact);
        }
    }
