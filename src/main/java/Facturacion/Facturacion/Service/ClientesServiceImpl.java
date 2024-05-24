
package Facturacion.Facturacion.Service;

import Facturacion.Facturacion.Entidades.Clientes;
import Facturacion.Facturacion.Repository.ClientesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl implements ClientesService {
    
    @Autowired
    private ClientesRepository repositorio;

    @Override
    public List<Clientes> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Clientes> findAllCustom() {
       return repositorio.findAllCustom();
    }

    @Override
    public Optional<Clientes> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Clientes add(Clientes c) {
        return repositorio.save(c);
    }

    @Override
    public Clientes update(Clientes c) {
        Clientes objclientes=repositorio.getReferenceById(c.getId());
        BeanUtils.copyProperties(c, objclientes);
        return repositorio.save(objclientes);
    }

    @Override
    public Clientes delete(Clientes c) {
        Clientes objclientes=repositorio.getReferenceById(c.getId());
        objclientes.setEstado(false);
        return repositorio.save(objclientes);
    }
}