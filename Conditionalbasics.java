package Learncondition;

import javax.swing.*;

public class Conditionalbasics {
    public static void main(String[] args) {
        //     1-24
        //     1-6=goodnight
        //     6-11=good morning
        //     11-16=good afternoon
        //     16-20=good evening
        //     20-24=good night
        int time = 2;
        if (time > 20 && time <= 24)
            System.out.println("good night");
        else if (time > 16 && time <= 20)
            System.out.println("good evening");
        else if (time > 11 && time <= 16)
            System.out.println("good afternoon");
        else if (time > 6 && time <= 11)
            System.out.println("good morning");
        else if (time > 1 && time <= 6)
            System.out.println("good night");
        else
            System.out.println("invalid time");

// marks 80 - 100 = a grade
// marks 60 - 80 = b grade
// marks 45- 60 = c grade
        // marks 33 - 45 = d grade
        // marks 0 - 33 = failed

//         marks = 450;
//        if (marks > 80 && marks <= 1000)
//            System.out.println("a grade");
//        else if (marks > 60 && marks <= 80) {
//            System.out.println("b grade");
//        } else if (marks > 45 && marks <= 60) {
//            System.out.println("c grade");
//        } else if (marks int> 33 && marks <= 45) {
//            System.out.println("d grade");
//        } else if (marks > 0 && marks <= 33) {
//            System.out.println("failed");
//        } else
//            System.out.println("invalid marks");
//

        //      int time  = 18;
        //      if (time < 10)
        //          System.out.println("good morning");
        //      else if (time > 10)
        //      {  System.out.println("good day");}
        //      else {
        //          System.out.println("good evening");
        //      } if (time > 1.00)
        //      System.out.println("good afternoon");
        //      else if (time < 23 )
        //      {
        //          System.out.println("good night");

        }

    }


