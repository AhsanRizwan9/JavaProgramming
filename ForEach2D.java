class ForEach2D{
	public static void main(String args[]){
	int[][] a = new int[3][5];
	int sum = 0;
	for(int i=0 ; i<3 ; i++)
		for(int j=0 ; j<5 ; j++)
			a[i][j]= (i+1) * (j+1);
  	for(int x[] : a){
		for(int y : x){
			System.out.println("value is " + y );
			sum += y;
		}
	}
	System.out.println("sum is " + sum);
	}
}