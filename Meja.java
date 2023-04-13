/* Program Meja java
   Nama : Puteri Yohana Br Sitompul
   Tanggal : 11 April 2023
   Nim : 22323027
 */



public class Meja //Deklarasi variabel 
{ // membuka program java
	public int kaki_meja(){ // membuat variabel dengan nama kaki_meja dan bertipe integer
	return 70; //Merupakan nilai Balik kan yang tersimpan di variabel
	}

	public int alas_meja(){ // fungsi yang bisa  diakses secara langsung dengan menggunakan object
	return 120; //Merupakan nilai balik kan yang tersimpan di variabel
	}
	public static void main (String [] args) //Sebuah fungsi untuk menjalankan program dalam java dan menghasilkan nilai tetap
	{
	Meja b = new Meja(); // membuat variabel b dengan tipe data meja dan objek baru menggunakan keyword
	int kaki = b.kaki_meja(); // memanggil variabel dengan tipe data integer dengan nama kaki_meja
	int alas_meja = b.alas_meja(); // memanggil variabel bertipe integer dengan nama alas_meja
	System.out.println(kaki*alas_meja); /// Melakukan eksekusi dan menampilkan nilai hasil aritmatika dari kaki*alas_meja
	}
} // menutup program java