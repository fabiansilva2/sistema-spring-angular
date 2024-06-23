package aplicacao.sistema_vendas.repository;

import aplicacao.sistema_vendas.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
