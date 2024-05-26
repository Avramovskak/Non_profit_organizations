package project.non_profit_organizations.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.non_profit_organizations.model.Donor;
import project.non_profit_organizations.repository.DonorRepository;

import java.util.List;

@Service
public class DonorService {
    @Autowired
    private DonorRepository donorRepository;

    public Donor createDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    public Donor getDonorById(Long id) {
        return donorRepository.findById(id).orElse(null);
    }

    public Donor updateDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    public String deleteDonor(Long id) {
        donorRepository.deleteById(id);
        return "Donor successfully deleted";
    }
}