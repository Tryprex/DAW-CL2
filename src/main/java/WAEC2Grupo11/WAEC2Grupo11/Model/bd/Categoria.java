package WAEC2Grupo11.WAEC2Grupo11.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria")
    private Integer IdCategoria;
    @Column(name = "nomcategoria")
    private String NomCategoria;
    @Column(name = "descripcategoria")
    private String descripCategoria;
    @Column(name = "fecharegistro")
    private Date FechaRegistro;
    @ManyToOne
    @JoinColumn(name = "idfarmaco")
    private Farmaco farmaco;
}
