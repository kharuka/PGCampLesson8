public class Main {
    public static void main(String[] args) {
        Integer hoge = null;
        try{
            throwException();
        }catch (NullPointerException e){
            System.out.println("ぬるぽ");
        }
        System.out.println("OK");

    }

    public static void throwException() throws NullPointerException{
        Integer hoge = null;
        hoge.intValue();
    }

}
