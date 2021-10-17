/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3Domingo.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository
public class RepositorioCliente {
      @Autowired
    private InterfaceCliente crud1;

    public List<Clientes> getAll(){
        return (List<Clientes>) crud1.findAll();
    }
    public Optional<Clientes> getCliente(int id){
        return crud1.findById(id);
    }

    public Clientes save(Clientes cliente){
        return crud1.save(cliente);
    }
    public void delete(Clientes cliente){
        crud1.delete(cliente);
    }
}
