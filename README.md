# Java DSA Algos

A Java project for exploring Data Structures and Algorithms (DSA) implementations.

## Prerequisites

- **Java 21** or later
- **Maven 3.6.0** or later

## Quick Start

### Build the Project

```bash
mvn clean package
```

This will:
- Compile the source code
- Run tests (if any)
- Generate two JAR files in `target/`:
  - `java_dsa_algos-1.0-SNAPSHOT.jar` — Standard JAR
  - `java_dsa_algos-1.0-SNAPSHOT-runnable.jar` — Standalone executable JAR

### Run the Application

**Option 1: Using the standalone runnable JAR (Recommended)**
```bash
java -jar target/java_dsa_algos-1.0-SNAPSHOT-runnable.jar
```

**Option 2: Using the classpath**
```bash
java -cp target/java_dsa_algos-1.0-SNAPSHOT.jar com.itquetzali.coin.Main
```

**Option 3: Compile and run directly**
```bash
mvn clean compile exec:java -Dexec.mainClass="com.itquetzali.coin.Main"
```

## Project Structure

```
java_dsa_algos/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/itquetzali/coin/
│   │   │       └── Main.java          # Entry point
│   │   └── resources/
│   └── test/                          # Unit tests (when added)
├── pom.xml                            # Maven configuration
└── README.md                           # This file
```

## Maven Commands

| Command | Description |
|---------|-------------|
| `mvn clean` | Remove build artifacts |
| `mvn compile` | Compile source code |
| `mvn test` | Run unit tests |
| `mvn package` | Build and package as JAR |
| `mvn verify` | Verify build integrity |
| `mvn install` | Install JAR in local Maven repository |
| `mvn clean package` | Full clean build |

## Development

### Adding Dependencies

Edit `pom.xml` in the `<dependencies>` section:

```xml
<dependency>
    <groupId>group-id</groupId>
    <artifactId>artifact-id</artifactId>
    <version>1.0.0</version>
</dependency>
```

Then run: `mvn clean compile`

### IDE Setup

- **IntelliJ IDEA**: Open the project folder and select "Open as Maven Project"
- **Eclipse**: Import → Existing Maven Projects
- **VS Code**: Install "Extension Pack for Java"

## Build Configuration

The project uses:
- **Java 21** language level
- **Maven Compiler Plugin** for compilation with release flag
- **Maven JAR Plugin** for JAR manifest configuration
- **Maven Shade Plugin** for creating standalone executable JARs

## License

No license specified