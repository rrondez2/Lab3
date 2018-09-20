import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WebScraper {



    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }



    public static int uniqueWords(final String url) {

        String[] words = url.split("");

        int count = 0;

        for (int x = 0; x <url.length(); x++) {

            count++;

        }

        return count;




    }



    public static void main(String[] unused){
        System.out.println(uniqueWords("https://www.bls.gov/tus/charts/chart9.txt"));

        System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt").length());





    }






}
