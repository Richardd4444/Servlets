package com.servlets;

import com.beans.Product;
import com.dao.ApplicationDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //collect search string from the form
        String searchString = req.getParameter("search");

        //call DAO layer and get all products for search criteria
        ApplicationDao dao = new ApplicationDao();
        List<Product> products = dao.searchProducts(searchString);

        //write the product data back to the client browser
        String page = getHtlmString(req.getServletContext().getRealPath("/html/searchResults.html"),products);
        resp.getWriter().write(page);

    }

    /**
     * This methods reads the HTML template as a String, replaces placeholders
     * with the values and returns the entire page as a String
     * @param filePath
     * @param products
     * @return
     * @throws IOException
     */

    public String getHtlmString(String filePath, List<Product> products) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line ="";
        StringBuffer buffer = new StringBuffer();

        while((line=reader.readLine())!=null){
            buffer.append(line);
        }
        reader.close();
        String page = buffer.toString();

        page = MessageFormat.format(page, products.get(0).getProductImgPath(), products.get(1).getProductImgPath(), products.get(2).getProductImgPath(),
                products.get(0).getProductName(), products.get(1).getProductName(), products.get(2).getProductName(),0);

        return page;
    }
}
