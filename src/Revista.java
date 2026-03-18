public class Revista extends ItemAcervo{

    private int edicao;

    public Revista(String titulo, String autor, int ano, int edicao) {
        super(titulo, autor, ano);
        this.edicao = edicao;
    }

    @Override
    public void exibirFicha() {
        System.out.println("\n--- REVISTA ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Edição: " + edicao);
    }
}
