package br.maciel.spring02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity // será armazenado em BD
@Table(name="fornecedor")

public class Fornecedor {
 
    @Id // chave primaria
    @GeneratedValue (strategy = GenerationType.IDENTITY)// auto numerado no BD com 1,2,3
    @Column(name="id")   
    private long id;
    
    @Column(name="nome",length = 200, nullable = false)
    private String nome;

    @Column(name="telefone",length = 30, nullable = false)
    private String telefone;

    @OneToMany(mappedBy = "fornecedor") // um para vários
    @JsonIgnoreProperties("fornecedor")
    private List <Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

}
