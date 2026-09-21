import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallenge{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        // 1. Add Students

        System.out.println("Enter 5 students name: ");
        for(int i=0; i < 5; i++){
            System.out.println("Student " +( i +1 ) + ": ");
            String name = sc.nextLine();
            students.add(name);
        }


        System.out.println("\n ===== Students ======");
        System.out.println(students);

        // 2. Remove Student
        
        System.out.print("\nEnter a student name to remove: ");
        String removeStudent = sc.nextLine();
        if(students.contains(removeStudent)){
            students.remove(removeStudent);
            System.out.println(removeStudent + " removed successfully");
            System.out.println(students);
        }
        else{
            System.out.println(removeStudent + " not found");
        }

        // 3. Update Student

        System.out.print("\nEnter a student name to update: ");
        String updateStudent = sc.nextLine();
        if(students.contains(updateStudent)){
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            students.set(students.indexOf(updateStudent), newName);
            
            System.out.println(students);
        }
        
        else{
            System.out.println(updateStudent + " not found");
        }

        // 4. Search Elements
        
        System.out.print("\nEnter a name to search: ");
        String searchName = sc.nextLine();

        if(students.contains(searchName)){
            System.out.println(searchName + " is present in the list.");
        }
        else{
            System.out.println(searchName + " is not present in the list.");
        }

        // 5. Iterate and display contents

        System.out.println("\n All students :");
        for(String student : students){
            System.out.println(student);
        }
        sc.close();
    }
}