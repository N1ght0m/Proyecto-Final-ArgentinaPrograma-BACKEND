package com.Portfolio.Web.gat.Interface;

import com.Portfolio.Web.gat.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Bring a list of Personas
    public List<Persona> getPersona();
    
    //Save an object from Personas
    public void savePersona(Persona persona);
    
    //Delete an object found by ID
    public void deletePersona(Long id);
    
    //Search a Persona by ID
    public Persona findPersona(Long id); 
}
