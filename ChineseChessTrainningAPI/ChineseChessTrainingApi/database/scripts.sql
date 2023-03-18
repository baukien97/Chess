-- drop database chinese_chess_training;
create database chinese_chess_training;
use chinese_chess_training;

create table tbl_piece(
	id bigInt not null primary key auto_increment,
    name nvarchar(20) not null,
    is_red bit
);

create table tbl_match(
	id bigInt not null primary key auto_increment,
    name nvarchar(1000) not null,
    match_id bigInt,
    foreign key (match_id) references tbl_match(id) on update cascade
);

--   drop table tbl_match_detail;
create table tbl_match_detail(
	match_id bigInt,
	turn bigInt not null,
    piece_id bigInt,
    current_col int,
    current_row int,
    next_col int,
    next_row int,
    primary key(match_id,turn),
    foreign key (match_id) references tbl_match(id) on update cascade,
    foreign key (piece_id) references tbl_piece(id) on update cascade
);

--------------------------------------------------------------
insert into tbl_piece values (1,'Tốt',1);
insert into tbl_piece values (2,'Tốt',1);
insert into tbl_piece values (3,'Tốt',1);
insert into tbl_piece values (4,'Tốt',1);
insert into tbl_piece values (5,'Tốt',1);
insert into tbl_piece values (6,'Pháo',1);
insert into tbl_piece values (7,'Pháo',1);
insert into tbl_piece values (8,'Xe',1);
insert into tbl_piece values (9,'Xe',1);
insert into tbl_piece values (10,'Mã',1);
insert into tbl_piece values (11,'Mã',1);
insert into tbl_piece values (12,'Tượng',1);
insert into tbl_piece values (13,'Tượng',1);
insert into tbl_piece values (14,'Sĩ',1);
insert into tbl_piece values (15,'Sĩ',1);
insert into tbl_piece values (16,'Tướng',1);
insert into tbl_piece values (17,'Tốt',0);
insert into tbl_piece values (18,'Tốt',0);
insert into tbl_piece values (19,'Tốt',0);
insert into tbl_piece values (20,'Tốt',0);
insert into tbl_piece values (21,'Tốt',0);
insert into tbl_piece values (22,'Pháo',0);
insert into tbl_piece values (23,'Pháo',0);
insert into tbl_piece values (24,'Xe',0);
insert into tbl_piece values (25,'Xe',0);
insert into tbl_piece values (26,'Mã',0);
insert into tbl_piece values (27,'Mã',0);
insert into tbl_piece values (28,'Tượng',0);
insert into tbl_piece values (29,'Tượng',0);
insert into tbl_piece values (30,'Sĩ',0);
insert into tbl_piece values (31,'Sĩ',0);
insert into tbl_piece values (32,'Tướng',0);
--------------------------------------------------------------
select * from tbl_piece;
--------------------------------------------------------------
insert into tbl_match values (1,'Tuyển tập pháo đầu',1);
insert into tbl_match values (2,'Tuyển tập bình phong mã',2);
insert into tbl_match values (3,'Tuyển tập Phi tượng',3);
insert into tbl_match values (4,'Thuận pháo',1);
insert into tbl_match values (5,'Nghịch pháo',1);
insert into tbl_match values (6,'Trận 1',4);
insert into tbl_match values (7,'Trận 1',5);
--------------------------------------------------------------
select * from tbl_match;
--------------------------------------------------------------
insert into tbl_match_detail values (6,1,6,8,8,5,8);
insert into tbl_match_detail values (6,2,23,8,3,5,3);
insert into tbl_match_detail values (6,3,10,8,10,7,8);
insert into tbl_match_detail values (6,4,27,8,1,7,3);
insert into tbl_match_detail values (6,5,8,9,10,9,9);
insert into tbl_match_detail values (6,6,25,9,1,8,1);
insert into tbl_match_detail values (6,7,8,9,9,4,9);
insert into tbl_match_detail values (6,8,25,8,1,8,7);
insert into tbl_match_detail values (6,9,8,4,9,4,2);
insert into tbl_match_detail values (6,10,26,2,1,1,3);
insert into tbl_match_detail values (6,11,9,1,10,1,9);
insert into tbl_match_detail values (6,12,22,2,3,2,10);
insert into tbl_match_detail values (6,13,7,2,8,2,3);
insert into tbl_match_detail values (6,14,25,8,7,8,3);
insert into tbl_match_detail values (6,15,8,4,2,7,2);
insert into tbl_match_detail values (6,16,24,1,1,2,1);
insert into tbl_match_detail values (6,17,7,2,3,7,3);
insert into tbl_match_detail values (6,18,29,7,1,9,3);
insert into tbl_match_detail values (6,19,6,5,8,5,4);
insert into tbl_match_detail values (6,20,31,6,1,5,2);
insert into tbl_match_detail values (6,21,7,7,3,9,3);
insert into tbl_match_detail values (6,22,25,8,3,8,1);
insert into tbl_match_detail values (6,23,9,1,9,8,9);
insert into tbl_match_detail values (6,24,25,8,1,6,1);
insert into tbl_match_detail values (6,25,8,7,2,8,2);
insert into tbl_match_detail values (6,26,24,2,1,2,5);
insert into tbl_match_detail values (6,27,7,9,3,9,1);
insert into tbl_match_detail values (6,28,25,6,1,9,1);
insert into tbl_match_detail values (6,29,8,8,2,8,1);
insert into tbl_match_detail values (6,30,25,9,1,8,1);
insert into tbl_match_detail values (6,31,9,8,9,8,1);
-- /////////////////////////////////////////////////////////
insert into tbl_match_detail values (7,1,6,8,8,5,8);
insert into tbl_match_detail values (7,2,22,2,3,5,31);
insert into tbl_match_detail values (7,3,10,8,10,7,8);
insert into tbl_match_detail values (7,4,27,8,1,9,3);
insert into tbl_match_detail values (7,5,8,9,10,8,10);
insert into tbl_match_detail values (7,6,25,9,1,8,1);
insert into tbl_match_detail values (7,7,11,2,10,1,8);
insert into tbl_match_detail values (7,8,26,2,1,3,3);
insert into tbl_match_detail values (7,9,9,1,10,2,10);
insert into tbl_match_detail values (7,10,24,1,1,2,1);
insert into tbl_match_detail values (7,11,5,1,7,1,6);
insert into tbl_match_detail values (7,12,21,9,4,9,5);
insert into tbl_match_detail values (7,13,8,8,10,8,6);
insert into tbl_match_detail values (7,14,24,2,1,2,5);
insert into tbl_match_detail values (7,15,11,1,8,2,6);
insert into tbl_match_detail values (7,16,24,2,5,6,5);
insert into tbl_match_detail values (7,17,8,8,6,4,6);
insert into tbl_match_detail values (7,18,23,8,3,8,10);
insert into tbl_match_detail values (7,19,10,7,8,8,10);
insert into tbl_match_detail values (7,20,25,8,1,8,9);
insert into tbl_match_detail values (7,21,11,2,6,4,5);
insert into tbl_match_detail values (7,22,22,5,3,8,3);
insert into tbl_match_detail values (7,23,11,4,5,3,3);
insert into tbl_match_detail values (7,24,24,6,5,6,10);
insert into tbl_match_detail values (7,25,16,5,10,6,10);
insert into tbl_match_detail values (7,26,22,8,3,8,10);
--------------------------------------------------------------
select * from tbl_match_detail;

---------------------------------------------------------------------
