package aplicacao.sistema_vendas.controller;

import java.util.List;
import java.util.Optional;

import aplicacao.sistema_vendas.model.Produto;
import aplicacao.sistema_vendas.repository.ProdutoRepository;

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
public class ProdutoController {


    private final ProdutoRepository produtoRepository = null;

    @GetMapping(value = "api/Produto")
    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    @GetMapping(value = "api/Produto/{id}")
    public Optional<Produto> getById(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping(value = "api/Produto")
    public Produto postMethod(@RequestBody Produto entity) {
        return produtoRepository.save(entity);
    }

    @PutMapping(value = "api/Produto/{id}")
    public Produto putMethodName(@PathVariable String id, @RequestBody Produto entity) {
        return produtoRepository.saveAndFlush(entity);
    }

    @DeleteMapping(value = "api/Produto/{id}")
    public void deleteMethod(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }
}

