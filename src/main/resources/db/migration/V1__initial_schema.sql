-- notification preference table
CREATE TABLE IF NOT EXISTS  notification_preferences (
                       user_id VARCHAR(100) PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       preferences VARCHAR(255) NOT NULL
);
