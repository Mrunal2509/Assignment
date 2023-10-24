Public class Pattern1
{
	public static void main(String args[]) {
		
		char ch='A';
		char ch1='a';
		for(int k=0;k<3;k++) {
			for(int i=0;i<3;i++) {
				for(int j=1;j<2;j++) {
					 System.out.print(ch+" "+ch1);
				}
				ch1++;
				 System.out.println();
			}
			ch1='a';
			ch++;
			System.out.println();
			
		}
}
}
