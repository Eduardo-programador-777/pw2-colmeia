package br.com.etechoracio.colmeia.model;

public class Zangao extends Abelha{

    private int voosAcasalamento;

    public Zangao(String nome, int idade, int voosAcasalamento) {
        super(nome, idade);
        this.voosAcasalamento = voosAcasalamento;
    }

    @Override
    public void executarAtividade() {
        System.out.println("Atividade: Voos de acasalamento.");
    }

    @Override
    public double calcularConsumoDiario() {
        return 15 + (voosAcasalamento * 3);
    }
}

