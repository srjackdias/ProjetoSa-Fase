package com.Senai.projetoSa.dtos.req;

import java.util.List;

public class CreateUsuarioDTO {
    
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cep;
    private String tipo_usuario;
    private CreateAvaliacaoDTO avaliacao;
    private List<CreateTrabalhadorSolicitado> trabalhoSolicitado;

    
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
    public CreateAvaliacaoDTO getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(CreateAvaliacaoDTO avaliacao) {
        this.avaliacao = avaliacao;
    }
    public List<CreateTrabalhadorSolicitado> getTrabalhoSolicitado() {
        return trabalhoSolicitado;
    }
    public void setTrabalhoSolicitado(List<CreateTrabalhadorSolicitado> trabalhoSolicitado) {
        this.trabalhoSolicitado = trabalhoSolicitado;
    }
  

}
