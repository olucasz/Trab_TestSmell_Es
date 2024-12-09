import static org.junit.Assert.*;
import org.junit.Test;

public class DebitoTest {

    @Test
    public void testVerificaDebitoSemDebito() {
        Debito debito = new Debito(1);
        assertTrue("Aluno sem débito foi considerado com débito", debito.verificaDebito());
    }

    @Test
    public void testVerificaDebitoComDebito() {
        Debito debito = new Debito(4);
        assertFalse("Aluno com débito foi considerado sem débito", debito.verificaDebito());
    }
}
