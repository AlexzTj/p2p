create table user(
id varchar(255),
name  varchar(255),
email  varchar(255),
phone  varchar(255),
bic  varchar(255),
iban  varchar(255),
balance double,
primary key(id)
);

create table transaction(
id varchar(255),
user_id  varchar(255),
type  varchar(255),
created_at timestamp,
amount double,
primary key(id)
);

alter table transaction
add constraint FK_transaction_user foreign key(user_id)references user;
