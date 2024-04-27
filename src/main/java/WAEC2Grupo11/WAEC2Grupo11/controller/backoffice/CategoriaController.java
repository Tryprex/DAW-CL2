package WAEC2Grupo11.WAEC2Grupo11.controller.backoffice;

import WAEC2Grupo11.WAEC2Grupo11.Model.bd.Categoria;
import WAEC2Grupo11.WAEC2Grupo11.Model.bd.Farmaco;
import WAEC2Grupo11.WAEC2Grupo11.Model.dto.Response.CategoResponse;
import WAEC2Grupo11.WAEC2Grupo11.Model.dto.request.CategoRequest;
import WAEC2Grupo11.WAEC2Grupo11.service.IcategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/")
public class CategoriaController {

    private IcategoriaService icategoriaService;
    @GetMapping("")
    public  String listarCategoria(Model model){
        model.addAttribute("categorias",
                icategoriaService.listarCategorias());
        return "backoffice/Categoria/frmCategoria";
    }
    @GetMapping("/list")
    @ResponseBody
    public List<Categoria> listarCategor(){
        return icategoriaService.listarCategorias();
    }

    @PostMapping("/register")
    @ResponseBody
    public CategoResponse registerCatego(@RequestBody CategoRequest categoRequest){
        String mensaje = "Categoria registrada correctamente";
        boolean respuesta = true;
        try{
            Categoria catego = new Categoria();
            if(categoRequest.getIdcategoria() > 0){
                catego.setIdCategoria(categoRequest.getIdcategoria());
            }
            catego.setNomCategoria(categoRequest.getNomcategoria());
            catego.setDescripCategoria(categoRequest.getDescripcategoria());
            catego.setFechaRegistro(categoRequest.getFecharegistro());
            Farmaco farm = new Farmaco();
            farm.setIdFarmaco(categoRequest.getIdfarmaco());
            catego.setFarmaco(farm);
            icategoriaService.registerCategoria(catego);
        }catch (Exception ex){
            mensaje = "Categoria no registrado, error en la BD.";
            respuesta = false;
        }
        return CategoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}
