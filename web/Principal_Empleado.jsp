<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        <title>FCCA - Bootstrap Admin Template</title>
        <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link href="css/style.css" rel="stylesheet">
        <link href="css/style-responsive.css" rel="stylesheet">
        <script src="lib/chart-master/Chart.js"></script>
    </head>

    <body>
        <section id="container">
            <header class="header black-bg">
                <div class="sidebar-toggle-box">
                    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>
                <a href="index.html" class="logo"><b>FC<span>CA</span></b></a>
                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="index.jsp">Cerrar Sesión</a></li>
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
                    <img src="img/IMG_2518.png" width="1290" height="">
                </section>
            </section>
            <footer class="site-footer">
                <div class="text-center">
                    <p>
                        &copy; Copyrights <strong>FCCA</strong>. All Rights Reserved
                    </p>
                    <div class="credits">
                        Created with FCCA template by Carmen Borja, Piero Vergara y Gabriel Castillo
                    </div>
                </div>
            </footer>
            <script src="lib/jquery/jquery.min.js"></script>

            <script src="lib/bootstrap/js/bootstrap.min.js"></script>
            <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
            <script src="lib/jquery.scrollTo.min.js"></script>
            <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
            <script src="lib/jquery.sparkline.js"></script>
            <script src="lib/common-scripts.js"></script>
            <script type="text/javascript" src="lib/gritter/js/jquery.gritter.js"></script>
            <script type="text/javascript" src="lib/gritter-conf.js"></script>
            <script src="lib/sparkline-chart.js"></script>
            <script src="lib/zabuto_calendar.js"></script>

            <script type="application/javascript">
                $(document).ready(function() {
                $("#date-popover").popover({
                html: true,
                trigger: "manual"
                });
                $("#date-popover").hide();
                $("#date-popover").click(function(e) {
                $(this).hide();
                });

                $("#my-calendar").zabuto_calendar({
                action: function() {
                return myDateFunction(this.id, false);
                },
                action_nav: function() {
                return myNavFunction(this.id);
                },
                ajax: {
                url: "show_data.php?action=1",
                modal: true
                },
                legend: [{
                type: "text",
                label: "Special event",
                badge: "00"
                },
                {
                type: "block",
                label: "Regular event",
                }
                ]
                });
                });

                function myNavFunction(id) {
                $("#date-popover").hide();
                var nav = $("#" + id).data("navigation");
                var to = $("#" + id).data("to");
                console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
                }
            </script>
    </body>

</html>
