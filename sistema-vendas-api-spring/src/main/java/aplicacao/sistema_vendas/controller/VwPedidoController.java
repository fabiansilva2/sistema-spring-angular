package aplicacao.sistema_vendas.controller;

import java.util.List;

import aplicacao.sistema_vendas.model.VwPedido;
import aplicacao.sistema_vendas.repository.VwPedidoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class VwPedidoController {

    
    private final VwPedidoRepository vwPedidoRepository = null;

    @GetMapping(value = "api/VwPedido")
    public List<VwPedido> getAll() {
        return vwPedidoRepository.findAll();
    }
    
}