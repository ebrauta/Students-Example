package main.java.ebr;

import java.util.Scanner;

public class Student {
    //Variables
    private String firstName;
    private String lasName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuittionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lasName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }
    //Generate ID
    private void setStudentID(){
        //GradeLevel + ID
        id++;
        this.studentID =  gradeYear + "" + id;
    }
    //Enroll the courses
    public void enroll(){
        //Get inside a loop, user hints 0
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n     " + course;
                tuittionBalance += costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuittionBalance);
    }

    //Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuittionBalance -= payment;
        System.out.println("Thank you for you payment of $" + payment);
        viewBalance();
    }

    //Show status
    public String toString(){
        return "Name: " + firstName + " " + lasName + 
        "\nGrade Level: " + gradeYear + 
        "\nStudent ID: " + studentID +
        "\nCourses Enrolled: " + courses + 
        "\nBalance: $" + tuittionBalance;
    } 
}
