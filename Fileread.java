package PracticeIT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Read {
	String name, lName, Role, phno, Location, sal;

	public Read(String n, String l, String r, String p, String s, String loc) {
		this.name = n;
		this.lName = l;
		this.Role = r;
		this.phno = p;
		this.Location = loc;
		this.sal = s;
	}

	public String getName() {
		return name;
	}

	public String getlName() {
		return lName;
	}

	public String getRole() {
		return Role;
	}

	public String getPhno() {
		return phno;
	}

	public String getLocation() {
		return Location;
	}

	public String getSal() {
		return sal;
	}

	public void DisplayDetails() {
		System.out.println("Name: " + getName() + ", Role: " + getRole() + ", Phone number: " + getPhno()
				+ ", Salary is: " + getSal() + ", Location:" + getLocation());
	}

}

public class Fileread {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<Read> robj = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D://Boxing.txt"));
			String nextLine;
			String t[];

			while ((nextLine = reader.readLine()) != null) {
				// System.out.println(nextLine);
				t = nextLine.split(", ");
				robj.add(new Read(t[0], t[1], t[2], t[3], t[4], t[5]));

			}
		} catch (FileNotFoundException e) {

		}
		System.out.print("Enter Salary: ");
		String d = sc.nextLine();

		for (Read r : robj) {
			// if (Double.parseDouble(r.getSal()) > Double.parseDouble(d))
			// System.out.println(r.getName()+" is having higher Salary than "+d);
			// if (Double.parseDouble(r.getSal()) < Double.parseDouble(d))
			// System.out.println(r.getName() + " is having lesser Salary than " + d);
			if (Double.parseDouble(r.getSal()) == Double.parseDouble(d))
				System.out.println(r.getName() + " is having Salary of " + d);
			// r.DisplayDetails();
		}
	}

}
