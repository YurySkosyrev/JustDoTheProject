package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();

    }

    private static long saveStudentOrder(StudentOrder so){
        System.out.println("saveStudentOrder");
        return -1;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        Adult husband = new Adult("Васильев","Андрей", "Петрович", null);
        return so;
    }
}
