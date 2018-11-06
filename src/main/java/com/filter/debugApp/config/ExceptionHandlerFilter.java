package com.filter.debugApp.config;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionHandlerFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        CharResponseWrapper responseWrapper = new CharResponseWrapper(response);
        PrintWriter out = responseWrapper.getWriter();


        try {
            filterChain.doFilter(request, responseWrapper);
        } catch (Exception e) {
           e.printStackTrace();
           out.write("Error occ");
        }


    }
}
