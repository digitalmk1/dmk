<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp"></jsp:include>
  <body>
 
  <!-- Pre-loader end -->
  <jsp:include page="theme-loader.jsp"></jsp:include>
  
  <div id="pcoded" class="pcoded">
      <div class="pcoded-overlay-box"></div>
      <div class="pcoded-container navbar-wrapper">
     
      <!-- navbar.jsp -->
         <jsp:include page="navbar.jsp"></jsp:include>
         
         
         
          <div class="pcoded-main-container">
              <div class="pcoded-wrapper">
              <jsp:include page="main-menu.jsp"></jsp:include>
                  <div class="pcoded-content">
                  
                      <!-- Page-header start -->
                     <jsp:include page="pageheader.jsp"></jsp:include>
                      
                      <!-- Page-header end -->
                        <div class="pcoded-inner-content">
                            <!-- Main-body start -->
                            <div class="main-body">
                                <div class="page-wrapper">
                                    <!-- Page-body start -->
                                    <div class="page-body">
                                       <div class="row">
                                        
                                        
                                        
                                        
                                        
                                        
                                        <h1>CONTEUDO PAGINA BASE DO SISTEMA </h1>
                                        
                                        
                                        
                                        
                                        
                                           
                                            <!--  project and team member end -->
                                        </div>
                                    </div>
                                    <!-- Page-body end -->
                                </div>
                                <div id="styleSelector"> </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Required Jquery java script -->
 <jsp:include page="javascripfile.jsp"></jsp:include>
</body>

</html>