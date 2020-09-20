package logical_program;

public class Days {

	public static void main(String[] args) {
	System.out.println(days("Tue", 700));
	}
	public static String days(String S,int k) {
		String[] days= {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		String day="";
		for (int i = 0; i < days.length; i++) {
		int	rem=k%7;
		int p=0;
		if(days[i]==S) {
			  p=i+rem;
			if(p>6) {
				p=p%7;
			}
			day=days[p];
		}
	}
		return day;

	}

}
