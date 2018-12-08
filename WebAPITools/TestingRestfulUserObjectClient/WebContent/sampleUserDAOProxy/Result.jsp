<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleUserDAOProxyid" scope="session" class="di.via.user.UserDAOProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleUserDAOProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleUserDAOProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleUserDAOProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        di.via.user.UserDAO getUserDAO10mtemp = sampleUserDAOProxyid.getUserDAO();
if(getUserDAO10mtemp == null){
%>
<%=getUserDAO10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        java.lang.Object[] getUsers15mtemp = sampleUserDAOProxyid.getUsers();
if(getUsers15mtemp == null){
%>
<%=getUsers15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getUsers15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getUsers15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 18:
        gotMethod = true;
        String id_1id=  request.getParameter("id27");
        int id_1idTemp  = Integer.parseInt(id_1id);
        di.via.user.User getUser18mtemp = sampleUserDAOProxyid.getUser(id_1idTemp);
if(getUser18mtemp == null){
%>
<%=getUser18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(getUser18mtemp != null){
java.lang.String typepassword21 = getUser18mtemp.getPassword();
        String tempResultpassword21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword21));
        %>
        <%= tempResultpassword21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getUser18mtemp != null){
java.lang.String typeemail23 = getUser18mtemp.getEmail();
        String tempResultemail23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail23));
        %>
        <%= tempResultemail23 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getUser18mtemp != null){
%>
<%=getUser18mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 29:
        gotMethod = true;
        String id_2id=  request.getParameter("id32");
        int id_2idTemp  = Integer.parseInt(id_2id);
        sampleUserDAOProxyid.deleteUser(id_2idTemp);
break;
case 34:
        gotMethod = true;
        String password_4id=  request.getParameter("password39");
            java.lang.String password_4idTemp = null;
        if(!password_4id.equals("")){
         password_4idTemp  = password_4id;
        }
        String email_5id=  request.getParameter("email41");
            java.lang.String email_5idTemp = null;
        if(!email_5id.equals("")){
         email_5idTemp  = email_5id;
        }
        String id_6id=  request.getParameter("id43");
        int id_6idTemp  = Integer.parseInt(id_6id);
        %>
        <jsp:useBean id="di1via1user1User_3id" scope="session" class="di.via.user.User" />
        <%
        di1via1user1User_3id.setPassword(password_4idTemp);
        di1via1user1User_3id.setEmail(email_5idTemp);
        di1via1user1User_3id.setId(id_6idTemp);
        sampleUserDAOProxyid.updateUser(di1via1user1User_3id);
break;
case 45:
        gotMethod = true;
        String password_8id=  request.getParameter("password50");
            java.lang.String password_8idTemp = null;
        if(!password_8id.equals("")){
         password_8idTemp  = password_8id;
        }
        String email_9id=  request.getParameter("email52");
            java.lang.String email_9idTemp = null;
        if(!email_9id.equals("")){
         email_9idTemp  = email_9id;
        }
        String id_10id=  request.getParameter("id54");
        int id_10idTemp  = Integer.parseInt(id_10id);
        %>
        <jsp:useBean id="di1via1user1User_7id" scope="session" class="di.via.user.User" />
        <%
        di1via1user1User_7id.setPassword(password_8idTemp);
        di1via1user1User_7id.setEmail(email_9idTemp);
        di1via1user1User_7id.setId(id_10idTemp);
        sampleUserDAOProxyid.addUser(di1via1user1User_7id);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>