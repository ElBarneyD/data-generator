package Model;

public class Model_GenerateData {

    private String lastName;
    private String firstName;
    private String address;
    private int postalCode;
    private String locality;
    private String country;
    private int phoneNumber;
    private String mail;
    private String profession;
    private String date;
    private String recentDate;

    public Model_GenerateData(String lastName, String firstName, String address, int postalCode, String locality, String country, int phoneNumber, String mail, String profession, String date, String recentDate) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.postalCode = postalCode;
        this.locality = locality;
        this.country =country;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.profession = profession;
        this.date = date;
        this.recentDate = recentDate;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRecentDate() {
        return recentDate;
    }

    public void setRecentDate(String recentDate) {
        this.recentDate = recentDate;
    }
}
