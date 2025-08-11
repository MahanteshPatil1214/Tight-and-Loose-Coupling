package car.example.bean;

public class MyBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage(){
        System.out.println("Message : " + message);
    }

    @Override
    public String toString() {
        return "Mybean{" +
                "message='" + message + '\'' +
                '}';
    }
}
