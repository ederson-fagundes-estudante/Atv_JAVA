import java.util.Scanner;
public class _1 {
	public static void soma() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero 1:");
		int v1 = sc.nextInt();
		System.out.println("Numero 2:");
		int v2 = sc.nextInt();
		System.out.println("Soma: "+(v1+v2));
		main(null);
		sc.close();
	}
	public static void raiz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero:");
		int v1 = sc.nextInt();
		System.out.println("Raiz: "+(Math.sqrt(v1)));
		main(null);
		sc.close();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu de opções:");
		System.out.println("1. Somar dois números");
		System.out.println("2. Raiz quadrada de um número.");
		System.out.println("Digite a opção desejada:");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			soma();
			break;
		case 2:
			raiz();
			break;
		default:
			main(null);
		}
		sc.close();
	}

}
