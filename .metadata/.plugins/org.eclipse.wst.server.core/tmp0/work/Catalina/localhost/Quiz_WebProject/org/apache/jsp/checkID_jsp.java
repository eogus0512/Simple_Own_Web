/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-11-02 15:55:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkID_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>아이디 중복 체크</title>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html\"; charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/custom.css\">\r\n");
      out.write("\t<link rel=\"icon\" href=\"./img/favicon.png\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction pValue(){\r\n");
      out.write("\t\t\tdocument.getElementById(\"LoginID\").value = opener.document.userInfo.LoginID.value;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction sendCheckValue(){\r\n");
      out.write("\t\t\topener.document.userInfo.LoginID.value = document.getElementById(\"LoginID\").value;\r\n");
      out.write("\t\t\tif (opener != null) {\r\n");
      out.write("            \topener.chkForm = null;\r\n");
      out.write("            \tself.close();\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"pValue()\" class=\"text-center\" onsubmit=\"\">\r\n");
      out.write("<div id=\"wrap col-12\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<h4>아이디 중복체크</h4>\r\n");
      out.write("\t<hr class=\"my-4\">\r\n");
      out.write("\t<hr size=\"1\" width=\"460\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div id=\"chk\">\r\n");
      out.write("\t\t<form method=\"post\" action=\"action/checkIDAction.jsp\" id=\"checkForm\">\r\n");
      out.write("\t\t\t<div class=\"col-10 d-flex align-items-md-center container-xxl\">\r\n");
      out.write("\t\t\t\t<input type=\"id\" class=\"form-control\" name=\"LoginID\" id=\"LoginID\" placeholder=\"\" style=\"margin-right: 10px\" required>\r\n");
      out.write("\t\t\t\t<input class=\"col-3 btn\" style=\"background-color: #558DF0; color:white;\" type=\"submit\" value=\"중복확인\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form><br>\r\n");
      out.write("\t\t<div class=\"gap-5 d-md-block align-items-md-center container-xxl\">\r\n");
      out.write("\t\t\t<button class=\"col-3 btn float-right\" style=\"background-color: #558DF0; color:white;\" id=\"useID\" type=\"button\" onclick=\"sendCheckValue()\">사용하기</button>\r\n");
      out.write("\t\t\t<button class=\"col-3 btn float-right\" style=\"background-color: #558DF0; color:white;\" style=\"margin-left: 10%\" type=\"button\" onclick=\"window.close()\">취소</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
