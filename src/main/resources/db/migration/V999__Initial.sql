INSERT INTO store (id, name, api_key) VALUES
	(1, 'store-1', '1-AB'),
	(2, 'store-2', '2-CD'),
	(3, 'store-3', '3-EF');

INSERT INTO "store_platform_connection" (id, store_id, platform_type) VALUES
	(1, 1, 'META'),
	(2, 1, 'PINTEREST'),
	(3, 2, 'META'),
	(4, 3, 'PINTEREST'),
	(5, 3, 'TIKTOK');


INSERT INTO "connection_credentials" (id, store_platform_connection_id, pixel_access_token, pixel_id) VALUES
	(1, 1, 'ACCES-TOKEN-1', 'PIXEL-ID-1'),
	(2, 2, 'ACCES-TOKEN-2', 'PIXEL-ID-2'),
	(3, 3, 'ACCES-TOKEN-3', 'PIXEL-ID-3'),
	(4, 4, 'ACCES-TOKEN-4', 'PIXEL-ID-4'),
	(5, 5, 'ACCES-TOKEN-5', 'PIXEL-ID-5');


SELECT setval('"store_seq"', (SELECT max("id") FROM "store"));
SELECT setval('"store_platform_connection_seq"', (SELECT max("id") FROM "store_platform_connection"));
SELECT setval('"connection_credentials_seq"', (SELECT max("id") FROM "connection_credentials"));
