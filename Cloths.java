class Cloths
{
public static void main(String[] args)
{
 String[] clothes={"Bathrobe","Belt","Blazer,Bomber", "jacket","Bow-tie","Cap,Cardigan","Cargo pants","Down Jacket","Down VestGlove","Hat",
 "Hawaiian","shirt","Jacket","Jeans","Jogging suit","Jumper","Jumpuit","Long-sleeve top","Lycra shorts","Overall","Pajamas","Pant","Polo shirt","Poncho"};
for(int i=0;i<clothes.length;i++)
{
System.out.println(clothes[i]);
}



System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("After Updation");
String[] updatedclothes={"Pullover", "Raincoat", "Running shorts", "Scarf", "Shirt", "Shorts", "Singlet", "Ski-jacket", "Sleeveless-shirt", "Socks", "Sportcoat", "Suit", "Sweatband", "Sweater", "Sweatpant", "Sweatshirt", "Swimsuits", "Tanktop", "Tee shirt", "Tennis shorts", "Three-piece suit", "Tie", "Trench-coat", "Tuxedo", "Underpants", "Vest", "Waist-coat", "Windbreakers"};
for(int i=0;i<clothes.length;i++){
clothes[i]=updatedclothes[i];
System.out.println(clothes[i]);
}

}
}