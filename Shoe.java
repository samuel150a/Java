class Shoe
{
public static void main(String[] args)
{
 String[] Shoes={"Nike", "Adidas", "Puma", "Reebok", "Under Armour", "New Balance", "Asics", "Skechers", "Fila", "Converse", "Vans", "Timberland", "Red Wing", "Clarks", "Bata", "Woodland", "Crocs", "Lee Cooper", "Salomon", "Merrell", "Johnston & Murphy", "Aldo", "Hush Puppies", "Lotto"};
for(int i=0;i<Shoes.length;i++)
{
System.out.println(Shoes[i]);
}



System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("After Updation");
String[] updatedShoes={"Gucci", "Prada", "Louis Vuitton", "Balenciaga", "Jimmy Choo", "Christian Louboutin", "Dolce & Gabbana", "Versace", "Tom Ford", "Burberry", "Cole Haan", "Dr. Martens", "Steve Madden", "Allen Edmonds", "Bruno Magli", "ECCO", "Mephisto", "Rockport", "Florsheim", "Toms", "Santoni", "Giorgio Armani", "John Varvatos", "Yeezy"};
for(int i=0;i<Shoes.length;i++){
Shoes[i]=updatedShoes[i];
System.out.println(Shoes[i]);
}
}
}