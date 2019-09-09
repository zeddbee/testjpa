CREATE TABLE MODEL
(
	ID NUMBER(19) NOT NULL,
	VAL VARCHAR2(50) NOT NULL,
);

create table aging_color (
aging_color_id bigint not null, 
created_by varchar(255), 
created_on date, 
age_color_name varchar(255), 
age_description varchar(255), 
age_level varchar(255), primary key (aging_color_id)
);
create table aging_start_date (
aging_start_date_id bigint not null, 
created_by varchar(255), 
created_on date, 
existing_comment varchar(255), 
start_date_desc varchar(255), 
start_date varchar(255), 
status varchar(255), primary key (aging_start_date_id)
);