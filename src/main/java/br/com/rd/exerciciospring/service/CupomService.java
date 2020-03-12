package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.entity.Cupom;
import br.com.rd.exerciciospring.model.entity.CupomItem;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("CupomService")
public class CupomService {

    @Autowired
    CupomRepository cupomRepository;

    public ResponseEntity consultar(Cupom cupom){
        if(cupom == null || cupom.getIdCliente() == null)
            return ResponseEntity.badRequest().body(new Exception("Cliente não localizado"));

        if(cupom.getDtVenda() == null)
            return ResponseEntity.badRequest().body(new Exception("Data não encontrada"));


        return ResponseEntity.ok().body(cupomRepository.save(cupom));

    }



    public List<Cupom> findByIdCliente(Long idDoCliente) {
        return null;
    }

    public List<Cupom> findByData(String dtVenda) {
        return null;
    }
}

