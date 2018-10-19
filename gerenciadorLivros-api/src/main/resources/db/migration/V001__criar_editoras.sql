CREATE TABLE editora (
	id BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nmEditora VARCHAR(100) NOT NULL,
	deObservacao VARCHAR(1000) NULL,
	flForaUso BOOLEAN NOT NULL DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO editora (nmEditora,flForaUso) VALUES ('Editora Belas Letras',false);
INSERT INTO editora (nmEditora,flForaUso) VALUES ('Editora Hedra',false);
INSERT INTO editora (nmEditora,flForaUso) VALUES ('Editora Papa Livros',false);