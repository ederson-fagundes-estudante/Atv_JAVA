import java.util.Scanner;
public class _4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hora de inicio:");
		int horaInicio = sc.nextInt();
		System.out.println("Minutos de inicio:");
		int minInicio = sc.nextInt();
		System.out.println("Hora de fim:");
		int horaFim = sc.nextInt();
		System.out.println("Minutos de fim:");
		int minFim = sc.nextInt();

		sc.close();
		
		int minTotalFim = ((horaFim*60)+minFim);
		int minTotalInicio = ((horaInicio*60)+minInicio);
		int minTotal;
		
		if(minTotalFim-minTotalInicio<0) {
			minTotal = ((24*60)-minTotalInicio)+minTotalFim;
		}else {
			minTotal = minTotalFim-minTotalInicio;
		}
		int horaTotal = minTotal/60;
		minTotal = minTotal%60;
		System.out.println(horaTotal+":"+minTotal);
	}
	
}
