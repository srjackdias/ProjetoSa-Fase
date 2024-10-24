package com.Senai.projetoSa.entities;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity(name = "usuario")
public class UsuarioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name= "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "telefone")
    private String telefone;

    @Column(name= "cep")
    private String cep;

    @Column(name = "tipo_usuario")
    private String  tipo_usuario;


    @OneToOne(mappedBy = "usuario")
    private AvaliacaoEntity avaliacao;
    
    
    @OneToMany(mappedBy= "usuario")
    private List<TrabalhadoSolicitadoEntity> trabalhoSolicitado;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public String getTipo_usuario() {
        return tipo_usuario;
    }


    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }


    public AvaliacaoEntity getAvaliacao() {
        return avaliacao;
    }


    public void setAvaliacao(AvaliacaoEntity avaliacao) {
        this.avaliacao = avaliacao;
    }


    public List<TrabalhadoSolicitadoEntity> getTrabalhoSolicitado() {
        return trabalhoSolicitado;
    }


    public void setTrabalhoSolicitado(List<TrabalhadoSolicitadoEntity> trabalhoSolicitado) {
        this.trabalhoSolicitado = trabalhoSolicitado;
    }


    

}
