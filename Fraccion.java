public class Fraccion{
    private int numerador,denominador;

    //constructor
    public Fraccion(){
        numerador=0;
        denominador=1;
    }

    //sobrecarga del metodo constructor
    public Fraccion(int numerador, int denominador){
        this.numerador=numerador;
        if(denominador>0){
            this.denominador=denominador;
        }else
            this.denominador=1;
    }

    //metodos de acceso
    //getters
    int getNumerador(){
        return numerador;
    }
    int getDenominador(){
        return denominador;
    }

    //metodos de modificacion
    //setters
    void setNumerador(int val){
        numerador=val;
    }
    void setDenominador(int val){
        if(val>0){
            this.denominador=val;
        }else  
            this.denominador=1;
    }

    @Override
    public String toString(){
        String cadena;
        cadena = numerador+"/"+denominador;
        return cadena;
    }
}