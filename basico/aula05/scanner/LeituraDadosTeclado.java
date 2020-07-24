package basico.aula05.scanner;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


		/*System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: "+nomeCompleto);

		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: "+primeiroNome);

		System.out.print("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: "+idade);

		System.out.print("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: "+altura); */

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimação");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.hasNextBoolean();

        System.out.println("Você digitou os seguintes valores");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem animal de estimação? " + temPet);

    }

}