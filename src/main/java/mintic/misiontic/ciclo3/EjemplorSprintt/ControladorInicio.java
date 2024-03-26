/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.EjemplorSprintt;

import java.util.Arrays;
import java.util.List;
import mintic.misiontic.ciclo3.modelo.usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Juanka
 */

@Controller
@Slf4j
public class ControladorInicio {
    @Value("$index.mensaje")
    String dato;
    @GetMapping("/")
    public String incio(Model modelo){
        String mensaje ="saludos desde MVC";
        modelo.addAttribute("mensaje",mensaje);
        modelo.addAttribute("dato",dato);
        usuario u = new usuario();
        u.setCedula("1234");
        u.setClave("abcd");
        u.setNombre("JUAN CAMILO GAVIRIA");
        u.setEmail("juancgaviria2003@gmail.com");
        
       /** usuario u2 = new usuario();
        u.setCedula("4567");
        u.setClave("abcd");
        u.setNombre("JUAN GAVIRIA");
        u.setEmail("juancgaviria2003@gmail.com");
        
        usuario u3 = new usuario();
        u.setCedula("89010");
        u.setClave("abcd");
        u.setNombre("JUAN CAMILO");
        u.setEmail("juancgaviria2003@gmail.com");
        
        List<usuario> ListaUsuarios = Arrays.asList(u2,u3);
        modelo.addAttribute("usuario",ListaUsuarios);
        * */
        modelo.addAttribute("alguien", u);
        log.info("ejecutando el controlador de incio MVC");
        return "index";
        
    }
    
}
