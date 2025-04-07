import org.example.Veiculo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculosTest {

    @Test
    public void testDescontomenor7() throws Exception {
        Veiculo veiculo = new Veiculo("Fox", 15);
        assertEquals(60, veiculo.desconto(4));
    }

    @Test
    public void testDescontomenor14() throws Exception {
        Veiculo veiculo = new Veiculo("Ideia", 18);
        assertEquals(145.8, veiculo.desconto(9));
    }

    @Test
    public void testDescontomenor21() throws Exception {
        Veiculo veiculo = new Veiculo("Crosfox", 18);
        assertEquals(273.6, veiculo.desconto(19));
    }

    @Test
    public void testDescontomenor28() throws Exception {
        Veiculo veiculo = new Veiculo("Ka", 18);
        assertEquals(315, veiculo.desconto(25));
    }

    @Test
    public void testDescontomaior28() throws Exception {
        Veiculo veiculo = new Veiculo("Mustang", 18);
        assertEquals(288, veiculo.desconto(32));
    }

    @Test
    public void testDescontodiarianegativo() {
        assertThrows(Exception.class, () -> {
            Veiculo veiculo = new Veiculo("Ferrari", -20);
            veiculo.desconto(8);
        });
    }

    @Test
    public void testDescontodias0() {
        assertThrows(Exception.class, () -> {
            Veiculo veiculo = new Veiculo("Corolla", 20);
            veiculo.desconto(0);
        });
    }

    @Test
    public void testDescontodiasnegativo() {
        assertThrows(Exception.class, () -> {
            Veiculo veiculo = new Veiculo("Uno", 30);
            veiculo.desconto(-2);
        });
    }
}
