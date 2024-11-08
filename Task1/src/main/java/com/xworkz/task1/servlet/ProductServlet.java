package com.xworkz.task1.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.task1.dto.ProductDTO;
import com.xworkz.task1.service.ProductServiceImpl;
import com.xworkz.task1.service.ProductSrevice;
@WebServlet(loadOnStartup = 1, urlPatterns = "/booking")
public class ProductServlet extends HttpServlet{
	
	public ProductServlet() {
		System.out.println("This is product servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String companyName = req.getParameter("companyName");
		String productName = req.getParameter("productName");
		String productType = req.getParameter("productType");
		String quantityString = req.getParameter("quantity");
		String ProductCost = req.getParameter("cost");
		
		int quantity = Integer.valueOf(quantityString);
		int cost = Integer.valueOf(ProductCost);
		
		ProductDTO productDTO =new ProductDTO(companyName, productName, productType, quantity, cost);
		ProductSrevice productSrevice = new ProductServiceImpl();
		if(productSrevice.valid(productDTO)) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/product.jsp");
			req.setAttribute("success", "Product will be delivered");
			//req.setAttribute("Success", productSrevice); (optional)
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/product.jsp");
			req.setAttribute("failure", "Oops!...SORRY");
			req.setAttribute("failureMsg", productSrevice);
			dispatcher.forward(req, resp);
		}
	}
}
