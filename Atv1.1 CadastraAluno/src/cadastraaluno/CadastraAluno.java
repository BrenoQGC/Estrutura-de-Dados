/*
Uma estrutura de dados é considerada homogênea quando as informações armazenadas possuem o mesmo tipo. Ela pode ser composta por variáveis unidimensionais e multidimensionais, a depender da necessidade.

 

Sendo assim, implemente um programa para cadastro de alunos de uma disciplina utilizando a linguagem Java, seguindo os seguintes critérios:

·         criar um array unidimensional do tipo string para cadastrar o nome de 25 alunos;

·         garantir que o array seja totalmente preenchido.

 

Após implementar o programa e preencher o array com o nome dos alunos, cadastre mais cinco novos alunos.

 

Agora, após o processo de implementação, qual é a dificuldade de inserir os novos alunos nessa estrutura de dados? Como pode ser resolvido o problema? Justifique sua resposta a partir dos conceitos de gerenciamento de memória estudados ao longo da unidade.
*/
package cadastraaluno;
import java.util.Scanner;

public class CadastraAluno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] alunos = new String[25];
        
        for(int i=0;i<25;i++){
            System.out.printf("insira um novo aluno \n");
            alunos[i] = teclado.nextLine();
        }
        for(int i=0;i<25;i++){
            System.out.printf("alunos cadastrados: \n");
            System.out.printf(alunos[i] + "\n");
        }
        
        System.out.printf("Cadastre 5 novos alunos \n");
        
        for(int i=0;i<5;i++){
        System.out.printf("insira um novo aluno \n");
        alunos[i] = teclado.nextLine();
        }
        
        for(int i=0;i<25;i++){
        System.out.printf("Novos alunos cadastrados: \n");
        System.out.printf(alunos[i] + "\n");
        }
    }
}
/* 
    Um Array é uma estrutura de dados estática, ou seja, seu tamanho é definido no código e é fixo, no caso do programa CadastraAluno
o array possui 25 itens, que limita a esse número a quantidade de alunos que podemos cadastrar, para inserirmos mais 5 alunos no array,
precisamos substituir outros valores inseridos anteriormente.
    Para Poder cadastrar um número indefinido de alunos precisamos uma estrutura de dados dinâmica, como uma lista.

*/