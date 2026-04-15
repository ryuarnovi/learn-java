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

    public void output(){
        long outputLuas = this.sisi * this.sisi;
        System.out.println("Luas persegi dengan sisi " + this.sisi + " adalah " + outputLuas);
    }
}
