package B_May_Code.ex_25052024;

public class HTTPSStatus {
    public static void main(String[] args) {
        HTTPStatusCode status=HTTPStatusCode.OK;
        System.out.println(status.getCode() +"-"+ status.getMessage());
    }
}
enum HTTPStatusCode{
    OK(200,"OK"),
    CREATED( 201,"Created"),
    ACCEPTED(202,"Accepted"),
    NOCONTENT(204, "No Content");

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    HTTPStatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
