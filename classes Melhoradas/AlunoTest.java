import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class AlunoTest {

    private static final String ALUNO_VALIDO = "123";
    private static final String ALUNO_INVALIDO = "10";
    private static final String ALUNO_COM_DEBITO = "4";
    private static final String ALUNO_SEM_DEBITO = "1";

    @Test
    public void testVerficaAlunoValido() {
        Aluno aluno = new Aluno(ALUNO_VALIDO);
        assertTrue("Esperava que o aluno fosse válido", aluno.verficaAluno());
    }

    @Test
    public void testVerficaAlunoInvalido() {
        Aluno aluno = new Aluno(ALUNO_INVALIDO);
        assertFalse("Esperava que o aluno fosse inválido", aluno.verficaAluno());
    }

    @Test
    public void testVerificaDebitoSemDebito() {
        Aluno aluno = new Aluno(ALUNO_SEM_DEBITO);
        assertTrue("Esperava que o aluno não tivesse débito", aluno.verificaDebito());
    }

    @Test
    public void testVerificaDebitoComDebito() {
        Aluno aluno = new Aluno(ALUNO_COM_DEBITO);
        assertFalse("Esperava que o aluno tivesse débito", aluno.verificaDebito());
    }

    @Test
    public void testEmprestarComLivrosValidos() {
        Aluno aluno = new Aluno(ALUNO_VALIDO);
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1));
        assertTrue("Esperava que o empréstimo fosse realizado com livros válidos", aluno.emprestar(livros));
    }
}
