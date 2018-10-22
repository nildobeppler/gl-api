CREATE TABLE editora (
	id BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nmFantasia VARCHAR(50) NOT NULL,
	nmRazaoSocial VARCHAR(50) NOT NULL,
	nuCnpj VARCHAR(18) NOT NULL,
	nuInscricaoEstadual VARCHAR(15) NOT NULL,
	nmContato VARCHAR(20) NULL,
	nmEmail VARCHAR(50) NULL,
	nmSite VARCHAR(50) NULL,
	nuFonePrincipal VARCHAR(15) NULL,
	nuFoneSecundario VARCHAR(15) NULL,
	nuFoneCelular VARCHAR(15) NULL,
	vlDesconto DECIMAL(5,2) NOT NULL,
	deObservacao VARCHAR(1000) NULL,
	flForaUso BOOLEAN NOT NULL DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO editora 
(nmFantasia            ,nmRazaoSocial              ,nuCnpj              ,nuInscricaoEstadual,nmContato      ,nmEmail                  ,nmSite            ,nuFonePrincipal,nuFoneSecundario,nuFoneCelular   ,vlDesconto,deObservacao      ,flForaUso) VALUES
('Editora Belas Letras','Editora Belas Letras LTDA','06.947.994/0001-34','ISENTO'           ,'Nildo Beppler','nildo.beppler@gmail.com','www.nildo.com.br',''             ,''              ,'(48)98466-9011',50.00     ,'Editora do Nidão',false    );