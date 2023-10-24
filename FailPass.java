import java.util.*;
public class FailPass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int percent=sc.nextInt();
		if(percent>=0&&percent<=100)
		{
			if(percent<=34)
			{
				System.out.println("Fail");
			}else if(percent<=65)
			{
				System.out.println("Pass");
			}else
				System.out.println("Distinction");
		}else
			System.out.println("Eneter valid percentgae");
		
	}

}
