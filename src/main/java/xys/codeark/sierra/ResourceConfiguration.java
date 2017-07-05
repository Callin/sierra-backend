package xys.codeark.sierra;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class ResourceConfiguration extends ResourceConfig {
    public ResourceConfiguration() {
        packages("xys.codeark.sierra.rest");
    }
}
