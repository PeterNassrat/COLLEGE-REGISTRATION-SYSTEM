package ProjectPackage;

import ToolsPackage.*;
import java.util.Scanner;
import java.util.ArrayList;

public class TheProgram {

    public static void main(String[] args) throws Exception {
        Scanner Sc1 = new Scanner(System.in);
        Options Op = new Options();
        ArrayList<Students> students = new ArrayList();
        ArrayList<Employees> employees = new ArrayList();
        boolean FirstTime = true;
        OUTER:
        while (true) {
            try {
                int operationType;
                if (FirstTime == true) {
                    operationType = Op.ChooseOptionType(Sc1);
                    FirstTime = false;
                } else {
                    operationType = Op.ChooseNewOptionType(Sc1);
                }
                switch (operationType) {
                    case 1:
                        int PersonType = Op.PersonTypeToAdd(Sc1);
                        switch (PersonType) {
                            case 1:
                                Students student = new Students(Sc1);
                                if (Op.isExistPerson(student.getNationalIdNumber(),
                                        students, employees) != -1) {
                                    System.out.printf("Student's National ID Number already exists!\n");
                                } else {
                                    students.add(student);
                                    System.out.printf("Student's Information added successfully\n");
                                }
                                break;
                            case 2:
                                Employees employee = new Employees(Sc1);
                                if (Op.isExistPerson(employee.getNationalIdNumber(),
                                        students, employees) != -1) {
                                    System.out.printf("Employee's National ID Number already exists!\n");
                                } else {
                                    employees.add(employee);
                                    System.out.printf("Employee's Information added successfully\n");
                                }
                                break;
                        }
                        break;
                    case 2:
                        if (students.isEmpty() && employees.isEmpty()) {
                            System.out.printf("There are no Persons added\n");
                        } else {
                            String NationalIdNumber = Op.getNationalIdNumber(Sc1);
                            if (Op.isExistPerson(NationalIdNumber, students, employees) != -1) {
                                System.out.printf("Are you sure to delete this Person's Information?"
                                        + "\nA Person's information will delete permanently!"
                                        + "\n1 --> YES\n2 --> NO\n");
                                int Sure = Sc1.nextInt();
                                while (Sure != 1 && Sure != 2) {
                                    System.out.printf("Choose 1 or 2!\n");
                                    Sure = Sc1.nextInt();
                                }
                                if (Sure == 1) {
                                    if (Op.isExistStudent(NationalIdNumber, students) != -1) {
                                        students.remove(Op.isExistStudent(NationalIdNumber, students));
                                    } else {
                                        employees.remove(Op.isExistEmployee(NationalIdNumber, employees));
                                    }
                                    System.out.printf("Person's Information deleted successfully\n");
                                }
                            } else {
                                System.out.printf("Person's National ID Number does not exist!\n");
                            }
                        }
                        break;
                    case 3:
                        if (students.isEmpty() && employees.isEmpty()) {
                            System.out.printf("There are no Persons added\n");
                        } else {
                            String NationalIdNumber = Op.getNationalIdNumber(Sc1);
                            int Indexofperson = Op.isExistPerson(NationalIdNumber, students, employees);
                            if (Indexofperson != -1) {
                                if (Op.isExistStudent(NationalIdNumber, students) != -1) {
                                    int EditType = Op.ChooseEditStudentOption(Sc1);
                                    Op.EditStudentInfo(EditType, students.get(Indexofperson), Sc1);
                                } else {
                                    int EditType = Op.ChooseEditEmployeeOpion(Sc1);
                                    Op.EditEmployeeInfo(EditType, employees.get(Indexofperson), Sc1);
                                }
                            } else {
                                System.out.printf("Person's National ID Number does not exist!\n");
                            }
                        }
                        break;
                    case 4:
                        int DisplayType = Op.ChooseDisplayOption(Sc1);
                        switch (DisplayType) {
                            case 1:
                                if (students.isEmpty() && employees.isEmpty()) {
                                    System.out.printf("There are no Persons added\n");
                                } else {
                                    String NationalIdNumber = Op.getNationalIdNumber(Sc1);
                                    int Indexofperson = Op.isExistPerson(NationalIdNumber, students, employees);
                                    if (Indexofperson != -1) {
                                        if (Op.isExistStudent(NationalIdNumber, students) != -1) {
                                            Op.DisplayStudentInfo(Indexofperson, students);
                                        } else {
                                            Op.DisplayEmployeeInfo(Indexofperson, employees);
                                        }
                                    } else {
                                        System.out.printf("Person's National ID Number does not exist!\n");
                                    }
                                }
                                break;
                            case 2:
                                Op.DisplayStudentsInfo(students);
                                break;
                            case 3:
                                Op.DisplayEmployeesInfo(employees);
                                break;
                            case 4:
                                Op.DisplayPersonsInfo(students, employees);
                                break;
                        }
                        break;
                    default:
                        break OUTER;
                }
            } catch (Exception e) {
                Sc1.nextLine();
                System.out.printf("An Error occurred!\n");
                System.out.printf(e + "\n");
                System.out.printf("Make sure that you entered a valid type of input!\n");
            }
        }
    }
}
