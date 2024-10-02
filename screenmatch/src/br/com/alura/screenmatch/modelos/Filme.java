//Criado PACOTE para deixar o projeto organizado. O PACOTE é criado para separar as classes com funcionalidades em comum.
package br.com.alura.screenmatch.modelos;

//Criando a classe br.com.alura.screenmatch.modelos.Filme com os atributos. A classe especifica o conteudo de um Objeto. O que um filme tem? Caracteristicas.

import br.com.alura.screenmatch.calculo.Classificavel;

//extends pega tudo que tem na classe Titulo (conhecido como HERANÇA). Podendo ser lido tb como: TODO FILME É UM TITULO
public class Filme extends Titulo implements Classificavel {

    //ATRIBUTO
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
        //this.setNome(nome);
    }


    //METODOS get e set: (get(pegar) - set(ATRIBUIR)
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }


}