<%-- 
    Document   : pago
    Created on : 11/12/2019, 02:54:45 PM
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
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="css/style1.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/blue-theme.css">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <link rel="icon" href="img/cropped-transport_icon-180x180.png" sizes="32x32">
        <link rel="icon" href="img/cropped-transport_icon-300x300.png" sizes="192x192">
        <link rel="apple-touch-icon-precomposed" href="img/cropped-transport_icon-180x180.png">
        <meta name="msapplication-TileImage" content="img/cropped-transport_icon-300x300.png">
        
        <!-- SCRIPTS -->
        <script type="text/javascript" src="assets/js/modernizr.custom.20160111.js"></script>
        <script>
            var geoAddress = [
            {
                address: 'new york, dey st'
            },
            {
                address: 'new york, two bridges'
            },
            {
                address: 'new york, chinatown'
            }]
        </script>
    </head>

    <body class="bolts-fonts-primary-open-sans">

        <div class="boxed-container">

            <header class="site-header site-header--werk">

                <div class="top">
                    <div class="container">
                        <div class="top__left">
                            <div class="widget widget-icon-box">
                                <a class="icon-box" href="contact-us.html#" target="_self">
                                    <i class="fa fa-envelope"></i>
                                    <h4 class="icon-box__title"><span class="__cf_email__" data-cfemail="fc919d9590bc9e9390888fd29f9391">[email&#160;protected]</span></h4> 
                                    <span class="icon-box__subtitle"></span> 
                                </a>
                            </div>
                            <div class="widget widget-icon-box">
                                <div class="icon-box">
                                    <i class="fa fa-home"></i>
                                    <h4 class="icon-box__title">Santiago de Surco , Perú, Lima 13</h4> 
                                    <span class="icon-box__subtitle"></span> 
                                </div>
                            </div>
                        </div>
                        <!-- end of .top__right -->
                        <div class="top__right">
                            <div class="widget widget-social-icons">
                                <a class="social-icons__link" href="https://es-la.facebook.com/pages/category/Company/Ferrocarril-Central-Andino-47271884369/" target="_self"><i class="fa fa-facebook"></i></a>
                                <a class="social-icons__link" href="https://twitter.com/hashtag/trenmacho#" target="_self"><i class="fa fa-twitter"></i></a>
                                <a class="social-icons__link" href="https://www.youtube.com/channel/UCN9SQPUT1vpcK3dvKdUDeKg" target="_self"><i class="fa fa-youtube"></i></a>
                            </div>
                        </div>
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
                            <div class="header__widgets">
                                <div class="widget">
                                    <div class="icon-box"> 
                                        <i class="fa fa-check-square"></i>
                                        <h4 class="icon-box__title">Leading Provider of</h4>
                                        <span class="icon-box__subtitle">Construction Solutions</span> 
                                    </div>
                                </div>
                                <div class="widget">
                                    <div class="icon-box">
                                        <i class="fa fa-clock-o"></i>
                                        <h4 class="icon-box__title">Opening Times</h4> 
                                        <span class="icon-box__subtitle">Mon - Sat: 7.00 - 18:00</span> 
                                    </div>
                                </div>
                                <div class="widget">
                                    <div class="icon-box">
                                        <i class="fa fa-envelope"></i>
                                        <h4 class="icon-box__title">Get in touch</h4> 
                                        <span class="icon-box__subtitle"><a href="../cdn-cgi/l/email-protection.htm" class="__cf_email__" data-cfemail="e0898e868fa09492818e93908f9294ce838f8d">[email&#160;protected]</a></span> 
                                    </div>
                                </div>
                                
                            </div>
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
                                    style="background:#F4F4F4; color: #C0C0C0"><a class="" href="pasaje.jsp">Paso 1: Salidas</a></th>

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
                                    style="background:#BD1512; color:#0A0A0A;"><a class="" href="pago.jsp">Paso 4: Pago</a></th>
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
                            <p>Viaje: 
                            <select>
                                <option value="">22 de Noviembre 2019</option>
                            </select>
                            </p>


                    <div class="breadcrumbs">
                        <a title="Go to Bolts." href="Principal_Cliente.html">
                            Menu
                        </a> 
                        <a title="Go to Contact Us." href="pasaje.html" class="current-item">
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
                                <img src="img/FCCA_logoC.png" alt="Footer Logo" >
                                <p class="footer-address">
                                    <span class="icon-container fa fa-map-marker"></span>
                                    Ferrocarril Central Andino, Avenida Circunvalación del Golf los Incas, Santiago de Surco
                                </p>
                                <p class="footer-address">
                                    <span class="icon-container fa fa-phone"></span>
                                    987654321
                                </p>
                                <p>
                                    <span class="icon-container fa fa-envelope"></span>
                                    <a href="../cdn-cgi/l/email-protection.htm" class="__cf_email__" data-cfemail="6900070f06291d1b08071a19061b1d470a0604">[email&#160;protected]</a>
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
                                Copyright © 2019 FCCA. Todos los derechos reservados. 
                            </div>
                        </div>

                    </div>
                    <!-- end of .container -->

                </div>

            </footer>
            
        </div>
        <!-- end of .boxed-container -->

        <!-- Sticky nav -->
        <div class="pt-sticky-menu__container js-pt-sticky-menu" style="background-color: #ffffff;" id="stickyNav" data-top="240">

            <div class="container">
                <div class="pt-sticky-menu">
                    <div class="pt-sticky-menu__logo">
                        <a href="Principal_Cliente.html" tabindex="-1">
                            <img src="img/transport.png" alt="Bolts Transport" srcset="img/transport.png, img/transport2x.png 2x" class="img-fluid" width="131" height="49">
                        </a>
                    </div>
                    <nav class="pt-sticky-menu__navigation" aria-label="Main Menu">
                        <ul id="pt-sticky-main-menu" class="main-navigation" role="menubar">
                            <li class="menu-item">
                                <a href="Principal_Cliente.html" tabindex="-1">Home</a>
                            </li>
                            <li class="menu-item menu-item-has-children">
                                <a href="servicios.html" tabindex="-1">Services</a>
                                <ul class="sub-menu">
                                    <li class="menu-item">
                                        <a href="logistics.html" tabindex="-1">Logistics</a>
                                    </li>
                                    <li class="menu-item">
                                        <a href="domestic-services.html" tabindex="-1">Domestic Services</a>
                                    </li>
                                    <li class="menu-item">
                                        <a href="export-services.html" tabindex="-1">Export Services</a>
                                    </li>
                                    <li class="menu-item">
                                        <a href="package-tracking.html" tabindex="-1">Package Tracking</a>
                                    </li>
                                    <li class="menu-item">
                                        <a href="trucking.html" tabindex="-1">Trucking</a>
                                    </li>
                                    <li class="menu-item">
                                        <a href="resource-center.html" tabindex="-1">Resource Center</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="menu-item">
                                <a href="insti.html" tabindex="-1">About Us</a>
                            </li>
                            <li class="menu-item">
                                <a href="nosotros.html" tabindex="-1">Our Vehicles</a>
                            </li>
                            <li class="menu-item">
                                <a href="turismo.html" tabindex="-1">News</a>
                            </li>
                            <li class="menu-item">
                                <a href="contact-us.html" tabindex="-1">Contact Us</a>
                            </li>
                        </ul>
                    </nav>
                    <div class="pt-sticky-menu__hamburger hidden-lg-up">
                        <a href="contact-us.html#" class="btn btn-dark js-pt-sticky-menu-back-to-top-open-menu" tabindex="-1">
                            <i class="fa fa-bars"></i>
                            <span class="pt-sticky-menu__hamburger-text">MENU</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>

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
