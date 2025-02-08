package tarefaCalculoMedia;

import java.util.Scanner;

/**
 * @author Raphael Cavalcante
 */

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de uma variável para armazenar a soma das notas
        double somaNotas = 0.0;

        // Loop para pedir as 5 notas
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota da " + i + "ª matéria: ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        // Calcular a média
        double media = somaNotas / 5;

        // Exibir a média
        System.out.println("A média das 5 matérias é: " + media);

        // Verificar se o aluno passou ou reprovou, no exemplo média 6
        if (media >= 6.0) { // Mude aqui, caso queira mudar a média !
            System.out.println("Você passou!");
        } else {
            System.out.println("Você reprovou!");
        }

        scanner.close();
    }
}
