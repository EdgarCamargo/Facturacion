
package Facturacion.Facturacion.Service;


import java.util.List;
import java.util.Optional;
import Facturacion.Facturacion.Entidades.Clientes;

public interface ClientesService {

    public List<Clientes> findAll();

    public List<Clientes> findAllCustom();

    public Optional<Clientes> findById(long id);

    public Clientes add(Clientes c);

    public Clientes update(Clientes c);

    public Clientes delete(Clientes c);

}
