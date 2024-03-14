package Ejercicio2;

//Clase con el tipo persona que contiene edad y sexo
class Persona {
    int edad;
    char sexo;
    public Persona(int edad, char sexo){
        this.edad = edad;
        this.sexo = sexo;
    }
}

//Clase lista de personas
class ListPersonas {
    //Lista de las personas
    Persona[] list_personas = new Persona[50];
    //Indice de lista
    private int index_list_personas = 0;

    //Añadir una persona
    public void LeerPersona(int edad, char sexo){
        //Condiciones de edad y simbolos para sexo para añadir a la persona en el indice
        if(edad >= 0 && (sexo == 'M' || sexo == 'F')) {
            list_personas[index_list_personas] = new Persona(edad, sexo);
            index_list_personas++;
        }
    }

    //Realizar los resultados necesarios a través de un for
    public void ResultadosPersonas(){
        int personas_totales = list_personas.length;
        int personas_mayores_de_edad = 0;
        int personas_menores_de_edad = 0;
        int personas_masculinas_mayores_de_edad = 0;
        int personas_femeninas_menores_de_edad = 0;
        int personas_femeninas = 0;


        for (Persona listPersona : list_personas) {
            if (listPersona.edad >= 18) {
                personas_mayores_de_edad++;
                if(listPersona.sexo == 'M'){
                    personas_masculinas_mayores_de_edad++;
                }
            } else {
                personas_menores_de_edad++;
                if(listPersona.sexo == 'F'){
                    personas_femeninas_menores_de_edad++;
                }
            }

            if(listPersona.sexo == 'F'){
                personas_femeninas++;
            }
        }


        System.out.println("Personas mayores de edad: " + personas_mayores_de_edad);
        System.out.println("Personas menores de edad: " + personas_menores_de_edad);
        System.out.println("Personas masculinas mayores de edad: " + personas_masculinas_mayores_de_edad);
        System.out.println("Personas femeninas menores de edad: " + personas_femeninas_menores_de_edad);

        double porcentaje_personas_mayores_respecto_total = (double) personas_mayores_de_edad /personas_totales;
        double porcentaje_personas_femeninas_respecto_total = (double) personas_femeninas/personas_totales;

        System.out.println("Porcentaje personas mayores de edad respecto al total: " + porcentaje_personas_mayores_respecto_total);
        System.out.println("Porcentaje personas femeninas respecto al total: " + porcentaje_personas_femeninas_respecto_total);
    }
}
public class ClasificacionPersona {
    public static void main(String[] args) {
        ListPersonas lista_personas = new ListPersonas();

        //Añadir las personas a la lista (50 personas)
        lista_personas.LeerPersona(35,'F');
        lista_personas.LeerPersona(76,'F');
        lista_personas.LeerPersona(75,'F');
        lista_personas.LeerPersona(43,'F');
        lista_personas.LeerPersona(83,'M');
        lista_personas.LeerPersona(98,'F');
        lista_personas.LeerPersona(76,'F');
        lista_personas.LeerPersona(9,'M');
        lista_personas.LeerPersona(80,'M');
        lista_personas.LeerPersona(2,'F');
        lista_personas.LeerPersona(27,'M');
        lista_personas.LeerPersona(24,'M');
        lista_personas.LeerPersona(92,'M');
        lista_personas.LeerPersona(48,'M');
        lista_personas.LeerPersona(42,'M');
        lista_personas.LeerPersona(65,'M');
        lista_personas.LeerPersona(4,'M');
        lista_personas.LeerPersona(16,'F');
        lista_personas.LeerPersona(52,'M');
        lista_personas.LeerPersona(19,'M');
        lista_personas.LeerPersona(17,'F');
        lista_personas.LeerPersona(59,'F');
        lista_personas.LeerPersona(51,'F');
        lista_personas.LeerPersona(26,'M');
        lista_personas.LeerPersona(12,'F');
        lista_personas.LeerPersona(52,'F');
        lista_personas.LeerPersona(54,'M');
        lista_personas.LeerPersona(21,'M');
        lista_personas.LeerPersona(56,'F');
        lista_personas.LeerPersona(86,'F');
        lista_personas.LeerPersona(70,'M');
        lista_personas.LeerPersona(14,'F');
        lista_personas.LeerPersona(64,'F');
        lista_personas.LeerPersona(100,'F');
        lista_personas.LeerPersona(1,'M');
        lista_personas.LeerPersona(83,'M');
        lista_personas.LeerPersona(51,'M');
        lista_personas.LeerPersona(67,'F');
        lista_personas.LeerPersona(26,'F');
        lista_personas.LeerPersona(8,'M');
        lista_personas.LeerPersona(53,'M');
        lista_personas.LeerPersona(18,'F');
        lista_personas.LeerPersona(82,'M');
        lista_personas.LeerPersona(16,'F');
        lista_personas.LeerPersona(58,'M');
        lista_personas.LeerPersona(54,'M');
        lista_personas.LeerPersona(10,'M');
        lista_personas.LeerPersona(26,'F');
        lista_personas.LeerPersona(5,'F');
        lista_personas.LeerPersona(88,'M');

        //Imprimir resultados
        lista_personas.ResultadosPersonas();
    }
}
