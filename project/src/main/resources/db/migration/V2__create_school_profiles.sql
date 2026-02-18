CREATE TABLE school_profiles (
    id BIGINT PRIMARY KEY,
    school_name VARCHAR(150) NOT NULL,
    city VARCHAR(120) NOT NULL,
    contact_phone VARCHAR(30) NOT NULL,

    CONSTRAINT fk_school_user
    FOREIGN KEY (id)
    REFERENCES user(id)
    ON DELETE CASCADE
);