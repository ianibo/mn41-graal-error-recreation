package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/conferences") 
public class ConferenceController {

    private static final Logger log = LoggerFactory.getLogger(ConferenceController.class);

    private final ConferenceService conferenceService;

    public ConferenceController(ConferenceService conferenceService) { 
        log.debug("ConferenceController::construct");
        this.conferenceService = conferenceService;
    }

    @Get("/random") 
    public Conference randomConf() { 
        return conferenceService.randomConf();
    }
}
