package WAEC2Grupo11.WAEC2Grupo11.Model.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class CategoRequest {

    private Integer idcategoria;
    private String nomcategoria;
    private String descripcategoria;
    private Date fecharegistro;
    private Integer idfarmaco;

}
