package hub;

import hub.helper.Environment;

import javax.inject.Named;

@Named
public class SourceCode {

    public String version() {
        return Environment.getValue("OPENSHIFT_BUILD_COMMIT");
    }

}