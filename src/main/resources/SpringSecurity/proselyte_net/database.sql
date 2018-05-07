-- Table: users
CREATE TABLE users_proselyte_net (
  id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

-- Table: roles
CREATE TABLE roles_proselyte_net (
  id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB;

-- Table for mapping user and roles: user_roles
CREATE TABLE user_roles_proselyte_net (
  user_id INT NOT NULL,
  role_id INT NOT NULL,

  FOREIGN KEY (user_id) REFERENCES users_proselyte_net (id),
  FOREIGN KEY (role_id) REFERENCES roles_proselyte_net (id),

  UNIQUE (user_id, role_id)
)
  ENGINE = InnoDB;

-- Insert data

INSERT INTO users_proselyte_net VALUES (1, 'proselyte', '$2a$11$uSXS6rLJ91WjgOHhEGDx..VGs7MkKZV68Lv5r1uwFu7HgtRn3dcXG');

INSERT INTO roles_proselyte_net VALUES (1, 'ROLE_USER');
INSERT INTO roles_proselyte_net VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_roles_proselyte_nets VALUES (1, 2);