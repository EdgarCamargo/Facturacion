
package Facturacion.Facturacion.Service;

import Facturacion.Facturacion.Entidades.Productos;
import Facturacion.Facturacion.Repository.ProductosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosServiceImpl implements ProductosService{
    
     @Autowired
    private ProductosRepository repositorio;


    @Override
    public List<Productos> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Productos> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Productos> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Productos add(Productos p) {
        return repositorio.save(p);
    }

    @Override
    public Productos update(Productos p) {
        Productos objproductos=repositorio.getReferenceById(p.getId());
        BeanUtils.copyProperties(p, objproductos);
        return repositorio.save(objproductos);
    }

    @Override
    public Productos delete(Productos p) {
        Productos objproductos=repositorio.getReferenceById(p.getId());
        objproductos.setEstado(false);
        return repositorio.save(objproductos);  
    }
}

