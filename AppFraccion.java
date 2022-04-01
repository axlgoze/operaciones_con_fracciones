//Aplicacion
public class AppFraccion{
    public static void main (String []args){
        //Creacion de Fraccioes con la clase Fraccion
        Fraccion fr1 = new Fraccion(6,9);
        Fraccion fr2 =new Fraccion(3,3);
        //obtener datos para impresion de las fracciones a multiplicar
        System.out.println("Primera Fracción: " + fr1.getNumerador() + "/" + fr1.getNumerador());
        System.out.println("Segunda Fracción: " + fr2.getDenominador() + "/" + fr2.getDenominador());
        //Creacion de variable para que almacena el resultado de multiplicar fraccion uno y fraccion 2
        Fraccion res = OperacionFraccion.multiplica(fr1, fr2);
        System.out.println("Resultado: "+ res);
        //Creacion de variable para que almacene la Fraccion resultante una ves simplificada por el metodo correspondiente
        Fraccion simple = OperacionFraccion.simplificar(res);
        System.out.println("Resultado simplificado: "+simple);
    }
}