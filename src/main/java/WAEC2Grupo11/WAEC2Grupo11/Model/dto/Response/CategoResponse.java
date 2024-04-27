package WAEC2Grupo11.WAEC2Grupo11.Model.dto.Response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoResponse {
    private Boolean respuesta;
    private String mensaje;
}
