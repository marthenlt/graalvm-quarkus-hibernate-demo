-- drop table Fruit;
create table Fruit(id bigint(20) NOT NULL AUTO_INCREMENT, name varchar(40), country varchar(20), PRIMARY KEY (id));

INSERT INTO Fruit(name, country) VALUES ('Cherry', 'Japan');
INSERT INTO Fruit(name, country) VALUES ('Apple', 'USA');
INSERT INTO Fruit(name, country) VALUES ('Banana', 'Indonesia');


