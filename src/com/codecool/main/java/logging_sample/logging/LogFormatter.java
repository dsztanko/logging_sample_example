package logging_sample.logging;

/**
 * Created by dorasztanko on 2017.01.22..
 */
public enum LogFormatter {
    FORMAT(">>>>> ");
    private final String customizedFormatter;

    LogFormatter(String formatter) {
        this.customizedFormatter = formatter;
    }

    public String getCustomizedFormatter() {
        return this.customizedFormatter;
    }
}
