package io.github.lucasduete;

import io.github.lucasduete.controller.PublicacaoController;
import io.github.lucasduete.model.Publicacao;
import org.bson.types.ObjectId;


public class App {

    public static void main(String[] args) {

        inserirPubs();

        PublicacaoController publicacaoController = new PublicacaoController();
        System.out.println(publicacaoController.buscarPublicacao("Musicas"));
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
