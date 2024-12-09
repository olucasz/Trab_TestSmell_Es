import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;

class ItemTest {

    private static final int PRAZO_PADRAO = 5;

    @Test
    void testCalculaDataDevolucao() {
        Livro livro = new Livro(PRAZO_PADRAO);
        Item item = new Item(livro);
        Date dataBase = new Date();

        Date dataDevolucao = item.calculaDataDevolucao(dataBase);

        assertNotNull(dataDevolucao, "Esperava que a data de devolução não fosse nula.");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataBase);
        calendar.add(Calendar.DATE, livro.verPrazo());
        Date expectedDate = calendar.getTime();

        assertEquals(expectedDate, dataDevolucao, "A data de devolução está incorreta.");
    }
}
