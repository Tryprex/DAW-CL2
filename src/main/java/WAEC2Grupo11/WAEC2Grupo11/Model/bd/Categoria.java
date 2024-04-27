package WAEC2Grupo11.WAEC2Grupo11.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCategoria;
    @Column(name = "NomCategoria")
    private String NomCategoria;
    @Column(name = "DescripCategoria")
    private String descripCategoria;
    @Column(name = "FechaRegistro")
    private Date FechaRegistro;
    @ManyToOne
    @JoinColumn(name = "IdFarmaco")
    private Farmaco farmaco;

}
