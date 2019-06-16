class Block{
	int a,b,c;
	int volume;
	Block(int i,int j,int x){
		a=i;
		b=j;
		c=x;
		volume = a*b*c;
	}
	boolean SameBlock(Block ob){
		if((ob.a==a)&(ob.b==b)&(ob.c==c))
			return true;
		else 
			return false;
	}
	boolean sameVolume(Block ob){
		if(ob.volume==volume) return true;
		else return false;
	}
}
class Passob{
	public static void main(String[] args) {
		Block ob1 = new Block (10,2,5);
		Block ob2 = new Block (10,2,5);
		Block ob3 = new Block (4,5,5);

		System.out.println("ob1 Same Dimentions as ob2:" + ob1.SameBlock(ob2));
		System.out.println("ob1 Same Dimentions as ob3:" + ob1.SameBlock(ob3));
		System.out.println("ob1 Same Dimentions as ob3:" + ob1.sameVolume(ob3));
	}
}