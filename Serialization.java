import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class vehicle implements Serializable {
	int vno;
	String vname;

	vehicle(int v, String vname) {
		vno = v;
		this.vname = vname;
	}
}

class bikes extends vehicle {
	int bno;
	String bname;

	public bikes(int b, String bname) {
		super(b, "bike");
		bno = b;
		this.bname = bname;
	}
}

class Serialization {

	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		bikes v1 = new bikes(1201, "Yamaha");
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("vehicle.txt"));
		System.out.println("Serialization has started..");
		obj.writeObject(v1);
		if (obj != null)
			System.out.println("Serialization is done..");
		obj.flush();
		obj.close();

		System.out.println("De-Serialization has started..");
		ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("vehicle.txt"));

		bikes v2 = (bikes) obj1.readObject();
		/*
		 * Class cls = Class.forName("bikes"); Object o = cls.newInstance(); bikes b = (bikes) o; Field f[] =
		 * cls.getDeclaredFields(); System.out.println("Bike name: " + b.bname + " Bike number: " + b.bno);
		 */
		System.out.println("Vehicle number: " + v2.vno + " Vehicle Type: " + v2.vname);
		System.out.println("Bike number: " + v2.bno + " Model: " + v2.bname);
		System.out.println("De-Serialization is done..");
		obj1.close();
	}
}
