package Java_Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
	private int rno;
	private String name;
	private String dept;
	private double sal;

	public Employee(int rno, String name, String dept, double sal) {
		this.rno = rno;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	public int compareTo(Employee e) {
		if (e.sal > sal) {
			return 1;
		} else if (e.sal < sal) {
			return -1;
		} else
			return 0;
	}

	public String toString() {
		return "Employee no: " + rno + " ,Employee name: " + name + " ,Dept: " + dept + " ,Salary: " + sal;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1201, "Sai", "IT", 90000);
		Employee e2 = new Employee(1202, "Daniel", "IT", 50000);
		Employee e3 = new Employee(1203, "Hemanth", "IT", 70000);
		ArrayList<Employee> obj = new ArrayList<>();
		obj.add(e1);
		obj.add(e2);
		obj.add(e3);
		Collections.sort(obj);
		for (Employee e : obj) {
			System.out.println(e);
		}
		/*
		 * Iterator it = obj.iterator(); while (it.hasNext()) { Employee emp = (Employee) it.next(); //
		 * System.out.println(it); if (emp.sal > 50000) { System.out.println(emp.rno + " " + emp.name + " " + emp.dept +
		 * " " + emp.sal); } }
		 */
	}

}
