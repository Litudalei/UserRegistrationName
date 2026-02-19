package com.git.binding;

public class UserRegistration {
    private String firstName;

    private String email;

    // Getters and Setters are required for binding to work
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }



    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
