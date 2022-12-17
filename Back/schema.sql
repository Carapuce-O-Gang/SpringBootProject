CREATE DATABASE `auth-service`;
CREATE DATABASE `proposals-service`;

CREATE USER 'auth'@'localhost' IDENTIFIED BY 'auth';
CREATE USER 'auth'@'%' IDENTIFIED BY 'auth';
GRANT ALL PRIVILEGES ON `auth-service`.* TO 'auth'@'localhost';
GRANT ALL PRIVILEGES ON `auth-service`.* TO 'auth'@'%';

CREATE USER 'proposals'@'localhost' IDENTIFIED BY 'proposals';
CREATE USER 'proposals'@'%' IDENTIFIED BY 'proposals';
GRANT ALL PRIVILEGES ON `proposals-service`.* TO 'proposals'@'localhost';
GRANT ALL PRIVILEGES ON `proposals-service`.* TO 'proposals'@'%';

FLUSH PRIVILEGES;