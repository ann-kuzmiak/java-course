package com.course.OOP;
import com.course.OOP.exceptions.InvalidRoleException;
import com.course.OOP.interfaces.PrintInfo;

public class Manager extends User implements PrintInfo {
    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public Manager(String fullName, String email, String role, String position) throws InvalidRoleException {
        super(fullName, email, role);
        this.position = position;
    }

    public Manager(String firstName, String lastName, String email, String role, String position) throws InvalidRoleException {
        super(firstName, lastName, email, role);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public String toString() {
        return "Manager{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                toStringLine("billingAddress", billingAddress) +
                toStringLine("deliveryAddress", deliveryAddress) +
                ", role='" + role.toString() + '\'' +
                ", position='" + position + '\'' +
                ", responsibilityDistrict='" + responsibilityDistrict + '\'' +
                ", workPhoneNumber='" + workPhoneNumber + '\'' +
                '}';
    }

}
