package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.entity.Cupom;
import br.com.rd.exerciciospring.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CupomController {

    @Autowired
    CupomService cupomService;


//    implementar um metodo de consulta que retornará uma lista através
//    das pesquisas de ID_ClIENTE e DT_VENDA

    @GetMapping("/cupom/bucarPorId/{id_cliente")
        public List<Cupom> buscarPorIdCliente(@PathParam("id_cliente") Long idDoCliente){
        return cupomService.findByIdCliente(idDoCliente);

    }

    @GetMapping("/cupom/buscarPorData/{dt_venda}")
        public List<Cupom> buscarPorData(@PathParam("dt_venda") String dtVenda){
        return cupomService.findByData(dtVenda);
    }

}
