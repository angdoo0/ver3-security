drop table if exists t1;

create table t1(
	id int,
    name varchar(10)
);

select * from t1;

#insert into t1 values(1, 'one');

drop table if exists user;

create table if not exists user(
	id bigint auto_increment not null comment '순번',
    username varchar(255) not null comment '아이디',
    password varchar(255) not null comment '비밀번호',
    phone varchar(255) not null comment '연락처',
    email varchar(255) comment '이메일',
    primary key(id)
);

#insert into user(username, password, phone, email) 
#values('우유', '{noop}1111', '010-1111-1111', 'akfuw@gmail.com' );