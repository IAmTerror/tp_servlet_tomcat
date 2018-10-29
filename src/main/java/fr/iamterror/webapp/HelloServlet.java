package fr.iamterror.webapp;

/*
  Created by laerce on 10/11/2017.
 */

import javax.servlet.ServletRequest;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Formulaire</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World !</h1>");
        out.println("<p>Vous me sollicitez par un GET </p>");
        out.println("<h2>Mon adresse IP : </h2>");
        out.println(request.getRemoteAddr());
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String prenom = request.getParameter("prenom");
        float pu = Float.parseFloat(request.getParameter("pu"));
        int qte = Integer.parseInt(request.getParameter("qte"));
        float montant = pu * qte;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Votre commande </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Votre commande</h1>");

        if(prenom.isEmpty()) {
            out.println("<p>Bonjour inconnu</p>");
        } else {
            out.println("<p>Bonjour " + prenom + "</p>");
        }
        out.println("<p>Prix unitaire : " + pu + "</p>");
        out.println("<p>Quantité commandée : " + qte + "</p>");

        out.print("<p> Montant de la commande : " + qte + " x " + pu + " =  " + String.format("%.2f", montant) + " euro(s)</p>");

        out.println("<p>Vous me sollicitez par un POST </p>");
        out.println("</body>");
        out.println("</html>");
    }
}