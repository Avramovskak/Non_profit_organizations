package project.non_profit_organizations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.non_profit_organizations.model.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}