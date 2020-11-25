package main;
/**
 * Um dos estados concretos do livro. A classe Emprestado faz a
 * transição Emprestado -> Disponivel ao chamar o método devolver.
 * Ignora os pedidos (não se contemplam reservas).
 */
public class Emprestado extends EstadoLivro{
    // Dado que neste exemplo os estados dos livros não vão conter
  // atributos dependentes do contexto, fazemos com que Emprestado
  // seja um Singleton.

  private static Emprestado instancia;  // Instância do Singleton Emprestado

  protected Emprestado() {}

  public static Emprestado instancia() {
    if (Emprestado.instancia == null)
      Emprestado.instancia = new Emprestado();

    return Emprestado.instancia;
  }

  // Métodos específicos deste estado concreto. Devolver faz a transição
  // para Disponivel, enquanto que solicitar rejeita.

  public boolean solicitar(Livro livro) {
    System.out.println("O livro " + livro + " não está disponível");
    return false;
  }

  public void devolver(Livro livro) {
    System.out.println("OK, o livro " + livro + " foi devolvido");
    livro.estabelecerEstado(Disponivel.instancia());
  }

  // Redefine o nome do estado

  public String toString() {
    return "Emprestado";
  }
}
