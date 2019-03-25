public class Operators{
	public static void main(String[] args) {
		int a=20, b=10, c=0, d=20, e=40, f=30;
		boolean condition = true;


		c = ++a;
		System.out.println("value of C (++a)" + c);


		c = b++;
		System.out.println("value of c(b++) =" + c);



		c = --d;
		System.out.println("value of c(--d) =" + c);


		c = --e;
		System.out.println("value of c(--e) =" + c);


		System.out.println("value of !condition =" + !condition);

	}
}