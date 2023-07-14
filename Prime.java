import java.util.Scanner;
   public class Prime{
    public static void main(String args[]){
     int i,flag=0;
     System.out.print("enter a number :");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
      for(i=1;i<=n;i++){
       if(n%i==0)
       flag++ ;
      }
    if(flag==2)
            System.out.println(n+" is prime number");
     else
             System.out.println(n+" is not a prime number");
     }
  }      

	

