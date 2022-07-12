import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        double salario, diferenca;
        int cargo;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o seu cargo: \n"
                + "1 - Escriturário"
                + "\n2 - Secretário"
                + "\n3 - Caixa"
                + "\n4 - Gerente"
                + "\n5 - Diretor"
                + "\n->");
        cargo = sc.nextInt();
        
        switch (cargo) {
        case 1:{
            System.out.print("Digite o seu salário: \n->");
            salario = sc.nextInt();
            diferenca = salario*0.5;
            salario*=1.5;
            
            System.out.printf("Olá Escriturário.\nSeu novo salário é de: R$%.2f"
            +"\nO reajuste foi de: %.2f", salario, diferenca);
            break;
        }
        case 2:{
            System.out.print("Digite o seu salário: \n->");
            salario = sc.nextInt();
            diferenca = salario*0.35;
            salario*=1.35;
            
            System.out.printf("Olá Secretário.\n Seu novo salário é de: R$%f.2"+salario
                    +"\nO reajuste foi de: %.2f",salario,diferenca);
            break;
        }
        case 3:{
            System.out.print("Digite o seu salário: \n->");
            salario = sc.nextInt();
            diferenca = salario*0.2;
            salario*=1.2;
            
            System.out.printf("Olá Caixa.\n Seu novo salário é de: R$%.2f"+salario
                    +"\nO reajuste foi de: %.2f"+diferenca);
            break;
        }
        case 4:{
            System.out.print("Digite o seu salário: \n->");
            salario = sc.nextInt();
            diferenca = salario*0.1;
            salario*=1.1;
            
            System.out.printf("Olá Gerente.\n Seu novo salário é de: R$%.2f"+salario
                    +"\nO reajuste foi de: %f",salario,diferenca);
            break;
}
        case 5:{
            System.out.print("Digite o seu salário: \n->");
            salario = sc.nextInt();
            
            System.out.printf("Olá Diretor.\n Seu novo salário é de: R$%f.2"
                    +"\nO reajuste foi de: O, pois seu cargo não teve reajuste.", salario);
            break;
        }

        default:
            break;
        }
        sc.close();
    }

}
