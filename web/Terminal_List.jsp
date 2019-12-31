
<%@page import="model.beans.Terminal"%>
<%@page import="model.dao.TerminalDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean 
    id="Cliente" 
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
                    <h3><i class="fa fa-angle-right"></i>Listado de Terminales</h3>
                    <a  href="TerminalControlador?accion=add" class="current-item">Agregar Terminal</a>
                    <div class="row mt">
                        <div class="col-lg-12">
                            <div class="content-panel">
                                <section id="unseen">
                                    <table class="table table-bordered table-striped table-condensed">
                                        <thead>
                                            <tr>
                                                <th>Id</th>
                                                <th>Tren</th>
                                                <th>Nombre</th>
                                                <th>Direccion</th>
                                                <th>Telefono</th>
                                                <th>Acciones</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                TerminalDAO dao = new TerminalDAO();
                                                List<Terminal> list = dao.findAll();
                                                Iterator<Terminal> iter = list.iterator();
                                                Terminal cli = null;
                                                while (iter.hasNext()) {
                                                    cli = iter.next();

                                            %>
                                            <tr>
                                                <td><%= cli.getIdTerminal()%></td>
                                                <td><%= cli.getIdTren()%></td>
                                                <td><%= cli.getNombre_Terminal()%></td>
                                                <td><%= cli.getDireccion_Terminal()%></td>
                                                <td><%= cli.getTelefono_Terminal()%></td>
                                                <td>
                                                    <a class="btn btn-warning" href="TerminalControlador?accion=edit&id=<%=cli.getIdTerminal()%>">Editar</a>    
                                                    <a class="btn btn-danger" href="TerminalControlador?accion=delete&id=<%=cli.getIdTerminal()%>">Eliminar</a>
                                                </td>
                                            </tr>
                                        </tbody>
                                        <%}%> 
                                    </table>
                                </section>
                            </div>
                        </div>
                    </div>
                    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                    <footer class="site-footer">
                        <div class="text-center">
                            <p>
                                &copy; Copyrights <strong>Dashio</strong>. All Rights Reserved
                            </p>
                            <div class="credits">
                                Created with FCCA template by BOVEA</a>
                            </div>
                            <a href="responsive_table.html#" class="go-top">
                                <i class="fa fa-angle-up"></i>
                            </a>
                        </div>
                    </footer>
                </section>
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
