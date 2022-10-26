package com.micro.cliente.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class ClienteModel {

	private Integer id;
	private String tipoDocumento;
	private String documento;
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	private String telefono;
}
