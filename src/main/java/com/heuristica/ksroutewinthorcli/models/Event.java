package com.heuristica.ksroutewinthorcli.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "ksr_event")
@SequenceGenerator(name = "ksr_event_seq", allocationSize = 1)
public class Event implements Serializable {
    
    @Id
    @GeneratedValue(generator = "ksr_event_seq")
    private Long id; 
    private String eventableId;
    private String eventableType;   
    private String persistAction;
    private Integer priority;     
    
    @CreatedDate
    private LocalDateTime createdAt;        
}
