package com.Senai.projetoSa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity(name = "trabalho_solicitado")
public class TrabalhadoSolicitadoEntity {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "id_cliente")
     private Long id_cliente;  

     @Column(name = "id_trabalhador")
     private Long id_trabalhador;  
    
    @Column(name = "tipo")
    private String tipo;


    @Column(name = "valor")
    private String valor;


    @Column(name = "localizaçao")
    private String localizaçao;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private  UsuarioEntity usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Long getId_trabalhador() {
        return id_trabalhador;
    }

    public void setId_trabalhador(Long id_trabalhador) {
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

    public String getLocalizaçao() {
        return localizaçao;
    }

    public void setLocalizaçao(String localizaçao) {
        this.localizaçao = localizaçao;
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

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }



    
}
