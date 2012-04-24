package com.jetbuild.social.stream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jetbuild.social.model.Comment;

@Path("/streams")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Component("stream-resource")
@Scope("singleton")
public class StreamResource {
    @Autowired
    private StreamService streamService;

    @GET
    @Path("/comments")
    public Response getComments(@Context HttpHeaders headers, @Context UriInfo uriInfo,
            @Context SecurityContext securityContext) {
        return null;
    }

    @GET
    @Path("/{accountid}")
    public Response getInbox(@PathParam("threadid") String accountId, @Context HttpHeaders headers,
            @Context UriInfo uriInfo, @Context SecurityContext securityContext) {
        return null;
    }

    @GET
    @Path("/mentions")
    public Response getMentions(@Context HttpHeaders headers, @Context UriInfo uriInfo,
            @Context SecurityContext securityContext) {
        return null;
    }

    @GET
    @Path("/threads/{threadid}")
    public Response getThread(@PathParam("threadid") String threadId, @Context HttpHeaders headers,
            @Context UriInfo uriInfo, @Context SecurityContext securityContext) {
        return null;
    }

    @POST
    @Path("/comments")
    public void postNewComment(Comment comment, @Context HttpHeaders headers, @Context UriInfo uriInfo,
            @Context SecurityContext securityContext) {
        return;
    }

    @POST
    @Path("/replies")
    public void replyToComment(Comment comment, @Context HttpHeaders headers, @Context UriInfo uriInfo,
            @Context SecurityContext securityContext) {
        return;
    }
}
