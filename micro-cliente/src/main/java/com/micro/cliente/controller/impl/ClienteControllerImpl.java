package com.micro.cliente.controller.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.cliente.controller.ClienteController;
import com.micro.cliente.model.ClienteModel;
import com.micro.cliente.service.ClienteService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteControllerImpl implements ClienteController {

	private ClienteService clienteService;

	@PostMapping
	@Override
	public ResponseEntity<ClienteModel> createclient(@RequestBody ClienteModel clienteModel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.clienteService.createclient(clienteModel));
	}

	@GetMapping
	@Override
	public ResponseEntity<List<ClienteModel>> getAllClients() {
		return ResponseEntity.ok(this.clienteService.getAllClients());
	}

	@PutMapping("/{id}")
	@Override
	public ResponseEntity<ClienteModel> updateClient(@RequestBody ClienteModel clienteModel, @PathVariable Integer id) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.clienteService.updateClient(clienteModel, id));
	}

	@GetMapping("/{id}")
	@Override
	public ResponseEntity<ClienteModel> getClientById(@PathVariable Integer id) {
		return ResponseEntity.ok(this.clienteService.getClientById(id));
	}

	@DeleteMapping("/{id}")
	@Override
	public ResponseEntity<Void> deleteClient(@PathVariable Integer id) {
		this.clienteService.deleteClient(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
