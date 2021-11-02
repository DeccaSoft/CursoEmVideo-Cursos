Use Cadastro;
describe gafanhotos;
ALTER TABLE gafanhotos ADD COLUMN cursopreferido INT;
ALTER TABLE gafanhotos ADD FOREIGN KEY (cursopreferido) REFERENCES cursos(idcurso);
SELECT * FROM gafanhotos;
SELECT * FROM cursos;
UPDATE gafanhotos SET cursopreferido = '6' WHERE id = '1';
DELETE FROM curso WHERE idcurso = '6'; 		/*Não apaga pois i curso de id=6 possui um relacionamento*/
DELETE FROM curso WHERE idcurso = '28';		/*Apaga, pois o curso de id=28 ainda não possui nenhum relacionamento*/
SELECT nome, cursopreferido FROM gafanhotos;
SELECT gafanhotos.nome, cursos.nome, cursos.ano FROM gafanhotos JOIN cursos ON gafanhotos.cursopreferido = cursos.idcurso; /* JOIN = INNER JOIN */
SELECT gafanhotos.nome, cursos.nome, cursos.ano FROM gafanhotos JOIN cursos ON gafanhotos.cursopreferido = cursos.idcurso ORDER BY gafanhotos.nome;
SELECT g.nome, c.nome, c.ano FROM gafanhotos AS g JOIN cursos AS c ON g.cursopreferido = c.idcurso ORDER BY g.nome; /* Mostra somente os campos com relacionamento */
SELECT g.nome, c.nome, c.ano FROM gafanhotos AS g INNER JOIN cursos AS c ON g.cursopreferido = c.idcurso ORDER BY g.nome; /* JOIN = INNER JOIN */
SELECT g.nome, c.nome, c.ano FROM gafanhotos AS g LEFT OUTER JOIN cursos AS c ON g.cursopreferido = c.idcurso; /* Mostra todos os campos da Esquerda e os relacionamentos*/
SELECT g.nome, c.nome, c.ano FROM gafanhotos AS g LEFT JOIN cursos AS c ON g.cursopreferido = c.idcurso; /* LEFT OUTTER JOIN = LEFT JOIN */
SELECT g.nome, c.nome, c.ano FROM gafanhotos AS g RIGHT OUTER JOIN cursos AS c ON g.cursopreferido = c.idcurso; /* Mostra todos os campos da direita e os relacionamentos*/
SELECT g.nome, c.nome, c.ano FROM gafanhotos AS g RIGHT JOIN cursos AS c ON g.cursopreferido = c.idcurso; /* RIGHT OUTTER JOIN = LEFT JOIN */