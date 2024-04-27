package WAEC2Grupo11.WAEC2Grupo11.repository;

import WAEC2Grupo11.WAEC2Grupo11.Model.bd.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
