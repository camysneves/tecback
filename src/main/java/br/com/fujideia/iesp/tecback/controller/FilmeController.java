package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fujideia.iesp.tecback.service.FilmeService;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
    private FilmeService service;

    @PostMapping ("/salvar")
    public ResponseEntity<Filme> salvar(Filme filme) {
        filme = service.salvar(filme);

        return ResponseEntity.ok(filme);

    }
    @GetMapping
    public ResponseEntity<List<Filme>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}