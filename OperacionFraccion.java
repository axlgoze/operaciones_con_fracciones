public class OperacionFraccion{
    //metodo estatico para multiplicar Fracciones
    public static Fraccion multiplica(Fraccion frac1, Fraccion frac2){
        Fraccion resultado;
        int numerador = frac1.getNumerador()*frac2.getNumerador();
        int denominador = frac1.getDenominador()*frac2.getDenominador();
        resultado = new Fraccion(numerador,denominador);
        return resultado;
    }

    public static Fraccion simplificar(Fraccion resultado){
        Fraccion simple;
        
        int numerador = resultado.getNumerador();
        int denominador = resultado.getDenominador();
        int u = numerador;
        int v = denominador;
        int r;

        //calculo de MCD
        while(v != 0){
            r = u%v;
            u = v;
            v = r;
        }

        //simplificacion
        numerador /=u;
        denominador /=u;
        simple = new Fraccion(numerador,denominador);
        return simple;
    }
}