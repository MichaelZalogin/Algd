CREATE TABLE IF NOT EXISTS users
(
    username   varchar(128) PRIMARY KEY,
    firstname  varchar(128),
    lastname   varchar(128),
    birth_date DATE,
    role       varchar(128),
    info       jsonb
)