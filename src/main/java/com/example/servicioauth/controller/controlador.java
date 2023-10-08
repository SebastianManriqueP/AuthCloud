package com.example.servicioauth.controller;


import com.example.servicioauth.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("")
public class controlador {

    @PostMapping("/validacion")
    public ResponseEntity<HashMap<String,String>> validar (@RequestBody Usuario usuario){
        HashMap<String, String> respuesta = new HashMap<>();
        if (usuario.getUsuario().equals("sebas")){
            respuesta.put("Estado", "valido");
        }else{
            respuesta.put("Estado", "invalido");
        }
        return ResponseEntity.ok(respuesta);
    }
}
