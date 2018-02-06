package io.github.lucasduete.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import io.github.lucasduete.model.Publicacao;

import static com.mongodb.client.model.Filters.text;

public class PublicacaoDao {

    MongoDatabase database;

    public PublicacaoDao() {

        database = Conexao.getConectionDB();
    }


    public void salvarPublicacao(Publicacao publicacao) {
        MongoCollection collection = database.getCollection("Publicacao", Publicacao.class);

        collection.insertOne(publicacao);
    }

    public MongoCursor buscarPublicacao(String titulo) {
        MongoCollection collection = database.getCollection("Publicacao", Publicacao.class);

        return collection.find(text(titulo)).iterator();
    }
}
