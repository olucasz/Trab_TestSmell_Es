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
        assertTrue("Empréstimo deveria ser possível", emprestimo.emprestar(livros));
    }

    @Test
    public void testEmprestarComMaisDeDoisLivros() {
        Emprestimo emprestimo = new Emprestimo();
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(2));
        livros.add(new Livro(4));
        livros.add(new Livro(3));
        assertTrue("Empréstimo deveria calcular corretamente a data com mais de dois livros", emprestimo.emprestar(livros));
    }
}
