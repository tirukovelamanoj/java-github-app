<%@ page language="java" import="com.example.web.App.*" %>

<!DOCTYPE html>
<html>
	<body>
		
        <%@ include  file="page.html" %>
		
        <footer class="pt-4 my-md-5 pt-md-5 border-top">
            <div class="row">
              <div class="col-12 col-md">
                <p>Using JSP square of 2 - <%= new JavaWebApp().squareOfNumber(2) %> </p>
              </div>
            </div>
          </footer>

	</body>
</html>