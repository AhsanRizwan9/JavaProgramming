// Example 8 Assignment 4
public class SqrRoot{
	public static void main(String[] args) {
		double num, sroot, rerr;

		for (num = 1.0; num<100.0; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Squar root of " + num + "is" + sroot);			
		
			rerr = num - (sroot * sroot);
			System.out.println("Roundung error is " + rerr);
			System.out.println();
		}
	}
}