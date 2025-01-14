package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar",2023);
        meuFilme.avalia(8);
        var filmeDoJhonatan = new Filme("DogVille",2003);
        Serie lost = new Serie("Lost",2000);

        Filme f1 = filmeDoJhonatan;


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoJhonatan);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista ) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                //Filme filme = (Filme) item;
                System.out.println("Classificação " + filme.getClassificacao() );
            }

        }
        //Arraylist de artistas
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jhonatan");
        buscaPorArtista.add("Naiara");
        System.out.println(buscaPorArtista);

        //Usado o metodo collections para ordernar o Titulo
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        //Usado o comparator.comparing para ordernar pelo ano de lançamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
