package dawa

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client('https://dawa.aws.dk')
interface DawaClient {

    @Get('/regioner')
    List<Region> getRegioner()

    @Get('/regioner/{kode}')
    Region getRegion(String kode)

    @Get('/kommuner?regionskode={kode}')
    List<Kommune> kommunerForRegion(String kode)

}
