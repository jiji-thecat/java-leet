import java.util.ArrayList;
import java.util.List;

public class ArrayListTest{
    public static void main(String[] args){
        /**
         * 左辺をListにしておけば、右辺はArrayListやLinkedList, Vectorとかにできる
         * 左辺に<Integer>を入れておけば、右辺は推測してくれるので、<>空でOK
         */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

/**
 * 0番目の値を削除すると、左詰がおきる。[1,2,3]->[2,3]となる。
 * 0番目に値を入れるときは、list.add(index, value)を実行する。
 */
        System.out.println(list.get(0)); // 1
        list.set(0, 100);
        System.out.println(list.get(0)); // 100
        list.remove(0);
        System.out.println(list.get(0)); // 2
        list.add(0, 2000);
        System.out.println(list); // [2000, 2, 3]
    }
}