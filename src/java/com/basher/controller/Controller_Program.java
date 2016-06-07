/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basher.controller;

import com.DAO.DAO_Program;
import com.basher.model.BasherModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
//@WebServlet(name = "Controller_Program", urlPatterns = {"/zadmin/Controller_Program"})
public class Controller_Program extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String article = request.getParameter("article");
        String action = request.getParameter("action");
        String id = request.getParameter("id");

        DAO_Program dao = new DAO_Program();
        BasherModel bm = new BasherModel();

        bm.setTitle(title);
        bm.setArticle(article);
        if (action.equalsIgnoreCase("add")) {
            dao.insertProgram(bm);

        } else if (action.equalsIgnoreCase("edit")) {

            bm.setIndicator(Integer.parseInt(id));
            dao.updateProgram(bm);

        } else {

            dao.deleteProgram(Integer.parseInt(id));

        }

    }

}