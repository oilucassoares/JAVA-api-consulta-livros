package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

//Criando a classe br.com.alura.screenmatch.principal.Principal onde vai ter os objetos, onde vai ser definido quais são os atributos(caracteristicas) que tem na classe br.com.alura.screenmatch.modelos.Filme.
//Se escreve o método "public static void main....." e cria instâncias(objetos) da classe br.com.alura.screenmatch.modelos.Filme.

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão",1970); //Aqui o OBJETO é o meuFilme
        //Atribuindo as caracteristicas abaixo
        //meuFilme.setNome("O poderoso chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        //Chamando o METODO
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(5);
        System.out.println("Quantidade de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média é: "+ meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost"); foi comentado porque passei a usar o "construtor"
        //lost.setAnoDeLancamento(2000); foi comentado porque passei a usar o "construtor"
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração em minutos da série: " + lost.getDuracaoEmMinutos() + " minutos totais.");

        Filme outroFilme = new Filme("Avatar", 2023); //Aqui o OBJETO é o meuFilme
        //Atribuindo as caracteristicas abaixo
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        Filme filmeDoLucas = new Filme("O Regresso", 2016);
        //filmeDoLucas.setNome("O Regresso");
        //filmeDoLucas.setAnoDeLancamento(2016);
        filmeDoLucas.setDuracaoEmMinutos(156);
        filmeDoLucas.avalia(10);


        //Fazendo uma lista dos filmes através do ArrayList<>
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLucas);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size()); // Contando quantos foram adicionados
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome()); // (get0) Pegando o primeiro item da posição (primeiro filme).
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());



    }
}