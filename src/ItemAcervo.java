public abstract class ItemAcervo implements Reservavel {

    protected String titulo;
    protected String autor;
    protected int ano;

    protected boolean disponivel = true;
    protected Membro reservadoPor;

    public ItemAcervo(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public void reservar(Membro membro) {
        if (disponivel) {
            this.disponivel = false;
            this.reservadoPor = membro;
            System.out.println(" Reservado por: " + membro.getNome());
        } else {
            System.out.println(" Item já está reservado por: " + reservadoPor.getNome());
        }
    }

    @Override
    public void devolver() {
        if (!disponivel) {
            System.out.println(" Devolvido por: " + reservadoPor.getNome());
            this.disponivel = true;
            this.reservadoPor = null;
        } else {
            System.out.println(" Item já está disponível!");
        }
    }

    @Override
    public String getStatus() {
        if (disponivel) {
            return "Disponível ";
        } else {
            return "Reservado por " + reservadoPor.getNome() + " ❌";
        }
    }

    public abstract void exibirFicha();
}