package com.github.phillipkruger.profiling;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

/**
 * Activate JAX-RS. 
 * All REST Endpoints available under /api
 * 
 * @author Phillip Kruger (phillip.kruger@phillip-kruger.com)
 */
@ApplicationPath("/api")
@OpenAPIDefinition(info = @Info(title = "Profile service", version = "1.0.0",contact = @Contact(name = "Phillip Kruger", email = "phillip.kruger@phillip-kruger.com",url = "http://www.phillip-kruger.com")))
@Server(url = "/profiling")
public class ApplicationConfig extends Application {

}
