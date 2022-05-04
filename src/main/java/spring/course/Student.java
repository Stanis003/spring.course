package spring.course;


import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String  lastname;
    private String country;

    private LinkedHashMap<String, String> countryoptions;


    public Student() {
        countryoptions = new LinkedHashMap<>();

        countryoptions.put("BR", "Brazil");
        countryoptions.put("GR", "Germany");
        countryoptions.put("FR", "France");
        countryoptions.put("IT", "Italy");
        countryoptions.put("UC", "Uckraine");
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryoptions() {
        return countryoptions;
    }


}
