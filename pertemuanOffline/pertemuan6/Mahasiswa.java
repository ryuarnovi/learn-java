package pertemuanOffline.pertemuan6;

public class Mahasiswa {
    private String nama;
    private String alamat;
    private String ssn;

    public Mahasiswa(String nama, String alamat, String ssn) {
        this.nama = nama;
        this.alamat = alamat;
        this.ssn = ssn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void display() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("SSN    : " + ssn);
    }
}
