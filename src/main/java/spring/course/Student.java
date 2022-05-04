package spring.course;

public class Student {

    private String firstName;
    private String lastname;
    private String country;
    private String favoriteLanguage;
    private String [] operatingSystems;

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
        return favoriteLanguage;
    }

    public void setFavoritelanguage(String favoritelanguage) {
        this.favoriteLanguage = favoritelanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
