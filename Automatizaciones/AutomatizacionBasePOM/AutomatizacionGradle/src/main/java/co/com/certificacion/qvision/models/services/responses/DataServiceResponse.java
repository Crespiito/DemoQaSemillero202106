package co.com.certificacion.qvision.models.services.responses;

public class DataServiceResponse {

    String statusCode;

    public DataServiceResponse(String statusCode) {
        this.statusCode = statusCode;
    }


    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

}