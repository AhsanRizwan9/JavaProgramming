class TwoDShape{
	double width;
	double height;
	void ShowDim(){
		System.out.println("whidth and height are"+ whidth + "and"+ height);
	}
}
class Triangle extends TwoDShape{
	String style;
	double Area(){
		return (width + height) /2; 
	}
	void ShowStyle(){
		System.out.println("Triangle is" + style);
	}
}
class Shape{
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "filled";

		t2.width = 9.0;
		t2.height = 12.0;
		t2.style = "Outlined";

		System.out.println("Info for t1: ");
		t1.ShowStyle();
		t1.ShowDim();
		System.out.println("Area is" + t1.Area());
		System.out.println();


		System.out.println("Info for t2: ");
		t2.ShowStyle();
		t2.ShowDim();
		System.out.println("Area is" + t2.Area());
		System.out.println();
	}
}