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

										<!-- <h2> Cadastro de usuarios </h2> -->
										<div class="row">
											<div class="col-sm-12">
												<!-- Basic Form Inputs card start -->
												<div class="card">
													<div class="card-header"></div>
													

														      <h5>Cadastro de Usuários</h5>
                                                        <!--<span>Add class of <code>.form-control</code> with <code>&lt;input&gt;</code> tag</span>-->
                                                    
                                                    <div class="card-block">
                                                        <form class="form-material">
                                                            <div class="form-group form-default">
                                                                <input type="text" name="Código" class="form-control" required="" readonly="readonly">
                                                                <span class="form-bar"></span>
                                                                <label class="float-label">Código:</label>
                                                            </div>
                                                            
                                                            <div class="form-group form-default">
                                                                <input type="text" name="footer-email" class="form-control" required="">
                                                                <span class="form-bar"></span>
                                                                <label class="float-label">Usuário:</label>
                                                            </div>
                                                           
                                                            <div class="form-group form-default">
                                                                <input type="password" name="footer-email" class="form-control" required="">
                                                                <span class="form-bar"></span>
                                                                <label class="float-label">Senha:</label>
                                                            </div>
                                                            
                                                             <div class="form-group form-default">
                                                                <input type="text" name="Nome do Usuário" class="form-control" required="">
                                                                <span class="form-bar"></span>
                                                                <label class="float-label">Nome:</label>
                                                            </div>
                                                            
                                                            <div class="form-group form-default">
                                                                <input type="text" name="footer-email" class="form-control" required="">
                                                                <span class="form-bar"></span>
                                                                <label class="float-label">Email (exe:@gmail.com)</label>
                                                                
                                                                
													                               
                                                            </div>
                                                        </form>
                                                                   <!-- BOTOES -->                     
													            <button class="btn btn-primary waves-effect waves-light">Novo</button>
													            <button class="btn btn-success waves-effect waves-light">Salvar</button>
													            <button class="btn btn-warning waves-effect waves-light">Aterar</button>
													            <button class="btn btn-danger waves-effect waves-light">Excluir</button>

														<!--  project and team member end -->

													</div>
													<!-- Page-body end -->
												</div>
												<div id="styleSelector"></div>
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