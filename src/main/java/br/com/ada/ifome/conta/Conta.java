package br.com.ada.ifome.conta;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Conta {
	
    @Id
    private Long id;
    
    private String agencia;
    private String numero;
    
    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;
    
    private String instituicaoBancaria;


}
