import java.util.ArrayDeque;

public class ContohArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<String> antrian = new ArrayDeque<>();

        antrian.add("Muhammad");
        antrian.add("Raihan");
        antrian.add("Han");

        System.out.println("Isi ArrayDeque: " + antrian);

        String depan = antrian.pollFirst();

        String belakang = antrian.pollLast();

        System.out.println("Data yang diambil dari depan: " + depan);
        System.out.println("Data yang diambil dari belakang: " + belakang);
        System.out.println("Isi ArrayDeque setelah dihapus: " + antrian);
    }
}