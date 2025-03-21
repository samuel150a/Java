public class Targetnum
{
public static void main(String[] args)

{
String[] num={"1","2","3","4","5","6","7","8","9","10"};
String target ="11";
for(int i=0;i<=num.length-1;i++)
{
	if(num[i]==target){
		System.out.println(target+"is found at "+i +"th position");
	}
    

	



if(num[i]!=target)
{
System.out.println(target+"is not found at " +i +"th position");	
}
}
}
}