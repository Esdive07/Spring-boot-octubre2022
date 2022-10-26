package com.micro.cliente.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ClienteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer index;
	@JsonProperty("tipoDocumento")
	private String documentType;
	@JsonProperty("documento")
	private String document;
	@JsonProperty("nombre")
	private String name;
	@JsonProperty("apellidos")
	private String lastName;
	@JsonProperty("correoElectronico")
	private String email;
	@JsonProperty("telefono")
	private String phone;
}
