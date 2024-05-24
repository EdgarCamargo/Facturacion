
package Facturacion.Facturacion.Repository;

import Facturacion.Facturacion.Entidades.Clientes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface ClientesRepository extends JpaRepository <Clientes, Long> {
   
     @Query("select u from Clientes u where u.nombre = ?1")
   List<Clientes> findAllCustom();       
   Clientes findByClientes (String clientes); 
}

