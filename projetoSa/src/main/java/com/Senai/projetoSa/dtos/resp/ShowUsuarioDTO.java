package com.Senai.projetoSa.dtos.resp;

import java.util.List;

public class ShowUsuarioDTO {
    

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cep;
    private ShowAvaliacaoDTO avaliacao;
    private String  tipo_usuario;

    private List<ShowTrabalhadorSolicitadoDTO> trabalhoSolicitado;

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

    public ShowAvaliacaoDTO getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(ShowAvaliacaoDTO avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public List<ShowTrabalhadorSolicitadoDTO> getTrabalhoSolicitado() {
        return trabalhoSolicitado;
    }

    public void setTrabalhoSolicitado(List<ShowTrabalhadorSolicitadoDTO> trabalhoSolicitado) {
        this.trabalhoSolicitado = trabalhoSolicitado;
    }
    
    


}
