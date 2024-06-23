package aplicacao.sistema_vendas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="pedido_compra")
public class Registro {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_pedido")
    private Long idpedido;
 
    @Column(name="produto_id")
    private int produtoid;

    @Column(name="cliente_id")
    private int clienteid;

    @Column(name="vendedor_id")
    private int vendedorid;

    @Column(name="data_pedido")
    private String datapedido; 

}