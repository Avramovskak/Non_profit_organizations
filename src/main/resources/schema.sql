CREATE TABLE IF NOT EXISTS campaign (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    campaign_name VARCHAR(255) NOT NULL,
    campaign_description TEXT,
    campaign_location VARCHAR(255),
    campaign_city VARCHAR(255),
    campaign_country VARCHAR(255),
    campaign_goal_amount DOUBLE
);

CREATE TABLE IF NOT EXISTS donation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    donor_name VARCHAR(255) NOT NULL,
    donor_email VARCHAR(255),
    donor_phone VARCHAR(255),
    donor_address VARCHAR(255),
    donor_city VARCHAR(255),
    donor_country VARCHAR(255),
    donor_zip VARCHAR(255),
    donation_amount DOUBLE,
    donation_date TIMESTAMP,
    donation_received_date TIMESTAMP,
    donation_purpose VARCHAR(255),
    donation_receipt VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS donor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    donor_name VARCHAR(255) NOT NULL,
    donor_email VARCHAR(255),
    donor_phone VARCHAR(255),
    donor_address VARCHAR(255),
    donor_city VARCHAR(255),
    donor_country VARCHAR(255),
    donor_description TEXT,
    donor_amount DOUBLE
);

CREATE TABLE IF NOT EXISTS event (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    event_name VARCHAR(255) NOT NULL,
    event_description TEXT,
    event_location VARCHAR(255),
    event_city VARCHAR(255),
    event_country VARCHAR(255),
    event_date TIMESTAMP,
    event_end_date TIMESTAMP
);
