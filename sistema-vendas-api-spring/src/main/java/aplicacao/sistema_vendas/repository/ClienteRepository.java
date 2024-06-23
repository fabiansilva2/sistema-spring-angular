package aplicacao.sistema_vendas.repository;

import aplicacao.sistema_vendas.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
