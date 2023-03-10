package model;

import java.util.*;

public class Vendedor extends Usuario {

	private float valorVendas;
	private float totalComissao;
	private ArrayList<Venda> vendas;

	public Vendedor(String email, String endereco, String cidade, String estado, String cep, String bairro, String nome,
			String senha, float valorVendas, float totalComissao, String telefone) {
		super(email, endereco, cidade, estado, cep, bairro, nome, senha, telefone);
		this.valorVendas = valorVendas;
		this.totalComissao = totalComissao;
	}

	public Vendedor(String email, String endereco, String cidade, String estado, String cep, String bairro, String nome,
			String senha, String telefone) {
		super(email, endereco, cidade, estado, cep, bairro, nome, senha,telefone);
		valorVendas = 0;
		totalComissao = 0;
	}

	public boolean cadastrarVenda() {
		return true;
	}

	public void editarVenda() {

	}

	public void removerVenda() {

	}

	public float calcularValorVendas() {
		return 0;
	}

	public float calcularTotalComissao() {
		//Veiculo.valor * 0.02
		return 0;
	}

	public String toString() {
		return this.getNome();
	}
}
