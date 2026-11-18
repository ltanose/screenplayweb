# 🚀 Automatización Web SAUCEDEMO- Serenity BDD

## 📋 Descripción

Este proyecto automatiza la **APP WEB** de prueba **SAUCEDEMO** diseñado para dar cobertura de calidad a sus flujos criticos de manera eficiente y escalable. Utiliza **Serenity BDD** con **Cucumber** y el patrón **Screenplay** para crear pruebas mantenibles y legibles.

## 🎯 Objetivo

Dar cobertura de calidad a los flujos críticos de APP SAUCEDEMO para el proceso de compra de productos con el rol de usuario.

## 🛠️ Stack Tecnológico

- **Java Corretto-21.0.9.10.1** - Lenguaje de programación
- **Serenity BDD 4.0.12** - Framework de automatización y reporting
- **Cucumber 7.14.0** - BDD framework para escribir pruebas en Gherkin
- **Selenium WebDriver 4.17.0** - Automatización de navegadores
- **Gradle** - Gestión de dependencias y construcción
- **WebDriverManager** - Gestión automática de drivers
- **Lombok** - Reducción de código boilerplate

## 📁 Estructura del Proyecto

```
ProyectoBaseSPCandidato/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com.co.choucair/
│   │           ├── interactions/    # Interacciones personalizadas
│   │           ├── model/           # Clases de modelo/datos
│   │           ├── questions/       # Questions del patrón Screenplay
│   │           ├── tasks/           # Tasks del patrón Screenplay
│   │           ├── ui/              # Page Objects / Elementos UI
│   │           └── utils/           # Utilidades generales
│   └── test/
│       ├── java/
│       │   ├── runners/             # Test Runners de Cucumber
│       │   └── stepdefinitions/     # Definición de pasos Gherkin
│       └── resources/
│           ├── features/            # Archivos .feature en Gherkin
│           └── serenity.conf        # Configuración de Serenity
├── build.gradle                     # Configuración de Gradle
├── serenity.properties             # Propiedades de Serenity
└── README.md                        # Este archivo
```

## 🚦 Inicio Rápido

### Prerrequisitos

```bash
# Verificar Java
java -version  # Debe ser 11 o superior

# Verificar Gradle
gradle -v      # O usar ./gradlew incluido
```

### Instalación

```bash
# Clonar el repositorio
git clone https://github.com/ltanose/screenplayweb.git

# Instalar dependencias
gradle clean build

```
### Ejecución de Pruebas

```bash
# Ejecutar todas las pruebas y actualizar reportes
gradle clean test aggregate

# Ejecutar pruebas con tags específicos powershell
./gradlew.bat clean test "-Dcucumber.filter.tags=@AddCart"

./gradlew.bat clean test "-Dcucumber.filter.tags=@BuyProduct"

./gradlew.bat clean test "-Dcucumber.filter.tags=@Login"

# Ejecutar en navegador específico
gradle test -Dwebdriver.driver=firefox

# Generar reporte
gradle aggregate
```

## 📊 Criterios Mínimos de Automatización


| # | Criterio | Tag Sugerido | Prioridad |
|---|----------|--------------|-----------|
| 1 | Validar que se pueda iniciar sesión | `@Login` | CRÍTICA |
| 2 | Validar que se pueda hacer una compra exitosa | `@BuyProduct` | CRÍTICA |
| 3 | Validar que no se pueda comprar un producto si no se agrega el nombre en el checkout | `@BuyProduct` | CRÍTICA |
| 4 | Validar que no se pueda comprar un producto si no se agrega el apellido en el checkout | `@BuyProduct` | CRÍTICA |
| 5 | Validar que no se pueda comprar un producto si no se agrega el código postal en el checkout | `@BuyProduct` | CRÍTICA |
| 6 | Validar que se pueda agregar un producto al carrito | `@AddCart` | ALTA |
| 7 | Validar que se pueda Eliminar un producto al carrito | `@AddCart` | ALTA |

## 📈 Reportes

### Serenity Reports
Los reportes se generan automáticamente en `target/site/serenity/`:
- **index.html** - Reporte principal con resumen ejecutivo
- **capabilities.html** - Cobertura por funcionalidad