CREATE DATABASE if not exists `match_maker` ;
USE `match_maker`;

CREATE TABLE IF NOT EXISTS `match_maker_requests` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `request_id` varchar(500) NOT NULL,
    `user_id` varchar(255) NOT NULL,
    `game_preferences_id` varchar(255) NOT NULL,
    `requested_at` datetime NOT NULL,
    `status` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `game_preferences` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `current_rating` int NOT NULL,
    `min_rating` int NOT NULL,
    `max_rating` int NOT NULL,
    `color` varchar(255) NOT NULL,
    `game_type_id` int NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `game_type` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `game_format` varchar(255) NOT NULL,
    `fixed_duration` int NOT NULL,
    `incremental_duration` int NOT NULL,
    `status` int NOT NULL,
    `created_at` datetime NOT NULL,
    `updated_at` datetime NOT NULL,
    `created_by` varchar(255) NOT NULL,
    `updated_by` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `game_type` (`id`, `game_format`, `fixed_duration`, `incremental_duration`, `status`, `created_at`, `updated_at`, `created_by`, `updated_by`)
VALUES
    (1, 'RAPID', 600, 5, 1, NOW(), NOW(), 'sys', 'sys'),
    (2, 'BULLET', 60, 2, 1, NOW(), NOW(), 'sys', 'sys'),
    (3, 'BULLET', 120, 0, 1, NOW(), NOW(), 'sys', 'sys'),
    (4, 'BULLET', 180, 0, 1, NOW(), NOW(), 'sys', 'sys'),
    (5, 'STANDARD', 3600, 0, 1, NOW(), NOW(), 'sys', 'sys');