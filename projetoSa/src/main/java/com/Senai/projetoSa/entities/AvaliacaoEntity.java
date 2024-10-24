package com.Senai.projetoSa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "avaliacao")
public class AvaliacaoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "nota_avaliacao")
    private float nota_avaliacao;

    @Column(name = "texto_avaliativo")
    private String texto_avaliativo;


    @OneToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;


    public float getNota_avaliacao() {
        return nota_avaliacao;
    }


    public void setNota_avaliacao(float nota_avaliacao) {
        this.nota_avaliacao = nota_avaliacao;
    }


    public String getTexto_avaliativo() {
        return texto_avaliativo;
    }


    public void setTexto_avaliativo(String texto_avaliativo) {
        this.texto_avaliativo = texto_avaliativo;
    }


    public UsuarioEntity getUsuario() {
        return usuario;
    }


    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }
    
    

}
