package project.non_profit_organizations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.non_profit_organizations.model.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}