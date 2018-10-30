package com.heuristica.ksroutewinthorcli.services;

import com.heuristica.ksroutewinthorcli.models.Veiculo;
import com.heuristica.ksroutewinthorcli.repositories.VeiculoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VeiculoService {    
    
    @Autowired private VeiculoRepository veiculos; 
    @Autowired private EventService eventService;    

    public void loadEvents() {
        List<Veiculo> result = veiculos.findAllActive();
        result.forEach(v -> eventService.insertRecordable(v));        
    }    

}
