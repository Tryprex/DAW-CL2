package WAEC2Grupo11.WAEC2Grupo11.repository;

import WAEC2Grupo11.WAEC2Grupo11.Model.bd.Farmaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacoRepository extends JpaRepository<Farmaco, Integer> {
}
