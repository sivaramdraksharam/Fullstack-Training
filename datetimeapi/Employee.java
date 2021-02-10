package datetimeapi;

import java.time.LocalDate;
import java.util.Date;

public class Employee implements User {
	
	private int employeeId;
	private Date doj;
	private float employeeSalary;
	private LocalDate startDate;
	private LocalDate endDate;
	private int leaves;
	public Employee(int employeeId, Date doj, float employeeSalary, LocalDate startDate, LocalDate endDate,
			int leaves) {
		super();
		this.employeeId = employeeId;
		this.doj = doj;
		this.employeeSalary = employeeSalary;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaves = leaves;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", doj=" + doj + ", employeeSalary=" + employeeSalary
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", leaves=" + leaves + "]";
	}
	
	
	
	
}
