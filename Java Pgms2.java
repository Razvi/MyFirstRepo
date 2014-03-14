// Fig. 3.4: GradeBook.java
// Class declaration with one method that has a parameter.
public class GradeBook
{
	public void displayMessage(String courseName) //parameterized method.
		{
			System.out.printf( "Welcome to the grade book for\n%s!\n", courseName );
		}
}

// Fig. 3.5: GradeBookTest.java
// Create GradeBook object and pass a String to
// its displayMessage method.
import java.util.Scanner;

public class GradeBookTest
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter the course name:" );
		String nameOfCourse = input.nextLine();
		System.out.println();
		
		GradeBook myGradeBook = new GradeBook();
		myGradeBook.displayMessage( nameOfCourse );
	}
}