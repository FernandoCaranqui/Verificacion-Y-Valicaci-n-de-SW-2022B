import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        login newLogin ;
        System.out.println("Seleccione: ");
        System.out.println("1. Iniciar Sesión");
        System.out.println("2. Registrarse");
        Integer answer = teclado.nextInt();
        if(answer == 1){
            System.out.println("\"===============INICIAR SESIÓN================\"");
            System.out.print("USUARIO: ");
            String user= teclado.next();
            System.out.print("CONTRASEÑA: ");
            String password  = teclado.next();
            newLogin =  new login(user,password);
            newLogin.aunticar(user, password);


        } else if (answer ==2) {
            System.out.println("===============REGISTRAR================");
            System.out.print("USUARIO: ");
            String user= teclado.next();
            System.out.print("CONTRASEÑA: ");
            String password  = teclado.next();
            newLogin = new login(user, password);
            System.out.println("Bienvenido");
        }
    }

}
