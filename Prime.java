Public class Prime
{
	static boolean isprime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		for(int i=3;i<=30;i++) {
			if(isprime(i)) {
				 System.out.println(i+" ");
			}
		}
	}
}