package project.non_profit_organizations.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String donorName;
    private String donorEmail;
    private String donorPhone;
    private String donorAddress;
    private String donorCity;
    private String donorCountry;
    private String donorZip;
    private double donationAmount;
    private LocalDateTime donationDate;
    private LocalDateTime donationReceivedDate;
    private String donationPurpose;
    private String donationReceipt;

    public Donation(Long id, String donorName, String donorPhone, String donorEmail, String donorAddress, String donorCountry, String donorZip, double donationAmount, String donationReceipt, String donationPurpose, LocalDateTime donationReceivedDate, LocalDateTime donationDate, String donorCity) {
        this.id = id;
        this.donorName = donorName;
        this.donorPhone = donorPhone;
        this.donorEmail = donorEmail;
        this.donorAddress = donorAddress;
        this.donorCountry = donorCountry;
        this.donorZip = donorZip;
        this.donationAmount = donationAmount;
        this.donationReceipt = donationReceipt;
        this.donationPurpose = donationPurpose;
        this.donationReceivedDate = donationReceivedDate;
        this.donationDate = donationDate;
        this.donorCity = donorCity;
    }

    public Donation() {

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

    public String getDonorCity() {
        return donorCity;
    }

    public void setDonorCity(String donorCity) {
        this.donorCity = donorCity;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorCountry() {
        return donorCountry;
    }

    public void setDonorCountry(String donorCountry) {
        this.donorCountry = donorCountry;
    }

    public String getDonorZip() {
        return donorZip;
    }

    public void setDonorZip(String donorZip) {
        this.donorZip = donorZip;
    }

    public double getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(double donationAmount) {
        this.donationAmount = donationAmount;
    }

    public LocalDateTime getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(LocalDateTime donationDate) {
        this.donationDate = donationDate;
    }

    public LocalDateTime getDonationReceivedDate() {
        return donationReceivedDate;
    }

    public void setDonationReceivedDate(LocalDateTime donationReceivedDate) {
        this.donationReceivedDate = donationReceivedDate;
    }

    public String getDonationPurpose() {
        return donationPurpose;
    }

    public void setDonationPurpose(String donationPurpose) {
        this.donationPurpose = donationPurpose;
    }

    public String getDonationReceipt() {
        return donationReceipt;
    }

    public void setDonationReceipt(String donationReceipt) {
        this.donationReceipt = donationReceipt;
    }
}