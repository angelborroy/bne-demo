insert into users (first_name, family_name, id_picture, login, password, e_mail, phone, language, enabled) values ('Ana', 'Santos Aramburo', 0, 'ana', 'ana', 'ana.santos@bne.es', '0033 1 23 45 67 89', 'es', true);
insert into users (first_name, family_name, id_picture, login, password, e_mail, phone, language, enabled) values ('Mar', 'Hernández Agustí', 0, 'mar', 'mar', 'mar.hernandez@bne.es', '0033 1 23 45 67 89', 'es', true);
insert into users (first_name, family_name, id_picture, login, password, e_mail, phone, language, enabled) values ('José Luis', 'Bueren Gómez-Acebo', 1, 'joseluis', 'joseluis', 'joseluis.bueren@bne.es', '0033 1 23 45 67 89', 'es', true);
insert into users (first_name, family_name, id_picture, login, password, e_mail, phone, language, enabled) values ('Carlos', 'Alberdi Alonso', 1, 'carlos', 'carlos', 'carlos.alberdi@bne.es', '0033 1 23 45 67 89', 'es', true);
insert into users (first_name, family_name, id_picture, login, password, e_mail, phone, language, enabled) values ('Bárbara', 'Navas Vallterra', 0, 'barbara', 'barbara', 'barbara.navas@bne.es', '0033 1 23 45 67 89', 'es', true);

insert into authority (name) values ('direccion');
insert into authority (name) values ('jefatura');

insert into users_authority (id_user, id_authority) values (1, 1);
insert into users_authority (id_user, id_authority) values (2, 2);
insert into users_authority (id_user, id_authority) values (3, 2);
insert into users_authority (id_user, id_authority) values (4, 2);
insert into users_authority (id_user, id_authority) values (5, 2);