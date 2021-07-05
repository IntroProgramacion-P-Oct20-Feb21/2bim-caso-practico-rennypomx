/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casopractico;

import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class CasoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
        int opcion;
        String opcion2;
        int contador = 1;
        boolean bandera = true;

        do {
            System.out.println("Ingresar 1 para crear una cuenta en Facebook\n"
                             + "Ingresar 2 para crear una cuenta en Twitter\n"
                             + "Ingresar 3 para crear una cuenta en Whatsapp\n"
                             + "Ingresar 4 para crear una cuenta en Telegram\n"
                             + "Ingresar 5 para crear una cuenta en Signal\n"
                             + "Ingresar 6 para crear una cuenta en Instagram\n"
                             + "Ingresar 7 para crear una cuenta en Flickr: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println(crearFacebook());
                    break;
                case 2:
                    crearTwitter();
                    break;
                case 3:
                    System.out.println(crearWhatsapp());
                    break;
                case 4:
                    crearTelegram();
                    break;                
                case 5:
                    System.out.println(crearSignal());
                    break;
                case 6:
                    crearInstagram();
                    break;
                case 7:
                    System.out.println(crearFlickr());
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    contador = contador - 1;
                    break;
            }

            System.out.println("Escriba SI para crear mas cuentas\n"
                             + "Escriba NO para ya no crear mas cuentas: ");
            opcion2 = entrada.nextLine();
            opcion2 = opcion2.toLowerCase();
            if (opcion2.equals("no")) {
                bandera = false;
                System.out.printf("%s\n", obtenerMensaje(contador));
                
            } else {
                contador = contador + 1;
            }
        } while (bandera);
    }

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String cadena;
        System.out.println("A seleccionado la opción crear cuenta en Facebook"
                + "\nIngresar el nombre de Usuario: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        pais = entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correo = entrada.nextLine();
        
        cadena = String.format("Resumen de cuenta creada en Facebook\n"
                             + "Nombre del usuario: %s\n"
                             + "Edad del usuario: %s\n"
                             + "Ciudad del usuario: %s\n"
                             + "País del usuario: %s\n"
                             + "Correo del usuario: %s\n",
                             nombre, edad, ciudad, pais,
                             correo);
          return cadena;
    }

    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String nombres;
        String apellidos;
        int edad;
        String ciudad;
        String pais;
        String idioma;
        String correo;
        System.out.println("A seleccionado la opción crear cuenta en Twitter\n"
                         + "Ingresar el nombre de Usuario: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar los nombres completos del Usuario: ");
        nombres = entrada.nextLine();
        System.out.println("Ingresar los apellidos completos del Usuario: ");
        apellidos = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        pais= entrada.nextLine();
        System.out.println("Ingresar el idioma que habla el Usuario: ");
        idioma= entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correo = entrada.nextLine();
        
        System.out.printf("Resumen de cuenta creada en Twitter\n"
                        + "Nombre del Usuario: %s\n"
                        + "Nombres completos del Usuario: %s"
                        + "Apellidos completos de usuario: %s\n"
                        + "Edad del usuario: %d\n"
                        + "Ciudad del usuario: %s\n"
                        + "País del usuario: %s\n"
                        + "Idioma del usuario: %s\n"
                        + "Correo del usuario: %s\n",
                nombre, nombres, apellidos, edad,
                ciudad, pais, idioma, correo);
    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String numeroTelefono;
        int edad;
        String ciudad;
        String pais;
        String cadena;
        System.out.println("A seleccionado la opción crear cuenta en Whatsapp"
                         + "\nIngresar el nombre de Usuario: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el número de teléfono del Usuario: ");
        numeroTelefono = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        pais = entrada.nextLine();
        
        cadena = String.format("Resumen de cuenta creada en Whatsapp\n"
                             + "Nombre del usuario: %s\n"
                             + "Número del teléfono del usuario: %s\n"
                             + "Edad del usuario: %d\n"
                             + "Ciudad del usuario: %s\n"
                             + "País del usuario: %s\n",
                          nombre, numeroTelefono, edad, ciudad,
                          pais);
        return cadena;
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String numeroTelefono;
        String ciudad;
        String pais;
        String areaInteres;
        System.out.println("A seleccionado la opción crear cuenta en Telegram"
                + "\nIngresar el nombre de Usuario: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el número de teléfono del Usuario: ");
        numeroTelefono = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        pais = entrada.nextLine();
        System.out.println("Ingresar el área de interés del Usuario: ");
        areaInteres = entrada.nextLine();
        
        System.out.printf("Resumen de cuenta creada en Telegram\n"
                        + "Nombre del usuario: %s\n"
                        + "Número del teléfono del usuario: %s\n"
                        + "Ciudad del usuario: %s\n"
                        + "País del usuario: %s\n"
                        + "Área de interés del usuario: %s\n",
                nombre, numeroTelefono, ciudad, pais,
                areaInteres);
    }

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String numeroTelefono;
        String ciudad;
        String pais;
        String hobbyPri;
        String cadena;
        System.out.println("A seleccionado la opción crear cuenta en Signal\n"
                + "Ingresar el nombre de Usuario: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el número de teléfono del Usuario: ");
        numeroTelefono = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        pais = entrada.nextLine();
        System.out.println("Ingresar el hobby principal: ");
        hobbyPri = entrada.nextLine();
        
        cadena = String.format("Resumen de cuenta creada en Signal\n"
                             + "Nombre del usuario: %s\n"
                             + "Número del teléfono del usuario: %s\n"
                             + "Ciudad del usuario: %s\n"
                             + "País del usuario: %s\n"
                             + "Hobby principal del usuario: %s\n",
                             nombre, numeroTelefono, ciudad, pais,
                             hobbyPri);
        return cadena;
    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        int edad;
        String correo;
        System.out.println("A seleccionado la opción crear cuenta en Instagram"
                         + "\nIngresar el nombre de Usuario: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correo = entrada.nextLine();
        
        System.out.printf("Resumen de cuenta creada en Instagram\n"
                        + "Nombre del usuario: %s\n"
                        + "Ciudad del usuario: %s\n"
                        + "Edad del usuario: %d\n"
                        + "Correo del usuario: %s\n",
                        nombre, ciudad, edad, correo);
    }

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String correo;
        String cadena;
        System.out.println("A seleccionado la opción crear cuenta en Flickr\n"
                         + "Ingresar el nombre de Usuario: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correo = entrada.nextLine();
        
        cadena = String.format("Resumen de cuenta creada en Flickr\n"
                             + "Nombre del usuario: %s\n"
                             + "Correo del usuario: %s\n",
                             nombre, correo);
        return cadena;
    }

    public static String obtenerMensaje(int cont) {
        String cadenaFinal = "";
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};
        if ((cont >= 1) && (cont <= 5)) {
            cadenaFinal = mensajeFinal[0];
        } else {
            if ((cont >= 6) && (cont <= 15)) {
                cadenaFinal = mensajeFinal[1];
            } else {
                if (cont >= 16) {
                    cadenaFinal = mensajeFinal[2];
                }
            }
        }
        return cadenaFinal;
    }
}