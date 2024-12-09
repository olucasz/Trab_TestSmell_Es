import static org.junit.Assert.*;
import org.junit.Test;

public class DebitoTest {

    @Test
    public void testVerificaDebitoSemDebito() {
        Debito debito = new Debito(1);
        assertTrue("Esperava que o aluno não tivesse débito", debito.verificaDebito());
    }

    @Test
    public void testVerificaDebitoComDebito() {
        Debito debito = new Debito(4);
        assertFalse("Esperava que o aluno tivesse débito", debito.verificaDebito());
    }
}
