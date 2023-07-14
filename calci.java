import java.util.Scanner;
 public class calci{
	public static void main(String[] arguments){
		int operator,n1,n2;
		System.out.println("Enter the operator:'+','-','/','%'");
		System.out.println("Choose the operator:");
		Scanner sc = new Scanner(System.in);
                operator = sc.nextInt();
		System.out.println("Enter first number");
		n1=sc.nextInt();
		System.out.println("Enter second number");
		n2=sc.nextInt();
		int result=0;
		switch(operator)
		{
			case 1:
				System.out.println("Result:"+(n1+n2));
				break;
			case 2:
				System.out.println("Result:"+(n1-n2));
				break;
			case 3:
				System.out.println("Result:"+(n1/n2));
				break;
			case 4:
				System.out.println("Result:"+(n1%n2));
				break;
			default:
				System.out.println("Not Valid");
		}
	}
}



	

