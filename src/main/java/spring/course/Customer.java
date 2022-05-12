package spring.course;

import spring.course.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private  String firstName;

    @NotNull(message = "is required")
    @Size(min=1,message = "is required")
    private String lastName;


    @NotNull(message = "is required")
    @Min(value = 0, message = "greater then 0")
    @Max(value = 10, message = "less then 10")
    private Integer freePass;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digitals")
    private String postalCode;

    @CourseCode(value = {"TOPS", "LUV"}, message = "must start with TOPS or LUV")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

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

    public Integer getFreePass() {
        return freePass;
    }

    public void setFreePass(Integer freePass) {
        this.freePass = freePass;
    }
}
