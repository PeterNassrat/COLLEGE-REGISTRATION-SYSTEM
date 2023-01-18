package ProjectPackage;

import ToolsPackage.*;
import java.util.regex.*;
import java.util.Scanner;

public abstract class Persons {

    private String FirstName;
    private String SecondName;
    private String LastName;
    private String FullName;
    private int Age;
    private String NationalIdNumber;
    private String PhoneNumber;
    private String Gender;
    private String Email;
    private Address address;
    private Date_of_Birth date_of_birth;

    public Persons(Scanner Sc) {
        this.setFirstName(Sc);
        this.setSecondName(Sc);
        this.setLastName(Sc);
        this.setFullName();
        this.setDate_of_Birth(Sc);
        this.setAge(Sc);
        this.setGender(Sc);
        this.setNationalIdNumber(Sc);
        this.setPhoneNumber(Sc);
        this.setEmail(Sc);
        this.setAddress(Sc);
    }

    public final void setFirstName(Scanner Sc) {
        System.out.printf("Enter First Name: ");
        String firstName = Sc.next();
        while (!(Persons.isValidFirstName(firstName))) {
            System.out.printf("Invalid Name!\n");
            System.out.printf("Enter First Name again: ");
            firstName = Sc.next();
        }
        this.FirstName = firstName;
    }

    public static boolean isValidFirstName(String FirstName) {
        boolean isValid = false;
        if (FirstName.length() >= 3 && FirstName.length() <= 20) {
            isValid = true;
        }
        return isValid;
    }

    public String getFirstName() {
        return FirstName;
    }

    public final void setSecondName(Scanner Sc) {
        System.out.printf("Enter Second Name: ");
        String secondName = Sc.next();
        while (!(this.isValidSecondName(secondName))) {
            System.out.printf("Invalid Name!\n");
            System.out.printf("Enter Second Name again: ");
            secondName = Sc.next();
        }
        SecondName = secondName;
    }

    public boolean isValidSecondName(String SecondName) {
        boolean isValid = false;
        if (SecondName.length() >= 3 && SecondName.length() <= 20) {
            isValid = true;
        }
        return isValid;
    }

    public String getSecondName() {
        return SecondName;
    }

    public final void setLastName(Scanner Sc) {
        System.out.printf("Enter Last Name: ");
        String lastName = Sc.next();
        while (!(this.isValidLastName(lastName))) {
            System.out.printf("Invalid Name!\n");
            System.out.printf("Enter Last Name again: ");
            lastName = Sc.next();
        }
        LastName = lastName;
    }

    public boolean isValidLastName(String LastName) {
        boolean isValid = false;
        if (LastName.length() >= 3 && LastName.length() <= 20) {
            isValid = true;
        }
        return isValid;
    }

    public String getLastName() {
        return LastName;
    }

    public final void setFullName() {
        FullName = FirstName + " " + SecondName + " " + LastName;
    }

    public String getFullName() {
        return FullName;
    }

    public final void setDate_of_Birth(Scanner Sc) {
        date_of_birth = new Date_of_Birth(Sc);
    }

    public String getDate_of_Birth() {
        String _date_of_birth = Integer.toString(date_of_birth.getMonth())
                + '/' + Integer.toString(date_of_birth.getDay())
                + '/' + Integer.toString(date_of_birth.getYear());
        return _date_of_birth;
    }

    public final void setAge(Scanner Sc) {
        System.out.printf("Enter Age: ");
        int age = Sc.nextInt();
        while (!(this.isValidAge(age))) {
            System.out.printf("Invalid Age!\n");
            System.out.printf("Enter Age again: ");
            age = Sc.nextInt();
        }
        Age = age;
    }

    public boolean isValidAge(int Age) {
        boolean isValid = false;
        if (date_of_birth.getAge() == Age
                || (date_of_birth.getAge() - Age) == 1) {
            isValid = true;
        }
        return isValid;
    }

    public int getAge() {
        return Age;
    }

    public final void setPhoneNumber(Scanner Sc) {
        System.out.printf("Enter Phone Number: ");
        String phoneNumber = Sc.next();
        while (!(this.isValidPhoneNumber(phoneNumber))) {
            System.out.printf("Invalid Phone Number!\n");
            System.out.printf("Enter Phone Number again: ");
            phoneNumber = Sc.next();
        }
        PhoneNumber = phoneNumber;
    }

    public boolean isValidPhoneNumber(String PhoneNumber) {
        boolean isValid = false;
        if (PhoneNumber.length() == 11) {
            if (PhoneNumber.charAt(0) == '0' && PhoneNumber.charAt(1) == '1') {
                if (PhoneNumber.charAt(2) == '0'
                        || PhoneNumber.charAt(2) == '1'
                        || PhoneNumber.charAt(2) == '2'
                        || PhoneNumber.charAt(2) == '5') {
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public final void setNationalIdNumber(Scanner Sc) {
        System.out.printf("Enter National ID Number: ");
        String nationalIdNumber = Sc.next();
        while (!(this.isValidNationalIdNumber(nationalIdNumber))) {
            System.out.printf("Invalid National ID Number!\n");
            System.out.printf("Enter National ID Number again: ");
            nationalIdNumber = Sc.next();
        }
        NationalIdNumber = nationalIdNumber;
    }

    public boolean isValidNationalIdNumber(String NationalIdNumber) {
        boolean isValid = false;
        if (NationalIdNumber.length() == 14) {
            isValid = true;
        }
        return isValid;
    }

    public String getNationalIdNumber() {
        return NationalIdNumber;
    }

    public final void setGender(Scanner Sc) {
        System.out.printf("Enter Gender: \n1 --> Male \n2 --> Female\n");
        int genderType = Sc.nextInt();
        while (genderType != 1 && genderType != 2) {
            System.out.printf("Choose 1 or 2!\n");
            genderType = Sc.nextInt();
        }
        if (genderType == 1) {
            Gender = "Male";
        } else {
            Gender = "Female";
        }
    }

    public String getGender() {
        return Gender;
    }

    public final void setEmail(Scanner Sc) {
        System.out.printf("Enter Email: ");
        String email = Sc.next();
        while (!(this.isValidEmail(email))) {
            System.out.printf("Invalid Email!\n");
            System.out.printf("Enter Email again: ");
            email = Sc.next();
        }
        Email = email;
    }

    public boolean isValidEmail(String Email) {
        boolean isValid = false;
        Matcher matchingEmail = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(Email);
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

    public String getEmail() {
        return Email;
    }

    public final void setAddress(Scanner Sc) {
        address = new Address(Sc);
    }

    public String getAddress() {
        String _address = address.getGovernorate() + '-' + address.getCity() + '-' + address.getDistrict()
                + '-' + address.getStreet();
        return _address;
    }

    public void DisplayPersonType(int PersonNumber) {
        System.out.printf("\n");
        System.out.printf("%s%d\n", this.toString(), PersonNumber + 1);
    }

    public void DisplayFirstName() {
        System.out.printf("First Name: %s\n", this.getFirstName());
    }

    public void DisplaySecondName() {
        System.out.printf("Second Name: %s\n", this.getSecondName());
    }

    public void DisplayLastName() {
        System.out.printf("Last Name: %s\n", this.getLastName());
    }

    public void DisplayFullName() {
        System.out.printf("Full Name: %s\n", this.getFullName());
    }

    public void DisplayDate_of_Birth() {
        System.out.printf("Date of Birth: %s\n", this.getDate_of_Birth());
    }

    public void DisplayAge() {
        System.out.printf("Age: %s\n", this.getAge());
    }

    public void DisplayNationalIdNumber() {
        System.out.printf("National ID Number: %s\n", this.getNationalIdNumber());
    }

    public void DisplayGender() {
        System.out.printf("Gender: %s\n", this.getGender());
    }

    public void DisplayPhoneNumber() {
        System.out.printf("Phone Number: %s\n", this.getPhoneNumber());
    }

    public void DisplayEmail() {
        System.out.printf("Email: %s\n", this.getEmail());
    }

    public void DisplayAddress() {
        System.out.printf("Address: %s\n", this.getAddress());
    }

    public void EditAge(Scanner Sc) {
        System.out.printf("Enter new Age: ");
        int age = Sc.nextInt();
        while (!(this.isValidNewAge(age))) {
            System.out.printf("Invalid Age!\n");
            System.out.printf("Enter new Age again: ");
            age = Sc.nextInt();
        }
        Age = age;
    }

    public void EditPhoneNumber(Scanner Sc) {
        System.out.printf("Enter new Phone Number: ");
        String phoneNumber = Sc.next();
        while (!(this.isValidPhoneNumber(phoneNumber))) {
            System.out.printf("Invalid Phone Number!\n");
            System.out.printf("Enter new Phone Number again: ");
            phoneNumber = Sc.next();
        }
        PhoneNumber = phoneNumber;
    }

    public void EditEmail(Scanner Sc) {
        System.out.printf("Enter new Email: ");
        String email = Sc.next();
        while (!(this.isValidEmail(email))) {
            System.out.printf("Invalid Email!\n");
            System.out.printf("Enter new Email again: ");
            email = Sc.next();
        }
        Email = email;
    }

    public void EditAddress(Scanner Sc) {
        address.EditGovernorate(Sc);
        address.EditCity(Sc);
        address.EditDistrict(Sc);
        address.EditStreet(Sc);
    }

    public boolean isValidNewAge(int Age) {
        boolean isValid = false;
        if ((date_of_birth.getAge() == Age
                || (date_of_birth.getAge() - Age) == 1) && (Age >= this.Age)) {
            isValid = true;
        }
        return isValid;
    }
}
