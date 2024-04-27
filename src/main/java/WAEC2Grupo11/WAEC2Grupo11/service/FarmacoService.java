package WAEC2Grupo11.WAEC2Grupo11.service;

import WAEC2Grupo11.WAEC2Grupo11.Model.bd.Farmaco;
import WAEC2Grupo11.WAEC2Grupo11.repository.FarmacoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FarmacoService implements IFarmacoService{
private FarmacoRepository farmacoRepository;
    @Override
    public List<Farmaco> listarFarmaco() {
        return farmacoRepository.findAll();
    }
}
