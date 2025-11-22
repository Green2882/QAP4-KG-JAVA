
import java.io.Serializable;

public class Drug implements Serializable {

    // Instance variables
    private int drugId;
    private String drugName;
    public double drugCost;
    public double dosage;

    // Constrcutors
    public Drug() {
    }

    public Drug(int drugId, String drugName, double drugCost, double dosage) {

        this.drugId = drugId;
        this.drugName = drugName;
        this.drugCost = drugCost;
        this.dosage = dosage;
    }

    // Getters and Setters
    public int getDrugId() {

        return this.drugId;
    }

    public void setDrugId(int drugId) {

        this.drugId = drugId;
    }

    public String getDrugName() {

        return this.drugName;
    }

    public void setDrugName(String drugName) {

        this.drugName = drugName;
    }

    public double getDrugCost() {

        return this.drugCost;
    }

    public void setDrugCost(double drugCost) {

        this.drugCost = drugCost;
    }

    public double getDosage() {

        return this.dosage;
    }

    public void setDosage(double dosage) {

        this.dosage = dosage;
    }

    // toString
    @Override
    public String toString() {

        return ("Drug: " + this.getDrugName()
                + ", ID: " + this.getDrugId()
                + ", Cost: " + this.getDrugCost()
                + ", Dosage: " + this.getDosage());
    }
}
