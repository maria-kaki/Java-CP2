import org.example.Veiculo;

public class VeiculosTest {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo("Fox",15);
        double retorno = veiculo.desconto(10);
        System.out.println(retorno);
    }
}
