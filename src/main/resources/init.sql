CREATE TABLE IF NOT EXISTS users
(
    id         bigserial PRIMARY KEY,
    username   VARCHAR(128) UNIQUE,
    firstname  varchar(128),
    lastname   varchar(128),
    birth_date DATE,
    role       varchar(128),
    company_id int REFERENCES company (id)
);

CREATE SEQUENCE user_id_seq
    INCREMENT 2
    OWNED BY users.id;

CREATE TABLE company
(
    id   serial PRIMARY KEY,
    name varchar(64) NOT NULL UNIQUE
)