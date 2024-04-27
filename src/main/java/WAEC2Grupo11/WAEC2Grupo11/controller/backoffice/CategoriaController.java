package WAEC2Grupo11.WAEC2Grupo11.controller.backoffice;

import WAEC2Grupo11.WAEC2Grupo11.service.IcategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/Categorias")
public class CategoriaController {

    private IcategoriaService icategoriaService;
    @GetMapping("/list")
    public  String listarCategoria(Model model){
        model.addAttribute("categorias",
                icategoriaService.listarCategorias());
        return "backoffice/Categoria/frmCategoria";
    }

}
