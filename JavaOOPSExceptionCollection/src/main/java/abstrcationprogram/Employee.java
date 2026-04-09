package abstrcationprogram;

public class Employee extends Manager
{
	public void review()
	{
		System.out.println("Review Message");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.review();
		emp.appraisal();
		emp.salary();
	}

	@Override
	public void appraisal()
	{
		System.out.println("Excellent");
	}
}