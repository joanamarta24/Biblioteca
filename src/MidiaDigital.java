public class MidiaDigital extends ItemAcervo{

    private String formato;

    public MidiaDigital(String titulo, String autor, int ano) {
        super(titulo, autor, ano);
        this.formato = formato;
    }

    @Override
    public void exibirFicha() {
        System.out.println("\n ----MIDIA DIGITAL---");
        System.out.println("TITULO: " + titulo);
        System.out.println("AUTOR: " + autor);
        System.out.println("ANO: " + ano);
        System.out.println("fORMATO: " + formato);
    }
}
