import java.util.Arrays;
import java.util.Comparator;

class Persona {
    String nombre;
    int documento;

    Persona(String nombre, int documento) {
        this.nombre = nombre;
        this.documento = documento;
    }
}


class OrdenamientoBurbuja {

    public static void ordenamientoBurbuja(Persona[] personas) {
        int n = personas.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparar nombres
                if (personas[j].nombre.compareTo(personas[j + 1].nombre) > 0) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
                // Si los nombres son iguales, comparar por documento de identidad
                else if (personas[j].nombre.equals(personas[j + 1].nombre) && personas[j].documento > personas[j + 1].documento) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Juan", 1233243),
                new Persona("Ana", 4563345),
                new Persona("Ana", 7893334)
        };

        ordenamientoBurbuja(personas);

        // Imprimir personas ordenadas
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.nombre + ", Documento: " + persona.documento);
        }
    }
}


