

<%@page import="Modelo.Calculos_NumeroPrimos"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Numero Primo</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        
        
        <div class="container_form">
            <div class="container_form-img_logo">
                <img src="img/umg.jpg" alt=""/>
            </div>
            
                                                                                                  <form action="Controlador" method="POST">
                <h1>ANALISIS I</h1>

                <label for="name">Ingrese un numero:</label>
                <input type="text" name="txtNumero" />

                <button type="submit" name="accion=Agregar">Agregar Numero</button>
                <br>
                
            </form>
   
        </div>
    </body>
</html>
