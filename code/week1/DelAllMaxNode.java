import com.shujujiegou.www.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DelAllMaxNode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("请输入测试用例,输入next退出");
            while (true) {
                String input_int = scanner.next();
                if (input_int.equals("next")) {
                    break;
            }
            list.add(Integer.valueOf(input_int));
        }
        Integer[] array = list.toArray(new Integer[0]);
        testRemoveAllMaxNode(array);
    }


    public static void testRemoveAllMaxNode(Integer[] cases) {
        LinkList<Integer> linkList1;
        linkList1 = new LinkList<>(cases);
        removeAllMaxNode(linkList1);
    }


    public static void removeAllMaxNode(LinkList<Integer> list) {
        LinkNode<Integer> p = list.head.next;
        Integer maxValue = p.data;
        while (p.next != null) {
            if (p.next.data > maxValue) {
                maxValue = p.next.data;
            }
            p = p.next;
        }
        LinkNode<Integer> preNode = list.head; //查找并删除最大值结点
        p = preNode.next;
        while(p != null){
            if (maxValue.equals(p.data)) {
                preNode.next = p.next;
            }
            else{
                preNode =  preNode.next;
            }
            p = preNode.next;
        }

        System.out.println("=" + list.print());
    }


}
