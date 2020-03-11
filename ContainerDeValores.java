

public class ContainerDeValores {

    private int primeiroValor;
    private int segundoValor;

    public void imprimirImpares(){
        for(int i = primeiroValor; i <= segundoValor; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    public void setPrimeiroValor(int valor){
        this.primeiroValor = valor;
    }

    public void setSegundoValor(int valor){
        this.segundoValor = valor;
    }

}
