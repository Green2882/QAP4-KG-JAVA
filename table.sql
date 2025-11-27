CREATE TABLE patients(
patientId SERIAL PRIMARY KEY,
patientFirstName TEXT,
patientLastName TEXT,
patientDOB DATE
);

CREATE TABLE drugs(
drugId SERIAL PRIMARY KEY,
drugName TEXT,
drugCost DOUBLE PRECISION,
dosage DOUBLE PRECISION
);