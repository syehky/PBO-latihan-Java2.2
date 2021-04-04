import java.util.Scanner;

public class InputOutput{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		String nama;
		int jumlahsks;
		double IPK;

		System.out.print("Masukan nama anda : ");
		nama = scanner.nextLine();
		System.out.println("Hai, "+nama);

		System.out.print("Masukan Jumlah SKS yang sudah ditempuh : ");
		jumlahsks = scanner.nextInt();
	
		System.out.print("Masukan IPK Sementara : ");
		IPK = scanner.nextDouble();
	
		double jumlah = IPK * jumlahsks;
		System.out.print("Total Nilai = "+jumlah);
	}
}