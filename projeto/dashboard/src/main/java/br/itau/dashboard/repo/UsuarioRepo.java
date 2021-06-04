package br.itau.dashboard.repo;

import org.springframework.data.repository.CrudRepository;

import br.itau.dashboard.model.Usuario;

public interface UsuarioRepo extends CrudRepository <Usuario, Integer> {
    
    public Usuario findByEmailAndSenha(String email, String senha);
    public Usuario findByRacfAndSenha(String email, String senha);
    //no geral a saida mais indicada é a abaixo.
    public Usuario findByEmailOrRacf(String email, String racf);
}
