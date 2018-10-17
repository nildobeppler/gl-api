CREATE TABLE editora (
	id BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nmEditora VARCHAR(100) NOT NULL,
	deObservacao VARCHAR(1000) NULL,
	flForauso CHAR(1) NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO editora (nmEditora) VALUES ('Editora Belas Letras');
INSERT INTO editora (nmEditora) VALUES ('Editora Hedra');
INSERT INTO editora (nmEditora) VALUES ('Editora Papa Livros');