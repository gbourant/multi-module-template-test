package io.quarkus.projectb;

import io.quarkiverse.renarde.Controller;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;


public class TestResource extends Controller {

    @Inject
    Template index;

    @Path("/")
    public TemplateInstance index(){
        return index.instance();
    }

}
