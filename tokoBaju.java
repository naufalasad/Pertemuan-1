import java.util.* ;
public class tokoBaju{
  public static void main (String [] args)
  {
  Scanner sc=new Scanner (System.in);
  int hargaBaju=50000;
  int jumlahBajuDibeli;
  int totalBonus;
  int totalHarga;
  int jumlahBajuBayar;
  
  System.out.print("masukkan jumlah baju yang dibeli: ");
  jumlahBajuDibeli=Integer.parseInt(sc.nextLine());
  
  totalBonus=jumlahBajuDibeli / 3;
  jumlahBajuBayar=jumlahBajuDibeli - totalBonus;
  totalHarga=jumlahBajuBayar * hargaBaju;
    
  System.out.println("Harga per baju = " + hargaBaju);
  System.out.println("Total baju = " + jumlahBajuDibeli);
  System.out.println("Jumlah bonus =" + totalBonus);
  System.out.println("Jumlah baju yang harus di bayar = " + jumlahBajuBayar);
  System.out.println("Total yg harus di bayar = " + totalHarga);
  }
}
