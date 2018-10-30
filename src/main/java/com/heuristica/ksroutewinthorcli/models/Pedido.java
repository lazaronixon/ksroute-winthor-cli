package com.heuristica.ksroutewinthorcli.models;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pcpedc")
public class Pedido implements Recordable, Serializable {

    @Id
    private Long numped;
    
    private Double vlatend;
    private String posicao;
    private Double totpeso;
    private Double totvolume;
    
    private String fretedespacho;
    
    private Integer numseqmontagem;
    private Integer numordemcarga;    
    private Long numseqentrega;
    
    private LocalDate data;   
    
    @Override
    public String getRecordableId() { return String.valueOf(numped); }
    
    @Override
    public String getRecordableType() { return Pedido.class.getSimpleName(); }
    
}
