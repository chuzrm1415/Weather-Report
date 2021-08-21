package tec.bd.weather.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import tec.bd.weather.ApplicationContext;

@Command(name = "city", description = "Get weather forecast for city")
public class NameCommand implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(NameCommand.class);

    private static ApplicationContext APP_CONTEXT = ApplicationContext.init();

    @Parameters(paramLabel = "<City Name>", description = "City name to be resolved")
    private String cityName;

    @Override
    public void run() {

        var weatherReport = APP_CONTEXT.getWeatherReport();
        var report = weatherReport.getByCity(cityName);
        System.out.println(report);

    }
}
