class locations
{
public static void main(String[] args)
{
 String[] location={"Bengaluru", "Mysuru", "Mangaluru", "Hubballi", "Dharwad", "Belagavi", "Shivamogga", "Ballari", "Davangere", "Udupi", "Tumakuru", "Bidar", "Kalaburagi", "Chikkamagaluru", "Hassan", "Raichur", "Vijayapura", "Karwar", "Chitradurga", "Madikeri"};
for(int i=0;i<location.length;i++)
{
System.out.println(location[i]);
}



System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("After Updation");
String[] updatedlocation={"Jammu", "Srinagar", "Anantnag", "Baramulla", "Udhampur", "Pulwama", "Rajouri", "Poonch", "Kupwara", "Kathua", "Budgam", "Kulgam", "Shopian", "Doda", "Bandipora", "Ganderbal", "Reasi", "Kishtwar", "Samba", "Ramban"};
for(int i=0;i<location.length;i++){
location[i]=updatedlocation[i];
System.out.println(location[i]);
}
}
}