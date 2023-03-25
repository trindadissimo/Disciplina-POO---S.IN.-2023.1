package atividade1;

public class Aluno {
    //atributos
    String nome;
    double nota;
    boolean inscricao;
    String disciplina;
    char turma;
    String email;
    String telefone;
    
    //métodos construtores
    Aluno(String nome, double nota, boolean inscricao, String disciplina, char turma, String email, String telefone){
        this.nome=nome;
        this.nota=nota;
        this.inscricao=inscricao;
        this.disciplina=disciplina;
        this.turma=turma;
        this.email=email;
        this.telefone=telefone;
    }

    //método
    void notaAluno(){
        System.out.println("O Aluno tirou "+ nota+" no último teste avaliativo");
    }
    
}