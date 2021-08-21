package tec.bd.weather.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import tec.bd.weather.ApplicationContext;

@Command(name = "zipcode", description = "Get weather forecast by zipCode")
public class ZipCommand implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(NameCommand.class);

    private static ApplicationContext APP_CONTEXT = ApplicationContext.init();

    @Parameters(paramLabel = "<Zip Code>", description = "ZipCode of the city to be resolved")
    private String zipcode;

    @Override
    public void run() {

        var weatherReport = APP_CONTEXT.getWeatherReport();
        var report = weatherReport.getByZipCode(zipcode);
        System.out.println(report);

    }
}