package aplicacao.sistema_vendas.repository;

import aplicacao.sistema_vendas.model.Vendedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
    
}
