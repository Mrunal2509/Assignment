public class Pattern2
{
public static void main(String args[])
        {
		
		
		for(int i=0;i<5;i++)
                 {
			for(int s=6;s>i;s--) {
				 System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				 System.out.print("*"+" ");
			}
			 System.out.println();
		}
	}
}