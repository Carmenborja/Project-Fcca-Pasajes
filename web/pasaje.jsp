<%-- 
    Document   : pasaje
    Created on : 11/12/2019, 02:53:19 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Comprar Pasaje</title>

        <!-- STYLES -->
        <link rel="stylesheet" href="tabla.css">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="css/style1.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/blue-theme.css">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/tabla.css" rel="stylesheet" type="text/css"/>

        <link rel="icon" href="img/cropped-transport_icon-180x180.png" sizes="32x32">
        <link rel="icon" href="img/cropped-transport_icon-300x300.png" sizes="192x192">
        <link rel="apple-touch-icon-precomposed" href="img/cropped-transport_icon-180x180.png">
        <meta name="msapplication-TileImage" content="img/cropped-transport_icon-300x300.png">
    </head>

    <body class="bolts-fonts-primary-open-sans">

        <div class="boxed-container">

            <header class="site-header site-header--werk">

                <div class="top">
                    <div class="container">
                        <div class="top__left">
                            <div class="widget widget-icon-box">
                                <div class="icon-box">
                                    <i class="fa fa-home"></i>
                                    <h4 class="icon-box__title">San Isidro, Caminos del Inca</h4> 
                                    <span class="icon-box__subtitle"></span> 
                                </div>
                            </div>
                        </div>
                        <!-- end of .top__right -->
                        <!-- end of .top__left -->
                    </div>
                    <!-- end of .container -->
                </div>
                <!-- end of .top -->

                <div class="header__container">

                    <div class="container">
                        <div class="header">
                            <!-- Logo and site name -->
                            <div class="header__logo">
                                <a href="index.html#">
                                    <img src="img/FCCA_logo.png" alt="Bolts Transport" srcset="img/FCCA_logo.png, img/FCCA_logo.png 2x" class="img-fluid" width="202" height="60"> 
                                </a>
                            </div>
                            <!-- Toggle button for Main Navigation on mobile -->
                            <button class="btn  btn-dark header__navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#bolts-main-navigation">
                                <i class="fa fa-bars hamburger"></i> 
                                <span>MENU</span>
                            </button>
                            <!-- Main Navigation -->
                            <nav class="header__navigation collapse navbar-toggleable-md" id="bolts-main-navigation">
                                <ul id="menu-main-menu" class="main-navigation  js-main-nav" role="menubar">
                                    <li class="menu-item"><a href="Principal_Cliente.jsp">Menu</a></li>                  
                                    </li>
                                    <li class="menu-item "><a href="insti.html">Sobre Nosotros</a></li>
                                    <li class="menu-item "><a href="nosotros.html">Tren</a></li>
                                    <li class="menu-item "><a href="turismo.html">Noticias</a></li>
                                    <li class="menu-item current-menu-item"><a href="pasaje.html">Pasaje</a></li>
                                </ul>
                            </nav>
                            <!-- Header widget area -->
                            
                        </div>
                        <!-- end of .header -->
                    </div>
                    <!-- end of .container -->

                </div>
                <!-- end of .header__container -->

            </header>

            <div class="page-header">
                <div class="container">
                    <div class="page-header__text">
                        <h1 class="page-header__title">Comprar Boleto</h1>
                        <p class="page-header__subtitle">Pasaje</p>
                    </div>
                   
                    <div>
                    <style type="text/css"></style>
                    <center>
                    <table width="780px" cellpadding="2" cellspacing="0">
                        <tbody>
                            <tr> 
                                <th width="14.28%" rowspan="2" class="" 
                                    style="background:#BD1512; color: #0A0A0A"><a class="" href="pasaje.jsp">Paso 1: Salidas</a></th>

                                <th width="14.28%" style="background:#FFFFFF;
                                    border-bottom:1px solid #C0C0C0;">&nbsp;</th>

                                <th width="14.28%" rowspan="2" class="" 
                                    style="background:#F4F4F4; color:#C0C0C0;"><a class="" href="asientos.jsp">Paso 2: Asientos</a></th>

                                <th width="14.28%" style="background:#FFFFFF;
                                border-bottom:1px solid #C0C0C0;">&nbsp; </th>

                                <th width="14.28%" rowspan="2" class="" 
                                    style="background:#F4F4F4; color:#C0C0C0;"><a class="" href="pasajeros.jsp">Paso 3: Pasajeros</a></th>

                                <th width="14.28%" style="background:#FFFFFF;
                                    border-bottom:1px solid #C0C0C0;">&nbsp;</th>

                                <th width="14.28%" rowspan="2" class="" 
                                    style="background:#F4F4F4; color:#C0C0C0;"><a class="" href="pago.jsp">Paso 4: Pago</a></th>
                            </tr>

                                <tr>
                                    <th>&nbsp;</th>
                                    <th>&nbsp;</th>
                                    <th>&nbsp;</th>
                                </tr>
                            <br>                 
                        </tbody>
                    </table>
                    </center>
                    </div>

                    <div>
                            <p>Viaje: 
                            <select>
                                <option value="">22 de Noviembre 2019</option>
                            </select>
                            </p>

                            <p>Rutas:<br>
                                <input type="radio" name="viaje" value="Lima-Huancayo-Lima">Lima-Huancayo-Lima<br>
                                <input type="radio" name="viaje" value="Lima-Huancayo">Lima-Huancayo<br>
                                <input type="radio" name="viaje" value="Huancayo-Lima">Huancayo-Lima
                            </p>
                    </div>

                    <div id="main-container">
                        
        <div id="main-container">
        
            <div id="main-container">
        <table id="main-container">
            <thead>


                <tr>
                    <th colspan="7" >Cronográma</th>        
                    <th colspan="2">Tarifas(S/.) Incluyen IGV</th>      
                </tr>

            </thead>

            <tr>
                <td>Servicio</td>
                <td>Fecha Partida</td>
                <td>Hora Partida</td>
                <td>Estación</td>
                <td>Fecha Retorno</td>
                <td>Hora Retorno</td>
                <td>Estación</td>
                <td>EXTR.</td>
                <td>NAC.</td>
            </tr>

            <tr>
                <td><input type="radio" name="servicios" value="Clasico3">Clasico 3</td>
                <td>22/11/19</td>
                <td>7:00</td>
                <td>Desamp.</td>
                <td>25/11/19</td>
                <td>7:00</td>
                <td>Huancayo</td>
                <td>700.00</td>
                <td>450.00</td>
            </tr>

            <tr>
                <td><input type="radio" name="servicios" value="Turistico4">Turistico 4</td>
                <td>22/11/19</td>
                <td>7:00</td>
                <td>Desamp.</td>
                <td>25/11/19</td>
                <td>7:00</td>
                <td>Huancayo</td>
                <td>1000.00</td>
                <td>600.00</td>
            </tr>

            

        </table>
                </div>    
    

                    </div>


                    <div class="breadcrumbs">
                        <a title="Go to Bolts." href="Principal_Cliente.html">
                            Menu
                        </a> 
                        <a title="Go to Contact Us." href="pasaje.jsp" class="current-item">
                            Pasaje
                        </a>
                    </div>
                </div>
                <!-- end of .container -->
            </div>
            <!-- end of .page-header -->

            
            <!-- end of .content-area -->

            <footer class="footer">

                <!-- Footer Top -->
                <div class="footer-top">

                    <div class="container">

                        <div class="row">
                            <div class="col-xs-12 col-lg-4">
                                <h6 class="footer-top__headings">Transporte</h6>
                                <div class="textwidget">
                                    
                        Transporte de personas
                        La compañía FCCA ha logrado ganar reconocimiento por emprender viajes con un gran éxito. <br> <br> <a class="btn  btn-secondary" href="index.html#" target="_self">Obtener Consulta</a>
                                </div>
                            </div>
                            <!-- end of .col -->
                            <div class="col-xs-12 col-lg-2">
                                
                            </div>
                            <!-- end of .col -->
                            <div class="col-xs-12 col-lg-2">
                                
                            </div>
                            <!-- end of .col -->
                           <div class="col-xs-12 col-lg-4 textwidget footer-featured">
                                <p class="footer-address">
                                    <span class="icon-container fa fa-map-marker"></span>
                                    Ferrocarril Central Andino, Avenida Circunvalación del Golf los Incas, Santiago de Surco
                                </p>
                                <p class="footer-address">
                                    <span class="icon-container fa fa-phone"></span>
                                    987654321
                                </p>

                                &nbsp; &nbsp; <br> <br>
                                <a class="icon-container" href="https://es-la.facebook.com/pages/category/Company/Ferrocarril-Central-Andino-47271884369/" target="_self">
                                    <span class="fa fa-facebook fa-2x"></span>
                                </a> 
                                <a class="icon-container" href="https://twitter.com/hashtag/trenmacho" target="_self">
                                    <span class="fa fa-twitter fa-2x"></span>
                                </a>
                                &nbsp;&nbsp;
                                <a class="icon-container" href="https://www.youtube.com/channel/UCN9SQPUT1vpcK3dvKdUDeKg" target="_self">
                                    <span class="fa fa-youtube fa-2x"></span>
                                </a>
                            </div>
                            <!-- end of .col -->
                        </div>
                        <!-- end of .row -->

                    </div>
                    <!-- end of .container -->

                </div>

                <!-- Footer Bottom -->
                <div class="footer-bottom__container">

                    <div class="container">

                        <div class="footer-bottom">
                            <div class="footer-bottom__left">
                                Creado por: <a href="contact-us.html#">BOVEA</a>. 
                            </div>
                            <div class="footer-bottom__right">
                                Copyright © 2020 FCCA. Todos los derechos reservados. 
                            </div>
                        </div>

                    </div>
                    <!-- end of .container -->

                </div>

            </footer>
            
        </div>
        <!-- end of .boxed-container -->

        <!-- Sticky nav -->
        

        <!-- SCRIPTS -->
        <script data-cfasync="false" src="../cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script><script type="text/javascript" src="assets/js/jquery.js"></script>
        <script type="text/javascript" src="assets/js/underscore.js"></script>
        <script type="text/javascript" src="bower_components/requirejs/require.js"></script>
        <script type="text/javascript" src="assets/js/main.js"></script>
        <script type="text/javascript" src="assets/js/wpFeatherlight.pkgd.js"></script>
        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC4q9VF6dr_pBb4WauIG8SDmg45ROTNlh4"></script>
        <script type="text/javascript" src="assets/js/googleMap.js"></script>
        <script>

            // CONTACT  FORM
            jQuery('.js-contact-form').on("submit", function(e){

                jQuery('.ajax-loader').show();

                var url = 'mail.php',
                    form = this;

                jQuery(form).find('[name="fields[code]"]').remove();

                function result(class_key, data){
                    setTimeout(function(){
                        jQuery('.ajax-loader').hide();
                        jQuery('.ajax-result').find(class_key).show().text(data);
                    },500);
                }

                jQuery.ajax({
                    type: "POST",
                    url: url,
                    data: jQuery(form).serialize(),
                })
                .done(function(data) {
                    result('.success', data);
                }).error(function(data){
                    result('.error', data);
                })

                e.preventDefault();

          });
        </script>
    </body>
</html>
