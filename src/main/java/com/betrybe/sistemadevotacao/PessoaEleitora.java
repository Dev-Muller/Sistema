package com.betrybe.sistemadevotacao;

/**
 * Classe PessoaEleitora.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;


  /**
   * Constructor.
   */
  public PessoaEleitora(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  /**
   * Getters e Setters.
   */
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
