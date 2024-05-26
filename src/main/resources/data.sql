INSERT INTO campaign (campaign_name, campaign_description, campaign_location, campaign_city, campaign_country, campaign_goal_amount)
VALUES ('Clean Water Initiative', 'Providing clean water to rural areas', 'Location A', 'City A', 'Country A', 50000);

INSERT INTO donor (donor_name, donor_email, donor_phone, donor_address, donor_city, donor_country, donor_description, donor_amount)
VALUES ('John Doe', 'johndoe@example.com', '1234567890', '123 Elm St', 'Springfield', 'USA', 'Regular donor', 1000);

INSERT INTO donation (donor_name, donor_email, donor_phone, donor_address, donor_city, donor_country, donor_zip, donation_amount, donation_date, donation_received_date, donation_purpose, donation_receipt)
VALUES ('John Doe', 'johndoe@example.com', '1234567890', '123 Elm St', 'Springfield', 'USA', '12345', 500, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Clean Water Initiative', 'Receipt001');

INSERT INTO event (event_name, event_description, event_location, event_city, event_country, event_date, event_end_date)
VALUES ('Charity Gala', 'Annual fundraising gala', 'Grand Hall', 'Metropolis', 'USA', '2024-06-01 19:00:00', '2024-06-01 23:00:00');