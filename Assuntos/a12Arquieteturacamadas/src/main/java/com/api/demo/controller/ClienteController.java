package com.api.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo.model.ClienteModel;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {

    @GetMapping("/teste")
    public String testeString() {
        return "Teste spring";
    }

    @PostMapping("/novoCliente")
    public ClienteModel novoClienteModel(@RequestBody ClienteModel cliente) {
        return cliente;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/cliente/{id}")
    public ClienteModel findById(@PathVariable long id) {
        return new ClienteModel(id, "usuario_exemplo", "senha123");
    }

    @GetMapping("/clientes")
    public List<ClienteModel> getAll() {
        List<ClienteModel> lista = new ArrayList<>();
        lista.add(new ClienteModel(1L, "usuario1", "123"));
        lista.add(new ClienteModel(2L, "usuario2", "456"));
        return lista;
    }
}