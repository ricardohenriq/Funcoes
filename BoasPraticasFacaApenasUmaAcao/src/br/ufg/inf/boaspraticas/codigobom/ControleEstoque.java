package br.ufg.inf.boaspraticas.codigobom;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;

public class ControleEstoque {

    HashMap<Integer, Produto> estoqueProdutos;
    HashMap<String, Produto> produtosVendidos;
    MessageDigest messageDigest;

    public static void main(String[] args) {
        ControleEstoque controleEstoque = new ControleEstoque();
        HashMap<String, Object> parametros = new HashMap<>();
        parametros.put("codigo", 3);
        parametros.put("desconto", 0.1);
        parametros.put("quantidadeVendida", 2.0);
        controleEstoque.efetuaVendaAVista(parametros);
    }

    public ControleEstoque() {
        estoqueProdutos = new HashMap<>();
        produtosVendidos = new HashMap<>();
        inicializaEstoque(estoqueProdutos);
    }

    public void inicializaEstoque(HashMap<Integer, Produto> estoqueProdutos) {
        for (int i = 0; i < 10; i++) {
            estoqueProdutos.put(i, new Produto("Produto" + i, i, (i * i) * 10, i + 10));
        }
    }

    private String geraConteudoUtil(Produto produtoVendido) {
        return new Date().toString() + produtoVendido.codigo + produtoVendido.nome;
    }

    private MessageDigest getMessageDigestConfigurado() {
        try {
            return MessageDigest.getInstance("SHA");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException("O tipo de hash escolhido (SHA) não é suportado");
        }
    }

    private String geraHashVenda(Produto produtoVendido) {
        MessageDigest messageDigest = getMessageDigestConfigurado();
        messageDigest.update(geraConteudoUtil(produtoVendido).getBytes());
        return String.format("%064x", new java.math.BigInteger(1, messageDigest.digest()));
    }

    private boolean temDesconto(HashMap<String, Object> parametros) {
        return parametros.get("desconto") != null;
    }

    void efetuaVendaAVista(HashMap<String, Object> parametros) {
        Produto produtoVendido = estoqueProdutos.get(parametros.get("codigo"));
        if (produtoVendido.getQuantidade() > 0) {
            if (temDesconto(parametros)) {
                produtoVendido.setPreco(produtoVendido.preco * (1 - (double) parametros.get("desconto")))
            }
            produtoVendido.setQuantidade(produtoVendido.quantidade - (double) parametros.get("quantidadeVendida"));
            String shaVenda = geraHashVenda(produtoVendido);
            produtosVendidos.put(shaVenda, produtoVendido);
        } else {
            throw new IllegalArgumentException("Produto não disponível em estoque");
        }
    }
}
