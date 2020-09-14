package dawa

import grails.converters.JSON
import org.springframework.beans.factory.annotation.Autowired

class DawaController {

    @Autowired
    DawaClient dawaClient


    def index() {

        render(dawaClient.regioner as JSON)
    }

    def region(String id) {
        render(dawaClient.getRegion(id) as JSON)
    }

    def kommuner(String id) {
        render(dawaClient.kommunerForRegion(id) as JSON)
    }
}
