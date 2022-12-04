INSERT INTO account_details (address, age, city, country, name, postal_code, state)
VALUES ('262  Lochmere Lane', 35, 'LOUISVILLE', 'United States', 'Josie D Story', '40289', 'Kentucky'),
       ('2903  Jarvis Street', 28, 'Buffalo', 'United States', 'Bernard P Fendley', '14211', 'New York'),
       ('4161  Alfred Drive', 47, 'Brooklyn', 'United States', 'Faith R Parsons', '11226', 'New York'),
       ('2587  Logan Lane', 47, 'HOLTSVILLE', 'United States', 'Johnnie J Cannon', '00544', 'New York'),
       ('698  Clark Street', 47, 'Brentwood', 'United States', 'Lawrence E Folkerts', '11717', 'New York');

INSERT INTO user_account (email, password, role, username, account_details_id)
VALUES ('josie_story@email.com', '123123123', 'USER', 'josieStory',
        (SELECT id from account_details WHERE name = 'Josie D Story')),
       ('bernard@email.com', '123123123', 'USER', 'bernard',
        (SELECT id from account_details WHERE name = 'Bernard P Fendley')),
       ('faith.p@email.com', '123123123', 'USER', 'faith',
        (SELECT id from account_details WHERE name = 'Faith R Parsons')),
       ('johnnie@email.com', '123123123', 'USER', 'johnnie',
        (SELECT id from account_details WHERE name = 'Johnnie J Cannon')),
       ('lawrence.f@email.com', '123123123', 'USER', 'lawrence.f',
        (SELECT id from account_details WHERE name = 'Lawrence E Folkerts'));