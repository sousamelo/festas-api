package io.sousamelo.festas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FestasController {

    @RequestMapping("/eventos/form")
    public String form() {
        return "formEvento";
    }
    
}
