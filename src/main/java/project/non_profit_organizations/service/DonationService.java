package project.non_profit_organizations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.non_profit_organizations.model.Donation;
import project.non_profit_organizations.repository.DonationRepository;

import java.util.List;

@Service
public class DonationService {
    @Autowired
    private DonationRepository donationRepository;

    public Donation createDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public Donation getDonationById(Long id) {
        return donationRepository.findById(id).orElse(null);
    }

    public Donation updateDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    public String deleteDonation(Long id) {
         donationRepository.deleteById(id);
         return "Donation successfully deleted";
    }
}