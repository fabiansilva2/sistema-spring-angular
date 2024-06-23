package aplicacao.sistema_vendas.repository;

import aplicacao.sistema_vendas.model.Registro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<Registro,Long> {
    
}
