describe pessoas;

ALTER TABLE pessoas ADD COLUMN profissao varchar(10);
desc pessoas;
select * from pessoas;

ALTER TABLE pessoas DROP COLUMN profissao;
desc pessoas;
select * from pessoas;

ALTER TABLE pessoas ADD COLUMN profissao varchar(10) AFTER nome;
desc pessoas;
select * from pessoas;

ALTER TABLE pessoas ADD codigo int first;
desc pessoas;
select * from pessoas;

ALTER TABLE pessoas MODIFY COLUMN profissao varchar(20) not null default '';
desc pessoas;
select * from pessoas;

ALTER TABLE pessoas CHANGE COLUMN profissao  prof varchar(20) not null default '';
desc pessoas;
select * from pessoas;

ALTER TABLE pessoas RENAME TO gafanhotos;
desc gafanhotos;
select * from gafanhotos;

CREATE TABLE IF NOT EXISTS cursos(
nome varchar(30) not null UNIQUE,
descricao text,
carga int UNSIGNED,
totaulas int unsigned,
ano year DEFAULT 2021
) DEFAULT CHARSET = utf8;
desc cursos;
alter table cursos add column idcurso int first;
alter table cursos add primary key(idcurso);
desc cursos;
