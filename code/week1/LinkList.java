public class LinkList<E> {
    LinkNode<E> head;
    LinkNode<E> point;
    private int size;

    public LinkList() {
        head = new LinkNode<E>();
        head.next = null;
        size = 0;
    }

    public LinkList(E[] array) {
        head = new LinkNode<E>();
        head.next = null;
        addArray(array);
    }

    public int size() {
        return this.size;
    } //创建单链表

    public void add(LinkNode<E> node) {
        if (head.next == null) {
            this.head.next = node;
            this.point = this.head.next;
        } else {
            this.point.next = node;
            this.point = node;
        }
        size++;
    }


    public void addArray(E[] array) {
        for (E e : array) {
            add(new LinkNode<>(e));
        }
    }


    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        LinkNode<E> p = head;
        while (p.next != null) {
            sb.append(" ");
            sb.append(p.next.data.toString());
            sb.append(" ");
            p = p.next;
        }
        sb.append("}");
        return sb.toString();
    }
}
