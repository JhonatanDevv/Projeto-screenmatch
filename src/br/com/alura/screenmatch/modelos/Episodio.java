package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.classificavel;

public class Episodio implements classificavel {
    private int numero;
    private String nome;
    private String serie;
    private int totalVisualizacao;

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacao >100){
            return 4;
        } else
        return 2;
    }

    public void setSerie(Serie lost) {
    }
}
