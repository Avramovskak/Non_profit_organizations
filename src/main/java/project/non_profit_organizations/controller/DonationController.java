package project.non_profit_organizations.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.non_profit_organizations.model.Donation;
import project.non_profit_organizations.service.DonationService;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
public class DonationController {
    @Autowired
    private DonationService donationService;

    @PostMapping
    public Donation createDonation(@RequestBody Donation donation) {
        return donationService.createDonation(donation);
    }

    @GetMapping
    public List<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }

    @GetMapping("/{id}")
    public Donation getDonationById(@PathVariable Long id) {
        return donationService.getDonationById(id);
    }

    @PutMapping("/{id}")
    public Donation updateDonation(@PathVariable Long id, @RequestBody Donation donation) {
        donation.setId(id);
        return donationService.updateDonation(donation);
    }

    @DeleteMapping("/{id}")
    public String deleteDonation(@PathVariable Long id) {
       return donationService.deleteDonation(id);
    }
}