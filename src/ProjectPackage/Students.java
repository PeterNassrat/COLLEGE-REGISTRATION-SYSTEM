package ProjectPackage;

import java.util.Scanner;
import java.util.regex.*;

public class Students extends Persons {

    private int Level;
    private double GPA;
    private String AcademicEmail;
    private String ID;
    private String Department;

    public Students(Scanner Sc) {
        super(Sc);
        this.setLevel(Sc);
        this.setGPA(Sc);
        this.setAcademicEmail(Sc);
        this.setID(Sc);
        this.setDepartment(Sc);
    }

    public final void setLevel(Scanner Sc) {
        System.out.printf("Enter Level: ");
        int level = Sc.nextInt();
        while (!(this.isValidLevel(level))) {
            System.out.printf("Invalid Level!\n");
            System.out.printf("Enter Level again: ");
            level = Sc.nextInt();
        }
        Level = level;
    }

    public boolean isValidLevel(int Level) {
        boolean isValid = false;
        if (Level >= 1 && Level <= 4) {
            isValid = true;
        }
        return isValid;
    }

    public int getLevel() {
        return Level;
    }

    public final void setGPA(Scanner Sc) {
        System.out.printf("Enter GPA: ");
        double gPA = Sc.nextDouble();
        while (!(this.isValidGPA(gPA))) {
            System.out.printf("Invalid GPA!\n");
            System.out.printf("Enter GPA again: ");
            gPA = Sc.nextDouble();
        }
        GPA = gPA;
    }

    public boolean isValidGPA(double GPA) {
        boolean isValid = false;
        if (GPA >= 0.0 && GPA <= 4.0) {
            isValid = true;
        }
        return isValid;
    }

    public double getGPA() {
        return GPA;
    }

    public final void setAcademicEmail(Scanner Sc) {
        System.out.printf("Enter Academic Email: ");
        String academicEmail = Sc.next();
        while (!(this.isValidAcademicEmail(academicEmail))) {
            System.out.printf("Invalid Academic Email!\n");
            System.out.printf("Enter Academic Email again: ");
            academicEmail = Sc.next();
        }
        AcademicEmail = academicEmail;
    }

    public boolean isValidAcademicEmail(String AcademicEmail) {
        boolean isValid = false;
        Matcher matchingEmail = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(AcademicEmail);
        int numberOfMatching = 0;
        while (matchingEmail.find() == true) {
            numberOfMatching++;
            if (numberOfMatching > 1) {
                break;
            }
        }
        if (numberOfMatching == 1) {
            isValid = true;
        }
        return isValid;
    }

    public String getAcademicEmail() {
        return AcademicEmail;
    }

    public final void setID(Scanner Sc) {
        System.out.printf("Enter ID: ");
        String iD = Sc.next();
        while (!(this.isValidID(iD))) {
            System.out.printf("Invalid ID!\n");
            System.out.printf("Enter ID again: ");
            iD = Sc.next();
        }
        ID = iD;
    }

    public boolean isValidID(String ID) {
        boolean isValid = false;
        if (ID.length() == 9) {
            isValid = true;
        }
        return isValid;
    }

    public String getID() {
        return ID;
    }

    public final void setDepartment(Scanner Sc) {
        System.out.printf("Enter Department: \n1 --> Computer Science\n2 --> Information Systems\n"
                + "3 --> Information Technology\n4 --> Multi-Media\n5 --> Software Engineering\n"
                + "6 --> Biology Informatics\n7 --> General\n");
        int department = Sc.nextInt();
        while (!(department >= 1 && department <= 7)) {
            System.out.printf("Choose from 1 to 7\n");
            department = Sc.nextInt();
        }
        String Departments[] = {"", "Computer Science", "Information Systems", "Information Technology",
            "Multi-Media", "Software Engineering", "Biology Informatics", "General"};
        Department = Departments[department];
    }

    public String getDepartment() {
        return Department;
    }

    public void DisplayLevel() {
        System.out.printf("Level: %d\n", this.getLevel());
    }

    public void DisplayGPA() {
        System.out.printf("GPA: %.2f\n", this.getGPA());
    }

    public void DisplayAcademicEmail() {
        System.out.printf("Academic Email: %s\n", this.getAcademicEmail());
    }

    public void DisplayID() {
        System.out.printf("Faculty ID: %s\n", this.getID());
    }

    public void DisplayDepartment() {
        System.out.printf("Dpartment: %s\n", this.getDepartment());
    }

    public boolean isValidNewLevel(int Level) {
        boolean isValid = false;
        if (Level >= this.Level && Level <= 4) {
            isValid = true;
        }
        return isValid;
    }

    public void EditLevel(Scanner Sc) {
        System.out.printf("Enter new Level: ");
        int level = Sc.nextInt();
        while (!(this.isValidNewLevel(level))) {
            System.out.printf("Invalid Level!\n");
            System.out.printf("Enter new Level again: ");
            level = Sc.nextInt();
        }
        Level = level;
    }

    public void EditGPA(Scanner Sc) {
        System.out.printf("Enter new GPA: ");
        double gPA = Sc.nextDouble();
        while (!(this.isValidGPA(gPA))) {
            System.out.printf("Invalid GPA!\n");
            System.out.printf("Enter new GPA again: ");
            gPA = Sc.nextDouble();
        }
        GPA = gPA;
    }

    public void EditDepartment(Scanner Sc) {
        System.out.printf("Enter new Department: \n1 --> Computer Science\n2 --> Information Systems\n"
                + "3 --> Information Technology\n4 --> Multi-Media\n5 --> Software Engineering\n"
                + "6 --> Biology Informatics\n7 --> General\n");
        int department = Sc.nextInt();
        while (!(department >= 1 && department <= 7)) {
            System.out.printf("Choose from 1 to 7\n");
            department = Sc.nextInt();
        }
        String Departments[] = {"", "Computer Science", "Information Systems", "Information Technology",
            "Multi-Media", "Software Engineering", "Biology Informatics", "General"};
        Department = Departments[department];
    }

    @Override
    public String toString() {
        return "Student Information: ";
    }
}
