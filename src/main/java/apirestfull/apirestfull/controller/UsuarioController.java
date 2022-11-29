package apirestfull.apirestfull.controller;


import apirestfull.apirestfull.model.UsuarioModel;
import apirestfull.apirestfull.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paciente")
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listarPacientes")
    public ResponseEntity <List<UsuarioModel>> listarTodos() {

        return ResponseEntity.ok(repository.findAll());

    }

    @PostMapping("/salvar")
    public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel paciente) {

        return ResponseEntity.ok(repository.save(paciente));


    }
}
