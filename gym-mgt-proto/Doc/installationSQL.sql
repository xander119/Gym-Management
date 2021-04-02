create table customer_membership
(
    customer_membership_id bigint auto_increment
        primary key,
    membership_id bigint not null,
    customer_id bigint not null
);

create table gm_permission
(
    permission_id bigint auto_increment
        primary key,
    name varchar(255) not null,
    type varchar(255) not null,
    uri varchar(255) null
);

create table skill_static_data
(
    skill_static_data_id bigint auto_increment
        primary key,
    skill_id bigint not null,
    static_data_id bigint not null
);

create table static_data
(
    static_data_id bigint auto_increment
        primary key,
    code varchar(255) not null,
    name varchar(255) not null,
    type_code varchar(255) not null,
    active tinyint(1) default 1 null,
    description varchar(255) null,
    constraint static_data_code_uindex
        unique (code),
    constraint static_data_name_uindex
        unique (name)
);

create table product
(
    product_id bigint auto_increment
        primary key,
    name varchar(255) not null,
    cost double not null,
    product_type_id bigint null,
    constraint Product_name_uindex
        unique (name),
    constraint product__static_data_fk
        foreign key (product_type_id) references static_data (static_data_id)
);

create table membership
(
    membership_id bigint auto_increment
        primary key,
    membership_type_id bigint not null,
    start_date datetime not null,
    end_date datetime null,
    membership_product bigint null,
    constraint membership_product_fk
        foreign key (membership_product) references product (product_id),
    constraint membership_type_fk
        foreign key (membership_type_id) references static_data (static_data_id)
);

create table role
(
    role_id bigint auto_increment
        primary key,
    name varchar(255) null,
    role_type_id bigint not null,
    active tinyint(1) default 1 null,
    constraint role_static_data_fk
        foreign key (role_type_id) references static_data (static_data_id)
);

create table role_permission
(
    role_permission_id bigint auto_increment
        primary key,
    permission_id bigint null,
    role_id bigint null,
    constraint role_permission_permission_fk
        foreign key (permission_id) references gm_permission (permission_id),
    constraint role_permission_role_fk
        foreign key (role_id) references role (role_id)
);

create table security_user
(
    security_user_id bigint auto_increment
        primary key,
    username varchar(255) not null,
    password varchar(255) not null,
    email varchar(255) not null,
    date_of_birth date null,
    phone int not null,
    gender bigint null,
    role bigint null,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    constraint security_user_username_uindex
        unique (username),
    constraint security_user_gender_fk
        foreign key (gender) references static_data (static_data_id),
    constraint security_user_roles_fk
        foreign key (role) references static_data (static_data_id)
);

create table customer
(
    customer_id bigint auto_increment
        primary key,
    security_user bigint not null,
    constraint customer_security_user_fk
        foreign key (security_user) references security_user (security_user_id)
)
    comment '客户';

create table security_user_permission
(
    security_user_permission_id bigint auto_increment
        primary key,
    security_user_id bigint null,
    permission_id bigint null,
    constraint security_user_permission_permission_fk
        foreign key (permission_id) references gm_permission (permission_id),
    constraint security_user_permission_security_user_fk
        foreign key (security_user_id) references security_user (security_user_id)
);

create table security_user_role
(
    security_user_role_id bigint auto_increment
        primary key,
    role_id bigint not null,
    security_user_id bigint not null,
    constraint security_user_role_role_fk
        foreign key (role_id) references role (role_id)
            on update cascade on delete cascade,
    constraint security_user_role_security_user_security_user_id_fk
        foreign key (security_user_id) references security_user (security_user_id)
);

create table skill
(
    skill_id bigint auto_increment
        primary key,
    name varchar(255) not null,
    code varchar(255) not null,
    skill_type_id bigint null,
    constraint skill_type_fk
        foreign key (skill_type_id) references static_data (static_data_id)
);
create table trainer
(
    trainer_id bigint auto_increment
        primary key,
    experience int not null,
    security_user_id bigint null,
    constraint trainer_security_user_fk
        foreign key (security_user_id) references security_user (security_user_id)
);

create table trainer_skill
(
    trainer_skill_id bigint auto_increment
        primary key,
    trainer_id bigint not null,
    skill_id bigint not null
);


alter table gm_permission
    add value varchar(255) null;
