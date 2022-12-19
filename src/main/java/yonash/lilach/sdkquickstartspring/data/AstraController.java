package yonash.lilach.sdkquickstartspring.data;


import com.datastax.astra.sdk.AstraClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AstraController {

    @Autowired
    private AstraClient astraClient;

    // Spring Data using the CqlSession initialized by the starter



    @GetMapping("/api/devops/organizationid")
    public String showOrganizationId() {
        return astraClient.apiDevopsOrganizations().organizationId();
    }

}

