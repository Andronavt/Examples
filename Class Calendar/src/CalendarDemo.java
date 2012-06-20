import java.util.Calendar;


class CalendarDemo {
	public static void main(String args[]){
		String months[]={
				"Январь","Февраль", "Март", "Аперль", "Май", "Июнь", "Июль",
				"Август","Сентябрь","Октябрь","Ноябрь","Декабрь"
		};
		
		Calendar calendar=Calendar.getInstance();
		
		System.out.print("Date: ");
		System.out.print(calendar.get(Calendar.MONTH));
		System.out.print(" "+calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.YEAR));
		
		System.out.print("Time: ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.println(calendar.get(Calendar.SECOND));
		
		calendar.set(Calendar.HOUR,10);
		calendar.set(Calendar.MINUTE, 29);
		calendar.set(Calendar.SECOND,22);
		
		System.out.print("Update time: ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.println(calendar.get(Calendar.SECOND));
		
	}

}
