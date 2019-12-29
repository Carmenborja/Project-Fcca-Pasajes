<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.beans.Medio_Pago"%>
<%@page import="model.dao.Medio_PagoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-GB">

    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Turismo</title>
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/blue-theme.css">

        <link rel="icon" href="img/cropped-transport_icon-180x180.png" sizes="32x32">
        <link rel="icon" href="img/cropped-transport_icon-300x300.png" sizes="192x192">
        <link rel="apple-touch-icon-precomposed" href="img/cropped-transport_icon-180x180.png">
        <meta name="msapplication-TileImage" content="img/cropped-transport_icon-300x300.png">

        <!-- SCRIPTS -->
        <script type="text/javascript" src="assets/js/modernizr.custom.20160111.js"></script>
    </head>

    <body class="blog" >


        <header class="site-header site-header--werk">

            <div class="top">
                <div class="container">
                    <div class="top__left">
                        <div class="widget widget-icon-box">
                            <a class="icon-box" href="news.html#" target="_self">
                                <i class="fa fa-envelope"></i>
                                <h4 class="icon-box__title"><span class="__cf_email__" data-cfemail="2a474b43466a4845465e5904494547">[email&#160;protected]</span></h4> 
                                <span class="icon-box__subtitle"></span> 
                            </a>
                        </div>
                        <div class="widget widget-icon-box">
                            <div class="icon-box">
                                <i class="fa fa-home"></i>
                                <h4 class="icon-box__title">227 Marion Street, Columbia, SC 29201</h4> 
                                <span class="icon-box__subtitle"></span> 
                            </div>
                        </div>
                    </div>
                    <!-- end of .top__right -->
                    <div class="top__right">
                        <div class="widget widget-social-icons">
                            <a class="social-icons__link" href="news.html#" target="_self"><i class="fa fa-facebook"></i></a>
                            <a class="social-icons__link" href="news.html#" target="_self"><i class="fa fa-twitter"></i></a>
                            <a class="social-icons__link" href="news.html#" target="_self"><i class="fa fa-youtube"></i></a>
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

                            <img src="img/FCCA_logo.png" alt="Bolts Transport" srcset="img/FCCA_logo.png, img/FCCA_logo.png 2x" class="img-fluid" width="202" height="60"> 

                        </div>
                        <!-- Toggle button for Main Navigation on mobile -->
                        <button class="btn  btn-dark header__navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#bolts-main-navigation">
                            <i class="fa fa-bars hamburger"></i> 
                            <span>MENU</span>
                        </button>
                        <!-- Main Navigation -->
                        <nav class="header__navigation collapse navbar-toggleable-md" id="bolts-main-navigation">
                            <ul id="menu-main-menu" class="main-navigation  js-main-nav" role="menubar">
                                <li class="menu-item"><a href="Principal_Empleado.jsp">Menu</a></li>


                                <li class="menu-item "><a href="Empleado.jsp">Empleado</a></li>
                                <li class="menu-item menu-item-has-children current-menu-item"><a href="Cliente_add.jsp">Cliente</a></li>
                                <ul class="sub-menu">
                                    <li class="menu-item"><a href="Cliente_List.jsp">Listado Cliente</a></li>
                                    <li class="menu-item"><a href="domestic-services.html">Domestic Services</a></li>
                                </ul>
                                <li class="menu-item "><a href="Pais.jsp">Pais</a></li>
                                <li class="menu-item "><a href="turismo.html">Tren</a></li>
                                <li class="menu-item "><a href="turismo.html">Asiento</a></li>

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

        <div class="container">
            <div class="page-header__text">
                <h1 class="page-header__title">Listado Medio de Pago</h1>
            </div>
            <div class="breadcrumbs">
                Ferrocarril Central Andino
            </div>
        </div>
        <!-- end of .container -->


        <div class="table table-responsive">
            <table class="table">
                <thead>
                    <tr class="table-primary">
                        <th class="text-center">Id</th>
                        <th class="text-center">Nombres</th>
                        <th class="text-center">Apellidos</th>
                        <th class="text-center">N Tarjeta</th>                         
                        <th class="text-center">Codigo de Seguridad</th>
                        <th class="text-center">Fecha Expiracion</th>
                        <th class="text-center">Correo</th>
                        <th class="text-center">Acciones</th>                         
                    </tr>
                </thead>

                <%
                    Medio_PagoDAO dao = new Medio_PagoDAO();
                    List<Medio_Pago> list = dao.findAll();
                    Iterator<Medio_Pago> iter = list.iterator();
                    Medio_Pago asi = null;
                    while (iter.hasNext()) {
                        asi = iter.next();
                        
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= asi.getIdMedioPago()%></td>
                        <td class="text-center"><%= asi.getNombre_titular()%></td>
                        <td class="text-center"><%= asi.getApellidos_titular()%></td>
                        <td class="text-center"><%= asi.getN_tarjeta()%></td>
                        <td class="text-center"><%= asi.getCodigo_seguridad()%></td>
                        <td class="text-center"><%= asi.getFecha_expiracion()%></td>
                        <td class="text-center"><%= asi.getCorreo()%></td>
                          
                        <td>
                                <a class="btn btn-warning" href="MedioPagoControlador?accion=edit&id=<%=asi.getIdMedioPago()%>">Editar</a>    
                                <a class="btn btn-danger" href="MedioPagoControlador?accion=delete&id=<%=asi.getIdMedioPago()%>">Eliminar</a>
                        </td>
                    </tr>
                     <%}%>
                </tbody>
            </table>
        </div>

        <!-- SCRIPTS -->
        <script data-cfasync="false" src="../cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script><script type="text/javascript" src="assets/js/jquery.js"></script>
        <script type="text/javascript" src="assets/js/underscore.js"></script>
        <script type="text/javascript" src="bower_components/requirejs/require.js"></script>
        <script type="text/javascript" src="assets/js/main.js"></script>
        <script type="text/javascript" src="assets/js/wpFeatherlight.pkgd.js"></script>
    
</html>               
</body>

