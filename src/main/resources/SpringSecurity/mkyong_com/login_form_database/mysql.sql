
CREATE  TABLE users_2_mkyong_com (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));

CREATE TABLE user_roles_2_mkyong_com (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role_2_mkyong_com (role,username),
  KEY fk_username_idx_2_mkyong_com (username),
  CONSTRAINT fk_username_2_mkyong_com FOREIGN KEY (username) REFERENCES users_2_mkyong_com (username));

INSERT INTO users_2_mkyong_com(username,password,enabled)
VALUES ('mkyong','123456', true);
INSERT INTO users_2_mkyong_com(username,password,enabled)
VALUES ('alex','123456', true);

INSERT INTO user_roles_2_mkyong_com (username, role)
VALUES ('mkyong', 'ROLE_USER');
INSERT INTO user_roles_2_mkyong_com (username, role)
VALUES ('mkyong', 'ROLE_ADMIN');
INSERT INTO user_roles_2_mkyong_com (username, role)
VALUES ('alex', 'ROLE_USER');