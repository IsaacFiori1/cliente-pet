package br.com.petz.Clientepet.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.petz.Clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.Clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.Clientepet.cliente.application.repository.ClienteRepository;
import br.com.petz.Clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteAplicattionService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteAplicationService - criarCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteAplicationService - criarCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}
}
