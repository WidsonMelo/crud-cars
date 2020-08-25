-- Modelagem do banco de dados
create table car(
	id bigint not null auto_increment,
	color varchar(60) not null,
	year year(4) not null,
	model varchar(60) not null,
	manufacturer varchar(60) not null,
	power float(2, 1) not null,
	primary key(id)
);

INSERT INTO car VALUES (1, 'Preto', 2014, 'Siena', 'Fiat', 1.6);
INSERT INTO car VALUES (2, 'Branco', 2012, 'Fox', 'Volkswagen', 1.0);