package com.micro.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.cliente.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
