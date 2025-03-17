public class If{
    public static void main(String[] args){
        int num = 5;

        if(num < 10){
            System.out.println("num is smaller than 10");
        } else {
            System.out.println("num is bigger than 10");
        }

        for(int i=0; i<5; i++){
            System.out.println("loop: " + i);
        }

        int count = 0;
        while(count < 3){
            System.out.println("count is " + count);
            count++;
        }
    }
}