public class Livro extends ItemAcervo{

    private int paginas;

    public Livro(String titulo, String autor, int ano, int paginas) {
        super(titulo, autor, ano);
        this.paginas = paginas;
    }

    @Override
    public void exibirFicha() {
        System.out.println("\n--- LIVRO ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Páginas: " + paginas);
    }
}
