package lt.vtmc.valgykla_demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.vtmc.valgykla_demo.model.Meniu;


public interface MeniuRepository extends JpaRepository<Meniu, Long> {
	
  List<Meniu> findByPublished(boolean published);
  List<Meniu> findByTitleContaining(String title);
}