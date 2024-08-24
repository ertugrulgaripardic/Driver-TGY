
public class Driver {
	public static void main(String[] args) {
		Aylar ay= Aylar.OCAK;
		System.out.println(ay);
		
		Aylar[] values = Aylar.values();
		for (int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
	}

}
