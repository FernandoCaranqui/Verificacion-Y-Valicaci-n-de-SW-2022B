public class login {
    private String user;
    private String password;

    public login() {
    }

    public login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean aunticar(String usuario, String contrasena){
        if(usuario.equals(user) && contrasena.equals(password)){
            System.out.println("Bienvenido "+usuario);
            return true;
        } else {
            System.out.println("USUARIO O CONTRASEÑA INCORRECTOS");
            aunticar(usuario, contrasena);
            return false;
        }
    }
}
