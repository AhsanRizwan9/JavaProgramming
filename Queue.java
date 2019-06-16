class Queue{
	private char[] q;
	private int putloc, getloc;
Queue(int size){
	q=new char[size];
	putloc=getloc=0;
}
void put(char ch){
	if(putloc==q.length()){
		System.out.println("Queue is Full");
		return;
	}
	q[++putloc]=ch;
}
char grt(){
	if(getloc==putloc){
		System.out.println("Queue is Empty");
		return (char) 0;
	}
	return q[getloc++];
}
}
class Queue_{
	public static void main(String[] args) {
		Queue test = new Queue(10);
		test.put('a');
		test.put('b');
		test.put('g');
		System.out.println(test.get());
	}
}
