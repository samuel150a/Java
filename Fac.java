class Fac
{
public static void main(String[] args)

{
int[] num={2,7,5,};
for(int j=0;j<=num.length-1;j++){
int fac=1;
for(int i=1;i <=num[j];i++)
{
	fac*=i;
}
System.out.println("facto of "+num[j]+" is "+fac);
}
}
}