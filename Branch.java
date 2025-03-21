public class Branch{

static String[] branchnames={null,null,null};
static int index=0;

public static void branch(String s1){
	if(branchnames!=null){
		if(index<branchnames.length){
			branchnames[index]=s1;
			index++;
          System.out.println("Added succesfully");
		}
		else
			System.out.println("array is full");
		
	}
	else
		System.out.println("array is null");
}
public static void display()
{
	for(int i=0;i<branchnames.length;i++)
	{
		System.out.println(branchnames[i]);
	}
	
	
	
}
public static void search()
{
	String target="electronic";
	
	for(int i=0;i<branchnames.length;i++)
	{
	if(branchnames[i]==target){	
		System.out.println(branchnames[i]);
		return;
	}else {
		System.out.println("elements is not proesnt");
	}
	}
	
	
	
}
}

	 
	