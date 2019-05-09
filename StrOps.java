class StrOps {
	public static void main(String[] args)
	{
	String str1 = "When it comes to web progrmming, java is #1.";
	String str2 = new String(str1);
	String str3 = "Java strings are PowerFul.";
	int result,idx;
	char ch;
	System.out.println("length of string 1:" + str1.length());
 	for(int i=0; i < str1.length(); i++)
	System.out.print(str1.charAt(i));
	System.out.println();
	if(str1.equals(str2))
	System.out.println("String 1 equal to String 2");
	else 
	System.out.println("String 1 Not Equal to String 2");
	
	if(str1.equals(str3))
	System.out.println("String 1 equal to String 3");
	else 
	System.out.println("String 1 Not Equal to String 3");
	
	result = str1.compareTo(str3);
	if(result==0) 	
	System.out.println("string is equal then String 3");
	if(result<0) 	
	System.out.println("string is less then String 3");
	else
	System.out.println("string is greater then String 3");
	
	str2 = "One Two Three One";
	idx = str2.indexOf("One");
	System.out.println("Index of first Occurrence of One: " + idx);
	idx = str2.lastIndexOf("One");
	System.out.println("Index of first Occurrence of One: " + idx);
	}
}