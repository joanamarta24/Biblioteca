public interface Reservavel {

    boolean isDisponivel();

    void reservar(Membro membro);

    void devolver();

    String getStatus();
}