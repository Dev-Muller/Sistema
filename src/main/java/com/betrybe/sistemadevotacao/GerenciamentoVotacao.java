package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe GerenciamentoVotacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<String> cpfsComputados;

  /**
 * Constructor.
 */
  public GerenciamentoVotacao() {
    this.pessoasEleitoras = new ArrayList<PessoaEleitora>();
    this.pessoasCandidatas = new ArrayList<PessoaCandidata>();
    this.cpfsComputados = new ArrayList<String>();
  }

  /**
   * Metodos.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora eleitora : pessoasEleitoras) {
      if (eleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
      }
    }
    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    this.pessoasEleitoras.add(pessoaEleitora);
  }

  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata candidata : pessoasCandidatas) {
      if (candidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
      }
    }
    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    this.pessoasCandidatas.add(pessoaCandidata);
  }

}
