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
        float a=0,b=0;

        boolean continua= true;

        do {

            while (continua) {
                System.out.print("Primeiro número: ");
                if (ler.hasNextFloat()) {
                    a = ler.nextFloat();
                    ler.nextLine();
                    continua = false;
                }else{
                    ler.nextLine();
                    System.out.println("Erro: Isso não é um número");
                }

            }


            System.out.print("Informe a operação: ");
            String oper = ler.next();


            do {
                System.out.print("Segundo número: ");
                if (ler.hasNextFloat()) {
                    b = ler.nextFloat();
                    ler.nextLine();
                    continua = false;
                }else{
                ler.nextLine();
                System.out.println("Erro: Isso não é um número");
                continua = true;
                }

            }while (continua);

            //Agora é a parte do switch que faz  a calculadora funcionar


            switch (oper) {
                case "+":
                    result = a + b;
                    System.out.println("O resultado da operação é " + result);
                    break;
                case "-":
                    result = a - b;
                    System.out.println("O resultado da operação é " + result);
                    break;
                case "*":
                    result = a * b;
                    System.out.println("O resultado da operação é " + result);
                    break;
                case "/":
                    result = a / b;
                    System.out.println("O resultado da operação é " + result);
                    break;
                default:
                    System.out.println("Operação invalida, tente novamente");

            }



            System.out.print("Deseja realizar uma nova operação? (S/N): ");
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
