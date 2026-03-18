import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Membro> membros = new ArrayList<>();
        ArrayList<ItemAcervo> itens = new ArrayList<>();

        membros.add(new Membro("João", 1));
        membros.add(new Membro("Maria", 2));

        itens.add(new Livro("Java Básico", "Autor A", 2020, 300));
        itens.add(new Revista("Tech Hoje", "Autor B", 2023, 10));
        itens.add(new MidiaDigital("Curso Java", "Autor C", 2022));

        int opcao;

        do {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1 - Listar Itens");
            System.out.println("2 - Reservar Item");
            System.out.println("3 - Devolver Item");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    for (int i = 0; i < itens.size(); i++) {
                        System.out.println("\nID: " + i);
                        itens.get(i).exibirFicha();
                        System.out.println("Status: " + itens.get(i).getStatus());
                    }
                    break;

                case 2:
                    System.out.print("ID do item: ");
                    int itemIndex = sc.nextInt();

                    System.out.print("ID do membro: ");
                    int membroIndex = sc.nextInt();

                    itens.get(itemIndex).reservar(membros.get(membroIndex));
                    break;

                case 3:
                    System.out.print("ID do item: ");
                    int devolverIndex = sc.nextInt();

                    itens.get(devolverIndex).devolver();
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}