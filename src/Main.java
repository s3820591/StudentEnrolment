import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void firstMenu(){
        System.out.println("Welcome to Enrollment app!!!");
        System.out.println("Which actions you want to do? (Input the number)");
        System.out.println("1. Students");
        System.out.println("2. Courses");
        System.out.println("3: Enrollments");
        System.out.println("4: Exit");
        System.out.print("Input: ");
    }

    public static void studentMenu(){
        System.out.println("Which actions you want to do? (Input the number)");
        System.out.println("1. Add student");
        System.out.println("2. Update student");
        System.out.println("3: Delete student");
        System.out.println("4: Print 1 student");
        System.out.println("5: Print all students");
        System.out.print("Input: ");
    }

    public static void courseMenu(){
        System.out.println("Which actions you want to do? (Input the number)");
        System.out.println("1. Add course");
        System.out.println("2. Update course");
        System.out.println("3: Delete course");
        System.out.println("4: Print 1 course");
        System.out.println("5: Print all courses");
        System.out.print("Input: ");
    }

    public static void enrollMenu(){
        System.out.println("Which actions you want to do? (Input the number)");
        System.out.println("1. Add enrollment");
        System.out.println("2. Update enrollment");
        System.out.println("3: Delete enrollment");
        System.out.println("4: Print 1 enrollment");
        System.out.println("5: Print all enrollments");
        System.out.print("Input: ");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        firstMenu();
        if (input.nextInt() == 1){
            studentMenu();
            if (input.nextInt() == 1){
                //System.out.print("Please provide id: ");
                String id = input.nextLine();
                System.out.print("Please provide name: ");
                String name= input.nextLine();
                System.out.print("Please provide birthday (dd/MM/yyyy): ");
                String birth = input.nextLine();
                Date birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
                Student s = new Student(id, name, birthday);
                s.add();
            }
        }

    }
}
