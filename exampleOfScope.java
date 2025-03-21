class exampleOfScope{
	public static void main(String[] args){
		int a=10,b=5;
		int result=a+b;
		System.out.println("the result is"+result);
		{
			int sub = a-b;
			System.out.println(sub);
		}
		//System.out.println(sub);
	}
} //System.out.println(a);