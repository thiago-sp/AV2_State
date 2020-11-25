package main;

public class Main {

    public static void main(String[] args) {
        Livro l1 = new Livro("Design Patterns");
    Livro l2 = new Livro("Java Programming Language");

    l1.solicitar(l1);    // Disponível -> Emprestado
    l1.solicitar(l1);    // Ops, o livro já está emprestado
    l1.devolver(l1);     // Emprestado -> Disponível

    l2.devolver(l2);     // nada, o livro já está disponível
  }
}
    
