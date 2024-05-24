
package Facturacion.Facturacion.Controller;

import Facturacion.Facturacion.Entidades.Clientes;
import Facturacion.Facturacion.Service.ClientesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {
    @Autowired 
    private ClientesService servicio;
    
    @GetMapping
    public List<Clientes> findAll(){
        return servicio.findAll();
      }
}
