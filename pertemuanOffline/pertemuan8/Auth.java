public class Auth {
    protected String username;
    protected String password;
    protected boolean isLoggedIn;

    public Auth(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
    }

    public void login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            this.isLoggedIn = true;
            System.out.println("Login berhasil.");
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
    }

    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("Logout berhasil.");
        } else {
            System.out.println("Anda belum login.");
        }
    }

    public void profile() {
        if (isLoggedIn) {
            System.out.println("Username: " + username);
        } else {
            System.out.println("Silakan login terlebih dahulu.");
        }
    }
}
