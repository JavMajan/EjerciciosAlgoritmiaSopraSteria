package Ejercicio3;

//Clase salario
class Salario {
    //Varialbes para horas trabajadas y tarifa
    int horas_trabajadas;
    int tarifa;

    //Métodos para introducir horas trabajadas y tarifa
    public void LeerHorasTrabajadas(int horas_trabajadas){
        this.horas_trabajadas = horas_trabajadas;
    }

    public void LeerTarifa(int tarifa){
        this.tarifa = tarifa;
    }

    //Metodo para calculo de salario
    public double SalarioTotal(){
        //Si es menor o igual a 40 solo se multiplica las horas trabajadas por la tarifa
        if(horas_trabajadas <= 40){
            return horas_trabajadas*tarifa;
        }
        // Si es mayor a 40 horas, se divide en el salario regular con el salario hasta 40 horas
        // y tras esto el calculo del salario de horas extras en el que se quita las 40 horas regulares y se añade el 50 porciento a la tarifa por horas extra
        // Devuelve el resultado sumado
        else{
            int salario_horas_regular = 40 * tarifa;

            int horas_extra = horas_trabajadas - 40;
            double tarifa_extra = tarifa + (tarifa*0.5);
            double salario_horas_extra = horas_extra * tarifa_extra;

            return salario_horas_regular + salario_horas_extra;
        }
    }
}

public class CalculoSalario {
    public static void main(String[] args) {
        Salario s = new Salario();

        s.LeerHorasTrabajadas(50);
        s.LeerTarifa(10);
        System.out.println("Salario total: " +s.SalarioTotal());
    }
}
