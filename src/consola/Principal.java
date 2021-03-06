package clase23mayoact;

/**
 * Actividad realizada para la Unidad 8. Tema: Matrices.
 *
 * @author Angonoa Franco
 * @since Mayo 2020
 * @version 1.1
 * 1.0 Inicial
 * 1.1 Agregado de otra resolucion
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
            ACTIVIDAD 2: Creamos a seis personas
         */
        //Hay dos formas de pasar objetos:
        //**Forma 1**
        Documento doc1 = new Documento(37589654, "DNI");
        Persona per1 = new Persona(65987, "Pablo Iriarte", doc1, 0, 0);  //Esta persona es de Argentina(0), Cordoba(0)

        //**Forma 2**
        Persona per2 = new Persona(64547, "Lucas Herrador", new Documento(38547851, "DNI"), 0, 0); //Esta persona es de Argentina(0), Cordoba(0)

        //Los demas objetos se crearan con la segunda forma.
        Persona per3 = new Persona(63258, "Candela Salazar", new Documento(39874521, "DNI"), 1, 2); //Esta persona es de Chile(1), Concepcion(2)
        Persona per4 = new Persona(61254, "Nadia López", new Documento(39458741, "DNI"), 2, 3);  //Esta persona es de Uruguay(2), Paysandu(3)
        Persona per5 = new Persona(62147, "Santiago Staricco", new Documento(35147852, "DNI"), 1, 2);  //Esta persona es de Chile(1), Concepcion(2)
        Persona per6 = new Persona(61478, "Jorge Nogueira", new Documento(36587452, "DNI"), 0, 2);  //Esta persona es de Argentina(0), Buenos Aires(2)

        /*
            ACTIVIDAD 3: A todas las personas las guardamos en un vector.
         */
        Persona[] personas = {per1, per2, per3, per4, per5, per6};

        /*
            ACTIVIDAD 4: Contamos la cantidad de gente segun su país y su ciudad.
         */
        int[][] origen1 = new int[3][4];

        //Con este for contamos segun su pais y ciudad.         
        for (Persona elemPer : personas) {
            int pais = elemPer.getPais();
            int ciud = elemPer.getCiudad();
            origen1[pais][ciud]++;
        }

        //Mostramos la matriz:
        //FORMA 1: con for mejorados.
        System.out.println("Ciud0\tCiud1\tCiud2\tCiud3");
        for (int[] vectFila : origen1) {
            for (int valorColum : vectFila) {
                System.out.print(valorColum + "\t");
            }
            System.out.print(" - Pais ");
            System.out.println("");
        }

        System.out.println("\n");

        /*
            Cambiamos la forma de verlo. Primero ciudades y despues paises,
            tal cual figura en las filminas.
         */
        
        int[][] origen2 = new int[4][3];
        
        for (Persona elemPer : personas) {
            int ciud = elemPer.getCiudad();
            int pais = elemPer.getPais();            
            origen2[ciud][pais]++;
        }
        
        //FORMA 2: con for normales.
        System.out.println("ARG\tCHILE\tURUGUAY");
        for (int i = 0; i < origen2.length; i++) {
            //i: representa la ciudad

            for (int j = 0; j < origen2[j].length; j++) {
                //j: representa el pais
                System.out.print(origen2[i][j] + "\t");
            }
            System.out.print(" - Ciudad " + i);
            System.out.println("");
        }
    } //Fin del metodo main

} //Fin de la clase
