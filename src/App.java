import ar.com.ada.oop.override.Person;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Integer dni;

        Person person1 = new Person("Hernán", "Camps", 33963852);
        Person person2 = new Person("Tamara", "Laiz", 35138018);
        Person person3 = new Person("Silvia", "Montero", 18741852);
        Person person4 = new Person("Eliana", "Tiratel", 18869523);
        Person person5 = new Person("Tamara", "Zaccagnini", 35138018);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println(person5.toString());
        System.out.println(person1.toString() + " hasCode(): " + person1.hashCode());
        System.out.println(person2.toString() + " hashCode(): " + person2.hashCode());
        System.out.println(person3.toString() + " hashCode(): " + person3.hashCode());
        System.out.println(person4.toString() + " hashCode(): " + person4.hashCode());
        System.out.println(person4.toString() + " hashCode(): " + person5.hashCode());
        System.out.println("¿person2 = person5?: " + person2.equals(person5));

        // crear un arreglo con todas las personas que instanciamos

        Person [] arrayPersonas = {person1, person2, person3, person4, person5};

        // pedir un dni al usuario

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el número de documento: ");
        dni = keyboard.nextInt();

        // buscar dentro del arreglo la persona que corresponde con ese dni
        int contador = 0;
        for (int i = 0; i <= arrayPersonas.length - 1; i++) {
            if (dni.equals(arrayPersonas[i].getDni())) {
                System.out.println("El DNI ingresado corresponde a: " + arrayPersonas[i].toString());
                contador ++;
            }

        }
        if (contador==0){
            System.out.println("El DNI ingresado no fue encontrado");
        }

        // imprimir el tostring de la persona que corresponda


    }

}

