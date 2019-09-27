GraalVM demo modified from Quarkus Hibernate Panache.

Modified a few things:
- Moved from PostgreSQL to MySQL database.
- Altered the Fruit data structure.
- Added a few services e.g. search by Fruit name and Country.

To get started, do create a database named "qna" (you can modify the database name from application.properties) on MySQL.
And then execute the SQL file found under src/main/resources/import.sql to initialized some contents and create a Fruit table.

Package the project using "mvn package".

The project has been tested with:
- GraalVM Enterprise Edition v19.2
- Quarkus v0.23.0

