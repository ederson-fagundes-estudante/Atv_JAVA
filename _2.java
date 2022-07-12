import java.time.LocalDateTime;    

public class _2 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();  
		System.out.printf("%d/%d/%d - %s %d:%d", now.getYear(), now.getMonthValue(), now.getYear(), now.getMonth(), now.getHour(), now.getMinute());
	}
}
