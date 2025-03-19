public class App {
    public static void main(String[] args) throws Exception {
        Veiculo gol = new Veiculo(); //criação de um objeto (instância)
        Veiculo palio = new Veiculo();
        Veiculo jeep = new Veiculo();
        //separação dos objetos para não misturar os valores

        //utililizando a variável
        gol.buzinar();

        System.out.println(gol.buzinar());
        System.out.println(palio.buzinar());

        gol.acelecar(10);
        System.out.println(gol.velocidade);

        gol.acelecar(15);
        System.out.println(gol.velocidade);

        System.out.println(palio.velocidade);
    }
}
