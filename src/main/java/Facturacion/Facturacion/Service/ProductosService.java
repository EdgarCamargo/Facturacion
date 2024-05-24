
package Facturacion.Facturacion.Service;


import java.util.List;
import java.util.Optional;
import Facturacion.Facturacion.Entidades.Productos;

public interface ProductosService {

    public List<Productos> findAll();

    public List<Productos> findAllCustom();

    public Optional<Productos> findById(long id);

    public Productos add(Productos p);

    public Productos update(Productos p);

    public Productos delete(Productos p);

}