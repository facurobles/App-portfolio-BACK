
package com.portfolio.Repository;

import com.portfolio.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByNombreEd(String nombreE);
    public boolean existsByNombreEd(String nombreE);
}
