public class Main {
    public static void main(String[] args) {

        logProcessor logProcessor=new info(new debug(new error(null)));
        logProcessor.log(3,"tera log type bata bhai");
    }
}