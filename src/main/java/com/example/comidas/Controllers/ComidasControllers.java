package com.example.comidas.Controllers;

import com.example.comidas.Entities.ComidasEntities;
import com.example.comidas.Services.ComidasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comidas")
public class ComidasControllers {

    @Autowired
    private ComidasServices comidasServices;

    // Obtener todas las comidas
    @GetMapping
    public List<ComidasEntities> getAllComidas() {
        return comidasServices.getAllComidas();
    }

    // Crear una nueva comida
    @PostMapping
    public ComidasEntities createComida(@RequestBody ComidasEntities comida) {
        return comidasServices.createComida(comida);
    }

    // Actualizar una comida existente
    @PutMapping("/{id}")
    public ComidasEntities updateComida(@PathVariable Long id, @RequestBody ComidasEntities comidaActualizada) {
        return comidasServices.updateComida(id, comidaActualizada);
    }

    // Eliminar una comida
    @DeleteMapping("/{id}")
    public String deleteComida(@PathVariable Long id) {
        boolean eliminada = comidasServices.deleteComida(id);
        if (eliminada) {
            return "Comida eliminada correctamente";
        } else {
            return "No se encontró la comida con el ID proporcionado";
        }
    }
}