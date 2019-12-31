<%@page import="util.conexion"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<jsp:useBean 
    id="nombre_trabajador" 
    class="java.util.ArrayList" 
    scope="request"/>

<jsp:useBean 
    id="nombre_cliente" 
    class="java.util.ArrayList" 
    scope="request"/>

<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        <title>Dashio - Bootstrap Admin Template</title>

        <!-- Favicons -->
        <link href="img/favicon.png" rel="icon">
        <link href="img/apple-touch-icon.png" rel="apple-touch-icon">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <!-- Bootstrap core CSS -->
        <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!--external css-->
        <link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="lib/bootstrap-fileupload/bootstrap-fileupload.css" />
        <link rel="stylesheet" type="text/css" href="lib/bootstrap-datepicker/css/datepicker.css" />
        <link rel="stylesheet" type="text/css" href="lib/bootstrap-daterangepicker/daterangepicker.css" />
        <link rel="stylesheet" type="text/css" href="lib/bootstrap-timepicker/compiled/timepicker.css" />
        <link rel="stylesheet" type="text/css" href="lib/bootstrap-datetimepicker/datertimepicker.css" />
        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet">
        <link href="css/style-responsive.css" rel="stylesheet">

        <!-- =======================================================
          Template Name: Dashio
          Template URL: https://templatemag.com/dashio-bootstrap-admin-template/
          Author: TemplateMag.com
          License: https://templatemag.com/license/
        ======================================================= -->
    </head>

    <body>
        <section id="container">
            <header class="header black-bg">
                <div class="sidebar-toggle-box">
                    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>
                <a href="index.html" class="logo"><b>FC<span>CA</span></b></a>
                <div class="nav notify-row" id="top_menu">
                </div>
                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="login.jsp">Iniciar Sesión</a></li>
                    </ul>
                </div>
            </header>
            <aside>
                <div id="sidebar" class="nav-collapse">
                    <ul class="sidebar-menu" id="nav-accordion">
                        <br>
                        <p class="centered"><a href="profile.html"><img src="img/FCCA_logo.png" width="200"></a></p><br>
                        <li class="mt">
                            <a class="active" href="index.html">
                                <i class="fa fa-dashboard"></i>
                                <span>Menu Principal</span>
                            </a>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;">
                                <i class="fa fa-cog"></i>
                                <span>Mantenimientos</span>
                            </a>
                            <ul class="sub">
                                <li><a href="Cliente_List.jsp">Cliente</a></li>
                                <li><a href="Empleado_List.jsp">Empleado</a></li>
                                <li><a href="Tarifa_List.jsp">Tarifa</a></li>
                                <li><a href="Cronograma_List.jsp">Cronograma</a></li>
                                <li><a href="Asiento_List.jsp">Asiento</a></li>
                                <li><a href="MedioPago_List.jsp">Medio de Pago</a></li>
                                <li><a href="Pais_List.jsp">Pais</a></li>
                                <li><a href="Pasaje_List.jsp">Pasaje</a></li>
                                <li><a href="Tarifa_List.jsp">Tarifa</a></li>
                                <li><a href="Terminal_List.jsp">Terminal</a></li>
                                <li><a href="Tren_List.jsp">Tren</a></li>
                            </ul>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;">
                                <i class="fa fa-calendar"></i>
                                <span>Reserva</span>
                            </a>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;">
                                <i class="fa fa-shopping-bag"></i>
                                <span>Venta</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </aside>
            <section id="main-content">
                <section class="wrapper">
                    <h3><i class="fa fa-angle-right"></i>Registrar Reserva</h3>
                    <div class="row mt">
                        <div class="col-lg-12">
                            <div class="form-panel">
                                <form class="form-horizontal style-form">
                                    <br>
                                    <div class="form-group">

                                        <label class="control-label col-md-3">Trabajador:</label>
                                        <div class="col-md-3 col-xs-11">
                                            <select name="txtidTrab" class="form-control">
                                                <option value="0" selected>Seleccionar...</option>
                                                <%
                                                    for (int i = 0; i < nombre_trabajador.size(); i++) {
                                                        String nom = nombre_trabajador.get(i).toString();
                                                %>
                                                <option value="<%=i + 1%>"><%=nom%></option>
                                                <%  }%>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label col-md-3">Cliente:</label>
                                        <div class="col-md-3 col-xs-11">
                                            <select name="txtidCli" class="form-control">
                                                <option value="0" selected>Seleccionar...</option>
                                                <%
                                                    for (int i = 0; i < nombre_cliente.size(); i++) {
                                                        String nom = nombre_cliente.get(i).toString();
                                                %>
                                                <option value="<%=i + 1%>"><%=nom%></option>
                                                <%  }%>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label col-md-3">Fecha</label>
                                        <div class="col-md-3 col-xs-11">
                                            <input type="date" name="txtfecha" class="form-control">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label col-md-3">Descripcion</label>
                                        <div class="col-md-3 col-xs-11">
                                            <input type="text" name="txtDesc" class="form-control">
                                        </div>
                                    </div>


                                    <div class="form-group">
                                        <div class="col-md-3 col-xs-11">
                                            <input class="btn btn-success" class="form-control" type="submit" name="accion" value="Agregar" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                                            <input type="reset" name="Limpiar" class="btn btn-primary" class="form-control">
                                            <a href="Asiento_List.jsp">Regresar</a>
                                        </div>
                                    </div>
                            </div>
                            </form>
                        </div>
                    </div>
                    </div>
                    <br><br><br><br><br><br><br><br><br><br><br>
                    <footer class="site-footer">
                        <div class="text-center">
                            <p>
                                &copy; Copyrights <strong>Dashio</strong>. All Rights Reserved
                            </p>
                            <div class="credits">
                                Created with Dashio template by <a href="https://templatemag.com/">TemplateMag</a>
                            </div>
                            <a href="advanced_form_components.html#" class="go-top">
                                <i class="fa fa-angle-up"></i>
                            </a>
                        </div>
                    </footer>
                    <!--footer end-->
                </section>
                <!-- js placed at the end of the document so the pages load faster -->
                <script src="lib/jquery/jquery.min.js"></script>
                <script src="lib/bootstrap/js/bootstrap.min.js"></script>
                <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
                <script src="lib/jquery.scrollTo.min.js"></script>
                <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
                <!--common script for all pages-->
                <script src="lib/common-scripts.js"></script>
                <!--script for this page-->
                <script src="lib/jquery-ui-1.9.2.custom.min.js"></script>
                <script type="text/javascript" src="lib/bootstrap-fileupload/bootstrap-fileupload.js"></script>
                <script type="text/javascript" src="lib/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
                <script type="text/javascript" src="lib/bootstrap-daterangepicker/date.js"></script>
                <script type="text/javascript" src="lib/bootstrap-daterangepicker/daterangepicker.js"></script>
                <script type="text/javascript" src="lib/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
                <script type="text/javascript" src="lib/bootstrap-daterangepicker/moment.min.js"></script>
                <script type="text/javascript" src="lib/bootstrap-timepicker/js/bootstrap-timepicker.js"></script>
                <script src="lib/advanced-form-components.js"></script>

                </body>

                </html>
