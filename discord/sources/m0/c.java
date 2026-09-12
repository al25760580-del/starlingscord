package m0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (Float.hashCode(1.0f) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=1.0, fontScale=1.0)";
    }
}
