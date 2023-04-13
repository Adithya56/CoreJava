package Java_Practice;

class ProcessRequest {
	public void process(Accounts a1) {
		System.out.println("Account " + a1.ano + " having salary of " + a1.sal);
		a1 = new Accounts(1202, "Daniel", 60000);
		System.out.println("Account " + a1.ano + " having salary of " + a1.sal);
	}
}

class Accounts {
	int ano;
	String name;
	double sal;

	public Accounts(int a, String n, double s) {
		this.ano = a;
		this.name = n;
		this.sal = s;
	}
}

public class PassingObject {

	public static void main(String[] args) {
		Accounts a = new Accounts(1201, "Adithya", 50000);
		ProcessRequest pr = new ProcessRequest();
		pr.process(a);

	}

}
