/*
Example: Suppose consider we working of LibraryManagment 
application for particular college and college has inbuilt student database 
and the objective of this project is issue book only to college student not 
outsider 
When student ask about book first we check the student id from college database 
if we found student id then we can issue the book to college student and if we 
not found student id in database then system should not issue book 

*/
import java.util.*;

class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Library {
    private Student[] s;
    private boolean status = false;

    public void setStudent(Student... s) {
        this.s = s;
    }

    public boolean isIssueBook(int id, String name) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].getId() == id && name.equals(s[i].getName())) {
                status = true;
                break;
            }
        }
        return status;
    }
}

public class EncapsulationQ1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library li = new Library();

        Student st[] = new Student[3];

        for (int i = 0; i < st.length; i++) {
            st[i] = new Student();

            System.out.print("Enter Student Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            st[i].setId(id);
            st[i].setName(name);
        }

        li.setStudent(st);

        System.out.println("\nEnter Student Id for book issue:");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String sname = sc.nextLine();

        boolean result = li.isIssueBook(sid, sname);

        if (result) {
            System.out.println(" Book issued to student");
        } else {
            System.out.println("Student not found. Book not issued");
        }
    }
}