import java.util.Scanner;
   class factorial{
    public static void main(String args[]){
     int i,fact=1;
     System.out.print("enter number:");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(i=1;i<=n;i++)
         fact=fact*i;
    System.out.println("Factorial of "+n+" is: "+fact);
 }
  }
