package spring.course;

public class Student {

    private String firstName;
    private String lastname;
    private String country;
    private String favoritelanguage;

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getFavoritelanguage() {
        return favoritelanguage;
    }

    public void setFavoritelanguage(String favoritelanguage) {
        this.favoritelanguage = favoritelanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
