export interface PedidoCompra {
  idpedido: number,
  nomevendedor: string,
  nomecliente: string,
  descricaoproduto: string,
  datapedido: string
}


export interface Registro {
  idpedido: number,
  produtoid: number,
  clienteid: number,
  vendedorid: number,
  datapedido: string
}
