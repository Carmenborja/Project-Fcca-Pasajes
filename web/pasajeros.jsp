<%-- 
    Document   : pasajeros
    Created on : 11/12/2019, 02:56:43 PM
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
                        <p class="page-header__subtitle">Pasajeros</p>
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
                                    style="background:#BD1512; color:#0A0A0A;"><a class="" href="pasajeros.jsp">Paso 3: Pasajeros</a></th>

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
                    <div class="container">
            <div class="col-lg-6"  >
                <form action="ClienteControlador" class="form-group">
                    
                    Nombres
                    <input type="text" name="txtNombres" class="form-control"><br> 
                    Apellidos
                    <input type="text" name="txtApellidos" class="form-control"><br> 
                    Tipo de Documento
                    <select name="cboTipoD" class="form-control" value="DNI">
                        <option value="Pasaporte">Pasaporte</option>
                        <option value="DNI">DNI</option>
                        <option value="FAP">FAP</option>
                    </select><br> 
                    Numero de Documento
                    <input type="text" name="txtNDocumento" class="form-control"><br> 
                    Pais<br>
                    <select name="cboP" class="form-control">
                        <option value="af">Afghanistan</option>
                                <option value="ax">Åland Islands</option>
                                <option value="al">Albania</option>
                                <option value="dz">Algeria</option>
                                <option value="as">American Samoa</option>
                                <option value="ad">Andorra</option>
                                <option value="ao">Angola</option>
                                <option value="ai">Anguilla</option>
                                <option value="aq">Antarctica</option>
                                <option value="ag">Antigua and Barbuda</option>
                                <option value="ar">Argentina</option>
                                <option value="am">Armenia</option>
                                <option value="aw">Aruba</option>
                                <option value="au">Australia</option>
                                <option value="at">Austria</option>
                                <option value="az">Azerbaijan</option>
                                <option value="bs">Bahamas</option>
                                <option value="bh">Bahrain</option>
                                <option value="bd">Bangladesh</option>
                                <option value="bb">Barbados</option>
                                <option value="by">Belarus</option>
                                <option value="be">Belgium</option>
                                <option value="bz">Belize</option>
                                <option value="bj">Benin</option>
                                <option value="bm">Bermuda</option>
                                <option value="bt">Bhutan</option>
                                <option value="bo">Bolivia, Plurinational State of</option>
                                <option value="bq">Bonaire, Sint Eustatius and Saba</option>
                                <option value="ba">Bosnia and Herzegovina</option>
                                <option value="bw">Botswana</option>
                                <option value="bv">Bouvet Island</option>
                                <option value="br">Brazil</option>
                                <option value="io">British Indian Ocean Territory</option>
                                <option value="bn">Brunei Darussalam</option>
                                <option value="bg">Bulgaria</option>
                                <option value="bf">Burkina Faso</option>
                                <option value="bi">Burundi</option>
                                <option value="kh">Cambodia</option>
                                <option value="cm">Cameroon</option>
                                <option value="ca">Canada</option>
                                <option value="cv">Cape Verde</option>
                                <option value="ky">Cayman Islands</option>
                                <option value="cf">Central African Republic</option>
                                <option value="td">Chad</option>
                                <option value="cl">Chile</option>
                                <option value="cn">China</option>
                                <option value="cx">Christmas Island</option
                                ><option value="cc">Cocos (Keeling) Islands</option>
                                <option value="co">Colombia</option>
                                <option value="km">Comoros</option>
                                <option value="cg">Congo</option>
                                <option value="cd">Congo, the Democratic Republic of the</option>
                                <option value="ck">Cook Islands</option>
                                <option value="cr">Costa Rica</option>
                                <option value="ci">Côte d'Ivoire</option
                                ><option value="hr">Croatia</option>
                                <option value="cu">Cuba</option>
                                <option value="cw">Curaçao</option>
                                <option value="cy">Cyprus</option>
                                <option value="cz">Czech Republic</option>
                                <option value="dk">Denmark</option>
                                <option value="dj">Djibouti</option>
                                <option value="dm">Dominica</option>
                                <option value="do">Dominican Republic</option>
                                <option value="ec">Ecuador</option>
                                <option value="eg">Egypt</option>
                                <option value="sv">El Salvador</option>
                                <option value="gq">Equatorial Guinea</option>
                                <option value="er">Eritrea</option>
                                <option value="ee">Estonia</option>
                                <option value="et">Ethiopia</option>
                                <option value="fk">Falkland Islands (Malvinas)</option>
                                <option value="fo">Faroe Islands</option>
                                <option value="fj">Fiji</option>
                                <option value="fi">Finland</option>
                                <option value="fr">France</option>
                                <option value="gf">French Guiana</option>
                                <option value="pf">French Polynesia</option>
                                <option value="tf">French Southern Territories</option>
                                <option value="ga">Gabon</option>
                                <option value="gm">Gambia</option>
                                <option value="ge">Georgia</option>
                                <option value="de">Germany</option>
                                <option value="gh">Ghana</option>
                                <option value="gi">Gibraltar</option>
                                <option value="gr">Greece</option>
                                <option value="gl">Greenland</option>
                                <option value="gd">Grenada</option>
                                <option value="gp">Guadeloupe</option>
                                <option value="gu">Guam</option>
                                <option value="gt">Guatemala</option>
                                <option value="gg">Guernsey</option>
                                <option value="gn">Guinea</option>
                                <option value="gw">Guinea-Bissau</option>
                                <option value="gy">Guyana</option>
                                <option value="ht">Haiti</option>
                                <option value="hm">Heard Island and McDonald Islands</option>
                                <option value="va">Holy See (Vatican City State)</option>
                                <option value="hn">Honduras</option>
                                <option value="hk">Hong Kong</option>
                                <option value="hu">Hungary</option>
                                <option value="is">Iceland</option>
                                <option value="in">India</option>
                                <option value="id">Indonesia</option>
                                <option value="ir">Iran, Islamic Republic of</option>
                                <option value="iq">Iraq</option>
                                <option value="ie">Ireland</option>
                                <option value="im">Isle of Man</option>
                                <option value="il">Israel</option>
                                <option value="it">Italy</option>
                                <option value="jm">Jamaica</option>
                                <option value="jp">Japan</option>
                                <option value="je">Jersey</option>
                                <option value="jo">Jordan</option>
                                <option value="kz">Kazakhstan</option>
                                <option value="ke">Kenya</option>
                                <option value="ki">Kiribati</option>
                                <option value="kp">Korea, Democratic People's Republic of</option>
                                <option value="kr">Korea, Republic of</option>
                                <option value="kw">Kuwait</option>
                                <option value="kg">Kyrgyzstan</option>
                                <option value="la">Lao People's Democratic Republic</option>
                                <option value="lv">Latvia</option>
                                <option value="lb">Lebanon</option>
                                <option value="ls">Lesotho</option>
                                <option value="lr">Liberia</option>
                                <option value="ly">Libya</option>
                                <option value="li">Liechtenstein</option>
                                <option value="lt">Lithuania</option>
                                <option value="lu">Luxembourg</option>
                                <option value="mo">Macao</option>
                                <option value="mk">Macedonia, the Former Yugoslav Republic of</option>
                                <option value="mg">Madagascar</option>
                                <option value="mw">Malawi</option>
                                <option value="my">Malaysia</option>
                                <option value="mv">Maldives</option>
                                <option value="ml">Mali</option>
                                <option value="mt">Malta</option>
                                <option value="mh">Marshall Islands</option>
                                <option value="mq">Martinique</option>
                                <option value="mr">Mauritania</option>
                                <option value="mu">Mauritius</option>
                                <option value="yt">Mayotte</option>
                                <option value="mx">Mexico</option>
                                <option value="fm">Micronesia, Federated States of</option>
                                <option value="md">Moldova, Republic of</option>
                                <option value="mc">Monaco</option>
                                <option value="mn">Mongolia</option>
                                <option value="me">Montenegro</option>
                                <option value="ms">Montserrat</option>
                                <option value="ma">Morocco</option>
                                <option value="mz">Mozambique</option>
                                <option value="mm">Myanmar</option>
                                <option value="na">Namibia</option>
                                <option value="nr">Nauru</option>
                                <option value="np">Nepal</option>
                                <option value="nl">Netherlands</option>
                                <option value="nc">New Caledonia</option>
                                <option value="nz">New Zealand</option>
                                <option value="ni">Nicaragua</option>
                                <option value="ne">Niger</option>
                                <option value="ng">Nigeria</option>
                                <option value="nu">Niue</option>
                                <option value="nf">Norfolk Island</option>
                                <option value="mp">Northern Mariana Islands</option>
                                <option value="no">Norway</option>
                                <option value="om">Oman</option>
                                <option value="pk">Pakistan</option>
                                <option value="pw">Palau</option>
                                <option value="ps">Palestine, State of</option>
                                <option value="pa">Panama</option>
                                <option value="pg">Papua New Guinea</option>
                                <option value="py">Paraguay</option>
                                <option value="pe" selected="">Perú</option>
                                <option value="ph">Philippines</option>
                                <option value="pn">Pitcairn</option>
                                <option value="pl">Poland</option>
                                <option value="pt">Portugal</option>
                                <option value="pr">Puerto Rico</option>
                                <option value="qa">Qatar</option>
                                <option value="re">Réunion</option>
                                <option value="ro">Romania</option>
                                <option value="ru">Russian Federation</option>
                                <option value="rw">Rwanda</option>
                                <option value="bl">Saint Barthélemy</option>
                                <option value="sh">Saint Helena, Ascension and Tristan da Cunha</option>
                                <option value="kn">Saint Kitts and Nevis</option>
                                <option value="lc">Saint Lucia</option>
                                <option value="mf">Saint Martin (French part)</option>
                                <option value="pm">Saint Pierre and Miquelon</option>
                                <option value="vc">Saint Vincent and the Grenadines</option>
                                <option value="ws">Samoa</option>
                                <option value="sm">San Marino</option>
                                <option value="st">Sao Tome and Principe</option>
                                <option value="sa">Saudi Arabia</option>
                                <option value="sn">Senegal</option>
                                <option value="rs">Serbia</option>
                                <option value="sc">Seychelles</option>
                                <option value="sl">Sierra Leone</option>
                                <option value="sg">Singapore</option>
                                <option value="sx">Sint Maarten (Dutch part)</option>
                                <option value="sk">Slovakia</option>
                                <option value="si">Slovenia</option>
                                <option value="sb">Solomon Islands</option>
                                <option value="so">Somalia</option>
                                <option value="za">South Africa</option>
                                <option value="gs">South Georgia and the South Sandwich Islands</option>
                                <option value="ss">South Sudan</option>
                                <option value="es">Spain</option>
                                <option value="lk">Sri Lanka</option>
                                <option value="sd">Sudan</option>
                                <option value="sr">Surilabel</option>
                                <option value="sj">Svalbard and Jan Mayen</option>
                                <option value="sz">Swaziland</option>
                                <option value="se">Sweden</option>
                                <option value="ch">Switzerland</option>
                                <option value="sy">Syrian Arab Republic</option>
                                <option value="tw">Taiwan, Province of China</option>
                                <option value="tj">Tajikistan</option>
                                <option value="tz">Tanzania, United Republic of</option>
                                <option value="th">Thailand</option>
                                <option value="tl">Timor-Leste</option>
                                <option value="tg">Togo</option>
                                <option value="tk">Tokelau</option>
                                <option value="to">Tonga</option>
                                <option value="tt">Trinidad and Tobago</option>
                                <option value="tn">Tunisia</option>
                                <option value="tr">Turkey</option>
                                <option value="tm">Turkmenistan</option>
                                <option value="tc">Turks and Caicos Islands</option>
                                <option value="tv">Tuvalu</option>
                                <option value="ug">Uganda</option>
                                <option value="ua">Ukraine</option>
                                <option value="ae">United Arab Emirates</option>
                                <option value="gb">United Kingdom</option>
                                <option value="us">United States</option>
                                <option value="um">United States Minor Outlying Islands</option>
                                <option value="uy">Uruguay</option>
                                <option value="uz">Uzbekistan</option>
                                <option value="vu">Vanuatu</option>
                                <option value="ve">Venezuela, Bolivarian Republic of</option>
                                <option value="vn">Viet Nam</option>
                                <option value="vg">Virgin Islands, British</option>
                                <option value="vi">Virgin Islands, U.S.</option>
                                <option value="wf">Wallis and Futuna</option>
                                <option value="eh">Western Sahara</option>
                                <option value="ye">Yemen</option>
                                <option value="zm">Zambia</option>
                                <option value="zw">Zimbabwe</option>
                    </select><br> 
                    Telefono
                    <input type="text" name="txtTelf" class="form-control"><br> 
                    Direccion
                    <input type="text" name="txtDireccion" class="form-control"><br> 
                    Genero
                    <select name="cboG" class="form-control">
                        <option value="femenino" >F</option>
                        <option value="masculino">M </option>
                    </select><br> 
                    Correo
                    <input type="text" name="txtCorreo" class="form-control"><br> 
                    Fecha de Nacimiento
                    <input type="date" name="txtFechaN" class="form-control"><br> 
                    <input class="btn btn-success" class="form-control" type="submit" name="accion" value="create" >
                    <input type="reset" name="Limpiar" class="btn btn-primary" class="form-control">
                    <a href="ClienteControlador?accion=listar">Regresar</a>

                </form>
            </div><br>

        </div> 

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
