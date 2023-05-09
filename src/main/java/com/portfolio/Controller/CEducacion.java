/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Controller;


import com.portfolio.Dto.dtoEducacion;
import com.portfolio.Entity.Educacion;
import com.portfolio.Security.Controller.Mensaje;
import com.portfolio.Service.SEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("educa")
@CrossOrigin(origins = "https://portfolio-front-robles.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
      List<Educacion> list = sEducacion.list();
      return new ResponseEntity(list, HttpStatus.OK); }
      
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoedu){
        
        Educacion educacion = new Educacion(dtoedu.getNombreEd(),
                dtoedu.getNivelEd(), dtoedu.getPeriodoEd(),
                dtoedu.getUbicacionEd(), dtoedu.getTituloEd());
        
        sEducacion.save(educacion);
        
        return new ResponseEntity(new Mensaje("Educacion agregada"), HttpStatus.OK);}
        

    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoedu){
        
        Educacion educacion = sEducacion.getOne(id).get();
        
        educacion.setNombreEd(dtoedu.getNombreEd());
        educacion.setNivelEd(dtoedu.getNivelEd());
        educacion.setPeriodoEd(dtoedu.getPeriodoEd());
        educacion.setUbicacionEd(dtoedu.getUbicacionEd());
        educacion.setTituloEd(dtoedu.getTituloEd());
                
        sEducacion.save(educacion);
        
         return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);}
        
    
    
     @DeleteMapping("/delete/{id}")
     public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sEducacion.existById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
}
 
   
 
 
