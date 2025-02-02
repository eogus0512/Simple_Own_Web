<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="user.userDTO"%>
<%@ page import="user.userDAO"%>
<%@ page import="java.io.PrintWriter"%>
<%
    request.setCharacterEncoding("UTF-8");
    String loginID = null;
    String password = null;
    String nickName = null;
    String mailAddress = null;
    String userName = null;
    String userAge = null;
    String phoneNumber = null;
    String userAddress = null;

    if(request.getParameter("loginID") != null) {
        loginID = (String) request.getParameter("loginID");
    }
    if(request.getParameter("password") != null) {
        password = (String) request.getParameter("password");
    }
    userDAO userdao = new userDAO();
    int result = userdao.login(loginID, password);
    String[] info = userdao.getInfo(loginID);
    if(result == 1) {
        session.setAttribute("loginID", loginID);
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("location.href = './../index.jsp';");
        script.println("</script>");
        script.close();

        session.setAttribute("UserName", info[0]);
        session.setAttribute("LoginID", info[1]);
        session.setAttribute("Password", info[2]);
        session.setAttribute("Email", info[3]);
        session.setAttribute("Age", info[4]);
        session.setAttribute("Phone", info[5]);
        session.setAttribute("NickName", info[6]);
        session.setAttribute("Address", info[7]);
        session.setAttribute("Date", info[8]);

        return;
    } else if (result == 0) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('비밀번호가 틀립니다.');");
        script.println("history.back();");
        script.println("</script>");
        script.close();
        return;
    } else if (result == -1) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('존재하지 않는 아이디입니다.');");
        script.println("history.back();");
        script.println("</script>");
        script.close();
        return;
    } else if (result == -2) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('데이터베이스 오류');");
        script.println("history.back();");
        script.println("</script>");
        script.close();
        return;
    }
%>
