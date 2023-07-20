package br.com.petz.Clientepet.cliente.application.service;

import br.com.petz.Clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.Clientepet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
