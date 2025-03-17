public class TryCatch{
    public static void main(String[] args){
        try{
            System.out.println(args[0]+args[1]);
        } catch(Exception e){
            System.out.println(e);
        }

        System.out.println("calc done");
    }
}