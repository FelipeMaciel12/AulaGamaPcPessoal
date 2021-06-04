package br.itau.dashboard.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.dashboard.model.Usuario;
import br.itau.dashboard.repo.UsuarioRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")

public class UsuarioController {

    @Autowired
    private UsuarioRepo repo;

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable int id) {
        Usuario usuario = repo.findById(id).orElse(null);
        if (usuario != null) {
            usuario.setSenha("*******");
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/id")
    public ResponseEntity<Usuario> buscarUsuarioPorID(@RequestBody Usuario id) {
        Usuario usuario = repo.findById(id.getId()).orElse(null);
        if (usuario != null) {
            usuario.setSenha("*******");
            return ResponseEntity.ok(usuario); // OK = Codigo 200 (HTTP de sucesso)
        }

        return ResponseEntity.notFound().build(); // notFound = Codigo 404 (Não encontrado)
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario user) {
        Usuario userBD = repo.findByEmailOrRacf(user.getEmail(), user.getRacf());
        if (userBD != null) {

            if (userBD.getSenha().equals(user.getSenha())) {
                userBD.setSenha("*******");
                return ResponseEntity.ok(userBD);
            }
        }

        return ResponseEntity.notFound().build(); // notFound = Codigo 404 (Não encontrado)
    }

    @GetMapping ("/all")
    public List<Usuario> listaUsuarios(){
        return (List<Usuario>) repo.findAll();
    }

}
