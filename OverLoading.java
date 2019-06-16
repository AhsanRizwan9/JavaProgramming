class OverLoading{
	void ovlDemo(){
		System.out.println("No Parameters");
	}
	void ovlDemo(int a){
		System.out.println("one Parameters");
	}
	int ovlDemo(int a,int b){
		System.out.println("Two Parameters:" +a+" "+b);
		return a+b;
	}
}
class OverloadingDemo{
	public static void main(String[] args) {
		overload ob = new overload();
		int resT;
		double resD;
		ob.ovlDemo();
		System.out.println();
		ob.ovlDemo(2);
		Short.out.println();
		resT=ob.ovlDemo(4,6);
		System.out.println("Result of ob.ovlDemo(4,6):" + resT);
		System.out.println();
		resD= ob.ovlDemo(1.1,2.32);
		System.out.println("Result of ob.ovlDemo(1.1,2.32):"+resD);

	}
}