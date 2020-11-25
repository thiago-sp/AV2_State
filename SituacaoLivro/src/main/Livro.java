package main;
/**
  * Livro define o contexto para este exemplo simples de padrão estado.
  * Um Livro pode estar em dois estados: Disponível ou Emprestado, de modo que
  * se escolhermos por representar o estado com um atributo, os métodos da
  * classe Livro acabariam por converter-se em condicionais sobre esse estado.
  */
    public class Livro {
        private EstadoLivro estado;    // implementa associação com o estado

  private String titulo;

  // O construtor da classe, além de inicializar o título do
  // livro, define o estado inicial (Disponível). Como neste caso
  // os estados de livros têm o seu próprio estado, usamos um Singleton.

  public Livro(String titulo) {
    this.titulo = titulo;
    this.estado = Disponivel.instancia();
  }

  public String toString() {
    return (this.titulo + " (" + this.estado + ")" );
  }

  // Este método modifica o estado do livro. Problema: o método deve
  // ser acessado a partir de uma classe externa (EstadoLivro), o que exclui
  // a visibilidade private e protected. public é demasiado geral pois
  // *todas* as classes podem acessar o método. Neste caso, sugere-se a
  // visibilidade de package, com Livro e os seus estados no mesmo package.

  void estabelecerEstado(EstadoLivro estado) {
    System.out.println("Transitando de " + this.estado + " a " + estado);
    this.estado = estado;
  }

  // Os métodos de dependentes do estado delegam o comportamento
  // definido para cada estado. Uma vez que vamos dar aos estados
  // a responsabilidade de realizar as transições, passamos o livro
  // ao estado para que possa, se lhe interessar, chamar estabelecerEstado.

    void solicitar(Livro l1) {
       this.estado.solicitar(this); //To change body of generated methods, choose Tools | Templates.
    }

    void devolver(Livro l1) {
        this.estado.devolver(this);
    }

}
