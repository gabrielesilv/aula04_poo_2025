public class Veiculo {
    public String modelo;
    String cor; //sem o modificador é automaticamente public
    public int velocidade = 0; //inicializando uma variável
    protected String marca;
    private Float capacidadeTanque;
    private Float potenciaMotor;


    //criando os métodos
    public String buzinar(){
        String buzina = "Bi-bi";
        return buzina;
    }

    public void acelecar(int valor){
        velocidade = velocidade + valor;
    }

}
