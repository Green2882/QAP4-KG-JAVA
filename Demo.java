
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            // ===== MAIN MENU =====
            System.out.println("\n==== Main Menu ====");
            System.out.println("P. Patient Menu");
            System.out.println("D. Drug Menu");
            System.out.println("X. Exit");
            System.out.print("Enter choice: ");

            String choice = in.nextLine().toUpperCase();

            switch (choice) {

                // Menu if pateint option chosen
                case "P":
                    System.out.println("\n==== Patient Menu ====");
                    System.out.println("A. Write patient info to database");
                    System.out.println("B. Read patient info from database");
                    System.out.println("C. Write patient info to text file");
                    System.out.println("D. Read patient info from text file");
                    System.out.print("Enter choice: ");

                    String patientChoice = in.nextLine().toUpperCase();

                    switch (patientChoice) {

                        case "A":
                            // writePatientDB();
                            System.out.println("Writing patient info to DB...");
                            break;

                        case "B":
                            // readPatientDB();
                            System.out.println("Reading patient info from DB...");
                            break;

                        case "C":
                            // writePatientFile();
                            System.out.println("Writing patient info to file...");
                            break;

                        case "D":
                            // readPatientFile();
                            System.out.println("Reading patient info from file...");
                            break;

                        default:
                            System.out.println("Invalid patient menu choice.");
                            break;
                    }
                    break;

                // Menu if drug option chosen
                case "D":
                    System.out.println("\n==== Drug Menu ====");
                    System.out.println("A. Write drug info to database");
                    System.out.println("B. Read drug info from database");
                    System.out.println("C. Write drug info to text file");
                    System.out.println("D. Read drug info from text file");
                    System.out.print("Enter choice: ");

                    String drugChoice = in.nextLine().toUpperCase();

                    switch (drugChoice) {
                        case "A":
                            // writeDrugDB();
                            System.out.println("Writing drug info to DB...");
                            break;

                        case "B":
                            // readDrugDB();
                            System.out.println("Reading drug info from DB...");
                            break;

                        case "C":
                            // writeDrugFile();
                            System.out.println("Writing drug info to file...");
                            break;

                        case "D":
                            // readDrugFile();
                            System.out.println("Reading drug info from file...");
                            break;

                        default:
                            System.out.println("Invalid drug menu choice.");
                            break;

                    }
                    break;

                case "X":
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid main menu choice.");
                    break;
            }
        }
    }
}
