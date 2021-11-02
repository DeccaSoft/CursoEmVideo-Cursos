use cadastro;
alter table gafanhotos drop column codigo;
desc gafanhotos;
select * from gafanhotos;
select * from cursos;
insert into cursos values
('1', 'HTLM4', 'Çurso de HTML5', '40', '37', '2014'),
('2', 'Algotitmos', 'Lógica de Programação', '20', '15', '2014'),
('3', 'PhotoShop', 'Dicas de PhotoShop CC', '10', '8', '2014'),
('4', 'PGP', 'Çurso de PHP para Iniciantes', '40', '20', '2010'),
('5', 'Jarva', 'Introdução à Linguagem Java', '10', '29', '2000'),
('6', 'MySQL', 'Banco de Dados MySQL', '30', '15', '2016'),
('7', 'Word', 'Çurso Completo de Word', '40', '30', '2016'),
('8', 'Spateado', 'Danças Rítmicas', '40', '30', '2018'),
('9', 'Cozinha Árabe', 'Aprenda a fazer Kibe', '40', '30', '2018'),
('10', 'YouTuber', 'Gerar Polêmica e Ganhar Inscritos', '5', '2', '2018');
desc cursos;
select * from cursos;
UPDATE cursos SET nome='HTML5' WHERE idcurso = '1';
select * from cursos;
UPDATE cursos SET descricao='Curso de HTML5' WHERE idcurso = '1';
update cursos set nome='PHP', ano='2015' where idcurso='4';
select * from cursos;
UPDATE cursos SET descricao='Curso de PHP para Iniciantes' WHERE idcurso = '4';
UPDATE cursos SET nome='Java', carga='40', ano='2015' WHERE idcurso = '5' LIMIT 1;
UPDATE CURSOS SET ANO='2050', CARGA='800' WHERE ANO='2018';
UPDATE CURSOS SET ANO='2018', CARGA='0' WHERE ANO='2050' LIMIT 1;
DELETE FROM cursos WHERE idcurso='8';
DELETE FROM cursos WHERE ano='2050' limit 3;
truncate cursos;
select * from cursos;