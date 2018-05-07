
CREATE  TABLE users_mkyong_com (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(45) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  accountNonExpired TINYINT NOT NULL DEFAULT 1 ,
  accountNonLocked TINYINT NOT NULL DEFAULT 1 ,
  credentialsNonExpired TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (username));

CREATE TABLE user_roles_mkyong_com (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (role,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users_mkyong_com (username));

CREATE TABLE user_attempts_mkyong_com (
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  attempts varchar(45) NOT NULL,
  lastModified datetime NOT NULL,
  PRIMARY KEY (id)
);
  
INSERT INTO users_mkyong_com(username,password,enabled)
VALUES ('mkyong','123456', true);
INSERT INTO users_mkyong_com(username,password,enabled)
VALUES ('alex','123456', true);

INSERT INTO user_roles_mkyong_com (username, role)
VALUES ('mkyong', 'ROLE_USER');
INSERT INTO user_roles_mkyong_com (username, role)
VALUES ('mkyong', 'ROLE_ADMIN');
INSERT INTO user_roles_mkyong_com (username, role)
VALUES ('alex', 'ROLE_USER');
    