class BobbleSort{
	public static void main(String args[]) {
		int sort[]= new int []{4,3,5,6,7,8,1,2,10,9};
		int temp;
		for (int i=0;i<=9 ; i++) {
			for (int j=0; j<=8;j++ ) {
				if(sort[j]>sort[j+1]){
					temp=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=temp;
				}
			}
		}
	for (int i=0;i<=9 ;i++ ) {
		System.out.print(sort[i]);		
	}
	}
}