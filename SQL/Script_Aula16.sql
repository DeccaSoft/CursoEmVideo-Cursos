CREATE TABLE gafanhoto_assiste_curso(
	id INT NOT NULL AUTO_INCREMENT,
    data DATE,
    idgafanhoto INT, /* Chaves Estrangeiras Não precisam ter o mesmo nome, mas DEVEM ser do mesmo tipo da Chave Primária */
    idcurso INT,
    PRIMARY KEY (id),
    FOREIGN KEY (idgafanhoto) REFERENCES gafanhotos(id),
    FOREIGN KEY (idcurso) REFERENCES cursos(idcurso)
) DEFAULT CHARSET = utf8;

INSERT INTO gafanhoto_assiste_curso VALUES (DEFAULT, '2014-03-01', '1', '2');
SELECT * FROM gafanhoto_assiste_curso;

SELECT g.id, g.nome, a.idgafanhoto, a.idcurso, c.idcurso, c.nome FROM gafanhotos g 
JOIN gafanhoto_assiste_curso a ON g.id = a.idgafanhoto 
JOIN cursos c ON a.idcurso = c.idcurso
ORDER BY g.nome;