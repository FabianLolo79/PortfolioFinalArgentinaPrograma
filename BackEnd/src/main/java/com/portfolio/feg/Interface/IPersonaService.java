package com.portfolio.feg.Interface;

import com.portfolio.feg.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();

    // guardar un objeto de tipo persona
    public void savePersona(Persona persona);

    //Eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);

    // Buscar una persona por id
    public Persona findPersona(Long id);
}
