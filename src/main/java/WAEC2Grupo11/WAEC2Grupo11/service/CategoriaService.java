package WAEC2Grupo11.WAEC2Grupo11.service;

import WAEC2Grupo11.WAEC2Grupo11.Model.bd.Categoria;
import WAEC2Grupo11.WAEC2Grupo11.repository.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoriaService implements IcategoriaService{
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }
    @Override
    public void registerCategoria(Categoria categor) {
        categoriaRepository.save(categor);
    }
}
