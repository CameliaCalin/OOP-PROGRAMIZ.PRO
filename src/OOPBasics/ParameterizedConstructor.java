package OOPBasics;

import java.util.Scanner;/*Create a program to assign a student's grade based on the exam score.

Grading Criteria: If the score is

greater than or equal to 90, grade is A.
greater than or equal to 80, grade is B.
less than 80, grade is C.*/
public class ParameterizedConstructor {
     int score;
     char grade;

     //assign value to score
     ParameterizedConstructor( int score){
         this.score = score;
     }

     void assignGrade() {
         //assign grade based on the value
         if (this.score >= 90){
             this.grade = 'A';
         }
         else if (this.score >= 80){
             this.grade = 'B';
         }
         else {
             this.grade = 'C';
         }

     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter student's score: ");
        int score = input.nextInt();

        ParameterizedConstructor student = new ParameterizedConstructor(score);
        student.assignGrade();
        System.out.println(student.grade);

    }

}




