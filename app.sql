CREATE TABLE courses(
   course_id SERIAL PRIMARY KEY,
   course_name VARCHAR NOT NULL,
   course_description VARCHAR
);

CREATE TABLE professors(
   professor_id SERIAL PRIMARY KEY,
   professor_name VARCHAR NOT NULL
);

CREATE TABLE students(
   student_id SERIAL PRIMARY KEY,
   student_name VARCHAR NOT NULL
);

CREATE TABLE professor_course_map(
   professor_course_map_id SERIAL PRIMARY KEY,
   professor_id NUMERIC NOT NULL,
   course_id NUMERIC NOT NULL
);

CREATE TABLE student_course_map(
   student_course_map_id SERIAL PRIMARY KEY,
   student_id NUMERIC NOT NULL,
   course_id NUMERIC NOT NULL
);