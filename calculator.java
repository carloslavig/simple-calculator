import java.util.Scanner;

public class calculator {
    public static void main (String [] args)
    {
        //Aqui eu começo minha calculadora
        Scanner ler = new Scanner(System.in);


        System.out.printf ("Informe o primeiro número que deseja para realizar a operação:\n");
        float a = ler.nextInt();

        System.out.printf ("Informe a operação:\n");
        String oper = ler.next();

        System.out.printf ("Informe o segundo número que deseja para realizar a operação:\n");
        float b = ler.nextInt();
        float result = 0;
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
