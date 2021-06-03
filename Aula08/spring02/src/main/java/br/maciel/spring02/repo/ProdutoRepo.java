package br.maciel.spring02.repo;

import org.springframework.data.repository.CrudRepository;
import br.maciel.spring02.model.Produto;

// CRUD - Create Ready Update Delete
public interface ProdutoRepo extends CrudRepository<Produto,Long> {
    
    public Produto findByNome(String nome);

}
