import java.util.Date;
import java.util.Scanner;
 
 public class Programa {
     
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
        Aluno aluno1 = new Aluno ();

        aluno1.nome = "Augusto";
        aluno1.sobrenome = "Guimaras";
        aluno1.sexo = "masculino";
        aluno1.cpf = "125698743";
        aluno1.ra = "123";
        aluno1.contato = "7856324109";
        aluno1.filiacao = "pai e mãe ";

        aluno1.dataNacsimento = new Date(2008, 02, 26);

        Endereco enderecoDoAluno1 = new Endereco();
        enderecoDoAluno1.bairro = "Parque São Paulo";
        enderecoDoAluno1.rua = "Rua Das Flores";
        enderecoDoAluno1.num = "712";

        aluno1.endereco = enderecoDoAluno1;     

        /* =========================================================================================*/
        Aluno aluno2 = new Aluno ();

        aluno2.nome = "Maria";
        aluno2.sobrenome = "Fereira";
        aluno2.sexo = "feminino";
        aluno2.cpf = "1256985599";
        aluno2.ra = "3456";
        aluno2.contato = "54646444409";
        aluno2.filiacao = "pai e mãe ";

        aluno2.dataNacsimento = new Date(2002, 07, 26);

        Endereco enderecoDoAluno2 = new Endereco();
        enderecoDoAluno2.bairro = "Parque das aves ";
        enderecoDoAluno2.rua = "Rua Das tulipas";
        enderecoDoAluno2.num = "742";

        aluno1.endereco = enderecoDoAluno2;  

        sc.close();

     }
 }