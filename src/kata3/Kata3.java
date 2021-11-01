package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram<String>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        
        histogram.increment("icloud.es");
        histogram.increment("icloud.es");
        
        new HistogramDisplay(histogram).execute(); 
    }
    
}