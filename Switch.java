import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter no 1: ");
		int a=sc.nextInt();
		System.out.println("Eneter no 2: ");
		int b=sc.nextInt();
		char ch=sc.next().charAt(0);
		switch(ch) {
		case '+':
			System.out.println(a+b);
			break;
		case'-':
			System.out.println(a-b);
			break;
		
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
			
		default:
			System.out.println("inavlid operator");
			break;
}
                }
}