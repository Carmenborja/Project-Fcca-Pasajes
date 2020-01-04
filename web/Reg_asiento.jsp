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
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
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
                        <h1>Seleccione sus asientos</h1>
                        <div class="containerbus">
                            <!-- Squared ONE -->
                            <div class="autobus">

                                <div class="fila">
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento1" name="check" />
                                            <label for="asiento1">1</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento2" name="check" />
                                            <label for="asiento2">2</label>
                                        </div>
                                    </div>
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento3" name="check" />
                                            <label for="asiento3">3</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento4" name="check" />
                                            <label for="asiento4">4</label>
                                        </div>
                                    </div>
                                </div>

                                <div class="fila">
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento5" name="check" />
                                            <label for="asiento5">5</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento6" name="check" />
                                            <label for="asiento6">6</label>
                                        </div>
                                    </div>
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento7" name="check" />
                                            <label for="asiento7">7</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento8" name="check" />
                                            <label for="asiento8">8</label>
                                        </div>
                                    </div>
                                </div>

                                <div class="fila">
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento9" name="check" />
                                            <label for="asiento9">9</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento10" name="check" />
                                            <label for="asiento10">10</label>
                                        </div>
                                    </div>
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento11" name="check" />
                                            <label for="asiento11">11</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento12" name="check" />
                                            <label for="asiento12">12</label>
                                        </div>
                                    </div>
                                </div>

                                <div class="fila">
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento13" name="check" />
                                            <label for="asiento13">13</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento14" name="check" />
                                            <label for="asiento14">14</label>
                                        </div>
                                    </div>
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento15" name="check" />
                                            <label for="asiento15">15</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento16" name="check" />
                                            <label for="asiento16">16</label>
                                        </div>
                                    </div>
                                </div>

                                <div class="fila">
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento17" name="check" />
                                            <label for="asiento17">17</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento18" name="check" />
                                            <label for="asiento18">18</label>
                                        </div>
                                    </div>
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento19" name="check" />
                                            <label for="asiento19">19</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento20" name="check" />
                                            <label for="asiento20">20</label>
                                        </div>
                                    </div>
                                </div>

                                <div class="fila">
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento21" name="check" />
                                            <label for="asiento21">21</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento22" name="check" />
                                            <label for="asiento22">22</label>
                                        </div>
                                    </div>
                                    <div class="seccion">
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento23" name="check" />
                                            <label for="asiento23">23</label>
                                        </div>
                                        <div class="asiento">
                                            <input type="checkbox" value="None" id="asiento24" name="check" />
                                            <label for="asiento24">24</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
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

