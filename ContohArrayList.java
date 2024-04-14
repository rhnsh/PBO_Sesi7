import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Muhammad");
        nama.add("Raihan");
        nama.add("Han");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Han");

        boolean adaRaihan = nama.contains("Raihan");

        System.out.println("Apakah ada Raihan? " + adaRaihan);

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}