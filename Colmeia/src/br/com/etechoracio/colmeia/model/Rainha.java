package br.com.etechoracio.colmeia.model;

public class Rainha extends Abelha {

    private int ovosPorDia;

    public Rainha(String nome, int idade, int ovosPorDia) {
        super(nome, idade);
        this.ovosPorDia = ovosPorDia;
    }

    @Override
    public void executarAtividade() {
        System.out.println("Atividade: Colocando ovos.");
    }

    @Override
    public double calcularConsumoDiario() {
        return 20 + (ovosPorDia * 0.01);
    }
}


