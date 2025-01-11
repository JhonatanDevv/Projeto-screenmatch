package br.com.alura.screenmatch.modelos;

public class Titulo {

        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        //SHIFT + F6 para alterar campos com mesma nomenclatura
        private double somaDasAvaliacoes;
        private int totalDeAvaliacao;
        private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalDeAvaliacao(){
            return totalDeAvaliacao;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacao(int totalDeAvaliacao) {
        this.totalDeAvaliacao = totalDeAvaliacao;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica (){
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
            System.out.println("Duração em minutos: " + duracaoEmMinutos);
            System.out.println("Incluído no plano: " +  incluidoNoPlano);
        }

        public void avalia(double nota){
            somaDasAvaliacoes += nota;
            totalDeAvaliacao++;
        }

        public double pegaMedia (){
            return somaDasAvaliacoes / totalDeAvaliacao;
        }
}

