drop table if exists cheque;

create table cheque (
    c_id int auto_increment primary key,
    c_datetime timestamp not null,
    c_total_sum int not null,
    c_pos_cnt int not null
);

insert into cheque
(c_datetime, c_total_sum, c_pos_cnt)
values
    ({ts '2020-09-01 09:00:05.00'}, 250.00, 5),
    ({ts '2020-10-17 18:15:51.69'}, 1089.00, 1),
    ({ts '2012-10-18 19:16:22.81'}, 18000.00, 1);