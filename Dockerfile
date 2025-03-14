# Используем официальный образ OpenJDK 17
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем JAR-файл приложения
COPY app.jar app.jar

# Команда для запуска приложения
CMD ["java", "-jar", "app.jar"]