package pl.dmichalski.ws.c01;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {

        String googleIpAddress = "173.194.116.144";

        GeoIPService ipService = new GeoIPService();
        GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();

        GeoIP geoIP = geoIPServiceSoap.getGeoIP(googleIpAddress);
        System.out.println("Google servers are in: " + geoIP.getCountryName());

    }
}
