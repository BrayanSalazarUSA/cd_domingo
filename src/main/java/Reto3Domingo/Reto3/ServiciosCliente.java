/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3Domingo.Reto3;

/**
 *
 * @author usuario
 */
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosCliente {
       @Autowired
     private RepositorioCliente metodosCrud;
     
     public List<Clientes> getAll(){
        return metodosCrud.getAll();
    }
     
      public Optional<Clientes> getClient(int clientId) {
        return metodosCrud.getCliente(clientId);
    }

    public Clientes save(Clientes client){
        if(client.getIdClient()==null){
            return metodosCrud.save(client);
        }else{
            Optional<Clientes> e= metodosCrud.getCliente(client.getIdClient());
            if(e.isEmpty()){
                return metodosCrud.save(client);
            }else{
                return client;
            }
        }
    
    }}