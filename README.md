# 📝 Aplicación de Gestión de Tareas Pendientes

## 🚀 Objetivo

Gestiona tus tareas pendientes de forma sencilla y eficiente. Crea, lista y actualiza tareas con distintos estados para mejorar el seguimiento y la colaboración en tu equipo.

---

## 📋 Funcionalidades

- ➕ **Crear tareas**
- 📄 **Listar tareas**
- 🔄 **Actualizar estado de tareas**

### Estados disponibles

| Estado             | Descripción                        |
|--------------------|------------------------------------|
| ✅ Completada      | La tarea ha sido finalizada        |
| 📝 Documentada     | La tarea cuenta con documentación  |
| 👥 Revisada por pares | La tarea fue revisada por otro miembro |

---
## 🛠️ Tecnologías utilizadas

- ![Java](https://img.shields.io/badge/Java-21-blue)
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-brightgreen)
- ![H2 Database](https://img.shields.io/badge/H2-in--memory%20DB-lightgrey)
- ![JPA](https://img.shields.io/badge/JPA-Spring%20Data-yellow)
- ![Spring Web](https://img.shields.io/badge/Spring%20Boot%20Starter%20Web-web-blueviolet)
- ![Spring Test](https://img.shields.io/badge/Spring%20Boot%20Starter%20Test-test-orange)

---

## Estructura del Proyecto

```
.
├── HELP.md
├── mvnw / mvnw.cmd
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── todo/
│   │   │           └── app/
│   │   │               ├── TodoAppApplication.java
│   │   │               ├── controllers/
│   │   │               │   └── TaskController.java
│   │   │               ├── entities/
│   │   │               │   └── Task.java
│   │   │               ├── enumerator/
│   │   │               │   └── TaskStatus.java
│   │   │               ├── exceptionHandler/
│   │   │               │   ├── GlobalExceptionHandler.java
│   │   │               │   ├── dto/
│   │   │               │   │   └── GlobalErrorResponseDTO.java
│   │   │               │   └── exception/
│   │   │               │       ├── StatusNotFoundException.java
│   │   │               │       └── TaskNotFoundException.java
│   │   │               ├── respository/
│   │   │               │   └── TaskRepository.java
│   │   │               └── service/
│   │   │                   ├── TaskService.java
│   │   │                   └── impl/
│   │   │                       └── TaskServiceImpl.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
│       └── java/
│           └── com/
│               └── todo/
│                   └── app/
│                       └── TodoAppApplicationTests.java
└── target/
```

## Descripción de Carpetas y Archivos Principales

- **controllers/**: Controladores REST para la gestión de tareas.
- **entities/**: Entidades JPA que representan los modelos de datos.
- **enumerator/**: Enumeraciones utilizadas en la aplicación (por ejemplo, estados de las tareas).
- **exceptionHandler/**: Manejo global de excepciones y DTOs de error.
- **respository/**: Interfaces de acceso a datos (repositorios Spring Data JPA).
- **service/**: Lógica de negocio y servicios de la aplicación.
- **resources/**: Archivos de configuración y recursos estáticos.
- **test/**: Pruebas unitarias y de integración.
- 
```

La aplicación estará disponible en `http://localhost:8080`.

1. Clona el repositorio:
   git clone https://github.com/tu-usuario/tu-repo.git
