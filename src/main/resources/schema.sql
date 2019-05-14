CREATE TABLE IF NOT EXISTS t_users (

	id_col int(11) NOT NULL AUTO_INCREMENT,
    user_name VARCHAR(255) NOT NULL UNIQUE,
	user_email VARCHAR(255) ,
    password VARCHAR(200) ,
    is_active int(1),
     constraint pk_user_id primary key(id_col)
		);


CREATE TABLE IF NOT EXISTS t_roles (

        role_id int(11) not null AUTO_INCREMENT,
		role_name VARCHAR(255),
		is_role_active int(1),
      constraint pk_role_id primary key(role_id)
	 );

	 
	 CREATE TABLE IF NOT EXISTS t_map_user_roles (
        
	    map_id  int(10),
         user_id  int(11) ,
		role_id int(11),
		is_active int(1),
      constraint pk_map_id primary key(map_id)
     -- foreign key (user_id) references t_users(id_col)

	 );



