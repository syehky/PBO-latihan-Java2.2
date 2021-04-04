import Koneksi.Database;
import model.Dosen;
import model.Mahasiswa;
import model.MataKuliah;

public class Main{
    public static void main(String [] args){
     System.out.println("Ini program main");
     Database.hubungkan();
     Dosen.tampilaninfo();
     Mahasiswa.tampilaninfo();
     MataKuliah.tampilaninfo();
    }
}