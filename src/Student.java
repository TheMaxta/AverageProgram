/**************************************************************************************
 * Student
 * Max Mahlke
 This class handles processing of a student's name and score
 ************************************************************************************* */
import java.util.Scanner;
import java.lang.Math;
import java.util.Scanner;
public class Student {
	private String name;
	private String grade;
	private String percentage;
	private double score;
    Scanner input = new Scanner(System.in);

	//construction method
	public Student()
    {
        System.out.println("Enter name: ");
        this.name = selectName();
        System.out.println("Enter score: ");
        this.score = selectScore();
    }



    //helper method for string input
    private String selectName(){
        Scanner input = new Scanner(System.in);
        String name;
        //make sure the name has a capital letter and lower case
        //make sure the name is a string
        do {
            System.out.println("Please enter a valid student name: (Only letters will be accepted)");
            name = input.nextLine();
        }while(!name.matches("[a-zA-z ]*"));

	    return name;
    }

    //helper method double input for score
    private double selectScore(){
        Scanner input = new Scanner(System.in);
        Double score;
        do {
            System.out.println("Please enter a valid score: (Only numbers [0-100] will be accepted)");
            score = input.nextDouble();
        }while(!(score <= 100 && score >= 0));
        return score;
    }

	public void setName(String name) {
		this.name = name;    //.this method allows us to specify the instance variable over variable passed to the method
		//this.r is the r variable on line 6.
	}



	//two methods to act as overload method. setScore should run if a double is passed, and default to %/
    //second setscore method will accept two args: score, and the divisor whether that be decimal, percentage, or rational number.
	public void setScore(Double score) {
		this.score = score;
		this.percentage = "%";
	}
    public void setScore(Double score, String percentage){
	    this.score = score;

	    /* pseudo code
	     if percentage == decimal
	         this.score = score * 100
	       elseif percentage == /10
	         this.score = score / 10
	         else
	            this.score = score
	        end
	     */

	    this.percentage = percentage;
    }

    public String getPercentage(){ return (this.percentage); }

	public double getScore() {
		return (this.score);
	}

	public String getName() {
		return (this.name);
	}
	public String getGrade(){
		double min_score = this.score / 10 ;
		if (min_score >= 9) {
			this.grade = "A";
		} else if (min_score >= 8) {
			this.grade = "B";
		} else if (min_score >= 7) {
			this.grade = "C";
		} else if (min_score >= 6) {
			this.grade = "D";
		} else {
			this.grade = "F";
		}
		return (this.grade);
	}

}