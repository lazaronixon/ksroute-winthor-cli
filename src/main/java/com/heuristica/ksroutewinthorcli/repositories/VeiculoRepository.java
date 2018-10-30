package com.heuristica.ksroutewinthorcli.repositories;

import com.heuristica.ksroutewinthorcli.models.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {
    
    @Query("SELECT v FROM Veiculo v WHERE v.situacao <> 'I' ORDER BY v.id DESC")
    List<Veiculo> findAllActive();
    
}
