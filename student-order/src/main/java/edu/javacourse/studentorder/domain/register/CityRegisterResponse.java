package edu.javacourse.studentorder.domain.register;

public class CityRegisterResponse {
    private boolean registered;
    private boolean temporal;

    public boolean getRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public boolean isTemporal() {
        return temporal;
    }

    public void setTemporal(boolean temporal) {
        this.temporal = temporal;
    }

    @Override
    public String toString() {
        return "CityRegisterCheckerResponse{" +
                "existing=" + registered +
                ", temporal=" + temporal +
                '}';
    }
}
