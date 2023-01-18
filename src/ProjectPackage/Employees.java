package ProjectPackage;

import java.util.Scanner;

public class Employees extends Persons {

    private double Salary;
    private String WorkDepartment;
    private String ScienceDegree;
    private String UniversityGraduateFrom;
    private String FacultyGraduateFrom;

    public Employees(Scanner Sc) {
        super(Sc);
        this.setSalary(Sc);
        this.setWorkDepartment(Sc);
        this.setScienceDegree(Sc);
        this.setUniversityGraduateFrom(Sc);
        this.setFacultyGraduateFrom(Sc);
    }

    public final void setSalary(Scanner Sc) {
        System.out.printf("Enter Salary: ");
        double salary = Sc.nextDouble();
        while (!(this.isValidSalary(salary))) {
            System.out.printf("Invalid Salary!\n");
            System.out.printf("Enter Salary again: ");
            salary = Sc.nextDouble();
        }
        Salary = salary;
    }

    public boolean isValidSalary(double Salary) {
        boolean isValid = false;
        if (Salary > 0.0) {
            isValid = true;
        }
        return isValid;
    }

    public final void setWorkDepartment(Scanner Sc) {
        System.out.printf("Enter WorkDepartment: \n1 --> Adminstrator or Instructor\n"
                + "2 --> Technician\n3 --> Worker\n");
        int departmentType = Sc.nextInt();
        while (!(departmentType >= 1 && departmentType <= 3)) {
            System.out.printf("Choose from 1 to 3\n");
            departmentType = Sc.nextInt();
        }
        String WorkDepartments[] = {"", "Instructor or Administrator", "Technician", "Worker"};
        WorkDepartment = WorkDepartments[departmentType];
    }

    public final void setScienceDegree(Scanner Sc) {
        System.out.printf("Enter Degree Scince: \n1 --> Bachelor\n2 --> Master\n"
                + "3 --> Doctorate\n");
        int scienceDegree = Sc.nextInt();
        while (!(scienceDegree >= 1 && scienceDegree <= 3)) {
            System.out.printf("Choose from 1 to 3\n");
            scienceDegree = Sc.nextInt();
        }
        String ScienceDegrees[] = {"", "Bachelor", "Master", "Doctorate"};
        ScienceDegree = ScienceDegrees[scienceDegree];
    }

    public final void setUniversityGraduateFrom(Scanner Sc) {
        System.out.printf("Enter University (Graduate from): ");
        String universityGraduateFrom = Sc.next();
        while (!(this.isValidUniversityGraduateFrom(universityGraduateFrom))) {
            System.out.printf("Invalid University!\n");
            System.out.printf("Enter University (Graduate from) again: ");
            universityGraduateFrom = Sc.next();
        }
        UniversityGraduateFrom = universityGraduateFrom;
    }

    public boolean isValidUniversityGraduateFrom(String UniversityGraduateFrom) {
        boolean isValid = false;
        if (UniversityGraduateFrom.length() >= 3 && UniversityGraduateFrom.length() <= 30) {
            isValid = true;
        }
        return isValid;
    }

    public final void setFacultyGraduateFrom(Scanner Sc) {
        System.out.printf("Enter Faculty (Graduate from): ");
        String facultyGraduateFrom = Sc.next();
        while (!(this.isValidFacultyGraduateFrom(facultyGraduateFrom))) {
            System.out.printf("Invalid Faculty!\n");
            System.out.printf("Enter Faculty (Graduate from) again: ");
            facultyGraduateFrom = Sc.next();
        }
        FacultyGraduateFrom = facultyGraduateFrom;
    }

    public boolean isValidFacultyGraduateFrom(String FacultyGraduateFrom) {
        boolean isValid = false;
        if (FacultyGraduateFrom.length() >= 3 && FacultyGraduateFrom.length() <= 30) {
            isValid = true;
        }
        return isValid;
    }

    public double getSalary() {
        return Salary;
    }

    public String getWorkDepartment() {
        return WorkDepartment;
    }

    public String getScienceDegree() {
        return ScienceDegree;
    }

    public String getUniversityGraduateFrom() {
        return UniversityGraduateFrom;
    }

    public String getFacultyGraduateFrom() {
        return FacultyGraduateFrom;
    }

    public void DisplaySalary() {
        System.out.printf("Salary: %.2f\n", this.getSalary());
    }

    public void DisplayWorkDepartment() {
        System.out.printf("Work Department: %s\n", this.getWorkDepartment());
    }

    public void DisplayScienceDegree() {
        System.out.printf("Science Degree: %s\n", this.getScienceDegree());
    }

    public void DisplayUniversityGraduateFrom() {
        System.out.printf("University (Graduate from): %s\n", this.getUniversityGraduateFrom());
    }

    public void DisplayFacultyGraduateFrom() {
        System.out.printf("Faculty (Graduate from): %s\n", this.getFacultyGraduateFrom());
    }

    public void EditSalary(Scanner Sc) {
        System.out.printf("Enter new Salary: ");
        double salary = Sc.nextDouble();
        while (!(this.isValidSalary(salary))) {
            System.out.printf("Invalid Salary!\n");
            System.out.printf("Enter new Salary again: ");
            salary = Sc.nextDouble();
        }
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Information: ";
    }
}
