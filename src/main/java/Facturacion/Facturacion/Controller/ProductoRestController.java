
package Facturacion.Facturacion.Controller;

import Facturacion.Facturacion.Entidades.Productos;
import Facturacion.Facturacion.Service.ProductosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {
    
     @Autowired 
    private ProductosService servicio;
    
    @GetMapping
    public List<Productos> findAll(){
        return servicio.findAll();
      }
    
}
