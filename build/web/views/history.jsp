<%@page import="java.sql.ResultSet"%>
<%@page import="Controller.ProductController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='layouts/headgame.jsp'>
            <jsp:param name="title" value="History" />
        </jsp:include>
        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
    </head>
<body>
        <jsp:include page='layouts/navbarhistory.jsp'></jsp:include>
 <%
            ProductController pc = new ProductController();
            ResultSet rs;
            String nama = (String)request.getSession().getAttribute("nama");
           
            if (nama!=null) {
                rs = pc.getByName(nama);
            } else {
                rs = (ResultSet)request.getAttribute("rs");
            }
        %>

        <!-- Begin page content -->
        <div>
        <h1 class="contact">History</h1>
        <div class="row background-data2">
            <div class="col-12">
                <table>
                    <thead>
                        <tr>
                            <th>Username</th>
                            <th>User ID</th>
                            <th>Payment</th>
                            <th>Product</th>
                            <th>Aksi</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% while (rs.next()) {%>
                                <tr>
                                    <td><%= rs.getString("IGN")%></td>
                                    <td><%= rs.getString("UserID")%></td>
                                    <td><%= rs.getString("Payment")%></td>
                                    <td><%= rs.getString("Product")%></td>
                                    <td>
                                        <form action="delete?UserID=<%= rs.getString("UserID") %>" method="POST"
                                              onsubmit="return confirm('Are you sure want to delete the data?')"
                                        >
                                            <button type="submit" class="btn btn-sm btn-danger">Delete</button>
                                        </form>
                                        
                                    </td>
                                </tr>
                                <% }%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
    <jsp:include page='layouts/footer.jsp'></jsp:include>
    
</body>

</html>
