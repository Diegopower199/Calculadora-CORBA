# Practica 2 Sistemas Distribuidos Diego González Sanz

_Voy a explicar los pasos que se deben seguir para poder ejecutar este programa._

## Los siguientes pasos es para realizarlo en Linux Ubuntu

## Comenzando 🚀

**Debemos instalar el JDK de Java (en la terminal raiz)**

    $ sudo apt install openjdk-8-jdk-headless

**Cambiar el directorio a src/**

    $ cd src/

### Instalación 🔧

**Compilar el IDL**

    $ idlj -fall suma.idl

**Compilar todos los archivos java (dentro de la carpeta sumaApp)**

    $ javac *.java sumaApp/*.java

## Ejecutando las pruebas ⚙️

Llegado a este punto, ahora tendremos que abrir 3 terminales.

- La primera terminal iniciará el puerto
- La segunda terminal ejecutará el servidor
- La segunda terminal ejecutará el cliente

**Primera terminal**

    $ orbd -ORBInitialPort 3001

**Segunda terminal (Servidor)**

    $ java SumaServer -ORBInitialPort 3001 -ORBInitialHost localhost

**Tercera terminal (Cliente)**

    $ java SumaClient -ORBInitialPort 3001 -ORBInitialHost localhost
