package br.com.ada.ifome.entregador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Entregador {
	
	
    @Id
    private Long id;
    
    private String nome;
    
    @Column(unique = true, nullable = false)
    private String cpf;
    
    private String rg;
    private String cnh;
    private String email;

}
