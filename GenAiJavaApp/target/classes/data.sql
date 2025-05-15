CREATE TABLE policy (
    policy_id BIGINT PRIMARY KEY,
    policy_name VARCHAR(255),
    policy_type VARCHAR(255),
    premium_amount DOUBLE
);

INSERT INTO policy (policy_id, policy_name, policy_type, premium_amount) VALUES (1111, 'Health Insurance', 'Health', 5000.00);
INSERT INTO policy (policy_id, policy_name, policy_type, premium_amount) VALUES (2222, 'Car Insurance', 'Vehicle', 3000.00);