INSERT INTO t_users (id_col, user_name ,user_email ,password,is_active) VALUES

(1, 'Rahul' ,'rahul.raj@gmail.com','$2a$10$5xzBOVMvLje0N2SHjkiI5uqkmvDW8AJ1WQ/ct1EZCDCD/4EhS1ef.',1),-- pasword is asd
(2, 'Ronaldo' ,'cr7@gmail.com','pass',1),
(3, 'Lio Messi' ,'messi@gmail.com','pass',1),
(4, 'Ronaldo Brazil' ,'r9@gmail.com','pass',1),
(5, 'Pele' ,'pele@gmail.com','pass',0);



INSERT INTO t_roles (role_id,role_name,is_role_active) VALUES
(1,'READ',1),
(2,'WRITE',1),
(3,'READ_AND_WRITE',1);

INSERT INTO t_map_user_roles (map_id,user_id,role_id,is_active) VALUES
(1,1,1,1),
(2,1,2,1),
(3,1,3,1),
(4,2,1,1),
(5,3,1,1),
(6,4,1,1),
(7,5,1,1);