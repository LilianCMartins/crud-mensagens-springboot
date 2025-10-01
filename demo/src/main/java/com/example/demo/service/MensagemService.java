package com.example.demo.service;

import com.example.demo.model.Mensagem;
import com.example.demo.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository repository;

    public List<Mensagem> listarMensagens() {
        return repository.findAll();
    }

    public Optional<Mensagem> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Mensagem salvar(Mensagem mensagem) {
        return repository.save(mensagem);
    }

    public Optional<Mensagem> atualizar(Long id, Mensagem novaMensagem) {
        return repository.findById(id).map(mensagem -> {
            mensagem.setTexto(novaMensagem.getTexto());
            return repository.save(mensagem);
        });
    }

    public boolean deletar(Long id) {
        return repository.findById(id).map(mensagem -> {
            repository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
