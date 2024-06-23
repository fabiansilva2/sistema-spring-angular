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
@Table(name="produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_produto")
    private Long idproduto;

    @Column(name="descrição_produto")
    private String descricaoproduto;

    @Column(name="preco_produto")
    private String precoproduto;

    @Column(name="codigo_produto")
    private int codigoproduto;
    
}