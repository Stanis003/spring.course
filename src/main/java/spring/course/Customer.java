package spring.course;

import javax.validation.constraints.*;

public class Customer {
    private  String firstName;

    @NotNull(message = "is required")
    @Size(min=1,message = "is required")
    private String lastName;

    @Min(value = 0, message = "greater then 0")
    @Max(value = 10, message = "less then 10")
    private int freePass;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digitals")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFreePass() {
        return freePass;
    }

    public void setFreePass(int freePass) {
        this.freePass = freePass;
    }
}
