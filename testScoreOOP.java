import java.util.Scanner;
import java.lang.Math;

public class Student
{
	private String name;
	private double score;

	public void setName(String name){
		this.name = name; 	//.this method allows us to specify the instance variable over variable passed to the method
						//this.r is the r variable on line 6.
	}
	public void setScore(Double score){
		this.score = score;
	}





	public void showResults(){
	
	}


	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); //setup scanner object to utilize the (input) variable

		System.out.println("Please input # of scores: ");
	    Double count = input.nextInt();

	    Student objArray[] = new Student[count];

	    //now, we need to assign a name and score to each possible index to the array of [count] size
	    for(i=0;i<count;i++){
	    	objArray[i].setName();
	    	objArray[i].setScore();
	    }

		Student s1 = new Student();
		s1.setRadius(r);		
		s1.calculateArea();
		s1.showResults();				
	}
}


