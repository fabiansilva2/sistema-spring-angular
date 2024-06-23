package aplicacao.sistema_vendas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="vwproduto")
public class VwPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_pedido")
    private Long idpedido;

    @Column(name="nome_vendedor")
    private String nomevendedor;
    
    @Column(name="nome_cliente")
    private String nomecliente;

    @Column(name="descrição_produto")
    private String descricaoproduto;
    
    @Column(name="data_pedido")
    private String datapedido;
    
}
