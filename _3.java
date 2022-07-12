import java.util.Scanner;
public class _3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dia da data 1:");
		int dia1 = sc.nextInt();
		System.out.println("Mês da data 1:");
		int mês1 = sc.nextInt();
		System.out.println("Ano da data 1:");
		int ano1 = sc.nextInt();
		System.out.println("Dia da data 2:");
		int dia2 = sc.nextInt();
		System.out.println("Mês da data 2:");
		int mês2 = sc.nextInt();
		System.out.println("Ano da data 2:");
		int ano2 = sc.nextInt();

		sc.close();
		int bigger;
		
		if(ano1>ano2) {
			bigger = 1;
		} else if(ano1<ano2) {
			bigger = 2;
		} else {
			if(mês1>mês2) {
				bigger = 1;
			} else if(mês1<mês2) {
				bigger = 2;
			} else {
				if(dia1>dia2) {
					bigger = 1;
				}else {
					bigger = 2;
				}
			}
		}
		
		if(bigger == 1) {
			System.out.println("A data maior é "+getDate(dia1,mês1,ano1));
		} else {
			System.out.println("A data maior é "+getDate(dia2,mês2,ano2));
		}
	}
	public static String getDate(int day, int month, int year) {
		return day+"/"+month+"/"+year;
	}
}
