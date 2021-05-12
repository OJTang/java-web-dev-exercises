package exercises;
import java.util.*;


public class HashmapPractice {
    public static void main (String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;


        do {
            System.out.print("Enter your student's name (or ENTER to finish): ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer studentID = input.nextInt();
                students.put(studentID, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));
        input.close();

        System.out.println("\nClass roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.print(("\n" + student.getValue() + "'s ID: " + student.getKey()));
        }
        System.out.print(("\nNumber of students in roster: " + students.size()));
    }
}
