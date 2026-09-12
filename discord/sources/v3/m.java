package v3;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m.class == obj.getClass();
    }

    public final int hashCode() {
        return m.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
