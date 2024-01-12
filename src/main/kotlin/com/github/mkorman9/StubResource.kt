package com.github.mkorman9

import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.jboss.logging.Logger

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(value = [])
class StubResource(
    private val log: Logger
) {
    @GET
    fun getStub() {
        log.info("Request!")
    }
}
