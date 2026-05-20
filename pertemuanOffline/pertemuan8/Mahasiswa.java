public class Mahasiswa extends Auth {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim, String username, String password) {
        super(username, password);
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public void profile() {
        if (isLoggedIn) {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
        } else {
            System.out.println("Silakan login terlebih dahulu.");
        }
    }
}
