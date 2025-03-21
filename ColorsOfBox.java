class ColorsOfBox
{
public static void main(String[] args){

String[] box ={"red","blue","yellow","green","orange","purple","pink","brown","black","white","gray","gold","silver","maroon","cyan","indigo","lavender","turquoise","magenta"
,"teal","beige","salmon","khaki","plum","olive","violet","emerald","peach","navy"};
for(int i=0;i<box.length;i++)
{
	System.out.println(box[i]);
}



	System.out.println("Updated  values");
String[] updatedbox  ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","24","25","26","27","28","29"};
     
for(int i=0;i<box.length;i++)
{	 
box[i]=updatedbox[i];
	System.out.println(box[i]);
}
}
}