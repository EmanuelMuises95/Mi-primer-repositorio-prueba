package ExEjercicio001;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {

    public static void cargarPersonas(ArrayList<Persona> personas) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        String opc = "";

        do {

            Persona persona = new Persona();

            System.out.println("Ingrese el nombre: ");
            persona.setNombre(input.next());
            System.out.println("Ingrese la edad: ");
            persona.setEdad(input.nextInt());

            personas.add(persona);

            System.out.println("¿Desea dejar de ingresar Personas? (Y / N)");
            opc = input.next();

        } while (opc.equalsIgnoreCase("Y"));

    }

    public static void cargarPerros(ArrayList<Perro> perros) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        String opc = "";

        do {

            Perro perro = new Perro();

            System.out.println("Ingrese el nombre: ");
            perro.setNombre(input.next());
            System.out.println("Ingrese la edad: ");
            perro.setEdad(input.nextInt());

            perros.add(perro);

            System.out.println("¿Desea dejar de ingresar Perros? (Y / N)");
            opc = input.next();

        } while (opc.equalsIgnoreCase("Y"));

    }

    public static void mostrarPersonas(ArrayList<Persona> personas) {

        if (personas.isEmpty()) {
            System.out.println("La lista se encuentra vacia :'( ");
        } else {
            System.out.println("Lista de Personas");
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
    }

    public static void mostrarPerros(ArrayList<Perro> perros) {

        if (perros.isEmpty()) {
            System.out.println("La lista se encuentra vacia :'( ");
        } else {
            System.out.println("Lista de Perros");
            for (Perro perro : perros) {
                System.out.println(perro);
            }
        }

    }

    public static void adopcion(ArrayList<Persona> personas, ArrayList<Perro> perros) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        boolean encontro = false;
        boolean encontro2 = false;

        System.out.println("Ingrese el nombre de que persona desea que adopte");
        for (Persona auxPersona : personas) {
            System.out.println(auxPersona);
        }
        System.out.println("Ingrese la persona elegida : ");
        String varPersona = input.next();

        for (Persona aux : personas) {
            if (aux.getNombre().equalsIgnoreCase(varPersona)) {

                encontro = true;

                System.out.println("Elija un perro : ");
                for (Perro auxPerro : perros) {
                    System.out.println(auxPerro);
                }
                System.out.println("Ingrese el nombre del elegido : ");
                String perroElegido = input.next();

                for (Perro auxPerro : perros) {
                    if (auxPerro.getNombre().equalsIgnoreCase(perroElegido)) {
                        encontro2 = true;
                        aux.setPerro(auxPerro);
                        perros.remove(auxPerro);
                        break;
                    }
                }
                if (encontro2 == false) {
                    System.out.println("El perro no se encuentro en el sistema");
                }
            }
        }

        if (encontro == false) {
            System.out.println("La persona no se encuentra en el sistema");
        }

    }

    public static void programa() {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();

        int opc = 0;

        do {

            System.out.println("===================");
            System.out.println("Bienvenido al Sistema de Adopción");
            System.out.println("-------------------");
            System.out.println("Ingresar personas al sistema (Opc 1) \n"
                    + "Ingresar perros al sistema (Opc 2) \n"
                    + "Ver Personas en sistema (Opc 3) \n"
                    + "Ver Perros en sistema (Opc 4) \n"
                    + "Programa Adoptar (Opc 5) \n"
                    + "Salir (Opc 6)");

            opc = input.nextInt();

            switch (opc) {
                case 1:
                    cargarPersonas(personas);
                    break;
                case 2:
                    cargarPerros(perros);
                    break;
                case 3:
                    mostrarPersonas(personas);
                    break;
                case 4:
                    mostrarPerros(perros);
                    break;
                case 5:
                    adopcion(personas, perros);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opc != 6);

    }

}
