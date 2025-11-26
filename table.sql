CREATE TABLE patients(
patientId SERIAL PRIMARY KEY,
patientFirstName TEXT,
patientLastName TEXT,
patientDOB DATE
);

CREATE TABLE drugs(
drugId SERIAL PRIMARY KEY,
drugName TEXT,
drug_cost DOUBLE PRECISION,
dosage DOUBLE PRECISION
);