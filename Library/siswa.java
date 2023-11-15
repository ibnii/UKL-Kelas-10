package Library;

import java.util.ArrayList;

public class siswa implements superClass {

   ArrayList<String> namaSiswa = new ArrayList<String>();
   ArrayList<String> alamat = new ArrayList<String>();
   ArrayList<String> telepon = new ArrayList<String>();
   ArrayList<Boolean> status = new ArrayList<Boolean>();


   siswa(){
      namaSiswa.add("Wildan");
      namaSiswa.add("Dawam");
      namaSiswa.add("Bash");

      alamat.add("Jakarta");
      alamat.add("Palembang");
      alamat.add("Denpasar");

      telepon.add("082318316301");
      telepon.add("085259145807");
      telepon.add("085331512520");

      for (int i = 0; i < namaSiswa.size(); i++) {
         status.add(true);
      }

   }

   @Override
   public String getNama(int index) {
      return namaSiswa.get(index);
   }
   @Override
   public String getAlamat(int index) {
      return alamat.get(index);
   }
   @Override
   public String getTelepon(int index) {
      return telepon.get(index);
   }
}
