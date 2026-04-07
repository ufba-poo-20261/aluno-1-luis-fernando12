package br.ufba.poo.lista2;

/**
 * Crie a classe `Aluno`, que possui os atributos `matricula` e `nome` (ambos do
 * tipo `String`), além dos métodos e construtores relevantes de acordo com a
 * seguinte especificação:
 *
 * - O nome do aluno pode ser alterado, mas nunca o seu número de matrícula
 * - O número de matrícula de um aluno deve poder ser acessado por outras partes
 * do programa
 * - Duas instâncias de `Aluno` são consideradas iguais se possuem o mesmo número
 * de matrícula
 *
 * Assuma, para este exercício, que a classe `Aluno` sempre será instanciada com um
 * número de matrícula e um nome válidos, passados nessa ordem.
 */
public class Aluno {

    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public String getNome () {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object obj) {
        Aluno aluno2 = (Aluno) obj;
        return this.matricula.equals(aluno2.matricula);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("123", "luis");
        Aluno aluno2 = new Aluno("123", "fernanddo");
        System.out.println(aluno1.equals(aluno2));
    }
}



