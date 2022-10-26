package com.micro.cliente.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.cliente.entity.ClienteEntity;
import com.micro.cliente.model.ClienteModel;
import com.micro.cliente.repository.ClienteRepository;
import com.micro.cliente.service.ClienteService;
import com.micro.cliente.util.MapperUtil;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

	private ClienteRepository clienteRepository;
	private MapperUtil mapperUtil;

	@Override
	public ClienteModel createclient(ClienteModel clienteModel) {
		ClienteEntity clienteEntity = this.mapperUtil.mapperObject(clienteModel, ClienteEntity.class);
		return this.mapperUtil.mapperObject(this.clienteRepository.save(clienteEntity), ClienteModel.class);
	}

	@Override
	public List<ClienteModel> getAllClients() {
		List<ClienteEntity> listaClienteEntities = this.clienteRepository.findAll();
		List<ClienteModel> listamodel = new ArrayList<>();

		for (ClienteEntity clienteEntity : listaClienteEntities) {
			ClienteModel clienteModel = this.mapperUtil.mapperObject(clienteEntity, ClienteModel.class);
			listamodel.add(clienteModel);
		}

		return listamodel;
	}

	@Override
	public ClienteModel updateClient(ClienteModel clienteModel, Integer id) {
		clienteModel.setId(id);
		ClienteEntity clienteEntity = this.mapperUtil.mapperObject(clienteModel, ClienteEntity.class);
		return this.mapperUtil.mapperObject(this.clienteRepository.save(clienteEntity), ClienteModel.class);
	}

	@Override
	public ClienteModel getClientById(Integer id) {
		ClienteEntity clienteEntity = this.clienteRepository.findById(id).get();
		return this.mapperUtil.mapperObject(clienteEntity, ClienteModel.class);
	}

	@Override
	public void deleteClient(Integer id) {
		this.clienteRepository.deleteById(id);

	}

}
