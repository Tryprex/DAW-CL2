package WAEC2Grupo11.WAEC2Grupo11.Model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "farmaco")
public class Farmaco {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idfarmaco")
  private Integer IdFarmaco;
  @Column(name = "nomfarmaco")
  private String NomFarmaco;
  @Column(name = "composicion")
  private String Composicion;
  @Column(name = "fechavencimiento")
  private Date FechaVencimiento;
}
