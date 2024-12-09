import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class AlunoTest {

    @Test
    public void testVerficaAlunoValido() {
        Aluno aluno = new Aluno("123");
        assertTrue("Aluno válido não foi identificado corretamente", aluno.verficaAluno());
    }

    @Test
    public void testVerficaAlunoInvalido() {
        Aluno aluno = new Aluno("10");
        assertFalse("Aluno inválido não foi identificado corretamente", aluno.verficaAluno());
    }

    @Test
    public void testVerificaDebitoSemDebito() {
        Aluno aluno = new Aluno("1");
        assertTrue("Aluno sem débito foi considerado em débito", aluno.verificaDebito());
    }

    @Test
    public void testVerificaDebitoComDebito() {
        Aluno aluno = new Aluno("4");
        assertFalse("Aluno com débito foi considerado sem débito", aluno.verificaDebito());
    }

    @Test
    public void testEmprestarComLivrosValidos() {
        Aluno aluno = new Aluno("123");
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1));
        assertTrue("Falha ao emprestar livros válidos", aluno.emprestar(livros));
    }
}
