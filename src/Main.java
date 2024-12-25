import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 - OPERAÇÃO
//        System.out.println("Digite um número: ");
//        double num1 = sc.nextDouble();
//
//        System.out.println("Digite outro número");
//        double num2 = sc.nextDouble();
//
//        System.out.println("Digite o operador(+, -, *, /)");
//        char operator = sc.next().charAt(0);
//
//        double res = 0;
//
//        switch (operator) {
//            case '+':
//                res = num1 + num2;
//                break;
//            case '-':
//                res = num1 - num2;
//                break;
//            case '*':
//                res = num1 * num2;
//                break;
//            case '/':
//                if(num2 != 0) {
//                    res = num1 / num2;
//                } else {
//                    System.out.println("ERRO: Impossível dividir por zero");
//                }
//                break;
//            default:
//                System.out.println("Digite um operador válido");
//                break;
//        }
//        System.out.println("CÁLCULO: " + num1 + " " + operator + " " + num2 + " = " + res);

        //2 - VERIFICADOR DE PALÍNDROMO
//        System.out.println("Digite uma palavra: ");
//        String word = sc.nextLine();
//        word = word.replaceAll(" ", "");
//        boolean isPali = true;
//
//        for(int i = 0; i < word.length(); i++) {
//            int index = word.length() - i - 1;
//            if (word.toUpperCase().charAt(i) != word.toUpperCase().charAt(index)) {
//                isPali = false;
//                break;
//            }
//        }
//        if(isPali) {
//            System.out.println("A palavra: " + word + " é um palíndromo");
//        } else {
//            System.out.println("A palavra: " + word + " não é um palímdromo");
//        }

        //3 - SEQUÊNCIA DE FIBONACCI
//        System.out.println("Quantos numeros da sequência deseja ver? ");
//        int amount = sc.nextInt();
//        int last1 = 0;
//        int last2 = 0;
//        int current = 0;
//
//        for(int i = 1; i <= amount; i++) {
//            if(i == 1) {
//                System.out.println("0");
//            } else if (i == 2){
//                System.out.println("1");
//                last2 = 0;
//                last1 = 1;
//            } else {
//                current = last1 + last2;
//                System.out.println(current);
//                last2 = last1;
//                last1 = current;
//            }
//        }

        //4 - INVERTENDO INTEIRO
//        System.out.println("Digite um número inteiro: ");
//        int number = sc.nextInt();
//        int i = 0;
//
//        while(number > 0) {
//            i *= 10;
//            i += (number % 10);
//            number /= 10;
//        }
//
//        System.out.println(i);

        //5 - ANAGRAMAS
//        System.out.println("Digite uma palavra: ");
//        String word1 = sc.nextLine();
//        System.out.println("Digite outra palavra: ");
//        String word2 = sc.nextLine();
//        String word2alt = word2;
//        boolean isAna = true;
//
//        if(word1.length() == word2.length()) {
//            for(int i = 0; i <= word1.length() - 1; i++) {
//                char item = word1.charAt(i);
//                int index = word2alt.indexOf(item);
//                if(index != -1) {
//                    if(index == word2alt.length() - 1) {
//                        word2alt = word2alt.substring(0, index);
//                    } else {
//                        String first = word2alt.substring(0, index);
//                        String second = word2alt.substring(index);
//                        word2alt = first + second;
//                    }
//                } else {
//                    isAna = false;
//                    break;
//                }
//            }
//        }
//        if (isAna) System.out.println("As palavras " + word1 + " e " + word2 + " são anagramas");
//        if (!isAna) System.out.println("As palavras " + word1 + " e " + word2 + " não são anagramas");

        //6 - NÚMERO DE 0 À 50
//        Random random = new Random();
//        int number = random.nextInt(50);
//        int palpite = 0;
//        do {
//            System.out.println("Digite um número de 0 à 50");
//            palpite = sc.nextInt();
//            if(palpite < number) System.out.println("O número é maior");
//            if(palpite > number) System.out.println("O número é menor");
//        } while (palpite != number);

        //7 - CONTADOR DE PALAVRAS
//        System.out.println("Digite uma frase");
//        String phrase = sc.nextLine();
//        String phraseAlt = phrase;
//        int i = 0;
//        while(phraseAlt != "") {
//            int index = phraseAlt.indexOf(" ");
//            i++;
//            if(index != -1) {
//                phraseAlt = phraseAlt.replaceFirst(" ", "");
//                phraseAlt = phraseAlt.substring(index);
//            } else {
//                phraseAlt = "";
//            }
//        }
//        System.out.println("A frase: " + phrase + " possui " + i + " palavras.");
    }
}