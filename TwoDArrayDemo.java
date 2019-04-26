class TwoDArrayDemo{
	public static void main(String[] args) {
		int A[][]=new int [2][5];
		int a=-1;
		for (int i=0; i<2;i++) {
			for (int j=0; j<5;j++) {
				a++;
				A[i][j]=a;
			}
			
		}
		for (int i=0; i<2;i++) {
			for (int j=0; j<5;j++) {
				System.out.print("  "+A[i][j]+" ");
			}
			System.out.println("");
	}
}
}