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

        System.out.printf ("Informe o primeiro número que deseja para realizar a operação:\n");
        float a = ler.nextInt();

        System.out.printf ("Informe a operação:\n");
        String oper = ler.next();

        System.out.printf ("Informe o segundo número que deseja para realizar a operação:\n");
        float b = ler.nextInt();
        //Agora é a parte do switch que faz  a calculadora funcionar

        switch (oper)
        {
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
            default:
                System.out.println("Operação invalida");

        }

        System.out.println("O resultado da operação é \n");
        System.out.println(result);

        ler.close();
    }

}
