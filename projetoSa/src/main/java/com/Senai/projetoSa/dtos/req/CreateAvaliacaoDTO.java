package com.Senai.projetoSa.dtos.req;

public class CreateAvaliacaoDTO {
    

    private float nota_avaliacao;
    private String texto_avaliativo;
    
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

    


}
