/**************************************************************************************
 * StudentDriver
 * Max Mahlke
 This class drives the Student object, and handles menu functionality + i/o
 ************************************************************************************* */

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentDriver
{

    //output menu for user interface
    public void menu(){
        System.out.println("Welcome to TestScore averaging 9000!");
        System.out.println("1) Create new class average. ");
        System.out.println("2) Modify existing average. ");
        System.out.println("3) Select a class.");
        System.out.println();
    }



    static Scanner input = new Scanner(System.in); //setup scanner object to utilize the (input) variable
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //setup scanner object to utilize the (input) variable



        double total = 0;
        int count;
        System.out.println("Please input # of scores: ");
        count = input.nextInt();
        ArrayList<Student> objArray = new ArrayList<Student>();

    //now, we need to assign a name and score to each possible index to the array of [count] size
    for(int i = 0; i<count ; i++){
        objArray.add(new Student());
    }//end of for


    for (Student i : objArray) {
        total += i.getScore();
    }

    //receipt output of scores
        for (Student i : objArray) {
            System.out.println("Student #" + (objArray.indexOf(i)+1) + ") Name: " + i.getName());
            System.out.println("Student #" + (objArray.indexOf(i)+1) + ") Score: " + i.getScore());
            System.out.println("Student #" + (objArray.indexOf(i)+1) + ") Grade: " + i.getGrade());
            System.out.println("---------");
        }

		System.out.println("Total:");
		System.out.println(total);
		System.out.println("Average: ");
		System.out.println(total/count);
    }


    public void checkInt(int num){
        if (input.hasNextInt()){
            num = input.nextInt();
        }
    }
    public void checkString(){}
}
