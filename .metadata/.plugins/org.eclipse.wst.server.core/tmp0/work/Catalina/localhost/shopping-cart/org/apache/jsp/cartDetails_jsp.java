/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.100
 * Generated at: 2024-05-03 05:11:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.shashi.service.impl.*;
import com.shashi.service.*;
import com.shashi.beans.*;
import java.util.*;
import javax.servlet.ServletOutputStream;
import java.io.*;

public final class cartDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/footer.html", Long.valueOf(1714654048246L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(8);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("com.shashi.beans");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("com.shashi.service.impl");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.shashi.service");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("javax.servlet.ServletOutputStream");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<title>Cart Details</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\r\n");
      out.write("\r\n");
      out.write("	");

	/* Checking the user credentials */
	String userName = (String) session.getAttribute("username");
	String password = (String) session.getAttribute("password");

	if (userName == null || password == null) {

		response.sendRedirect("login.jsp?message=Session Expired, Login Again!!");

	}

	String addS = request.getParameter("add");
	if (addS != null) {

		int add = Integer.parseInt(addS);
		String uid = request.getParameter("uid");
		String pid = request.getParameter("pid");
		int avail = Integer.parseInt(request.getParameter("avail"));
		int cartQty = Integer.parseInt(request.getParameter("qty"));
		CartServiceImpl cart = new CartServiceImpl();

		if (add == 1) {
			//Add Product into the cart
			cartQty += 1;
			if (cartQty <= avail) {
		cart.addProductToCart(uid, pid, 1);
			} else {
		response.sendRedirect("./AddtoCart?pid=" + pid + "&pqty=" + cartQty);
			}
		} else if (add == 0) {
			//Remove Product from the cart
			cart.removeProductFromCart(uid, pid);
		}
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"text-center\"\r\n");
      out.write("		style=\"color: green; font-size: 24px; font-weight: bold;\">Cart\r\n");
      out.write("		Items</div>\r\n");
      out.write("	<!-- <script>document.getElementById('mycart').innerHTML='<i data-count=\"20\" class=\"fa fa-shopping-cart fa-3x icon-white badge\" style=\"background-color:#333;margin:0px;padding:0px; margin-top:5px;\"></i>'</script>\r\n");
      out.write(" -->\r\n");
      out.write("	<!-- Start of Product Items List -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("		<table class=\"table table-hover\">\r\n");
      out.write("			<thead\r\n");
      out.write("				style=\"background-color: #186188; color: white; font-size: 16px; font-weight: bold;\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>Picture</th>\r\n");
      out.write("					<th>Products</th>\r\n");
      out.write("					<th>Price</th>\r\n");
      out.write("					<th>Quantity</th>\r\n");
      out.write("					<th>Add</th>\r\n");
      out.write("					<th>Remove</th>\r\n");
      out.write("					<th>Amount</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody\r\n");
      out.write("				style=\"background-color: white; font-size: 15px; font-weight: bold;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				");

				CartServiceImpl cart = new CartServiceImpl();
				List<CartBean> cartItems = new ArrayList<CartBean>();
				cartItems = cart.getAllCartItems(userName);
				double totAmount = 0;
				for (CartBean item : cartItems) {

					String prodId = item.getProdId();

					int prodQuantity = item.getQuantity();

					ProductBean product = new ProductServiceImpl().getProductDetails(prodId);

					double currAmount = product.getProdPrice() * prodQuantity;

					totAmount += currAmount;

					if (prodQuantity > 0) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td><img src=\"./ShowImage?pid=");
      out.print(product.getProdId());
      out.write("\"\r\n");
      out.write("						style=\"width: 50px; height: 50px;\"></td>\r\n");
      out.write("					<td>");
      out.print(product.getProdName());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(product.getProdPrice());
      out.write("</td>\r\n");
      out.write("					<td><form method=\"post\" action=\"./UpdateToCart\">\r\n");
      out.write("							<input type=\"number\" name=\"pqty\" value=\"");
      out.print(prodQuantity);
      out.write("\"\r\n");
      out.write("								style=\"max-width: 70px;\" min=\"0\"> <input type=\"hidden\"\r\n");
      out.write("								name=\"pid\" value=\"");
      out.print(product.getProdId());
      out.write("\"> <input\r\n");
      out.write("								type=\"submit\" name=\"Update\" value=\"Update\"\r\n");
      out.write("								style=\"max-width: 80px;\">\r\n");
      out.write("						</form></td>\r\n");
      out.write("					<td><a\r\n");
      out.write("						href=\"cartDetails.jsp?add=1&uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&avail=");
      out.print(product.getProdQuantity());
      out.write("&qty=");
      out.print(prodQuantity);
      out.write("\"><i\r\n");
      out.write("							class=\"fa fa-plus\"></i></a></td>\r\n");
      out.write("					<td><a\r\n");
      out.write("						href=\"cartDetails.jsp?add=0&uid=");
      out.print(userName);
      out.write("&pid=");
      out.print(product.getProdId());
      out.write("&avail=");
      out.print(product.getProdQuantity());
      out.write("&qty=");
      out.print(prodQuantity);
      out.write("\"><i\r\n");
      out.write("							class=\"fa fa-minus\"></i></a></td>\r\n");
      out.write("					<td>");
      out.print(currAmount);
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("\r\n");
      out.write("				");

				}
				}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<tr style=\"background-color: grey; color: white;\">\r\n");
      out.write("					<td colspan=\"6\" style=\"text-align: center;\">Total Amount to\r\n");
      out.write("						Pay (in Rupees)</td>\r\n");
      out.write("					<td>");
      out.print(totAmount);
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				if (totAmount != 0) {
				
      out.write("\r\n");
      out.write("				<tr style=\"background-color: grey; color: white;\">\r\n");
      out.write("					<td colspan=\"4\" style=\"text-align: center;\">\r\n");
      out.write("					<td><form method=\"post\">\r\n");
      out.write("							<button formaction=\"userHome.jsp\"\r\n");
      out.write("								style=\"background-color: black; color: white;\">Cancel</button>\r\n");
      out.write("						</form></td>\r\n");
      out.write("					<td colspan=\"2\" align=\"center\"><form method=\"post\">\r\n");
      out.write("							<button style=\"background-color: blue; color: white;\"\r\n");
      out.write("								formaction=\"payment.jsp?amount=");
      out.print(totAmount);
      out.write("\">Pay Now</button>\r\n");
      out.write("						</form></td>\r\n");
      out.write("\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- ENd of Product Items List -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Shoping Center</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/changes.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\r\n");
      out.write("	<!-- Start the footer Contacts -->\r\n");
      out.write("	<!-- <a name=\"contact\"></a> -->\r\n");
      out.write("	<div class=\"container-fluid\"\r\n");
      out.write("		style=\"background-color: #454545; color: white; margin-top: 200px;\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<h3 class=\"text-center\">Contact</h3>\r\n");
      out.write("			<p class=\"text-center\">\r\n");
      out.write("				<em>We care for our farmers and consumers!</em>\r\n");
      out.write("			</p>\r\n");
      out.write("			<div class=\"row test\">\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("					<p>Fan? Drop a note.</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-map-marker\"></span>SRM\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-phone\"></span>Phone: +91\r\n");
      out.write("						9510898692\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-envelope\"></span>Email:\r\n");
      out.write("						ahhsanul@gmail.com\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<span class=\"glyphicon glyphicon-copyright-mark\"></span>\r\n");
      out.write("						AgriCare- 2024\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-8\">\r\n");
      out.write("					<form action=\"fansMessage\" method=\"post\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-sm-6 form-group\">\r\n");
      out.write("								<input class=\"form-control\" id=\"name\" name=\"name\"\r\n");
      out.write("									placeholder=\"Name\" type=\"text\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-sm-6 form-group\">\r\n");
      out.write("								<input class=\"form-control\" id=\"email\" name=\"email\"\r\n");
      out.write("									placeholder=\"Email\" type=\"email\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<textarea class=\"form-control\" id=\"comments\" name=\"comments\"\r\n");
      out.write("							placeholder=\"Comment\" rows=\"5\" required></textarea>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-md-12 form-group\">\r\n");
      out.write("								<button class=\"btn pull-right\" type=\"submit\">Send</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- End of Contact or about us -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
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
