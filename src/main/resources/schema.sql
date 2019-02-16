

CREATE TABLE IF NOT EXISTS customer_detail (

        cust_det_id int(11) not null AUTO_INCREMENT,

    --    created_at DATETIME(6),

        first_name VARCHAR(255),

        last_name VARCHAR(255),

	constraint pk_customer_detail primary key(cust_det_id)

);

CREATE TABLE IF NOT EXISTS customer (

	id_col int(11) NOT NULL AUTO_INCREMENT,

	name VARCHAR(255) NOT NULL UNIQUE,

		constraint pk_customer primary key(id_col)

	constraint fk_customer_detail foreign key(id_col) references customer_detail(cust_det_id),


);