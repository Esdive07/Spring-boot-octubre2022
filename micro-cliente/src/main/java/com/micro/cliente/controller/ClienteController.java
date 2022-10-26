package com.micro.cliente.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.micro.cliente.model.ClienteModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface ClienteController {

	@Operation(summary = "Create Clients")
	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Create Clients"),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content), })
	public ResponseEntity<ClienteModel> createclient(ClienteModel clienteModel);

	@Operation(summary = "Get All Clients")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Return All Clients"),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content), })
	public ResponseEntity<List<ClienteModel>> getAllClients();

	@Operation(summary = "Update Clients")
	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Update Clients"),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content), })
	public ResponseEntity<ClienteModel> updateClient(ClienteModel clienteModel, Integer id);

	@Operation(summary = "Get Client by id")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Return cliente by id"),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content), })
	public ResponseEntity<ClienteModel> getClientById(Integer id);

	@Operation(summary = "Delete Client by id")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "Delete cliente by id"),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content), })
	public ResponseEntity<Void> deleteClient(Integer id);

}
