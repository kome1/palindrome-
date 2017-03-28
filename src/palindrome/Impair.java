
import java.util.Scanner;


public class Impair {

	/** NGANDAYE Jean Baptiste
	 * @param args
	 */
	public static void main(String[] args) {
		// Matricule 14B442FS
		Scanner clavier=new Scanner (System.in);
		int i,nombre;
		System.out.println("Veillez saisir un nombre");
		nombre=clavier.nextInt();
		for(i=0;i<nombre;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		

	}

}
