FROM postgres:16.0
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD postgres
ENV POSTGRES_DB postgres
EXPOSE 5432
ADD CreateDB.sql  /docker-entrypoint-initdb.d/
CMD ["postgres"]