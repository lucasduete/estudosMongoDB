package io.github.lucasduete.model;

import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.Objects;

public class Publicacao {

    private ObjectId id;
    private String titulo;
    private String autor;
    private String conteudo;

    public Publicacao() {

    }

    public Publicacao(ObjectId id, String titulo, String autor, String conteudo) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacao that = (Publicacao) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(titulo, that.titulo) &&
                Objects.equals(autor, that.autor) &&
                Objects.equals(conteudo, that.conteudo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, titulo, autor, conteudo);
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
