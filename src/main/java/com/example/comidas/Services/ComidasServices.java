package com.example.comidas.Services;

import com.example.comidas.Entities.ComidasEntities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ComidasServices {

    private final List<ComidasEntities> comidas = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1); // Generador de IDs

    // Constructor para inicializar datos de ejemplo
    public ComidasServices() {
        initializeComidas();
    }

    // Método para inicializar 20 comidas de ejemplo
    private void initializeComidas() {
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Pizza Margarita", "Pizza con queso y tomate", 10.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Hamburguesa Clásica", "Hamburguesa con queso, lechuga y tomate", 8.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Sushi Roll", "Roll de sushi con salmón y aguacate", 12.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Tacos al Pastor", "Tacos de cerdo marinado con piña", 7.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Pasta Carbonara", "Pasta con salsa de huevo, queso y tocino", 9.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Ensalada César", "Ensalada con pollo, crutones y aderezo César", 6.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Paella Valenciana", "Arroz con mariscos, pollo y chorizo", 15.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Ramen de Cerdo", "Sopa de fideos con cerdo y huevo", 11.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Lasagna", "Láminas de pasta con carne y queso", 10.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Ceviche", "Pescado marinado en limón con cebolla y cilantro", 9.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Burrito", "Tortilla de harina rellena de carne, frijoles y queso", 8.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Pollo al Curry", "Pollo en salsa de curry con arroz", 12.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Empanadas", "Empanadas de carne o pollo", 5.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Sopa de Tomate", "Sopa cremosa de tomate con albahaca", 4.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Churrasco", "Carne asada con chimichurri", 14.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Falafel", "Albóndigas de garbanzos con salsa de yogur", 6.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Tiramisú", "Postre italiano con café y mascarpone", 7.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Moussaka", "Lasaña griega con berenjena y carne", 11.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Arepas", "Arepas rellenas de queso y carne", 5.99));
        comidas.add(new ComidasEntities(idGenerator.getAndIncrement(), "Gazpacho", "Sopa fría de tomate y pepino", 4.99));
    }

    // Obtener todas las comidas
    public List<ComidasEntities> getAllComidas() {
        return comidas;
    }

    // Crear una nueva comida
    public ComidasEntities createComida(ComidasEntities comida) {
        comida.setId(idGenerator.getAndIncrement()); // Asignar un ID único
        comidas.add(comida);
        return comida;
    }

    // Actualizar una comida existente
    public ComidasEntities updateComida(Long id, ComidasEntities comidaActualizada) {
        for (ComidasEntities comida : comidas) {
            if (comida.getId().equals(id)) {
                comida.setNombre(comidaActualizada.getNombre());
                comida.setDescripcion(comidaActualizada.getDescripcion());
                comida.setPrecio(comidaActualizada.getPrecio());
                return comida;
            }
        }
        return null; // Si no se encuentra la comida
    }

    // Eliminar una comida
    public boolean deleteComida(Long id) {
        return comidas.removeIf(comida -> comida.getId().equals(id));
    }
}