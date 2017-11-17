<#include "/macro_components/mainNavigation.ftl">

<!doctype html>
<html>
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- Bootstrap core CSS -->
      <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
      <!-- Our CSS -->
      <link href="/css/index.css" rel="stylesheet">
      <!-- Fonts CSS -->
      <link href="https://fonts.googleapis.com/css?family=Amaranth:400,400i,700,700i" rel="stylesheet">
      <!-- Textillate CSS -->
      <link href="/vendor/textillate/assets/animate.css" rel="stylesheet">

      <!-- Bootstrap core JavaScript -->
      <script src="/vendor/jquery/jquery.min.js" defer></script>
      <script src="/vendor/bootstrap/js/bootstrap.bundle.min.js" defer></script>

      <!-- Plugin JavaScript -->
      <script src="/vendor/jquery-easing/jquery.easing.min.js" defer></script>

      <!-- Textillate javascript -->
      <script src="/vendor/textillate/assets/jquery.lettering.js" defer></script>
      <!-- <script src="vendor/textillate/assets/jquery.fittext.js" defer></script> -->
      <script src="/vendor/textillate/jquery.textillate.js" defer></script>

      <!-- Contact Form JavaScript -->
      <script src="/js/jqBootstrapValidation.js" defer></script>

      <!-- Our JavaScript -->
      <script src="/js/index.js" defer></script>
      <title>Concert App</title>
   </head>

   <body>

      <@mainNavigation/>

      <section id="wall" class="container-fluid">
         <div class="row" id="jumbotron_wrapper">
            <div class="col-lg-4"></div>
            <div class="col-lg-4 jumbotron text-center" style="background:none;">
               <h1 class="tlt1Fade">Concert App by Gang Of Five.</h1>
               <br>
               <p id="jumbText" class="collapse">
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                  Nulla vestibulum ex pretium elit facilisis, sit amet venenatis erat facilisis.
                  Aliquam congue sem dui, vitae egestas diam posuere id.Cras congue tellus vel rutrum porta.
                  Quisque congue eu metus et dictum. Etiam nec sapien ut odio eleifend rutrum vel vel ante.
               </p>
               <br>
               <a class="btn btn-success" id="add_concert_btn">
                  Add concert to your archive
               </a>
            </div>
            <div class="col-lg-4"></div>
         </div>
      </section>

      <section id="services" class="container-fluid">
         <div class="row">
            <div class="col-xs-12 col-lg-4">
            </div>
            <div class="col-xs-12 col-lg-8"></div>
         </div>
      </section>
   </body>

</html>
