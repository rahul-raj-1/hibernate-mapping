CREATE TABLE IF NOT EXISTS customer (

	id_col int(11) NOT NULL AUTO_INCREMENT,

	name VARCHAR(255) NOT NULL UNIQUE
	
);


CREATE TABLE IF NOT EXISTS student (
       id int(11) not null AUTO_INCREMENT,
    --    created_at DATETIME(6),
        first_name VARCHAR(255),
        last_name VARCHAR(255)
        );