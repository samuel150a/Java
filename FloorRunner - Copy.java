class FloorRunner{
public static void main(String[] args){
	
	Floor floor=new Floor();
	System.out.println("the default value for number of rooms is\t"+floor.totalrooms);
	System.out.println("the default value for name is \t"+floor.name);
	System.out.println("the default value for area is \t"+floor.area);
	System.out.println("the default value for tiles is \t"+floor.tiles);
	floor.totalrooms=8;
	floor.name="grounf_floor";
	floor.area=577524;
	floor.tiles=true;
		System.out.println("the values after initialization");


	System.out.println("the total rooms"+floor.totalrooms);
	System.out.println("the floor name is "+floor.name);
	System.out.println("the area is \t"+floor.area);
	System.out.println("is it consists tiles"+floor.tiles);
	
}
}
	




	
	
	
	
	
	

