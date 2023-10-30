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

  /**
   * Metodo de cadastrar pessoa candidata.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata candidata : pessoasCandidatas) {
      if (candidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
      }
    }
    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    this.pessoasCandidatas.add(pessoaCandidata);
  }

  @Override
  public void mostrarResultado() {
    int totalVotos = cpfsComputados.size();
    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    } else {
      for (PessoaCandidata candidata : pessoasCandidatas) {
        int votosCandidata = candidata.getVotos();
        double percentualVotos = (votosCandidata * 100) / totalVotos;
        System.out.println("Nome: " + candidata.getNome() + " - "
            + votosCandidata + " votos ( " + Math.round(percentualVotos) + "% )");
      }
      System.out.println("Total de votos: " + totalVotos);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }

    // PessoaCandidata candidataVotada = null;
    for (PessoaCandidata candidata : pessoasCandidatas) {
      if (candidata.getNumero() == numeroPessoaCandidata) {
        candidata.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
        return;
      }
    }

    // if (candidataVotada != null) {
    //   candidataVotada.receberVoto();
    //   cpfsComputados.add(cpfPessoaEleitora);
    // } else {
    //   System.out.println("Número de pessoa candidata não encontrado!");
    // }
  }
}
