public class welcomeEmployeeWage{
	public static void main(String[] args){
		double rand = (Math.random())*10;
		int res = (int)rand % 2;
			if(res == 1)
				System.out.println("Employee is Present");
			else
				System.out.println("Employee is Absent");
	}
}
