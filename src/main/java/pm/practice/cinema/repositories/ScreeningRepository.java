package pm.practice.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pm.practice.cinema.domains.Screening;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {
}
