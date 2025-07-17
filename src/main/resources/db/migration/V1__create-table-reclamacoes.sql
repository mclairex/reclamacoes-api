create table reclamacoes(

    id SERIAL PRIMARY KEY, --SERIAL auto incrementa o id
    cpf VARCHAR(11) NOT NULL,
    titulo VARCHAR(50) NOT NULL,
    data_criacao TIMESTAMP NOT NULL,
    descricao TEXT NOT NULL
    status VARCHAR(50) NOT NULL
);