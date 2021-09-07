# Taller Clientes Y Servicios
## Taller AREP 2021-2 / 06 Septiembre del 2021
  Este taller presenta diferentes retos que exploran los conceptos de 
  esquemas de nombres y de clientes y servicios. 

# Prerrequisitos 
  + Git version 2.25.1
  + Apavhe Maven version 4.0.0
  + Java version 11.0.11
  
 Para verificar que esten instalados los programas puede usar los suguientes comandos
    + mvn --version
    + git version
    +java --version
    
  ## Ejercicio 1
  
   Escriba un programa en el cual usted cree un objeto URL e imprima en pantalla 
   cada uno de los componentes de una URL. Es decir , debe usar los siguientes métodos: 
   getProtocol, getAuthority, getHost, getPort, getPath, getQuery, getFile, getRef. 
   Asegúrese que ninguno imprima una cadena vacía, esto implica que la URL que use 
   para su objeto debe contener datos suficientes.
   
   Para ejecutar el ejecicio utilice el siguiente comando:
   
    java -cp java -cp TallerClientesServicios-1.0-SNAPSHOT.jar co.edu.escuelaing.arep.URL.URLReader
    

El resultado del ejercicio tomando http://admin:hello1234@10.20.130.230:20880/context/path?version=1.0.0&application=morgan#anchor1 como URL es el siguiente :
   
 ![Imagen](https://github.com/camilaFetecua/TallerClientesYServicios-Arep/blob/master/Imagenes/Ejercicio1.PNG)
  
    
    
    
   ## Ejercicio 2
   
   Escriba una aplicación browser que dada una URL lea datos de esa dirección y 
   que los almacene en un archivo con el nombre resultado.html. Intente ver este 
   archivo en el navegador. Su implementación debe ser un programa que reciba el 
   parámetro de URL por medio de la línea de comandos.
   
   Para ejecutar el ejecicio utilice el siguiente comando:
   
    java -cp java -cp TallerClientesServicios-1.0-SNAPSHOT.jar co.edu.escuelaing.arep.URL.URLScaner
      
   
   Para verificar el archivo resultado.html  [click aqui](https://github.com/camilaFetecua/TallerClientesYServicios-Arep/blob/master/resultado.html)
      
   El resultado del ejercicio es el siguiente :
    
   ![Imagen](https://github.com/camilaFetecua/TallerClientesYServicios-Arep/blob/master/Imagenes/Ejercicio2.PNG)
      
    
     
   ## Ejercicio 3
   
   Usando sockets escriba un servidor que reciba un número y responda el cuadrado de 
   este número. Escriba un cliente para probarlo y envíele una secuencia de 20 números.
   Para ejecutar este ejercicio debemos ejecutar primero el Servidor y depsues el cliente,
   en el cliente se digtan los 20 numeros y nos retorna el cuadrado de cada uno de estos.
   
   Para ejecutar el ejecicio utilice los siguientes comando:
   
    java -cp java -cp TallerClientesServicios-1.0-SNAPSHOT.jar co.edu.escuelaing.arep.Sockets.EchoServerCuadrado
      
    java -cp java -cp TallerClientesServicios-1.0-SNAPSHOT.jar co.edu.escuelaing.arep.Sockets.EchoClientCuadrado
        
  El resultado es el siguiente:
   
   ![Imagen](https://github.com/camilaFetecua/TallerClientesYServicios-Arep/blob/master/Imagenes/Ejercicio3a.PNG)

   ![Imagen](https://github.com/camilaFetecua/TallerClientesYServicios-Arep/blob/master/Imagenes/Ejercicio3b.PNG)

   
   ## Reto 1
   
   Escriba un servidor web que soporte múlltiples solicitudes seguidas (no concurrentes).      El servidor debe retornar todos los archivos solicitados, incluyendo páginas html e        imágenes. Construya un sitio web con javascript para probar su servidor. Despliegue su      solución en Heroku. NO use frameworks web como Spark o Spring use solo Java y las          librerías para manejo de la red.
   
    Para ejecutar el ejecicio utilice los siguientes comando:
   
    java -cp java -cp TallerClientesServicios-1.0-SNAPSHOT.jar co.edu.escuelaing.arep.HttpServer.HttpServer
       
   Para observar el resultado  primero vamos al browser y digitamos la siguiente URL  
   
   http://localhost:8081/mypage.html
   
   Esto nos retorma la pagina web donde encontramos la imagen 
   
   ![Imagen](https://github.com/camilaFetecua/TallerClientesYServicios-Arep/blob/master/Imagenes/Reto1a.PNG)
   
   
   
   Para el siguiente punto del ejercicio ejecutamos la siguiente URL 
   
    http://localhost:8081/index.html 
    
   Donde nos dirige a una pagina web de Booststrap y podemos ver el html, js y css
   
   
   
   Link de Heoku para ver la implementacion de este ejercicio:
    
    
   # Licencia

  Para consultar la Licencia del proyecto haga [click aqui](https://github.com/camilaFetecua/TallerClientesYServicios-Arep/blob/master/LICENSE.txt)
  
  
# Autor 
  **Maria Camila Fetecua Garcia** 
       
       
       
       
    
