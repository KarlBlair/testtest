# --- Sample dataset

# --- !Ups

delete from property;
delete from address; 

insert into property (type,id,num_beds,num_baths,price,garden_size,garage) values ('h',1,4, 3, 400.00, 132, true);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage) values ( 'h',2,2, 2, 300.00, 134, true);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage) values ( 'h',3,6, 4, 1000.00, 164, true);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage) values ( 'h',4,2, 1, 400.00, 100, false);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage) values ( 'h',5,3, 3, 600.00, 134, false);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage) values ( 'h',6,2, 1, 1300.00, 200, true);
insert into property (type,id,num_beds,num_baths,price,garden_size,garage) values ( 'h',7,4, 3, 700.00, 88, false);

insert into property (type,id,num_beds,num_baths,price,floor) values ('a', 8,2,1,1100,3);
insert into property (type,id,num_beds,num_baths,price,floor) values ('a', 9,3,2,1400,5);
insert into property (type,id,num_beds,num_baths,price,floor) values ('a', 10,3,3,1700,2);
insert into property (type,id,num_beds,num_baths,price,floor) values ('a', 11,1,1,800,1);
insert into property (type,id,num_beds,num_baths,price,floor) values ('a', 12,2,1,1600,4);



insert into address (id, street1, street2, town, post_code) values (1, '12 Cornwood', 'Springfield', 'Tallaht', 'D24X23');