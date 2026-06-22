// Davi Ribeiro Calado e Eduardo Marassatti Sassone 2ºA.I

package br.com.etechoracio.colmeia.model;

public abstract class Abelha {

    protected String nome;
    protected int idade;

    public Abelha(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " dias");
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public abstract void executarAtividade();

        public abstract double calcularConsumoDiario();
}

