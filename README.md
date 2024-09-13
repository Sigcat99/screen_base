# proyecto Entrevista  :space_invader:

El siguiente proyecto es una automatizacion implementada sobre la pagina https://www.demoblaze.com/
y su modulo Carrito de compras 

## TECNOLOGIAS 

Las teCnologias implementadas fueron :
    
 - **JAVA** :tea:
 - **GRADLE** :elephant:
 - **SERENITY_BDD** 
 - **CUCUMBER**
 
## DESARROLLO :computer:

para el desarrollo de este robot se implemento del patron de Diseño ScreenPlay

con la siguiente structura de carpetas`'

```plaintext
proyecto/
├── Jenkinsfile
├── docker-compose.yml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── co/com/
│   │   │       └── sig/
│   │   │           └──questions
│   │   │           └──task
│   │   │           └──userinterface
│   │   │           └──utils 
│   │   ├
│   │   │ 
│   └── test/
│       ├── java/
│       │   └── co/com/
│       │       └── Sig/
│       │           └── runners/
│       │           └── stepsdefinitios
│       ├── resources/
│           └── serenity.conf
│           └── features/
├── build.gradle
├── settings.gradle
└── README.md
```
## CONTINOUS TESTING

para el continous Testin se añade un Compose para levantar un docker de jenkis 
junto con un p´pipeline para la ejecuion de los tests
