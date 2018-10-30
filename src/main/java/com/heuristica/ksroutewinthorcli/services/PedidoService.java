package com.heuristica.ksroutewinthorcli.services;

import com.heuristica.ksroutewinthorcli.models.Pedido;
import com.heuristica.ksroutewinthorcli.repositories.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PedidoService {

    @Autowired private PedidoRepository pedidos;
    @Autowired private EventService eventService;
    
    public void loadEvents() {
        List<Pedido> result = pedidos.findAllDisponible();
        result.forEach(p -> eventService.insertRecordable(p));        
    }    

}
