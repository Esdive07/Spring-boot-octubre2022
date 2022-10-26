package com.micro.cliente.service;

import java.util.List;

import com.micro.cliente.model.ClienteModel;

public interface ClienteService {

	public ClienteModel createclient(ClienteModel clienteModel);

	public List<ClienteModel> getAllClients();

	public ClienteModel updateClient(ClienteModel clienteModel, Integer id);

	public ClienteModel getClientById(Integer id);

	public void deleteClient(Integer id);

}
