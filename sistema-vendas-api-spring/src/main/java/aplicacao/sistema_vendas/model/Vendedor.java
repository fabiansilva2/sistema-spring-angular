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
@Table(name="vendedor")
public class Vendedor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_vendedor")
    private Long idvendedor;

    @Column(name="nome_vendedor")
    private String nomevendedor;

    @Column(name="email_vendedor")
    private String emailvendedor;

    @Column(name="telefone_vendedor")
    private int telefonevendedor;
    
}
