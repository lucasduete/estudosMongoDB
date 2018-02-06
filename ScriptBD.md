use estudosMongoDB

db.createCollection("Publicacao");

db.Publicacao.createIndex({titulo: "text", conteudo: "text"}, { weights : { titulo: 2, conteudo: 1 }, default_language: "portuguese", name: "_textoQueryID" });

db.Publicacao.find({$text: {$search: "Musicas"}}, {_id:0, titulo:1, autor:1, conteudo:1})