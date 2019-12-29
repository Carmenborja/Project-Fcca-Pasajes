<%-- 
    Document   : Tren_edit
    Created on : 01-dic-2019, 16:31:10
    Author     : crish
--%>

<%@page import="util.conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="model.dao.TrenDAO"%>
<%@page import="model.beans.Tren"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                <h1 class="page-header__title">Editar Tren</h1>
                
            </div>
            <div class="breadcrumbs">
                Ferrocarril Central Andino
            </div>
        </div>
        <!-- end of .container -->

        <%
                    TrenDAO dao=new TrenDAO();
                    int id=Integer.parseInt((String)request.getAttribute("idTren"));
                    Tren tre=(Tren)dao.findById(id);
                    
                     Statement st;
                     ResultSet rs;

                     Connection con; //(1)
                     conexion cn = new conexion(); //(2)    
                    
                %>
        
        <div class="container">
            <div class="col-lg-6"  >
                <form class="form-group">                   
                    Asientos:
                    <input type="text" name="txtAsien" class="form-control" value="<%=tre.getAsientos() %>"><br> 
                    Descripcion:
                    <input type="text" name="txtDescr" class="form-control" value="<%=tre.getDescripcion_tren() %>"><br>                   
                    Ruta:
                    <input type="text" name="txtRuta" class="form-control" value="<%=tre.getRuta() %>"><br> 
                    Cantidad de Coches:
                    <input type="text" name="txtCantCo" class="form-control" value="<%=tre.getCantidadCoche() %>"><br> 
                    
                    
                    <input class="btn btn-success" class="form-control" type="submit" name="accion" value="Actualizar" >
                    <input type="reset" name="Limpiar" class="btn btn-primary" class="form-control" value="Limpiar">
                    <a href="TrenControlador?accion=findAll">Regresar</a>

                </form>
            </div><br>

        </div>

        <!-- SCRIPTS -->
        <script data-cfasync="false" src="../cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script><script type="text/javascript" src="assets/js/jquery.js"></script>
        <script type="text/javascript" src="assets/js/underscore.js"></script>
        <script type="text/javascript" src="bower_components/requirejs/require.js"></script>
        <script type="text/javascript" src="assets/js/main.js"></script>
        <script type="text/javascript" src="assets/js/wpFeatherlight.pkgd.js"></script>
    
</html>
