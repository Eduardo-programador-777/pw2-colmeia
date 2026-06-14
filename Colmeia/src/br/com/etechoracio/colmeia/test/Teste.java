package br.com.etechoracio.colmeia.test;

import br.com.etechoracio.colmeia.model.Operaria;
import br.com.etechoracio.colmeia.model.Rainha;
import br.com.etechoracio.colmeia.model.Zangao;

public class Teste {

     static void main() {

        Operaria op1 = new Operaria("Mel", 20, 5);
        Operaria op2 = new Operaria("Flor", 15, 3);
        Rainha rainha = new Rainha("Rainha Beatriz", 300, 1500);
        Zangao zangao = new Zangao("Zeca", 40, 2);

        double consumoTotal = 0;

        op1.exibirInformacoes();
        op1.executarAtividade();
        consumoTotal += op1.calcularConsumoDiario();

        op2.exibirInformacoes();
        op2.executarAtividade();
        consumoTotal += op2.calcularConsumoDiario();

        rainha.exibirInformacoes();
        rainha.executarAtividade();
        consumoTotal += rainha.calcularConsumoDiario();

        zangao.exibirInformacoes();
        zangao.executarAtividade();
        consumoTotal += zangao.calcularConsumoDiario();

        System.out.println("Consumo total da colmeia: " + consumoTotal + " mg");
    }

}
