public class CoursePrice
{
public static void price(Courses course)
{
	if(course==Courses.JAVA){
		System.out.println(Courses.JAVA);
		System.out.println("the cost is 6,000");
		}
		
		else if(course==Courses.PYTHON){
		System.out.println(Courses.PYTHON);
		System.out.println("the cost is 7,000");
		}
		
		else if(course==Courses.C){
		System.out.println(Courses.C);
		System.out.println("the cost is 8,000");
		}
		
		else if(course==Courses.RUBY){
		System.out.println(Courses.RUBY);
		System.out.println("the cost is 9,000");
		}
		
		else if(course==Courses.HTML){
		System.out.println(Courses.HTML);
		System.out.println("the cost is 4,000");
		}
		
		else{
			System.out.println("Courses is not found");
		}
	
}
}