package ico.fes.intro.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ico.fes.intro.model.empleados;

import java.sql.Date;

@Controller
public class Principal {

    @GetMapping("/inicio")
    public String getInicio(Model model){
    empleados emp= new empleados (1,23000,"Desarrollo", "José Sosa", "12/12/2000");
        model.addAttribute("empleado" ,emp);
        return "index";
    }
}
