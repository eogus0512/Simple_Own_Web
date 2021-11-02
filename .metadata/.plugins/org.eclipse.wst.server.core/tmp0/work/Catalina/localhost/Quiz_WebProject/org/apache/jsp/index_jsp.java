/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-11-02 16:25:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <title>동퀴콘</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/custom.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/favicon.png\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light fixed-top shadow-sm\" style=\"background-color: #558DF0;\">\r\n");
      out.write("    <div class=\"container-xxl d-flex align-items-md-center\" style=\"width:1200px\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"./img/mainIcon.png\" class=\"rounded float-start\" width=\"120\"></a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav me-auto\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\" style=\"font-size:15pt; color:white;\"><b>퀴즈 시작하기</b></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"registerQuiz.jsp\" style=\"font-size:15pt; color:white;\"><b>퀴즈 만들기</b></a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");

                String LoginID = null;
                String UserName = null;
                if(session.getAttribute("loginID") != null) {
                    LoginID = (String) session.getAttribute("LoginID");
                    UserName = (String) session.getAttribute("UserName");
                }
                if(LoginID == null) {
            
      out.write("\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                <a class=\"nav-link\" aria-current=\"page\" href=\"signUp.jsp\" style=\"color:white\">회원가입</a>\r\n");
      out.write("                <a class=\"btn btn-outline-primary\" href=\"login.jsp\" style=\"border-color: white; color: white\">로그인</a>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <ul class=\"navbar-nav d-flex\">\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" style=\"color: white\">\r\n");
      out.write("                        ");
      out.print(UserName );
      out.write(" 님\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #558DF0;\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"myPage.jsp\" style=\"color: white\">마이페이지</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\" style=\"color: white\">1:1 문의</a></li>\r\n");
      out.write("                        <li><hr class=\"dropdown-divider\" style=\"color: white\"></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"logout.jsp\" style=\"color: white\">로그아웃</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav><br><br><br><br><br>\r\n");
      out.write("<div id=\"mainSlide\" class=\"carousel slide carousel-fade\" data-bs-ride=\"carousel\" style=\"width:40%; margin: auto; display: flex; margin-bottom:40px; margin-top: 100px; border-radius:100px; border-width:3px; border-color:#558DF0;\">\r\n");
      out.write("    <div class=\"carousel-indicators\">\r\n");
      out.write("        <button type=\"button\" data-bs-target=\"#mainSlide\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n");
      out.write("        <button type=\"button\" data-bs-target=\"#mainSlide\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("        <button type=\"button\" data-bs-target=\"#mainSlide\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-inner\">\r\n");
      out.write("        <div class=\"carousel-item active\" id=\"first\">\r\n");
      out.write("            <img src=\"./img/quizRandom.png\" class=\"d-block w-100\" alt=\"첫번째\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\" id=\"second\">\r\n");
      out.write("            <img src=\"./img/quizRandom.png\" class=\"d-block w-100\" alt=\"두번째\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\" id=\"third\">\r\n");
      out.write("            <img src=\"./img/quizRandom.png\" class=\"d-block w-100\" alt=\"세번째\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#mainSlide\" data-bs-slide=\"prev\"\">\r\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#mainSlide\" data-bs-slide=\"next\">\r\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("    </button>\r\n");
      out.write("</div><br><br>\r\n");
      out.write("<div class=\"container-xxl d-flex\" style=\"width:820px; margin: auto;\">\r\n");
      out.write("\t<a class=\"btn\" href=\"#\" style=\"width:170px; height:50px; border-radius: 5px; font-size:15pt; background-color:#558DF0; color:white; padding:10px; margin:7px\"><b>국기</b></a>\r\n");
      out.write("\t<a class=\"btn\" href=\"solveQuiz.jsp\" style=\"width:170px; height:50px; border-radius: 5px; font-size:15pt; background-color:#558DF0; color:white; padding:10px; margin:7px\"><b>수도</b></a>\r\n");
      out.write("\t<a class=\"btn\" href=\"solveQuiz.jsp\" style=\"width:170px; height:50px; border-radius: 5px; font-size:15pt; background-color:#558DF0; color:white; padding:10px; margin:7px\"><b>상식</b></a>\r\n");
      out.write("\t<a class=\"btn\" href=\"solveQuiz.jsp\" style=\"width:170px; height:50px; border-radius: 5px; font-size:15pt; background-color:#558DF0; color:white; padding:10px; margin:7px\"><b>넌센스</b></a>\r\n");
      out.write("\t<a class=\"btn\" href=\"solveQuiz.jsp\" style=\"width:170px; height:50px; border-radius: 5px; font-size:15pt; background-color:#558DF0; color:white; padding:10px; margin:7px\"><b>한국사</b></a>\r\n");
      out.write("</div><br>\r\n");
      out.write("<div class=\"container-xxl d-flex\" style=\"width:800px; margin: auto;\">\r\n");
      out.write("\t<a class=\"btn\" href=\"#\" style=\"width:400px; height:70px; border-width:3px; border-color:#558DF0; border-radius: 5px 0px 0px 5px; font-size:20pt; color:#558DF0; padding:12px\"><b>랭킹</b></a>\r\n");
      out.write("\t<a class=\"btn\" href=\"#\" style=\"width:400px; height:70px; border-radius: 0px 5px 5px 0px; font-size:20pt; color:white; background-color: #558DF0; padding:12px\"><b>게시판</b></a>\r\n");
      out.write("</div><br><br><br><br>\r\n");
      out.write("<footer class=\"bg-light mt-4 p-5 text-center\" style=\"color: #000000;\">\r\n");
      out.write("    2017112079 윤대현<br>2017112066 정호종<br>\r\n");
      out.write("    Copyright &copy; 2021 ddolI98 All Rights Reserved.\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"./js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"./js/popper.js\"></script>\r\n");
      out.write("<script src=\"./js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
