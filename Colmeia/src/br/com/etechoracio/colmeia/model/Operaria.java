// Davi Ribeiro Calado e Eduardo Marassatti Sassone 2ºA.I

package br.com.etechoracio.colmeia.model;

import br.com.etechoracio.colmeia.interfaces.Coletor;
import br.com.etechoracio.colmeia.interfaces.Defensor;

public class Operaria extends Abelha implements Coletor, Defensor {

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

    public void coletarRecursos() {
        System.out.println(getNome() + ": Coletando pólen nas flores.");
    }

    public void defenderColmeia() {
        System.out.println(getNome() + ": Defendendo a entrada da colmeia.");
    }
}

