create database items;

Data base shemas are created autonatically after application running.

insert into item(code, name_en, name_ru) values (1, "phone", "телефон");
insert into item(code, name_en, name_ru) values (2, "laptop", "ноутбук");
insert into item(code, name_en, name_ru) values (3, "printer", "принтер");

insert into attribute(name_en, name_ru) values ("model", "модель");
insert into attribute(name_en, name_ru) values ("manufacture", "производитель");
insert into attribute(name_en, name_ru) values ("screen size", "размер экрана");
insert into attribute(name_en, name_ru) values ("cpu", "процессор");
insert into attribute(name_en, name_ru) values ("video card", "видеокарта");
insert into attribute(name_en, name_ru) values ("printer type", "тип принтера");

insert into item_attributes(item_id, attribute_id) values(1, 1);
insert into item_attributes(item_id, attribute_id) values(1, 2);
insert into item_attributes(item_id, attribute_id) values(1, 3);

insert into item_attributes(item_id, attribute_id) values(2, 1);
insert into item_attributes(item_id, attribute_id) values(2, 2);
insert into item_attributes(item_id, attribute_id) values(2, 3);
insert into item_attributes(item_id, attribute_id) values(2, 4);
insert into item_attributes(item_id, attribute_id) values(2, 5);

insert into item_attributes(item_id, attribute_id) values(3, 1);
insert into item_attributes(item_id, attribute_id) values(3, 2);
insert into item_attributes(item_id, attribute_id) values(3, 6);