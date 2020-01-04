<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean 
    id="nombre_pais" 
    class="java.util.ArrayList" 
    scope="request"/>

<html>
    <head>
        <title>Ferrocarril Central Andino</title>
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="css/style1.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/blue-theme.css">

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
                                    <h4 class="icon-box__title">San Isidro, Golf del Inca</h4> 
                                    <span class="icon-box__subtitle"></span> 
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="header__container">
                    <div class="container">
                        <div class="header">
                            <div class="header__logo">
                                <a href="index.html#">
                                    <img src="img/FCCA_logo.png" alt="Bolts Transport" srcset="img/FCCA_logo.png, img/FCCA_logo.png 2x" class="img-fluid" width="202" height="60"> 
                                </a>
                            </div>
                            <button class="btn  btn-dark header__navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#bolts-main-navigation">
                                <i class="fa fa-bars hamburger"></i> 
                                <span>MENU</span>
                            </button>
                            <nav class="header__navigation collapse navbar-toggleable-md" id="bolts-main-navigation">
                                <ul id="menu-main-menu" class="main-navigation  js-main-nav" role="menubar">
                                    <li class="menu-item current-menu-item"><a href="Principal_Cliente.jsp">Menu</a>
                                    </li>
                                    <li class="menu-item "><a href="turismo.html">Turismo</a></li>
                                    <li class="menu-item "><a href="servicios.html">Servicios</a></li>
                                    <li class="menu-item "><a href="nosotros.html">Institucionales</a></li>
                                    <li class="menu-item "><a href="insti.html">Sobre nosotros</a></li>
                                </ul>
                            </nav>
                            <div class="header__widgets">
                                <div class="widget">
                                    <a class="btn btn-secondary btn-sm" href="index.jsp" target="_self">Login</a>
                                </div>
                            </div>
                        </div>
                    </div>
            </header>
            <div class="jumbotron jumbotron--with-captions">
                <div class="carousel slide js-jumbotron-slider" id="headerCarousel" data-ride="carousel" data-interval="5000">
                   
                        <div class="carousel-item ">
                            <img src="img/IMG_4077.jpg" srcset="img/IMG_4077.jpg 1920w, img/IMG_4077.jpg 960w, img/IMG_4077.jpg 480w" sizes="100vw" alt="SAFE CARGO TRANSPORTATION"> 
                        </div>      
                   
                </div>
                <div class="container">
                    <div class="jumbotron-content js-slider-captions">
                        <h2>Registro de Clientes</h2>
                        <form class="form-horizontal style-form" action="ClienteControlador">

                            <div class="form-group">
                                <label class="exampleInputPassword1">Pais:</label>
                                <select name="cboP" class="form-control">
                                    <option value="0" selected>Seleccionar...</option>
                                    <%
                                        for (int i = 0; i < nombre_pais.size(); i++) {
                                            String nom = nombre_pais.get(i).toString();
                                    %>
                                    <option value="<%=i + 1%>"><%=nom%></option>
                                    <%  }%>
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Nombres</label>
                                <input type="text" class="form-control" name="txtNombres">
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Apellidos:</label>
                                <input type="text" class="form-control" name="txtApellidos">
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Tipo de Documento:</label>
                                <select name="cboTipoD" class="form-control" >
                                    <option value="Pasaporte">Pasaporte</option>
                                    <option value="DNI">DNI</option>
                                    <option value="FAP">FAP</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Numero de Documento:</label>
                                <input type="text" class="form-control" name="txtNDocumento">
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Telefono:</label>
                                <input type="text" class="form-control" name="txtTelf">
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Direccion:</label>
                                <input type="text" class="form-control" name="txtDireccion">
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Genero:</label>
                                <select name="cboG" class="form-control">
                                    <option value="F" >Femenino</option>
                                    <option value="M">Masculino </option>
                                </select>
                            </div>
                                
                                <div class="form-group">
                                <label for="exampleInputPassword1">Correo:</label>
                                <input type="text" class="form-control" name="txtCorreo">
                            </div>
                                
                                <div class="form-group">
                                <label for="exampleInputPassword1">Fecha:</label>
                                <input type="date" class="form-control" name="txtFechaN">
                            </div>

                                <input class="btn btn-success" class="form-control" type="submit" name="accion" value="Agregar">&nbsp;&nbsp;
                            <button type="reset" class="btn btn-primary">Limpiar</button>
                        </form>

                    </div>
                </div>
                <div class="content-area">

                    <div class="hentry__content">

                        <div class="container">

                            <div class="row marg-lg-b50">                  
                            </div>
                            <footer>
                                <div class="footer-bottom__container">
                                    <div class="container">
                                        <div class="footer-bottom">
                                            <div class="footer-bottom__left">
                                                Creador por: <a href="index.html#"> BOVEA</a>. 
                                            </div>
                                            <div class="footer-bottom__right">
                                                Copyright © 2020 FCCA. Todos los derechos reservados. 
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </footer>
                        </div>       
                        </body>
                        </html>

