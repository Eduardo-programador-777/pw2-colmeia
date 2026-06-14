package br.com.etechoracio.colmeia.model;

public class Operaria extends Abelha {

    private int horasVoo;

    public Operaria(String nome, int idade, int horasVoo) {
        super(nome, idade);
        this.horasVoo = horasVoo;
    }

    @Override
    public void executarAtividade() {
        System.out.println("Atividade: Coletando néctar e pólen.");
    }

    @Override
    public double calcularConsumoDiario() {
        return 10 + (horasVoo * 2);
    }
}

