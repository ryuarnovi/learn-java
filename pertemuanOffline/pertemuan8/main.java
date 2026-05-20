public class main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Rizki Ardiansyah", "A11.2024.15546", "rizki", "1234");

        mhs.profile();
        System.out.println();

        mhs.login("rian", "12345");
        mhs.login("rizki", "1234");
        System.out.println();

        mhs.profile();
        System.out.println();

        mhs.logout();
        System.out.println();

        mhs.profile();
    }
}
