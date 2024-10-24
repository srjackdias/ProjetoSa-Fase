package com.Senai.projetoSa.dtos.req;

public class CreateTrabalhadorSolicitado {

    private long id_cliente;
    private long id_trabalhador;
    private String tipo;
    private String valor;
    private String localizacao;
    private String  descricao;
    private boolean status;
    public long getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }
    public long getId_trabalhador() {
        return id_trabalhador;
    }
    public void setId_trabalhador(long id_trabalhador) {
        this.id_trabalhador = id_trabalhador;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
