package org.example;

public record Client(String firstName,String lastName,String customerNumber) {
    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                '}';
    }
}
