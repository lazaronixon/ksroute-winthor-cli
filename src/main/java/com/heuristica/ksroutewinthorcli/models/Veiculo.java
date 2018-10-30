package com.heuristica.ksroutewinthorcli.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pcveicul")
public class Veiculo implements Recordable, Serializable {
    
    @Id
    private Long codveiculo;
    private String descricao;
    private String tipoveiculo;
    private String situacao;
    
    @Override
    public String getRecordableId() { return String.valueOf(codveiculo); }
    
    @Override
    public String getRecordableType() { return Veiculo.class.getSimpleName(); }        
    
}
