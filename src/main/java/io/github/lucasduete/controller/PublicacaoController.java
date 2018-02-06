package io.github.lucasduete.controller;

import com.mongodb.client.MongoCursor;
import io.github.lucasduete.dao.PublicacaoDao;
import io.github.lucasduete.model.Publicacao;

import java.util.ArrayList;

public class PublicacaoController {

    private PublicacaoDao publicacaoDao;

    public PublicacaoController() {

        publicacaoDao = new PublicacaoDao();
    }


    public void salvarPublicacao(Publicacao publicacao) {

        publicacaoDao.salvarPublicacao(publicacao);
    }

    public ArrayList<Publicacao> buscarPublicacao(String query) {

        MongoCursor cursor = publicacaoDao.buscarPublicacao(query);

        ArrayList<Publicacao> publicacoes = new ArrayList<>();

        try {
            while (cursor.hasNext()) {
                publicacoes.add((Publicacao) cursor.next());
            }
        } finally {
            cursor.close();
        }

        return publicacoes;
    }

}
