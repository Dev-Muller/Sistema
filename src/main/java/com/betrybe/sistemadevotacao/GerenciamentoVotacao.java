package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
    private ArrayList<PessoaEleitora> pessoasEleitoras;
    private ArrayList<PessoaCandidata> pessoasCandidatas;
    private ArrayList<String> cpfsComputados;

    public GerenciamentoVotacao(){
        this.pessoasEleitoras = new ArrayList<PessoaEleitora>();
        this.pessoasCandidatas = new ArrayList<PessoaCandidata>();
        this.cpfsComputados = new ArrayList<String>();
    }
}
