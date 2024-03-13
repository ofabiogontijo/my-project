create table account (
    id varchar(36) primary key,
    name varchar (100) not null,
    email varchar (50) not null,
    phone varchar (20) not null,
    document varchar(30) not null,

    create_user_id varchar(255) default null,
    create_user_ip varchar(255) default null,
    created_at     timestamp with time zone,
    last_user_id   varchar(255) default null,
    last_user_ip   varchar(255) default null,
    updated_at     timestamp with time zone,
)