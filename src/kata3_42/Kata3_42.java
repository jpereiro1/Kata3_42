package kata3_42;

public class Kata3_42 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        
        new HistogramDisplay(histogram).execute();
    }
    
}
