package edu.javacourse.studentorder.domain.wedding;

public class RegisterOffice {
    private Long officeId;
    private String officeAreaId;
    private String officeName;

    public RegisterOffice() {
    }

    public RegisterOffice(Long pfficeId, String officeAreaId, String officeName) {
        this.officeId = pfficeId;
        this.officeAreaId = officeAreaId;
        this.officeName = officeName;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public String getOfficeAreaId() {
        return officeAreaId;
    }

    public void setOfficeAreaId(String officeAreaId) {
        this.officeAreaId = officeAreaId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RegisterOffice{");
        sb.append("officeId=").append(officeId);
        sb.append(", officeAreaId='").append(officeAreaId).append('\'');
        sb.append(", officeName='").append(officeName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
