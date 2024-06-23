import { PedidoCompra } from './../model/pedido-compra';
import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { take } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PedidoCompraService {
  constructor(private httpClient: HttpClient) {}
  private readonly API = 'api';

  pedidoCompraList() {
    return this.httpClient.get<PedidoCompra[]>(this.API + '/VwPedido').pipe(take(1));
  }

  excluir(idpedido: any) {
    let endPoints = '/Registro/' + idpedido;
    {
      alert('Add id a query delete: ' + endPoints);
    }


    return this.httpClient.delete(this.API + endPoints).subscribe((data) => {
      console.log(data);
    });
  }
  PostService(NewRegistro: any){

    window.location.reload()
    console.log(this.API+"/Registro")
    return this.httpClient.post(this.API + "/Registro", NewRegistro).pipe(take(1));


  }


}



