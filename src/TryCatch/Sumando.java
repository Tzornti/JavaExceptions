package TryCatch;

public class Sumando {
    //Clase que suma enteros positivos y hace Throw en caso de recibir un negativo
    int number1=0;
    int number2=0;
    int resultado;
    public Sumando(int x,int y){
        number1=x;
        number2=y;
    }
    public int suma(){
        if (this.number2<0 || this.number1<0){
            throw new IllegalArgumentException("No se admiten valores negativos.");
        }
        else{
            resultado=this.number1+this.number2;
            return resultado;
        }
    }

}

