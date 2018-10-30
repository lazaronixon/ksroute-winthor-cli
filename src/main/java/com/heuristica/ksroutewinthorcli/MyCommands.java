package com.heuristica.ksroutewinthorcli;

import com.heuristica.ksroutewinthorcli.repositories.EventRepository;
import com.heuristica.ksroutewinthorcli.services.PedidoService;
import com.heuristica.ksroutewinthorcli.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class MyCommands {
    
    @Autowired private EventRepository eventRepository;
    @Autowired private VeiculoService veiculoServices;
    @Autowired private PedidoService pedidoService;    
    
    @ShellMethod("Limpar fila de eventos.")
    public void clearQueue() {
        eventRepository.deleteAll();
    } 
    
    @ShellMethod("Carregar veículos.")
    public void loadVehicles() {
        veiculoServices.loadEvents();
    }  
    
    @ShellMethod("Carregar pedidos.")
    public void loadOrders() {
        pedidoService.loadEvents();
    }
    
    @ShellMethod("ActiveMQ URL.")
    public String activemqMonitor() {
        return "ActiveMQ URL --> http://localhost:8161";
    }
}
