class router
{
	public static void main(String[] args)
	
	{
		String Element1="wired";
		String Element2="wireless";
		String Element3="core";
		String Element4="edge";
		String Element5="virtual";
		String[] routers={Element1,Element2,Element3,Element4,Element5};
		for(int i=0;i<=2;i++)
		{
			System.out.println("the list is "+routers[i]);
			
		}
		for(String ForEach:routers)
		{
			System.out.println(ForEach);
		}
	}
}