package example.micronaut;

import jakarta.inject.Singleton;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Singleton 
public class ConferenceService {

    private static final Logger log = LoggerFactory.getLogger(ConferenceService.class);

    private static final List<Conference> CONFERENCES = Arrays.asList(
            new Conference("Greach"),
            new Conference("GR8Conf EU"),
            new Conference("Micronaut Summit"),
            new Conference("Devoxx Belgium"),
            new Conference("Oracle Code One"),
            new Conference("CommitConf"),
            new Conference("Codemotion Madrid")
    );

    public Conference randomConf() { 
	log.warn("Get randomConf()");
        return CONFERENCES.get(new Random().nextInt(CONFERENCES.size()));
    }
}


