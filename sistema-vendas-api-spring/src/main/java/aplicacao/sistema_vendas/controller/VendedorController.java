package aplicacao.sistema_vendas.controller;

import java.util.List;
import java.util.Optional;

import aplicacao.sistema_vendas.model.Vendedor;
import aplicacao.sistema_vendas.repository.VendedorRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class VendedorController {

    
    private final VendedorRepository vendedorRepository = null;

    @GetMapping(value = "api/Vendedor")
    public List<Vendedor> getAll() {
        return vendedorRepository.findAll();
    }

    @GetMapping(value = "api/Vendedor/{id}")
    public Optional<Vendedor> getById(@PathVariable Long id) {
        return vendedorRepository.findById(id);
    }

    @PostMapping(value = "api/Vendedor")
    public Vendedor postMethod(@RequestBody Vendedor entity) {
        return vendedorRepository.save(entity);
    }

    @PutMapping(value = "api/Vendedor/{id}")
    public Vendedor putMethodName(@PathVariable String id, @RequestBody Vendedor entity) {
        return vendedorRepository.saveAndFlush(entity);
    }

    @DeleteMapping(value = "api/Vendedor/{id}")
    public void deleteMethod(@PathVariable Long id) {
        vendedorRepository.deleteById(id);
    }


    
}
