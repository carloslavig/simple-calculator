import java.util.Scanner;

public class calculator {
    public static void main (String [] args)
    {
        //Aqui eu começo minha calculadora

        //Declaro a utilização do scanner que será usado como input de dados e defino como "ler"
        Scanner ler = new Scanner(System.in);
        //Declarando a variavel do resultado da calculadora
        float result = 0;
        //Aqui farei a pergunta a respeito dos números envolvidos e qual operação usar


        boolean continua;

        do {


            System.out.print("Primeiro numero: ");
            float a = ler.nextFloat();
            //ler.nextLine();

            System.out.print("Informe a operação: ");
            String oper = ler.next();

            System.out.print("Segundo numero: ");
            float b = ler.nextFloat();
            //ler.nextLine();
            //Agora é a parte do switch que faz  a calculadora funcionar


            switch (oper) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    System.out.println("Operação invalida");

            }

            System.out.println("O resultado da operação é " + result);

            System.out.print("deseja continuar? (S/N): ");
            String resposta = ler.next().toUpperCase();

            if (resposta.equals("S")) {
                System.out.println("Ok vamos continuar");
                continua = true;

            }else {
                System.out.println("Finalizado!");
                continua = false;
            }

        }while (continua == true);


    }

}
