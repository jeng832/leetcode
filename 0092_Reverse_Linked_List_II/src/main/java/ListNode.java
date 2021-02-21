import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(val));
        if (next != null) {
            sb.append(", ");
            sb.append(next.toString());
        }
        return sb.toString();
    }
}