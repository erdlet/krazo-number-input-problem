package de.erdlet.controller;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.UriRef;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.logging.Logger;

@Path("correct")
@Controller
public class CorrectBehavingAppController {

    @Inject
    private Models models;

    @Inject
    private RedirectValues redirectValues;

    @POST
    @UriRef("post-correct")
    public String postNumber(@FormParam("number") final double number) {
        redirectValues.setOutput(number);
        return "redirect:/correct";
    }

    @GET
    public String show() {
        models.put("ausgabe", redirectValues.getOutput());

        return "correct.html";
    }
}
