/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     29/09/2021 20:30:28                          */
/*==============================================================*/


/*==============================================================*/
/* Table: Aprender                                              */
/*==============================================================*/
create table Aprender
(
   id_aprender          int not null,
   titulo               text,
   conteudo             text
);

alter table Aprender
   add primary key (id_aprender);

/*==============================================================*/
/* Table: Bairro                                                */
/*==============================================================*/
create table Bairro
(
   id_bairro            int not null,
   nome_bairro          text,
   regiao               text
);

alter table Bairro
   add primary key (id_bairro);

/*==============================================================*/
/* Table: Contato                                               */
/*==============================================================*/
create table Contato
(
   id_contato           int not null,
   email                text,
   telefone             text
);

alter table Contato
   add primary key (id_contato);

/*==============================================================*/
/* Table: Endereco                                              */
/*==============================================================*/
create table Endereco
(
   id_endereco          int not null,
   logradouro           text,
   numero               int,
   complemento          text,
   bairro               text,
   cidade               text,
   estado               text,
   CEP                  text
);

alter table Endereco
   add primary key (id_endereco);

/*==============================================================*/
/* Table: Favoritar                                             */
/*==============================================================*/
create table Favoritar
(
   id_favoritar         int not null,
   id_pessoa            int,
   id_parceiro          int
);

alter table Favoritar
   add primary key (id_favoritar);

/*==============================================================*/
/* Table: Mensagem                                              */
/*==============================================================*/
create table Mensagem
(
   id_mensagem          int not null,
   id_usuario           int,
   id_parceiro          int,
   mensagem             text
);

alter table Mensagem
   add primary key (id_mensagem);

/*==============================================================*/
/* Table: Parceiro                                              */
/*==============================================================*/
create table Parceiro
(
   id_parceiro          int not null,
   id_ligacao_intens_trabalhados int,
   id_juridica          int,
   id_ligacao_bairro    int,
   coleta_a_domicilio   bool,
   coleta_em_toda_cidade bool
);

alter table Parceiro
   add primary key (id_parceiro);

/*==============================================================*/
/* Table: Pessoa                                                */
/*==============================================================*/
create table Pessoa
(
   id_pessoa            int not null,
   id_contato           int,
   id_endereco          int,
   nome                 text,
   email                text,
   telefone             text,
   senha                text
);

alter table Pessoa
   add primary key (id_pessoa);

/*==============================================================*/
/* Table: Pessoa_Fisica                                         */
/*==============================================================*/
create table Pessoa_Fisica
(
   id_usuario           int not null,
   id_pessoa            int,
   dataNasc             date,
   CPF                  text
);

alter table Pessoa_Fisica
   add primary key (id_usuario);

/*==============================================================*/
/* Table: Pessoa_Juridica                                       */
/*==============================================================*/
create table Pessoa_Juridica
(
   id_juridica          int not null,
   id_pessoa            int,
   cnpj                 text,
   tipo_pessoa_juridica bool
);

alter table Pessoa_Juridica
   add primary key (id_juridica);

/*==============================================================*/
/* Table: acao_descarte                                         */
/*==============================================================*/
create table acao_descarte
(
   id_descarte          int not null,
   id_lista_itens_descartados int,
   id_parceiro          int,
   id_pessoa            int
);

alter table acao_descarte
   add primary key (id_descarte);

/*==============================================================*/
/* Table: acao_doar                                             */
/*==============================================================*/
create table acao_doar
(
   id_doar              int not null,
   id_pessoa            int,
   id_parceiro          int,
   id_lista_itens_doacao int
);

alter table acao_doar
   add primary key (id_doar);

/*==============================================================*/
/* Table: item                                                  */
/*==============================================================*/
create table item
(
   id_item              int not null,
   nome_item            text
);

alter table item
   add primary key (id_item);

/*==============================================================*/
/* Table: ligacao_Bairro                                        */
/*==============================================================*/
create table ligacao_Bairro
(
   id_ligacao_bairro    int not null,
   id_bairro            int
);

alter table ligacao_Bairro
   add primary key (id_ligacao_bairro);

/*==============================================================*/
/* Table: ligacao_itens_trabalhados                             */
/*==============================================================*/
create table ligacao_itens_trabalhados
(
   id_ligacao_itens_trabalhados int not null,
   id_item              int
);

alter table ligacao_itens_trabalhados
   add primary key (id_ligacao_itens_trabalhados);

/*==============================================================*/
/* Table: lista_itens_descartados                               */
/*==============================================================*/
create table lista_itens_descartados
(
   id_lista_itens_descartados int not null,
   id_item              int
);

alter table lista_itens_descartados
   add primary key (id_lista_itens_descartados);

/*==============================================================*/
/* Table: lista_itens_doacao                                    */
/*==============================================================*/
create table lista_itens_doacao
(
   id_lista_itens_doacao int not null,
   id_item              int
);

alter table lista_itens_doacao
   add primary key (id_lista_itens_doacao);

alter table Favoritar add constraint FK_Pode foreign key (id_pessoa)
      references Pessoa (id_pessoa) on delete restrict on update restrict;

alter table Favoritar add constraint FK_Tem foreign key (id_parceiro)
      references Parceiro (id_parceiro) on delete restrict on update restrict;

alter table Mensagem add constraint FK_Pode foreign key (id_parceiro)
      references Parceiro (id_parceiro) on delete restrict on update restrict;

alter table Mensagem add constraint FK_Possui foreign key (id_usuario)
      references Pessoa_Fisica (id_usuario) on delete restrict on update restrict;

alter table Parceiro add constraint FK_E foreign key (id_juridica)
      references Pessoa_Juridica (id_juridica) on delete restrict on update restrict;

alter table Parceiro add constraint FK_Pode foreign key (id_ligacao_bairro)
      references ligacao_Bairro (id_ligacao_bairro) on delete restrict on update restrict;

alter table Parceiro add constraint FK_Pode foreign key (id_ligacao_intens_trabalhados)
      references ligacao_itens_trabalhados (id_ligacao_itens_trabalhados) on delete restrict on update restrict;

alter table Pessoa add constraint FK_Possui foreign key (id_contato)
      references Contato (id_contato) on delete restrict on update restrict;

alter table Pessoa add constraint FK_Possui foreign key (id_endereco)
      references Endereco (id_endereco) on delete restrict on update restrict;

alter table Pessoa_Fisica add constraint FK_E foreign key (id_pessoa)
      references Pessoa (id_pessoa) on delete restrict on update restrict;

alter table Pessoa_Juridica add constraint FK_E foreign key (id_pessoa)
      references Pessoa (id_pessoa) on delete restrict on update restrict;

alter table acao_descarte add constraint FK_Pode foreign key (id_parceiro)
      references Parceiro (id_parceiro) on delete restrict on update restrict;

alter table acao_descarte add constraint FK_Pode foreign key (id_pessoa)
      references Pessoa (id_pessoa) on delete restrict on update restrict;

alter table acao_descarte add constraint FK_Pode foreign key (id_lista_itens_descartados)
      references lista_itens_descartados (id_lista_itens_descartados) on delete restrict on update restrict;

alter table acao_doar add constraint FK_Pode foreign key (id_parceiro)
      references Parceiro (id_parceiro) on delete restrict on update restrict;

alter table acao_doar add constraint FK_Pode foreign key (id_pessoa)
      references Pessoa (id_pessoa) on delete restrict on update restrict;

alter table acao_doar add constraint FK_Pode foreign key (id_lista_itens_doacao)
      references lista_itens_doacao (id_lista_itens_doacao) on delete restrict on update restrict;

alter table ligacao_Bairro add constraint FK_Pode foreign key (id_bairro)
      references Bairro (id_bairro) on delete restrict on update restrict;

alter table ligacao_itens_trabalhados add constraint FK_Pode foreign key (id_item)
      references item (id_item) on delete restrict on update restrict;

alter table lista_itens_descartados add constraint FK_Pode foreign key (id_item)
      references item (id_item) on delete restrict on update restrict;

alter table lista_itens_doacao add constraint FK_Pode foreign key (id_item)
      references item (id_item) on delete restrict on update restrict;

