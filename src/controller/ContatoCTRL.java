
package controller;

import dao.ContatoDAO;
import java.util.List;
import model.Contato;



public class ContatoCTRL {
    
    private ContatoDAO dao;
    
    public ContatoCTRL(){
        dao = new ContatoDAO();
            
        }
        
    
    
    
    public boolean adcionar(String nome, String fone){
        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setFone(fone);
        return dao.insert(contato);
        
    }
    
    public boolean atualizar(int id, String nome, String fone){
        Contato contato = new Contato();
        contato.setId(id);
        contato.setNome(nome);
        contato.setFone(fone);
        return dao.update(contato);
        
             
    }
    
        
    public List<Contato> listar(String filter){
        if(filter == null){
            return dao.selectAll();
                              
            
        }else{
            return dao.selectFilter(filter);
            
        }
        
        
        
    }
    
    
    
    
    
    
}