<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login- Ferrocarril</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        
        <!--===============================================================================================-->
       
        <!--===============================================================================================-->
        
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <!--===============================================================================================-->
      
        <!--===============================================================================================-->	
      
        <!--===============================================================================================-->
    
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
    </head>
    <body  background="img/IMG_2518.png" >
    <center><br><br>
        <form  action="validacion" method="POST">

            <div class="wrap-login100 p-l-50 p-r-50 p-t-77 p-b-80" >
                <span class="login100-form-title p-b-55 " face="Trebuchet MS" style="color:gray">
                    Iniciar Sesión
                </span>
                <img src="img/person-logo_1.png" width="200" height="200"/><br><br>
                
                <div class="wrap-input100 validate-input m-b-16"  >
                    <input class="input100" type="text" name="txtuser" placeholder="Usuario" required focus>
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
                        <span class="lnr lnr-envelope"></span>
                    </span>
                </div>

                <div class="wrap-input100 validate-input m-b-16" data-validate = "Password" >
                    <input class="input100" type="password" name="txtpass" placeholder="Contraseña" required>
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
                        <span class="lnr lnr-lock"></span>
                    </span>
                </div>


                <div class="container-login100-form-btn p-t-25" style="color:black">
                    <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-lg" />
                </div>
                <div class="footer-bottom__container"><br>

                </div>
            </div>
            </div>
        </form>
    </center>
</body>
</html>
