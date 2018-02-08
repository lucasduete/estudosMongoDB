package io.github.lucasduete;

import io.github.lucasduete.controller.PublicacaoController;
import io.github.lucasduete.model.Publicacao;
import org.bson.types.ObjectId;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        PublicacaoController publicacaoController = new PublicacaoController();

        //Inserir Publicacoes Padroes Para Agilizar
        inserirPubs(publicacaoController);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um Texto para Filtar as Publicacoes");
//        String query = scanner.next();

        publicacaoController.buscarPublicacao("Musicas")
                .forEach( publicacao -> {
                            System.out.println(publicacao);
                        }
                );
    }

    public static void inserirPubs(PublicacaoController publicacaoController) {

        Publicacao pub = null;

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
