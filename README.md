
# ForoHub System 
ForoHub es una API REST creada con fines educativos. El sistema puede ser utilizado por los estudiantes de una carrera o curso para exponer algún problema de carácter educativo,
el cual puede ser respondido por otro usuario. Esto es posible mediante la creación de un nuevo tópico o tema de estudio, donde los demás usuarios podrán ver dicho tópico y contestarlo,
aportando así a una colaboración colectiva.

## Características 
**Gestión de Usuarios:** Autenticación y autorización con JWT.

**Gestión de Foros:** Creación y visualización de temas y respuestas.

**Gestión de Cursos:** Asociación de cursos con temas y categorías.

**Seguridad:** Implementación de roles y permisos con Spring Security.

## Arquitectura del Sistema El proyecto está diseñado con una arquitectura por capas: 
**Capa API:** Contiene los controladores REST y configuraciones de seguridad.

**Capa de Dominio:** Define las entidades, repositorios y DTOs.

**Capa de Infraestructura:** Incluye configuración de base de datos y manejo de errores.

## Tecnologías Utilizadas 
**Lenguaje:** Java 17

**Framework Principal:** Spring Boot

**Seguridad:** Spring Security, JWT

**Acceso a Datos:** Hibernate Spring Data JPA

**Base de Datos:** PostgreSql

## Configuración e Instalación 

### Prerrequisitos 
JDK 17

Maven 3.8+

PostgreSql

### Pasos 
#### Clonar el repositorio: 

```sh git clone https://github.com/adonayChavez/proyecto-foro-hub```
```cd forohub```

#### Configurar la base de datos: actualizar las credenciales en el archivo application.properties:

```spring.datasource.url=jdbc:mysql://localhost:8080/forohub```
```spring.datasource.username=tu_usuario spring.datasource.password=tu_contraseña```

#### Compilar y ejecuatr la aplicaccion:

```mvn clean install mvn spring-boot:run```

## Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

¡Gracias por usar ForoHub! Si tienes preguntas, no dudes en abrir un issue o contactarnos directamente.
