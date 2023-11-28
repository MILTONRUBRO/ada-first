package br.com.ada.ifome.entregador;

import org.springframework.stereotype.Service;

import br.com.ada.ifome.usuario.exceptions.CnhInvalidoException;
import br.com.ada.ifome.usuario.exceptions.CpfInvalidoException;
import br.com.ada.ifome.usuario.exceptions.RgInvalidoException;
import br.com.ada.ifome.utils.DocumentosUtils;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EntregadorService {

	private final EntregadorRepository entregadorRepository;

	public Entregador salvar(Entregador entregador) {
		
		if(!DocumentosUtils.validarCPF(entregador.getCpf())) {
            throw new CpfInvalidoException();
		}
		
		if(!DocumentosUtils.validarRG(entregador.getRg())) {
            throw new RgInvalidoException();
		}
		
		if(!DocumentosUtils.validarCNH(entregador.getCnh())) {
            throw new CnhInvalidoException();
		}
		
		return entregadorRepository.save(entregador);
		
	}

}
