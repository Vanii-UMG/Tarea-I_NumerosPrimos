/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Calculos_NumeroPrimos;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanii
 */
public class Controlador extends HttpServlet {

    //Instanciar la clase donde hare el calculo de los numero primos
    Calculos_NumeroPrimos numero = new Calculos_NumeroPrimos();
    

    //Escritura de archivo txt
    File archivo;
    FileWriter escribir;
    PrintWriter linea;

    int numeroPrimo;
    int codigo = 0;
    int suma;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String numeroIngresado = request.getParameter("txtNumero");
        int numeroI = Integer.parseInt(numeroIngresado);
        numeroPrimo = numero.calculoNumeroPrimo(numeroI);
        suma = suma + numeroPrimo;

        

        String ruta = "C:/Users/Alcan/OneDrive/Documentos/NetBeansProjects/NumerosPrimos/";
        String nombre = "Bitacora.txt";
        archivo = new File(ruta + nombre);

        if (!archivo.exists()) {
            try {

                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.write("El numero de intento fue: " + codigo + "\n");
                linea.write("El numero es: " + numeroI + "\n");
                linea.write("La suma de los Primos es: " + suma + "\n");
                codigo++;

                linea.close();
                escribir.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Se produjo un error en: " + e);
            }
        } else {
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.write("El numero de intento fue: " + codigo + "\n");
                linea.write("El numero es: " + numeroI + "\n");
                linea.write("La suma de los Primos es: " + suma + "\n");
                codigo++;

                linea.close();
                escribir.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Se produjo un error en: " + e);
            }
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
