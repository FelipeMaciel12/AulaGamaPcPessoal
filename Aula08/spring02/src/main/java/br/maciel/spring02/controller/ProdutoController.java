package br.maciel.spring02.controller;

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
import br.maciel.spring02.model.Produto;
import br.maciel.spring02.repo.ProdutoRepo;



@RestController
@CrossOrigin("*")
@RequestMapping("/produto")

public class ProdutoController {
    
    @Autowired // injeção de dependência
    private ProdutoRepo repo;

    @GetMapping("/todos")
    public List<Produto> listarTodos() {

        List<Produto> lista =  (List<Produto>) repo.findAll();
        return lista;

    }
    @GetMapping("/cod/{codigo}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable long codigo){
        Produto produto = repo.findById(codigo).orElse(null);
        if (produto!=null) {
            return ResponseEntity.ok(produto); // OK = Codigo 200 (HTTP de sucesso)
        }
        
        return ResponseEntity.notFound().build(); // notFound = Codigo 404 (Não encontrado)
    }
    @PostMapping("/cod")
    public ResponseEntity<Produto> buscarProduto2(@RequestBody Produto prod){
        Produto produto = repo.findById(prod.getCodigo()).orElse(null);
        if (produto!=null) {
            return ResponseEntity.ok(produto); // OK = Codigo 200 (HTTP de sucesso)
        }
        
        return ResponseEntity.notFound().build(); // notFound = Codigo 404 (Não encontrado)
    }

    @PostMapping("/nome")
    public ResponseEntity<Produto> buscarProdutoPorNome(@RequestBody Produto prod){
        Produto produto = repo.findByNome(prod.getNome());
        if (produto!=null) {
            return ResponseEntity.ok(produto); // OK = Codigo 200 (HTTP de sucesso)
        }
        
        return ResponseEntity.notFound().build(); // notFound = Codigo 404 (Não encontrado)
    }

}
