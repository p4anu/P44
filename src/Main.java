import java.util.Scanner;

public class Main {
    //Algorithm written by Miguel Angel De Zan (p4anu)
    //Algoritmo escrito por Miguel Angel De Zan (p4anu)
    public static void main(String[] args) {
        /**
         * ARREGLO 01
         * opera como una mini base de datos*/
        String [] usuario = new String [20];
        usuario [0] = "█Nombre: Eduardo██Apellido: Cereza██Fecha de nac: 02/09/1978██Año de registro: 2013██Tipo licencia: claseF█";
        usuario [1] = "█Nombre: Peter██Apellido: Parker██Fecha de nac: 12/10/1998██Año de registro: 2020██Tipo licencia: aracnido█";
        usuario [2] = "█Nombre: Gato██Apellido: Con Botas██Fecha de nac: 04/11/2009██Año de registro: 2019██Tipo licencia: mascota█";
        usuario [3] = "█Nombre: Jorge Luis██Apellido: Borges██Fecha de nac: 24/08/1899██Año de registro: 1980██Tipo licencia: hombre de arena█";

        //Input del usuario:
        System.out.println("INGRESE CÓDIGO DE ACCESO: ");
        String code;
        Scanner inUser = new Scanner(System.in);
        code = inUser.nextLine();

        //Condicional para el código de acceso
        if (code.equals("blanco")) { //La operación equals la aprendí haceindo esto, ya que primero intentaba con (code == "blanco") y no funcionaba

            System.out.println("Bienvenido!! el codigo es correcto");

            System.out.println("INGRESE SU NÚMERO DE USUARIO: ");
            int nroUser = inUser.nextInt();
            System.out.println("Su NRO de usuario es " + nroUser);

            //Condicional para el nro de usuario y devolución por pantalla:
            if (nroUser >= 0 && nroUser < 20) {
                System.out.println(usuario[nroUser]);
                System.out.println("Si el sistema ha indicado NULL es porque usted está registrado pero sus datos aun no se han actualizado (de otra manera ignore este mensaje)");
            } else {
                System.out.println("ERROR: su número de registro no corresponde a un usuario en servicio");
            }
        } else {
            System.out.println("El código no es correcto"); }

    }

    }