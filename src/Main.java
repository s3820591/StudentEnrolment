import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("Welcome to Enrollment app!!!");
        System.out.println("Which actions you want to do? (Input the number)");
        System.out.println("1. Add enrolment");
        System.out.println("2. Update enrolment");
        System.out.println("3: Print 1 enrolment");
        System.out.println("4: Print all enrolments");
        System.out.println("5: Exit");
        System.out.print("Input: ");
    }

    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i != 5){
            menu();
            Scanner input = new Scanner(System.in);
            i = input.nextInt();
            if (i == 1){
                input.nextLine();
                System.out.print("Please provide student id: ");
                String sid = input.nextLine();
                System.out.print("Please provide student name: ");
                String sname = input.nextLine();
                System.out.print("Please provide birthday (dd/MM/yyyy): ");
                String birth = input.nextLine();
                Date birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
                Student s = new Student(sid, sname, birthday);

                System.out.print("Please provide course id: ");
                String cid = input.nextLine();
                System.out.print("Please provide course name: ");
                String cname = input.nextLine();
                System.out.print("Please provide credit: ");
                int credit = input.nextInt();
                Course c = new Course(cid, cname, credit);

                System.out.print("Please provide semester: ");
                String semester = input.nextLine();

                StudentEnrolment se = new StudentEnrolment(s, c, semester);

                se.add();
            }

            else if (i == 2){
                input.nextLine();
                System.out.println("Input semester that you want to update");
                String semester = input.nextLine();
                System.out.println("Input student id that you want to update");
                String id = input.nextLine();

                StudentEnrolment se = new StudentEnrolment(id, semester);
                se.getOne();
                se.update();
                int j = input.nextInt();
                if (i == 1){
                    se.add();
                }
                else if (i == 2){
                    se.delete();
                }
            }

            else if(i == 3){
                input.nextLine();
                System.out.println("Input semester that you want to update");
                String semester = input.nextLine();
                System.out.println("Input student id that you want to update");
                String id = input.nextLine();

                StudentEnrolment se = new StudentEnrolment(id, semester);
                se.getOne();
            }

            else if(i == 4){
                StudentEnrolment se = new StudentEnrolment();
                se.getAll();
            }
        }

    }
}
