package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal.
 */
public class Principal {

  /**
   * Constructor.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    boolean opcao = true;

    while (opcao) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      int escolha = Integer.parseInt(scanner.nextLine());

      if (escolha == 1) {
        System.out.println("Entre com o nome da pessoa candidata: ");
        String nome = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata: ");
        int numero = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      } else if (escolha == 2) {
        opcao = false;
      } else {
        System.out.println("Opção inválida. Tente novamente.");
      }
    }

    opcao = true;
    while (opcao) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.print("Entre com o número correspondente à opção desejada:");
      int escolha = Integer.parseInt(scanner.nextLine());

      if (escolha == 1) {
        System.out.print("Entre com o nome da pessoa eleitora: ");
        String nome = scanner.nextLine();
        System.out.print("Entre com o CPF da pessoa eleitora: ");
        String cpf = scanner.nextLine();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      } else if (escolha == 2) {
        opcao = false;
      } else {
        System.out.println("Opção inválida. Tente novamente.");
      }
    }

    // while (opcao == 2) {
    //   System.out.print("Entre com o número correspondente à opção desejada:");
    //   System.out.println("1 - Votar");
    //   System.out.println("2 - Resultado Parcial");
    //   System.out.println("3 - Finalizar votação");
    //   int escolha = scanner.nextInt();

    //   if (escolha == 1) {
    //     System.out.print("Entre com o CPF da pessoa eleitora: ");
    //     String cpfPessoaEleitora = scanner.nextLine();
    //     System.out.print("Entre com o número da pessoa candidata: ");
    //     int numeroPessoaCandidata = scanner.nextInt();
    //     gerenciamentoVotacao.votar(cpfPessoaEleitora, numeroPessoaCandidata);
    //   } else if (escolha == 2) {
    //     gerenciamentoVotacao.mostrarResultado();
    //   } else if (escolha == 3) {
    //     gerenciamentoVotacao.mostrarResultado();
    //     // System.out.println("Votação finalizada!");
    //     // opcao = 0;
    //     break;
    //   } else {
    //     System.out.println("Opção inválida. Tente novamente.");
    //   }
    // }
    boolean votacaoAtiva = true;
    while (votacaoAtiva) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar votação");
      int escolha = Integer.parseInt(scanner.nextLine());

      switch (escolha) {
        case 1:
          System.out.println("Entre com o CPF da pessoa eleitora: ");
          String cpfPessoaEleitora = scanner.nextLine();
          System.out.println("Entre com o número da pessoa candidata: ");
          int numeroPessoaCandidata = Integer.parseInt(scanner.nextLine());
          gerenciamentoVotacao.votar(cpfPessoaEleitora, numeroPessoaCandidata);
          break;
        case 2:
          gerenciamentoVotacao.mostrarResultado();
          break;
        default:
          gerenciamentoVotacao.mostrarResultado();
          votacaoAtiva = false;
          break;
      }
    }
    scanner.close();
  }

}
