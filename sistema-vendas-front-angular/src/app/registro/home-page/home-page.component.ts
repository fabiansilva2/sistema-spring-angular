import { PedidoCompraService } from './../services/pedido-compra.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { PedidoCompra, Registro } from '../model/pedido-compra';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent implements OnInit {

  pedidocompra: Observable <PedidoCompra[]>;
  displayedColumns = ['idpedido','nomevendedor','nomecliente','descricaoproduto','datapedido','excluir'];

  constructor(private pedidoCompraService: PedidoCompraService) {
    //this.musicas = []
    this.pedidocompra = this.pedidoCompraService.pedidoCompraList();
   }

  ngOnInit(): void {
  }

  excluir(id: any){

    const NewRegistro: Registro = {
      idpedido: id,
      produtoid: 0,
      clienteid: 0,
      vendedorid: 0,
      datapedido: ''
    }

    {alert("excluir numero: " + id)}
    this.pedidoCompraService.excluir(NewRegistro.idpedido)
  }

  AddCliente(){
    {alert("Cliente Adicionado")}
  }


  PostMethod() {
    const NewRegistro: Registro = {
      idpedido: 0,
      produtoid: parseInt(
        (<HTMLInputElement>document.getElementById('produto_id')).value
      ),
      clienteid: parseInt(
        (<HTMLInputElement>document.getElementById('cliente_id')).value
      ),
      vendedorid: parseInt(
        (<HTMLInputElement>document.getElementById('vendedor_id')).value
      ),
      datapedido: (<HTMLInputElement>document.getElementById('data_pedido'))
        .value,
    };

    console.log(NewRegistro);
    this.pedidoCompraService.PostService(NewRegistro).subscribe(
      (sucesso) => console.log('sucesso'),
      (error) => console.log(error),
      () => console.log
    );
  }

  AddEcluirCliente() {
    {
      alert('Em construção');
    }
  }

  AddEcluirProduto() {
    alert('Em construção');
  }

}
