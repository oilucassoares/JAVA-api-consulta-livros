package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    //ATRIBUTOS da classe
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;   //foi usado PRIVATE para que não seja possível alterar o campo SOMA em outra classe
    private int totalDeAvaliacoes;  //foi usado PRIVATE para que não seja possível alterar o campo TOTAL em outra classe
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo() {
    }

    //METODOS da classe
    //Quando o metodo só GUARDA algo e não RETORNA nada, usa-se palavra chave >>void<<.
    //Quando o metodo RETORNA algo, usa-se palavra chave de acordo com o TIPO desse retorno, EX.: double.

    public void exibeFichaTecnica(){
        //Imprimindo esses atributos
        System.out.println("============================================");
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("============================================");

    }

    public void avalia(double nota){ //Aqui está sendo passado um parâmetro do tipo DOUBLE chamado de nota.
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    //Aqui está sendo RETORNADO a soma e fazendo a média, então não se usa o void(VAZIO), usa o double, pois trata-se de valor decimal.
    public double pegaMedia(){ //Aqui não preciso passar parâmetro, pois já sabemos de onde tem que pegar a informação.
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    //Criando um METODO get(pegar) para poder acessar aquelas variaveis PRIVATE.
    // Para acessar esse ATRIBUTO TotalDeAvaliacoes, cria-se o METODO get.
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    //Criando os SETTERS para poder usar na classe PRINCIPAL e definir quais podem ser editadas (set).

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
