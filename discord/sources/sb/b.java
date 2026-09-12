package sb;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19821a;

    public b(Integer num) {
        this.f19821a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        Integer num = ((b) obj).f19821a;
        Integer num2 = this.f19821a;
        if (num2 == null) {
            return num == null;
        }
        return num2.equals(num);
    }

    public final int hashCode() {
        Integer num = this.f19821a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f19821a + "}";
    }
}
