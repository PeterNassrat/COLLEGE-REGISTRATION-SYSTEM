package ToolsPackage;

import ProjectPackage.*;
import java.util.*;

public class Options {

    public int ChooseOptionType(Scanner Sc) {
        System.out.printf("Choose an Operation: \n1 --> Add a Person's Information\n2 --> Delete a Person's Information\n"
                + "3 --> Edit a Person's Information\n4 --> Display\n5 --> Exit\n");
        int operationType = Sc.nextInt();
        while (!(operationType >= 1 && operationType <= 5)) {
            System.out.printf("Choose from 1 to 5!\n");
            operationType = Sc.nextInt();
        }
        return operationType;
    }

    public int ChooseNewOptionType(Scanner Sc) {
        System.out.printf("Choose another Operation: \n1 --> Add a Person's Information\n2 --> Delete a Person's Information\n"
                + "3 --> Edit a Person's Information\n4 --> Display\n5 --> Exit\n");
        int operationType = Sc.nextInt();
        while (!(operationType >= 1 && operationType <= 5)) {
            System.out.printf("Choose from 1 to 5!\n");
            operationType = Sc.nextInt();
        }
        return operationType;
    }

    public int PersonTypeToAdd(Scanner Sc) {
        int PersonType;
        System.out.printf("1 --> Student\n2 --> Employee\n");
        PersonType = Sc.nextInt();
        while (PersonType != 1 && PersonType != 2) {
            System.out.printf("Choose 1 or 2\n");
            PersonType = Sc.nextInt();
        }
        return PersonType;
    }

    public void DisplayPersonsInfo(ArrayList<Students> students, ArrayList<Employees> employees) {
        if (students.isEmpty() && employees.isEmpty()) {
            System.out.printf("There are no Persons added\n");
        } else {
            for (int i = 0; i < students.size(); i++) {
                this.DisplayStudentInfo(i, students);
            }
            for (int i = 0; i < employees.size(); i++) {
                this.DisplayEmployeeInfo(i, employees);
            }
        }
    }

    public void DisplayStudentsInfo(ArrayList<Students> students) {
        if (students.isEmpty()) {
            System.out.printf("There are no Students added\n");
        } else {
            for (int i = 0; i < students.size(); i++) {
                this.DisplayStudentInfo(i, students);
            }
        }
    }

    public void DisplayEmployeesInfo(ArrayList<Employees> employees) {
        if (employees.isEmpty()) {
            System.out.printf("There are no Employees added\n");
        } else {
            for (int i = 0; i < employees.size(); i++) {
                this.DisplayEmployeeInfo(i, employees);
            }
        }
    }

    public int isExistStudent(String NationalIdNumber, ArrayList<Students> students) {
        int isExist = -1;
        for (int i = 0; i < students.size(); i++) {
            if (NationalIdNumber.equals(students.get(i).getNationalIdNumber())) {
                isExist = i;
                break;
            }
        }
        return isExist;
    }

    public int isExistEmployee(String NationalIdNumber, ArrayList<Employees> employees) {
        int isExist = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (NationalIdNumber.equals(employees.get(i).getNationalIdNumber())) {
                isExist = i;
                break;
            }
        }
        return isExist;
    }

    public int isExistPerson(String NationalIdNumber, ArrayList<Students> students, ArrayList<Employees> employees) {
        int isExist = -1;
        for (int i = 0; i < students.size(); i++) {
            if (NationalIdNumber.equals(students.get(i).getNationalIdNumber())) {
                isExist = i;
                break;
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            if (NationalIdNumber.equals(employees.get(i).getNationalIdNumber())) {
                isExist = i;
                break;
            }
        }
        return isExist;
    }

    public void EditStudentInfo(int EditType, Students Person, Scanner Sc) {
        switch (EditType) {
            case 1:
                Person.EditAge(Sc);
                break;
            case 2:
                Person.EditPhoneNumber(Sc);
                break;
            case 3:
                Person.EditEmail(Sc);
                break;
            case 4:
                Person.EditAddress(Sc);
                break;
            case 5:
                Person.EditLevel(Sc);
                break;
            case 6:
                Person.EditGPA(Sc);
                break;
            default:
                Person.EditDepartment(Sc);
                break;
        }
    }

    public void EditEmployeeInfo(int EditType, Employees Person, Scanner Sc) {
        switch (EditType) {
            case 1:
                Person.EditAge(Sc);
                break;
            case 2:
                Person.EditPhoneNumber(Sc);
                break;
            case 3:
                Person.EditEmail(Sc);
                break;
            case 4:
                Person.EditAddress(Sc);
                break;
            default:
                Person.EditSalary(Sc);
                break;
        }
    }

    public String getNationalIdNumber(Scanner Sc) {
        String NationalIdNumber;
        System.out.printf("Enter Person's National ID Number: ");
        NationalIdNumber = Sc.next();
        while (NationalIdNumber.length() != 14) {
            System.out.printf("Invalid National ID Number!\n");
            System.out.printf("Enter Person's National ID Number again: ");
            NationalIdNumber = Sc.next();
        }
        return NationalIdNumber;
    }

    public int ChooseEditStudentOption(Scanner Sc) {
        System.out.printf("1 --> Age\n2 --> Phone Number\n3 --> Email\n4 --> Address\n5 --> Level\n6 --> GPA\n7 --> Department\n");
        int EditType = Sc.nextInt();
        while (!(EditType >= 1 && EditType <= 7)) {
            System.out.printf("Choose from 1 to 7\n");
            EditType = Sc.nextInt();
        }
        return EditType;
    }

    public int ChooseEditEmployeeOpion(Scanner Sc) {
        System.out.printf("1 --> Age\n2 --> Phone Number\n3 --> Email\n4 --> Address\n5 --> Salary\n");
        int EditType = Sc.nextInt();
        while (!(EditType >= 1 && EditType <= 5)) {
            System.out.printf("Choose from 1 to 5\n");
            EditType = Sc.nextInt();
        }
        return EditType;
    }

    public int ChooseDisplayOption(Scanner Sc) {
        System.out.printf("1 --> Display a Person's Information\n2 --> Display all Students' Information\n"
                + "3 --> Display all Employees' Information\n4 --> Display all Persons' Information\n");
        int DisplayType = Sc.nextInt();
        while (!(DisplayType >= 1 && DisplayType <= 4)) {
            System.out.printf("Choose from 1 to 4!\n");
            DisplayType = Sc.nextInt();
        }
        return DisplayType;
    }

    public void DisplayStudentInfo(int IndexofStudent, ArrayList<Students> students) {
        students.get(IndexofStudent).DisplayPersonType(IndexofStudent);
        students.get(IndexofStudent).DisplayFirstName();
        students.get(IndexofStudent).DisplaySecondName();
        students.get(IndexofStudent).DisplayLastName();
        students.get(IndexofStudent).DisplayFullName();
        students.get(IndexofStudent).DisplayDate_of_Birth();
        students.get(IndexofStudent).DisplayAge();
        students.get(IndexofStudent).DisplayGender();
        students.get(IndexofStudent).DisplayNationalIdNumber();
        students.get(IndexofStudent).DisplayAddress();
        students.get(IndexofStudent).DisplayPhoneNumber();
        students.get(IndexofStudent).DisplayEmail();
        students.get(IndexofStudent).DisplayLevel();
        students.get(IndexofStudent).DisplayGPA();
        students.get(IndexofStudent).DisplayID();
        students.get(IndexofStudent).DisplayAcademicEmail();
        students.get(IndexofStudent).DisplayDepartment();
    }

    public void DisplayEmployeeInfo(int IndexofEmployee, ArrayList<Employees> employees) {
        employees.get(IndexofEmployee).DisplayPersonType(IndexofEmployee);
        employees.get(IndexofEmployee).DisplayFirstName();
        employees.get(IndexofEmployee).DisplaySecondName();
        employees.get(IndexofEmployee).DisplayLastName();
        employees.get(IndexofEmployee).DisplayFullName();
        employees.get(IndexofEmployee).DisplayDate_of_Birth();
        employees.get(IndexofEmployee).DisplayAge();
        employees.get(IndexofEmployee).DisplayGender();
        employees.get(IndexofEmployee).DisplayNationalIdNumber();
        employees.get(IndexofEmployee).DisplayAddress();
        employees.get(IndexofEmployee).DisplayPhoneNumber();
        employees.get(IndexofEmployee).DisplayEmail();
        employees.get(IndexofEmployee).DisplaySalary();
        employees.get(IndexofEmployee).DisplayWorkDepartment();
        employees.get(IndexofEmployee).DisplayScienceDegree();
        employees.get(IndexofEmployee).DisplayFacultyGraduateFrom();
        employees.get(IndexofEmployee).DisplayUniversityGraduateFrom();
    }
}
