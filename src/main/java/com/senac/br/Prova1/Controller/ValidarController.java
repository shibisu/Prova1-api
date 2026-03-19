package com.senac.br.Prova1.Controller;


import com.senac.br.Prova1.Prova1ApiApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/Prova")
@CrossOrigin
public class ValidarController {
    @GetMapping("/validenumero")
    public ResponseEntity<String>test() {





    }
}
