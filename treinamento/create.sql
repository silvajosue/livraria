create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
create table tb_autor (co_autor  bigserial not null, nu_creative_commons varchar(255), no_autor varchar(255), primary key (co_autor));
create table tb_editora (co_editora  bigserial not null, no_editora varchar(255), primary key (co_editora));
create table tb_livro (co_livro  bigserial not null, nu_isbn varchar(255), no_livro varchar(255), co_autor int8, co_editora int8, primary key (co_livro));
alter table tb_livro add constraint FK4b6gmrw336q6tmuf0luv4xx23 foreign key (co_autor) references tb_autor;
alter table tb_livro add constraint FKp7hnaljalfgbvq3roxjaleucj foreign key (co_editora) references tb_editora;
