package co.edu.escuelaing.arep.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class URLScaner {
    public static void main(String[] args) throws Exception {

        URL google = new URL(args[0]);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
            String file= "resultado.html";
            PrintWriter pw = new PrintWriter("C:\\Users\\Camis\\IdeaProjects\\TallerClientesServicios\\TallerClientesServicios\\"+file);
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                pw.println(inputLine);
            }
            reader.close();
            pw.close();
        } catch (IOException x) {
            System.err.println(x);

        }
    }
}
