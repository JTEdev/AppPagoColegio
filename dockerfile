# Usamos una imagen de Java con JDK 17
FROM openjdk:17-jdk-slim

# Crea un directorio para el app
WORKDIR /app

# Copia el archivo JAR del backend al contenedor
COPY target/*.jar app.jar

# Expone el puerto 8080
EXPOSE 8080

# Comando para ejecutar el JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
