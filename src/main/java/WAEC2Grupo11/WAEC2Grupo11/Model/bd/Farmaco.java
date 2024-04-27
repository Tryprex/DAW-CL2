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
  private Integer IdFarmaco;
  @Column(name = "NomFarmaco")
  private String NomFarmaco;
  @Column(name = "Composicion")
  private String Composicion;
  @Column(name = "FechaVencimiento")
  private Date FechaVencimiento;
}
