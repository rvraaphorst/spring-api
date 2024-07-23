INSERT INTO store (id, name, api_key) VALUES (1, 'store-1', '1-AB');
INSERT INTO store (id, name, api_key) VALUES (2, 'store-2', '2-CD');
INSERT INTO store (id, name, api_key) VALUES (3, 'store-3', '3-EF');

SELECT setval('"store_id_seq"', (SELECT max("id") FROM "store"));
