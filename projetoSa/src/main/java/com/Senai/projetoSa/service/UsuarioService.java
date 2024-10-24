package com.Senai.projetoSa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Senai.projetoSa.dtos.req.CreateTrabalhadorSolicitado;
import com.Senai.projetoSa.dtos.req.CreateUsuarioDTO;
import com.Senai.projetoSa.dtos.resp.ShowAvaliacaoDTO;
import com.Senai.projetoSa.dtos.resp.ShowTrabalhadorSolicitadoDTO;
import com.Senai.projetoSa.dtos.resp.ShowUsuarioDTO;
import com.Senai.projetoSa.entities.TrabalhadoSolicitadoEntity;
import com.Senai.projetoSa.entities.UsuarioEntity;
import com.Senai.projetoSa.repositories.AvaliacaoRepository;
import com.Senai.projetoSa.repositories.TrabalhoSolicitadoRepository;
import com.Senai.projetoSa.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;


    @Autowired
    AvaliacaoRepository avaliacaoRepository;


    @Autowired
    TrabalhoSolicitadoRepository trabalhoSolicitadoRepository;

    public void createUsuario (CreateUsuarioDTO dto){

    UsuarioEntity usuarioEntity = new UsuarioEntity();
    usuarioEntity.setNome(dto.getNome());
    usuarioEntity.setEmail(dto.getEmail());
    usuarioEntity.setSenha(dto.getSenha());
    usuarioEntity.setTelefone(dto.getTelefone());
    usuarioEntity.setCep(dto.getCep());
    usuarioEntity.setTipo_usuario(dto.getTipo_usuario());


    usuarioEntity = usuarioRepository.save(usuarioEntity);

    List <TrabalhadoSolicitadoEntity> trabalhadoSolicitadoEntities  = new ArrayList<>();;
   

    for(CreateTrabalhadorSolicitado trabalhadorSolicitadoDTO: dto.getTrabalhoSolicitado()){
        TrabalhadoSolicitadoEntity trabalhadoSolicitadoEntity = new TrabalhadoSolicitadoEntity();
        trabalhadoSolicitadoEntity.setId_cliente(trabalhadorSolicitadoDTO.getId_cliente());
        trabalhadoSolicitadoEntity.setId_trabalhador(trabalhadorSolicitadoDTO.getId_trabalhador());
        trabalhadoSolicitadoEntity.setTipo(trabalhadorSolicitadoDTO.getTipo());
        trabalhadoSolicitadoEntity.setValor(trabalhadorSolicitadoDTO.getValor());
        trabalhadoSolicitadoEntity.setLocalizaçao(trabalhadorSolicitadoDTO.getLocalizacao());
        trabalhadoSolicitadoEntity.setDescricao(trabalhadorSolicitadoDTO.getDescricao());
        trabalhadoSolicitadoEntity.setStatus(trabalhadorSolicitadoDTO.isStatus());

        trabalhadoSolicitadoEntities.add(trabalhadoSolicitadoEntity);


    }
    trabalhoSolicitadoRepository.saveAll(trabalhadoSolicitadoEntities);

    }

    public List<ShowUsuarioDTO> getAllUsuarios(){
        List<UsuarioEntity> usuarioEntity = usuarioRepository.findAll();

        return usuarioEntity
                .stream()
                .map(usuario -> {
                    ShowUsuarioDTO usuarioDTO = new ShowUsuarioDTO();
                    ShowAvaliacaoDTO avaliacaoDTO = new ShowAvaliacaoDTO();
                    List<ShowTrabalhadorSolicitadoDTO> trabalhadorSolicitadosDTOs =  new ArrayList<>();

                    for(TrabalhadoSolicitadoEntity trabalhadoSolicitadoEntity : usuario.getTrabalhoSolicitado()){
                        ShowTrabalhadorSolicitadoDTO trabalhadorSolicitadoDTO = new ShowTrabalhadorSolicitadoDTO();
                        trabalhadorSolicitadoDTO.setId_cliente(trabalhadoSolicitadoEntity.getId_cliente());
                        trabalhadoSolicitadoEntity.setTipo(trabalhadoSolicitadoEntity.getTipo());
                        trabalhadoSolicitadoEntity.setValor(trabalhadoSolicitadoEntity.getValor());
                        trabalhadoSolicitadoEntity.setLocalizaçao(trabalhadoSolicitadoEntity.getLocalizaçao());
                        trabalhadoSolicitadoEntity.setId_trabalhador(trabalhadoSolicitadoEntity.getId_trabalhador());
                        trabalhadoSolicitadoEntity.setDescricao(trabalhadoSolicitadoEntity.getDescricao());
                        trabalhadoSolicitadoEntity.setStatus(trabalhadoSolicitadoEntity.isStatus());

                        
                        trabalhadorSolicitadosDTOs.add(trabalhadorSolicitadoDTO);
                    }

                    avaliacaoDTO.setNota_avaliacao(usuario.getAvaliacao().getNota_avaliacao());
                    avaliacaoDTO.setTexto_avaliativo(usuario.getAvaliacao().getTexto_avaliativo());

                    usuarioDTO.setId(usuario.getId());
                    usuarioDTO.setNome(usuario.getNome());


                return usuarioDTO;



                }).toList();




    }
}
