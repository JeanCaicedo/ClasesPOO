# ClasesPOO

Ejercicios académicos de la asignatura de Programación Orientada a Objetos en Java, desarrollados en NetBeans.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![Apache Ant](https://img.shields.io/badge/Ant-A81C7D?style=for-the-badge&logo=apache-ant&logoColor=white)

## Contexto

Repositorio con tres prácticas cortas de POO hechas en clase. Cada carpeta es un proyecto NetBeans independiente (con `build.xml`, `manifest.mf` y `nbproject/`) enfocado en un concepto distinto: herencia, clases abstractas e interfaces.

## Ejercicios

- **JuegoAdivinaNumeroMultinivel** — juego de adivinar número por consola con tres niveles (`NivelFacil`, `NivelIntermedio`, `NivelDificil`) que extienden una clase base `NivelesAdivinaNumero`. Practica herencia y polimorfismo.
- **JuegoDeRol** — clase abstracta `Personaje` con método `Atacar()` y tres subclases concretas (`Guerrero`, `Mago`, `Arquero`). Ejercicio de clases abstractas y arreglos de objetos.
- **JuegoInterfacePOO** — interfaz `Juego` con `Iniciar()`, `Jugar()` y `Finalizar()`, implementada por `JuegoDeDados` y `JuegoAdivinaNumero`. Ejercicio de interfaces en Java.

## Tecnologías

- Java SE
- NetBeans + Apache Ant como sistema de build

## Ejecución

Cada carpeta es un proyecto NetBeans. La forma más directa es abrir el proyecto deseado en el IDE y correrlo desde ahí.

Alternativa por línea de comandos, compilando los `.java` directamente:

```bash
cd JuegoDeRol/src
javac juegoderol/*.java
java juegoderol.JuegoDeRol
```

Reemplazar `JuegoDeRol` / `juegoderol` por el proyecto y paquete correspondiente (`juegoadivinanumeromultinivel` o `juegointerfacepoo`).

## Estructura

```
ClasesPOO/
├── JuegoAdivinaNumeroMultinivel/
│   └── src/juegoadivinanumeromultinivel/
├── JuegoDeRol/
│   └── src/juegoderol/
└── JuegoInterfacePOO/
    └── src/juegointerfacepoo/
```

## Autor

Jean Caicedo — [@JeanCaicedo](https://github.com/JeanCaicedo)
