package io.github.lucasduete;

import io.github.lucasduete.controller.PublicacaoController;
import io.github.lucasduete.model.Publicacao;
import org.bson.types.ObjectId;

import java.util.Scanner;


public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Inserir Publicacoes Padroes Para Agilisar
        inserirPubs();

        boolean continuar = true;

        do {

            System.out.println("Digite o que deseja fazer: ");
            System.out.println("1 - Cadastrar Publicacao;");
            System.out.println("2 - Buscar Publicacao;");
            System.out.println("0 - Sair;");

            int aux = scanner.nextInt();

            switch (aux) {
                case 1:
                    cadastrarPub();
                    break;
                case 2:
                    buscarPub();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("OPCAO INVALIDA");
            }

            System.out.println("Deseja Continuar?");
            System.out.println("1 Para Sim");
            System.out.println("Digite Outra Tecla para Sair");

            if (aux == 1)
                continuar = true;
            else
                continuar = false;

        } while (continuar);

    }

    public static void cadastrarPub() {

        PublicacaoController publicacaoController = new PublicacaoController();

        System.out.println("Digite o Titulo:");
        String titulo = scanner.next();

        System.out.println("Digite o Autor:");
        String autor = scanner.next();

        System.out.println("Digite o Conteudo da Publicacao:");
        String conteudo = scanner.next();

        Publicacao pub = new Publicacao(new ObjectId(), titulo, autor, conteudo);
        publicacaoController.salvarPublicacao(pub);
    }

    public static void buscarPub() {

        PublicacaoController publicacaoController = new PublicacaoController();

        System.out.println("Digite um Texto para Filtar as Publicacoes");

        String query = scanner.next();

        publicacaoController.buscarPublicacao(query)
                .forEach( publicacao -> {
                    System.out.println(publicacao);
                }
        );

    }

    public static void inserirPubs() {

        Publicacao pub = null;
        PublicacaoController publicacaoController = new PublicacaoController();

        pub = new Publicacao(new ObjectId(), "Livros Academicos Ultrapassados", "Lucas", "Os Livros academicos estao cada vez mais ultrapassados");
        publicacaoController.salvarPublicacao(pub);

        pub = new Publicacao(new ObjectId(), "Greve Geral", "Jordan", "Greve geral de todos os servidores ppublicos assola o pais");
        publicacaoController.salvarPublicacao(pub);

        pub = new Publicacao(new ObjectId(), "Musicas da Velha Guarda", "Matheus", "Musicas vintage vem atraindo novos publicos");
        publicacaoController.salvarPublicacao(pub);

        pub = new Publicacao(new ObjectId(), "Rock bolado", "Lucas", "As Musicas de rock vem ficando cada fez mais boladas");
        publicacaoController.salvarPublicacao(pub);

        pub = new Publicacao(new ObjectId(), "Linux supera Windows", "Lucas", "Pela prim vez os usuarios de linux em geral ultrapassam os de windows");
        publicacaoController.salvarPublicacao(pub);
    }

}
