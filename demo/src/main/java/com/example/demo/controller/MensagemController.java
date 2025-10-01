package com.example.demo.controller;

import com.example.demo.model.Mensagem;
import com.example.demo.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    @Autowired
    private MensagemService service;

    @GetMapping
    public List<Mensagem> listar() {
        return service.listarMensagens();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mensagem> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mensagem criar(@RequestBody Mensagem mensagem) {
        return service.salvar(mensagem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mensagem> atualizar(@PathVariable Long id, @RequestBody Mensagem mensagem) {
        return service.atualizar(id, mensagem)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return service.deletar(id) ?
                ResponseEntity.noContent().build() :
                ResponseEntity.notFound().build();
    }
}
