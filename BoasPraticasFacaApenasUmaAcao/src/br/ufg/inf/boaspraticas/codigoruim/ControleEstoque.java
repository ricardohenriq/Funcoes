package br.ufg.inf.boaspraticas.codigoruim;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;

public class ControleEstoque {

    HashMap<Integer, Produto> estoqueProdutos;
    HashMap<String, Produto> produtosVendidos;

    public static void main(String[] args) {
        ControleEstoque controleEstoque = new ControleEstoque();
        HashMap<String, Object> parametros = new HashMap<>();
        parametros.put("codigo", 3);
        parametros.put("desconto", 0.1);
        controleEstoque.efetuaVendaAVista(parametros);
    }

    public ControleEstoque() {
        estoqueProdutos = new HashMap<>();
        produtosVendidos = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            estoqueProdutos.put(i, new Produto("Produto" + i, i, (i * i) * 10, i + 10));
        }
    }

    void efetuaVendaAVista(HashMap<String, Object> parametros) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException("O tipo de hash escolhido (SHA) não é suportado");
        }
        Produto produtoVendido = estoqueProdutos.get(parametros.get("codigo"));
        if (produtoVendido.getQuantidade() > 0) {
            if (parametros.get("desconto") != null) {
                produtoVendido.setPreco(produtoVendido.preco * (1 - (double) parametros.get("desconto")));
            }
            produtoVendido.setQuantidade(produtoVendido.quantidade - (double) parametros.get("quantidadeVendida"));
            String conteudoUtilVenda = new Date().toString() + produtoVendido.codigo + produtoVendido.nome;
            messageDigest.update(conteudoUtilVenda.getBytes());
            String shaVenda = String.format("%064x", new java.math.BigInteger(1, messageDigest.digest()));
            produtosVendidos.put(shaVenda, produtoVendido);
        } else {
            throw new IllegalArgumentException("Produto não disponível em estoque");
        }
    }
}
