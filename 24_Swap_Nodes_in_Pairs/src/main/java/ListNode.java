import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ListNode)) return false;
        ListNode node = (ListNode) obj;
        if (val != node.val) return false;
        if (next == null && node.next == null) return true;
        return next.equals(node.next);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val);
        if (next != null) {
            sb.append(" -> ");
            sb.append(next.toString());
        }
        return sb.toString();
    }
}