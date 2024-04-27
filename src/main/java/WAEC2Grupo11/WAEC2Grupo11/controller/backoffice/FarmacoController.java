package WAEC2Grupo11.WAEC2Grupo11.controller.backoffice;

import WAEC2Grupo11.WAEC2Grupo11.service.IFarmacoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("Farmaco")
public class FarmacoController {
    private IFarmacoService iFarmacoService;
    @GetMapping("/list")
public String listarFarmaco(Model model){
    model.addAttribute("farmacos",
            iFarmacoService.listarFarmaco());
    return "backoffice/Farmaco/frmFarmaco";
}
}
