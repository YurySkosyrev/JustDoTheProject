package edu.javacourse.studentorder.domain.wedding;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder {
   private long studentOrderId;
   private StudentOrderStatus studentOrderStatus;
   private LocalDateTime studentOrderDate;
   private Adult husband;
   private Adult wife;
   private List<Child> children;
   private String marriageCertificateId;
   private LocalDate marriageDate;
   private RegisterOffice marriageOffice;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void addChild(Child child) {
        if (children == null)
            children = new ArrayList<>(5);

        children.add(child);
    }

    public void setMarriageCertificateId(String marriageCertificateId) {
        this.marriageCertificateId = marriageCertificateId;
    }

    public RegisterOffice getMarriageOffice() {
        return marriageOffice;
    }

    public void setMarriageOffice(RegisterOffice marriageOffice) {
        this.marriageOffice = marriageOffice;
    }

    public StudentOrderStatus getStudentOrderStatus() {
        return studentOrderStatus;
    }

    public void setStudentOrderStatus(StudentOrderStatus studentOrderStatus) {
        this.studentOrderStatus = studentOrderStatus;
    }

    public LocalDateTime getStudentOrderDate() {
        return studentOrderDate;
    }

    public void setStudentOrderDate(LocalDateTime studentOrderDate) {
        this.studentOrderDate = studentOrderDate;
    }

    public String getMarriageCertificateId() {
        return marriageCertificateId;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudentOrder{");
        sb.append("studentOrderId=").append(studentOrderId);
        sb.append(", studentOrderStatus=").append(studentOrderStatus);
        sb.append(", studentOrderDate=").append(studentOrderDate);
        sb.append(", husband=").append(husband);
        sb.append(", wife=").append(wife);
        sb.append(", children=").append(children);
        sb.append(", marriageCertificateId='").append(marriageCertificateId).append('\'');
        sb.append(", marriageDate=").append(marriageDate);
        sb.append(", marriageOffice=").append(marriageOffice);
        sb.append('}');
        return sb.toString();
    }
}
