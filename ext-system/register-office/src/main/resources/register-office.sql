DROP TABLE IF EXISTS person;

CREATE TABLE ro_person (
    person_id SERIAL,
    first_name varchar(100),
    last_name varchar(100),
    patronymic varchar(100),
    date_birth date not null,
    PRIMARY KEY (person_id)
);

CREATE TABLE ro_passport (
    passport_id SERIAL,
    person_id integer not null,
    seria varchar(10) not null,
    number varchar(10) not null,
    date_issue date not null,
    issue_department varchar(200),
    PRIMARY KEY (passport_id)
    FOREIGN KEY (person_id) REFERENCES ro_person(person_id) ON DELETE RESTRICT
)