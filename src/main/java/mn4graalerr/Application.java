package mn4graalerr;

import io.micronaut.runtime.Micronaut;

import java.net.URI;
import java.net.URL;
import java.time.Instant;
import java.time.ZonedDateTime;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TypeHint(value = { Instant[].class, ZonedDateTime[].class, URI[].class, URL[].class })
@OpenAPIDefinition(info = @Info(title = "Test", description = "Test", version = "1.0.0"))
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
	System.out.println("Start1");
        log.info("Startr2");
        Micronaut.run(Application.class, args);
    }
}
