
CREATE TABLE "store" (
	id         BIGSERIAL PRIMARY KEY,
	name       CHARACTER VARYING(20) NOT NULL,
	api_key    CHARACTER VARYING(20) NOT NULL
);

CREATE UNIQUE INDEX "unq_store_api_key" ON "store"(api_key);


CREATE TABLE "store_platform_connection" (
	id         		BIGSERIAL PRIMARY KEY,
	store_id       	BIGINT NOT NULL,
	platform_type   CHARACTER VARYING(10) NOT NULL
);

ALTER TABLE ONLY "store_platform_connection"
	ADD CONSTRAINT "fk_store_platform_connection_store" FOREIGN KEY ("store_id") REFERENCES "store"(id);


CREATE TABLE "connection_credentials" (
	id         			BIGSERIAL PRIMARY KEY,
	store_platform_connection_id   	BIGINT NOT NULL,
	pixel_id    		CHARACTER VARYING(36) NOT NULL,
	pixel_access_token 	CHARACTER VARYING(36) NOT NULL
);

ALTER TABLE ONLY "connection_credentials"
	ADD CONSTRAINT "fk_connection_credentials_store_platform_connection" FOREIGN KEY ("store_platform_connection_id") REFERENCES "store_platform_connection"(id);


CREATE TABLE "order" (
	id         	BIGSERIAL PRIMARY KEY,
	given_id   	CHARACTER VARYING(20) NOT NULL,
	price    	NUMERIC(10,2) NOT NULL,
	timestamp 	TIMESTAMPTZ NOT NULL DEFAULT now()
);
