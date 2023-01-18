package ToolsPackage;

import java.util.Scanner;

public class Address {

    private String Governorate;
    private String City;
    private String Street;
    private String District;

    public Address(Scanner Sc) {
        this.setGovernorate(Sc);
        this.setCity(Sc);
        this.setDistrict(Sc);
        this.setStreet(Sc);
    }

    public final void setGovernorate(Scanner Sc) {
        System.out.printf("Enter Governorate: ");
        String governorate = Sc.next();
        while (!(this.isValidGovernorate(governorate))) {
            System.out.printf("Invalid Governorate!\n");
            System.out.printf("Enter Governorate again: ");
            governorate = Sc.next();
        }
        Governorate = governorate;
    }

    public boolean isValidGovernorate(String Governorate) {
        boolean isValid = false;
        if (Governorate.length() >= 3 && Governorate.length() <= 30) {
            isValid = true;
        }
        return isValid;
    }

    public final void setCity(Scanner Sc) {
        System.out.printf("Enter City: ");
        String city = Sc.next();
        while (!(this.isValidCity(city))) {
            System.out.printf("Invalid City!\n");
            System.out.printf("Enter City again: ");
            city = Sc.next();
        }
        City = city;
    }

    public boolean isValidCity(String City) {
        boolean isValid = false;
        if (City.length() >= 3 && City.length() <= 30) {
            isValid = true;
        }
        return isValid;
    }

    public final void setStreet(Scanner Sc) {
        System.out.printf("Enter Street: ");
        String street = Sc.next();
        while (!(this.isValidStreet(street))) {
            System.out.printf("Invalid Street!\n");
            System.out.printf("Enter Street again: ");
            street = Sc.next();
        }
        Street = street;
    }

    public boolean isValidStreet(String Street) {
        boolean isValid = false;
        if (Street.length() >= 3 && Street.length() <= 30) {
            isValid = true;
        }
        return isValid;
    }

    public final void setDistrict(Scanner Sc) {
        System.out.printf("Enter District: ");
        String district = Sc.next();
        while (!(this.isValidDistrict(district))) {
            System.out.printf("Invalid District!\n");
            System.out.printf("Enter District again: ");
            district = Sc.next();
        }
        District = district;
    }

    public boolean isValidDistrict(String District) {
        boolean isValid = false;
        if (District.length() >= 3 && District.length() <= 30) {
            isValid = true;
        }
        return isValid;
    }

    public void EditGovernorate(Scanner Sc) {
        System.out.printf("Enter new Governorate: ");
        String governorate = Sc.next();
        while (!(this.isValidGovernorate(governorate))) {
            System.out.printf("Invalid Governorate!\n");
            System.out.printf("Enter new Governorate again: ");
            governorate = Sc.next();
        }
        Governorate = governorate;
    }

    public void EditCity(Scanner Sc) {
        System.out.printf("Enter new City: ");
        String city = Sc.next();
        while (!(this.isValidCity(city))) {
            System.out.printf("Invalid City!\n");
            System.out.printf("Enter new City again: ");
            city = Sc.next();
        }
        City = city;
    }

    public void EditDistrict(Scanner Sc) {
        System.out.printf("Enter new District: ");
        String district = Sc.next();
        while (!(this.isValidDistrict(district))) {
            System.out.printf("Invalid District!\n");
            System.out.printf("Enter new District again: ");
            district = Sc.next();
        }
        District = district;
    }

    public void EditStreet(Scanner Sc) {
        System.out.printf("Enter new Street: ");
        String street = Sc.next();
        while (!(this.isValidStreet(street))) {
            System.out.printf("Invalid Street!\n");
            System.out.printf("Enter new Street again: ");
            street = Sc.next();
        }
        Street = street;
    }

    public String getGovernorate() {
        return Governorate;
    }

    public String getCity() {
        return City;
    }

    public String getStreet() {
        return Street;
    }

    public String getDistrict() {
        return District;
    }
}
