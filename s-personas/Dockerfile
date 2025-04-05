FROM icr.io/appcafe/open-liberty:kernel-slim-java17-openj9-ubi

# Copiar configuración del servidor (server.xml y demás)
COPY --chown=1001:0 /src/main/liberty/config /config

# Ejecutar instalación de features declarados en el server.xml
RUN features.sh

# Copiar WAR a Open Liberty
COPY --chown=1001:0 target/*.war /config/apps

# Copiar el driver JDBC a /opt/libs/
# Asegúrate de tener el archivo .jar en src/main/liberty/libs/postgresql-42.7.3.jar
COPY --chown=1001:0 src/main/liberty/libs/postgresql-42.7.3.jar /opt/libs/

# Configurar el servidor
RUN configure.sh
