// Davi Ribeiro Calado e Eduardo Marassatti Sassone 2ºA.I

package br.com.etechoracio.colmeia.model;

import br.com.etechoracio.colmeia.interfaces.Defensor;

public class Zangao extends Abelha implements Defensor {

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

    public void defenderColmeia() {
        System.out.println(getNome() + ": Defendendo a entrada da colmeia.");
    }
}

