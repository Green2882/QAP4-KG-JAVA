
import java.io.Serializable;

public class Patient implements Serializable {

    // Instance variables
    private int patientId;
    private String patientFirstName;
    private String patientLastName;
    private String patientDOB;

    // Constructors
    public Patient() {
    }

    public Patient(int patientId, String patientFirstName, String patientLastName, String patientDOB) {
        this.patientId = patientId;
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientDOB = patientDOB;
    }

    // Getters and Setters
    public int getPatientId() {

        return this.patientId;
    }

    public void setPatientId(int patientId) {

        this.patientId = patientId;
    }

    public String getPatientFirstName() {

        return this.patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {

        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {

        return this.patientLastName;
    }

    public void setPatientLastName(String patientLastName) {

        this.patientLastName = patientLastName;
    }

    public String getPatientDOB() {

        return this.patientDOB;
    }

    public void setPatientDOB(String patientDOB) {

        this.patientDOB = patientDOB;
    }

    // toString
    @Override
    public String toString() {
        return ("Patient ID: " + this.getPatientId()
                + ", First Name: " + this.getPatientFirstName()
                + ", Last Name: " + this.getPatientLastName()
                + ", DOB: " + this.getPatientDOB());
    }
}
