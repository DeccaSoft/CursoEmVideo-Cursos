use cadastro;
select * from gafanhotos;
select * from cursos;
select * from cursos order by nome desc;
select ano, nome, carga from cursos order by ano, nome desc;
SELECT * from cursos WHERE ano = '2016' order by nome;
SELECT nome, ano FROM cursos WHERE ano BETWEEN 2014 AND 2016 ORDER BY ano DESC, nome ASC;
SELECT nome, descricao, ano FROM cursos WHERE ano IN (2014, 2016, 2020) ORDER BY ano;
select nome, carga, totaulas from cursos where carga >= 35 and  totaulas < 30;
select nome, carga, totaulas from cursos where carga >= 35 OR  totaulas < 30;
SELECT * FROM cursos WHERE nome LIKE 'a%';
SELECT * FROM cursos WHERE nome LIKE '%a';
SELECT * FROM cursos WHERE nome LIKE '%a%';
SELECT * FROM cursos WHERE nome NOT LIKE '%a%';
SELECT * FROM cursos WHERE nome LIKE 'ph%p_';

USE gafanhotos;
SELECT * FROM gafanhotos;
SELECT nacionalidade FROM gafanhotos;
SELECT DISTINCT nacionalidade FROM gafanhotos;
SELECT DISTINCT nacionalidade FROM gafanhotos ORDER BY nacionalidade;

USE cursos;
SELECT * FROM cursos;
SELECT COUNT(*) FROM cursos;
SELECT * FROM cursos WHERE carga > 40;
SELECT count(*) FROM cursos WHERE carga > 40;
SELECT count(nome) FROM cursos;
select * from cursos order by carga desc;
select max(carga) from cursos;
SELECT MAX(totaulas) FROM cursos WHERE ano = "2016";
SELECT nome, MIN(totaulas) FROM cursos where ano = '2016';
SELECT * FROM cursos WHERE ano = 2016;
SELECT SUM(totaulas) FROM cursos WHERE ano = 2016;
SELECT AVG(totaulas) FROM cursos WHERE ano = 2016;

-- EXERCÍCIOS

select * from gafanhotos;
select * from gafanhotos where sexo = 'F';
select * from gafanhotos where nascimento BETWEEN '2015-12-31' AND '2020-01-01'; -- DÚVIDA
select * from gafanhotos where sexo = 'M' and profissao = 'programador';
SELECT * FROM gafanhotos where sexo = 'F' and nacionalidade = 'Brasil' and nome like 'j%';
select nome, nacionalidade from gafanhotos where sexo = 'M' and nacionalidade <> 'Brasil' and peso < 100 and nome like '%Silva%';
select max(altura) from gafanhotos where nacionalidade = 'Brasil';
select avg(peso) from gafanhotos;
select min(peso) from gafanhotos where sexo = 'f' and nacionalidade <> 'Brasil' and nascimento BETWEEN '1990-01-01' AND '2000-12-31';
select count(*) from gafanhotos where sexo = 'f' and altura > 1.9;

-- Aula 13

use cadastro;
SELECT * FROM cursos;
SELECT DISTINCT totaulas FROM cursos order by totaulas;
SELECT totaulas, count(*) FROM cursos GROUP BY totaulas order by totaulas;
SELECT * FROM cursos WHERE totaulas > 20;
SELECT carga, count(*) FROM cursos WHERE totaulas = 30 GROUP BY carga;
SELECT ano, COUNT(nome) FROM cursos GROUP BY ano HAVING count(ano) >= 5 ORDER BY count(*);
SELECT ano, count(*) FROM cursos WHERE totaulas > 30 GROUP BY ano HAVING ano > 2013 ORDER BY count(*) desc;
SELECT AVG(carga) FROM cursos;
SELECT carga, count(*) FROM cursos WHERE ano > 2015 GROUP BY carga HAVING carga > (SELECT AVG(carga) FROM cursos);

-- EXERCÍCIOS

USE gafanhotos;
SELECT * FROM gafanhotos;
SELECT profissao, count(profissao) FROM gafanhotos GROUP BY profissao;
SELECT sexo, COUNT(sexo) from gafanhotos WHERE nascimento > '2005-01-01' GROUP BY sexo;
SELECT nacionalidade, count(*) FROM gafanhotos WHERE nacionalidade <> 'Brasil' GROUP BY nacionalidade HAVING count(*) > 3;
SELECT avg(altura) FROM gafanhotos;
SELECT altura, COUNT(altura) from gafanhotos WHERE peso > 100 and altura > (SELECT avg(altura) FROM gafanhotos) GROUP BY altura;
SELECT altura, COUNT(altura) from gafanhotos WHERE peso > 100 GROUP BY altura HAVING altura > (SELECT avg(altura) FROM gafanhotos);