class Cereal
{
public static void main(String[] args)
{
 String[] Cereals={"Corn Flakes", "Rice Krispies", "Cheerios", "Frosted Flakes", "Wheaties", "Froot Loops", "Cocoa Puffs", "Special K", "Cap’n Crunch", "Raisin Bran", "Shredded Wheat", "Lucky Charms", "Trix", "Golden Grahams", "Honey Bunches of Oats", "Apple Jacks", "Count Chocula", "Grape-Nuts", "Cinnamon Toast Crunch", "Honey Smacks"};
for(int i=0;i<Cereals.length;i++)
{
System.out.println(Cereals[i]);
}



System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("After Updation");
String[] updatedCereals={"All-Bran", "Alpen", "Barbaras Puffins", "Basic 4", "Blueberry Morning", "Cocoa Pebbles", "Cookie Crisp", "Cracklin' Oat Bran", "Cream of Wheat", "Eggo Cereal", "Fiber One", "Frosted Mini-Wheats", "GoLean Crunch", "Honey Nut Cheerios", "Krave", "Life Cereal", "Muesli", "Nutri-Grain", "Oatmeal Squares", "Reese's Puffs"};
for(int i=0;i<Cereals.length;i++){
Cereals[i]=updatedCereals[i];
System.out.println(Cereals[i]);
}
}
}