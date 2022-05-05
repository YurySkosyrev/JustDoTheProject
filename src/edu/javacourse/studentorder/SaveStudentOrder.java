package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.sethFirstName("Алексей");
        so.sethLastName("Петров");
        so.setwFirstName("Галина");
        so.setwLastName("Петрова");
        long ans = saveStudentOrder(so);
    }

    private static long saveStudentOrder(StudentOrder so){
        System.out.println("saveStudentOrder");
        return -1;
    }
}
