package project.non_profit_organizations.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String donorName;
    private String donorEmail;
    private String donorPhone;
    private String donorAddress;
    private String donorCity;
    private String donorCountry;
    private String donorDescription;
    private double donorAmount;

    public Donor(Long id, String donorName, String donorEmail, String donorPhone, String donorCity, String donorAddress, String donorDescription, String donorCountry, double donorAmount) {
        this.id = id;
        this.donorName = donorName;
        this.donorEmail = donorEmail;
        this.donorPhone = donorPhone;
        this.donorCity = donorCity;
        this.donorAddress = donorAddress;
        this.donorDescription = donorDescription;
        this.donorCountry = donorCountry;
        this.donorAmount = donorAmount;
    }

    public Donor() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }

    public String getDonorPhone() {
        return donorPhone;
    }

    public void setDonorPhone(String donorPhone) {
        this.donorPhone = donorPhone;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorCity() {
        return donorCity;
    }

    public void setDonorCity(String donorCity) {
        this.donorCity = donorCity;
    }

    public String getDonorDescription() {
        return donorDescription;
    }

    public void setDonorDescription(String donorDescription) {
        this.donorDescription = donorDescription;
    }

    public String getDonorCountry() {
        return donorCountry;
    }

    public void setDonorCountry(String donorCountry) {
        this.donorCountry = donorCountry;
    }

    public double getDonorAmount() {
        return donorAmount;
    }

    public void setDonorAmount(double donorAmount) {
        this.donorAmount = donorAmount;
    }

    // Getters and Setters
}