package edu.impacta.atividade.restAssured;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlaceDogRestAssuredTest {

    private RequestSpecification httpsRequest;

    @Before
    public void before() {
        httpsRequest = RestAssured.given();
        httpsRequest.header("Content-Type","application/json");
    }

    @Test
    public void testPlaceDogCode200() {
        Response response = httpsRequest.get("https://place.dog/");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void testPlaceDogResponseBody() {
        Response response = httpsRequest.get("https://place.dog/");

        Assert.assertEquals(response.getContentType(), "text/html; charset=UTF-8");
    }

    @Test
    public void testPlaceDogCode500() {
        try {
            httpsRequest.get("https://place.dog");
        }catch (Exception e){
            Assert.assertEquals(e.getMessage(), "Este host não é conhecido (place.dog)");
        }

    }


}
