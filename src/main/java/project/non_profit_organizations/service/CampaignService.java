package project.non_profit_organizations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.non_profit_organizations.model.Campaign;
import project.non_profit_organizations.repository.CampaignRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignService {
    @Autowired
    private CampaignRepository campaignRepository;

    public Campaign createCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    public Campaign getCampaignById(Long id) {
        return campaignRepository.findById(id).orElseThrow(() -> new RuntimeException("Campaign not found with id " + id));
    }

    public Campaign updateCampaign(Long id, Campaign campaignDetails) {
        Campaign existingCampaign = campaignRepository.findById(id).orElseThrow(() -> new RuntimeException("Campaign not found"));

        if (campaignDetails.getCampaignName() != null) {
            existingCampaign.setCampaignName(campaignDetails.getCampaignName());
        }
        if (campaignDetails.getCampaignDescription() != null) {
            existingCampaign.setCampaignDescription(campaignDetails.getCampaignDescription());
        }
        if (campaignDetails.getCampaignLocation() != null) {
            existingCampaign.setCampaignLocation(campaignDetails.getCampaignLocation());
        }
        if (campaignDetails.getCampaignCity() != null) {
            existingCampaign.setCampaignCity(campaignDetails.getCampaignCity());
        }
        if (campaignDetails.getCampaignCountry() != null) {
            existingCampaign.setCampaignCountry(campaignDetails.getCampaignCountry());
        }
        if (campaignDetails.getCampaignGoalAmount() != null) {
            existingCampaign.setCampaignGoalAmount(campaignDetails.getCampaignGoalAmount());
        }

        return campaignRepository.save(existingCampaign);
    }

    public String deleteCampaign(Long id) {
        if (!campaignRepository.existsById(id)) {
            throw new RuntimeException("Campaign not found");
        }
        campaignRepository.deleteById(id);
        return "Campaign successfully deleted";
    }
}