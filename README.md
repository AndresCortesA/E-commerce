# Catálogo de Servicios

Este documento describe los servicios creados y sus funcionalidades en el proyecto de E-commerce.

## Servicios Actuales

### eureka-service
- **Descripción**: Servicio de descubrimiento que permite a otros servicios encontrar y comunicarse entre sí.
- **Funcionalidad**: Registro y descubrimiento de servicios.

### user-service
- **Descripción**: Servicio de gestión de usuarios.
- **Funcionalidad**: Manejo de la autenticación, registro y perfil de los usuarios.
- **Endpoints**:
    - **GET /api/users**: Listar todos los usuarios.
    - **GET /api/users/{id}**: Obtener un usuario por ID.
    - **POST /api/users**: Crear un nuevo usuario (envía un JSON en el cuerpo de la solicitud).
    - **PUT /api/users/{id}**: Actualizar un usuario existente.
    - **DELETE /api/users/{id}**: Eliminar un usuario.

## Servicios en Desarrollo

### catalog-service
- **Descripción**: Gestor de productos.
- **Funcionalidad**: Administración de productos, incluyendo creación, actualización, eliminación y consulta de productos.