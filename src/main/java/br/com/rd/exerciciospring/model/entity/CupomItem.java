package br.com.rd.exerciciospring.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private Long idCupomItem;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cupom")
    private Cupom idCupom;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_produto")
    private Produto idProduto;

   @Column(name = "qt_produto")
    private Long qtProduto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;
}
