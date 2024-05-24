
package Facturacion.Facturacion.Repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import Facturacion.Facturacion.Entidades.Productos;


public interface ProductosRepository extends JpaRepository<Productos, Long> {
   @Query("select u from Productos u where u.estado = ?1")
   List<Productos> findAllCustom();       
   Productos findByProductos (String productos); 
}