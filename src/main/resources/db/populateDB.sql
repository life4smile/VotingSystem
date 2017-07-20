DELETE FROM user_roles;
DELETE FROM restaurants;
DELETE FROM menus;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO users (name, email, password) VALUES
  ('Mike', 'mike@gmail.com', 'password'),
  ('John', 'john@gmail.com', 'password'),
  ('Nick', 'nick@gmail.com', 'password');

INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_ADMIN', 100000),
  ('ROLE_USER', 100001),
  ('ROLE_USER', 100002),
  ('ROLE_USER', 100003);

INSERT INTO restaurants (name, address) VALUES
  ('McDonald’s', 'Taganskaya 2'),
  ('Teremok', 'Taganskaya 3');

INSERT INTO menus (date_time, description, price, restaurant_id) VALUES
  ('2017-06-05 00:00:00', 'BigMac, CocaCola', 500, 100004),
  ('2017-06-05 00:00:00', 'Borscht, Fruit Water', 1000, 100005);

INSERT INTO likes (user_id, restaurant_id, date_time) VALUES
  (100001, 100005, '2017-06-05 10:00:00'),
  (100002, 100005, '2017-06-05 10:30:00'),
  (100003, 100004, '2017-06-05 10:45:00');

