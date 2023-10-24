import java.util.Scanner;
public class table {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"="+i*no);
		}
	}
}