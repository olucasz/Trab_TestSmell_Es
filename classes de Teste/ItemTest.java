import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;

class ItemTest {

    @Test
    void testCalculaDataDevolucao() {
        Livro livro = new Livro(5); // Prazo padrão: 5 + 1 = 6 dias
        Item item = new Item(livro);
        Date dataBase = new Date();

        // Calcula a data de devolução
        Date dataDevolucao = item.calculaDataDevolucao(dataBase);

        // Verifica se a data de devolução não é nula
        assertNotNull(dataDevolucao, "Data de devolução não deveria ser nula.");

        // Verifica se a data está correta (dataBase + prazo do livro)
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataBase);
        calendar.add(Calendar.DATE, livro.verPrazo());
        Date expectedDate = calendar.getTime();

        assertEquals(expectedDate, dataDevolucao, "A data de devolução calculada está incorreta.");
    }

    @Test
    void testSetAndGetLivro() {
        Livro livro = new Livro(3);
        Item item = new Item(livro);

        // Verifica se o livro associado está correto
        assertEquals(livro, item.getLivro(), "O livro associado ao item está incorreto.");

        // Define um novo livro e verifica a alteração
        Livro novoLivro = new Livro(7);
        item.setLivro(novoLivro);
        assertEquals(novoLivro, item.getLivro(), "O método setLivro não alterou o livro corretamente.");
    }

    @Test
    void testSetAndGetDataDevolucao() {
        Item item = new Item(new Livro(2));
        Date dataDevolucao = new Date();

        // Define uma data de devolução e verifica
        item.setDataDevolucao(dataDevolucao);
        assertEquals(dataDevolucao, item.getDataDevolucao(), "O método setDataDevolucao não funcionou corretamente.");
    }
}
