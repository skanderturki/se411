drop table CREDIT_CARD if exists;
drop table ACCOUNT if exists;


create table ACCOUNT (ID integer identity primary key, NUMBER varchar(9), NAME varchar(50) not null, unique(NUMBER));
create table CREDIT_CARD (ID integer identity primary key, ACCOUNT_ID integer, NUMBER varchar(16), unique(ACCOUNT_ID, NUMBER));

alter table CREDIT_CARD add constraint FK_ACCOUNT_CREDIT_CARD foreign key (ACCOUNT_ID) references ACCOUNT(ID) on delete cascade;
