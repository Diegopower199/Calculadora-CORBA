cd "este proyecto en el src, es decir, \src"
idlj -fall suma.idl 
javac *.java sumaApp/*.java
orbd -ORBInitialPort 3000
