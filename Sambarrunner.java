class Sambarrunner{
	public static void main(String[] args)
	{
		String[] info=Sambar.sambardetails();
		for(String info1:info)
		{
			System.out.println(info1);
		}
	int info2=Sambar.quantity();{
	System.out.println("quantityis"+info2);
	}
	boolean info3=Sambar.temp();
	{
		System.out.println("its hot?"+info3);
	}
	
    boolean info4=Sambar.nature();
	{
		System.out.println("its good?"+info4);
	}	
	}
}