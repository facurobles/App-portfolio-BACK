
package com.portfolio.Interface;

import com.portfolio.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto del ripo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscado por Id
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long id);
}
