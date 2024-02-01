package com.study.someprogect;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        if (request.getRequestURI().startsWith("/user")) {
            String userId = request.getParameter("userId");
            // return <html> or {json} or <xml> for an account get request
        } else if (request.getRequestURI().startsWith("/status")) {
            // return <html> or {json} or <xml> for a health status get request
        } // etc
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // return <html> or {json} or <xml> for a post request, like a form submission
    }
}
