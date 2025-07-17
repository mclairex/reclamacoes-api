create table usuarios (
    id BIGSERIAL PRIMARY KEY,
    login varchar(100) not null,
    senha varchar(100) not null
);

