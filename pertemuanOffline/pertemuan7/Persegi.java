package pertemuanOffline.pertemuan7;

public class Persegi {
    private long sisi;

    public Persegi(long sisi) {
        this.sisi = sisi;
    }

    public long getSisi() {
        return sisi;
    }

    public void setSisi(long sisi) {
        this.sisi = sisi;
    }

    public long getLuas() {
        return sisi * sisi;
    }
}
