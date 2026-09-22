import java.util.HashMap;
import java.util.Scanner;

public class HashMapChallenge{
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        
        // 1. Insert key-value pairs
        students.put("Amit", 90);
        students.put("Tarun", 85);
        students.put("Rahul", 95);
        students.put("Nandini", 87);
        students.put("Avani", 70);
        students.put("Sneha", 92);

        System.out.println("Students and marks");
        System.out.println(students);

        // 2. Retrieve a value using a key

        int marks = students.get("Avani");
        System.out.println("Marks of Avani : "+ marks);

        // 3. Update a value

        students.put("Nandini", 99);
        System.out.println("After updating Nandini's marks : "+ students.get("Nandini"));

        // 4. Check whether a key exists

        System.out.println("Enter key to check : ");
        Scanner sc = new Scanner(System.in);
        String findKey = sc.nextLine();

        if(students.containsKey(findKey)){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is not present");
        }

        // 5. Iterate through the entries

        for(String i : students.keySet()){
            System.out.println("Student : "+ i + ", Marks : "+ students.get(i));
        }
       sc.close(); 

    }
}