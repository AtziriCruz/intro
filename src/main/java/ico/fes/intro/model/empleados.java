package ico.fes.intro.model;
import java.util.Date;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class empleados {
    private int id;
    private double sueldo;
    private String departamento;
    private String Nombre;
    private String fechaNacimiento;
}
