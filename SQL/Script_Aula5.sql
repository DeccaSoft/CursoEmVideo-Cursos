use cadastro;

INSERT INTO pessoas
(nome, nascimento, sexo, peso, altura, nacionalidade)
VALUES
('Godofredo', '1984-01-02', 'M', '78.5', '1.83', 'Brasil'); 

INSERT INTO pessoas
(nome, nascimento, sexo, peso, altura, nacionalidade)
VALUES
('Maria', '1982-12-08', 'F', '55.5', '1.65', 'Portugal'); 

INSERT INTO pessoas
(id, nome, nascimento, sexo, peso, altura, nacionalidade)
VALUES
(DEFAULT, 'Ricardo', '1975-05-30', 'M', '85.1', '1.95', 'EUA'); 

INSERT INTO pessoas
(id, nome, nascimento, sexo, peso, altura, nacionalidade)
VALUES
('4', 'Creuza', '1970-01-28', 'F', '65.5', '1.44', DEFAULT); 

INSERT INTO pessoas VALUES (DEFAULT, 'André', '1975-08-18', 'M', '74.5', '1.70', DEFAULT); 

INSERT INTO pessoas VALUES
(DEFAULT, 'Daniella', '1977-12-08', 'F', '56.5', '1.50', DEFAULT),
(DEFAULT, 'Mateus', '2005-07-18', 'M', '59.5', '1.65', DEFAULT),
(DEFAULT, 'Davi', '2007-11-22', 'M', '44.5', '1.55', DEFAULT);

INSERT INTO pessoas VALUES ('4', 'Teste', '1978-05-11', 'M', '70.5', '1.60', DEFAULT); 
INSERT INTO pessoas VALUES ('10', 'Teste', '1978-05-11', 'M', '70.5', '1.60', DEFAULT); 

INSERT INTO pessoas VALUES (DEFAULT, 'Teste', '1978-05-11', 'M', '70.5', '1.60', DEFAULT); 
INSERT INTO pessoas VALUES (DEFAULT, 'Teste3', '1978-05-11', 'M', '70.5', '1.60', DEFAULT); 

SELECT * FROM pessoas;