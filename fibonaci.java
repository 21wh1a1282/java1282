import java.util.Scanner;
   class fibonaci{
   public static void main(String args[]){
    int n1=0,n2=1,n3,i;
     
    System.out.print("enter number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(n1+" "+n2);
   for(i=2;i<n;++i)
   {
    n3=n1+n2;
    System.out.print(" "+n3);
    n1=n2;
    n2=n3;
   }
 
  }}
