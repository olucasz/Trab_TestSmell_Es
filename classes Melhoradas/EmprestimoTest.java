import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoTest {

    @Test
    public void testCalculaDataDevolucao() {
        Emprestimo emprestimo = new Emprestimo();
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(5));
        livros.add(new Livro(3));

        assertTrue("Esperava que o empréstimo fosse possível", emprestimo.emprestar(livros));
    }

    @Test
    public void testEmprestarComMaisDeDoisLivros() {
        Emprestimo emprestimo = new Emprestimo();
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(2));
        livros.add(new Livro(4));
        livros.add(new Livro(3));

        assertTrue("Esperava que a data fosse calculada corretamente com mais de dois livros",
                   emprestimo.emprestar(livros));
    }
}
