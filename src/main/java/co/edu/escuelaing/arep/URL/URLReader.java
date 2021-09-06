package co.edu.escuelaing.arep.URL;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {
    public static void main(String[] args) throws MalformedURLException {
        URL personalSite = new URL("http://admin:hello1234@10.20.130.230:20880/context/path?version=1.0.0&application=morgan#anchor1");
        System.out.println("Protocolo: " + personalSite.getProtocol());
        System.out.println("Authority: " + personalSite.getAuthority());
        System.out.println("Host: " + personalSite.getHost());
        System.out.println("Port: " + personalSite.getPort());
        System.out.println("Path: " + personalSite.getPath());
        System.out.println("Query: " + personalSite.getQuery());
        System.out.println("File: " + personalSite.getFile());
        System.out.println("Ref: " + personalSite.getRef());
    }
}