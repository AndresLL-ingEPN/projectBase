# Proyecto de Automatización: Parabank con Serenity BDD + Cucumber + Screenplay

Este proyecto automatiza el flujo completo de un usuario en el portal bancario de prueba [Parabank](https://parabank.parasoft.com/parabank/index.htm), implementando las pruebas bajo el patrón **Screenplay** usando **Serenity BDD**, **Cucumber** y **Gradle**.

---

## 🧰 Tecnologías usadas

| Herramienta         | Versión       |
|---------------------|---------------|
| Java                | 8             |
| Gradle              | 7.6.1         |
| Serenity BDD        | 3.3.4         |
| Serenity Cucumber   | 3.3.4         |
| Cucumber JVM        | ~7.11.x       |
| JUnit               | 5.8.2         |
| Serenity Screenplay | 3.3.4         |
| Navegador           | Microsoft Edge |

---

## 📦 Estructura del Proyecto

- `features/` → Escenarios Gherkin (`.feature`)
- `stepdefinition/` → Step Definitions
- `tasks/` → Tareas reutilizables (Register, Login, Transferencia, etc.)
- `ui/` → Page Objects definidos con `Target`
- `util/` → Utilidades (tiempos, constantes)
- `hook/` → Hook para levantar el entorno y abrir navegador
- `runners/` → Runner Cucumber configurado con tag `@flujoCompleto`

---

## 🚀 Instalación y ejecución

### 1. Pre-requisitos

- Java 8 instalado
- Gradle instalado (opcional, el wrapper `./gradlew` funciona igual)
- Navegador **Microsoft Edge** instalado
- Intellij IDEA o cualquier IDE compatible

### 2. Clonar el proyecto

```bash
git clone https://github.com/tu-repositorio/parabank-serenity.git
cd parabank-serenity

### 3. Ejecutar las pruebas
./gradlew clean test -Dcucumber.filter.tags="@flujoCompleto"


###Flujo automatizado probado
El escenario ejecutado bajo @flujoCompleto incluye:

Registro de usuario

Cierre de sesión

Inicio de sesión con usuario creado

Apertura de una nueva cuenta bancaria

Transferencia de dinero entre cuentas

Validación de resultados

📋 Reportes generados
Después de ejecutar las pruebas, los reportes HTML se encuentran en:
target/site/serenity/index.html
