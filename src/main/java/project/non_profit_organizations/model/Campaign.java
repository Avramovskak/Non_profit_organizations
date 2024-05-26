package project.non_profit_organizations.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String campaignName;
    private String campaignDescription;
    private String campaignLocation;
    private String campaignCity;
    private String campaignCountry;
    private Double campaignGoalAmount;

    public Campaign(Long id, String campaignName, String campaignDescription, String campaignLocation, String campaignCity, String campaignCountry, double campaignGoalAmount) {
        this.id = id;
        this.campaignName = campaignName;
        this.campaignDescription = campaignDescription;
        this.campaignLocation = campaignLocation;
        this.campaignCity = campaignCity;
        this.campaignCountry = campaignCountry;
        this.campaignGoalAmount = campaignGoalAmount;
    }

    public Campaign() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignDescription() {
        return campaignDescription;
    }

    public void setCampaignDescription(String campaignDescription) {
        this.campaignDescription = campaignDescription;
    }

    public String getCampaignLocation() {
        return campaignLocation;
    }

    public void setCampaignLocation(String campaignLocation) {
        this.campaignLocation = campaignLocation;
    }

    public String getCampaignCity() {
        return campaignCity;
    }

    public void setCampaignCity(String campaignCity) {
        this.campaignCity = campaignCity;
    }

    public Double getCampaignGoalAmount() {
        return campaignGoalAmount;
    }

    public void setCampaignGoalAmount(Double campaignGoalAmount) {
        this.campaignGoalAmount = campaignGoalAmount;
    }

    public String getCampaignCountry() {
        return campaignCountry;
    }

    public void setCampaignCountry(String campaignCountry) {
        this.campaignCountry = campaignCountry;
    }
}