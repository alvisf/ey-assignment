ccreate table users(   uid int,   uname varchar(255),   upass varchar(255),   flag int );
create table invoice (   uid int,  bill_no int );

create table item (
  unique_bill_no int,
  item_id int,
  item_quantity int,
  bill_no int
);

create table shop (
  shop_id int,
  shop_name varchar(255)
);


create table items_available (
  for_shop_id int,
  avilable_item_name varchar(255),
  avilable_item_price int
);
