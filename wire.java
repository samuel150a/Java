class wire
{
	public static void main(String[] args)
	{
		String Element1="plaza cables";
		String Element2="RR cables";
		String Element3="Polycab";
		String Element4="Finolex";
		String Element5="HavellsIndia";
		
		String[] Wires={Element1,Element2,Element3,Element4,Element5};
		for(int i=0;i<=2;i++)
		{
			System.out.println("Wires are "+Wires[i]);
			
		}
		
		for(String ForEach:Wires)
		{
			System.out.println(ForEach);
		}
	}
}