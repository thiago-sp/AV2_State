package main;
/**
 * Esta é a classe abstrata que define as operações específicas do Estado.
 * Os métodos podem ser declarados abstratos, de modo que as classes
 * derivadas sejam forçadas a implementá-los, ou podem ter uma
 * implementação por padrão, definida neste nível.
 */
public abstract class EstadoLivro {
  // Os métodos devolver e solicitar são abstratos (devem ser implementados
  // pelos estados concretos) e são tomados como argumento livro, se
  // desejarmos aceder posteriormente aos atributos e métodos do mesmo.

  public abstract void devolver(Livro livro);
  public abstract boolean solicitar(Livro livro);

  // Além disso, adicionamos um método com um String que identifica o estado
  // do livro -- a definição estabelece um valor por padrão que será
  // usado se as subclasses não o redefinirem.

  public String toString() {
    return "Desconhecido";
  }
}
