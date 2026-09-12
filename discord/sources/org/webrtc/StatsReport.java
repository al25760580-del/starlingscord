package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public class StatsReport {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f17655id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public static class Value {
        public final String name;
        public final String value;

        @CalledByNative("Value")
        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.name);
            sb2.append(": ");
            return com.discord.chat.presentation.list.a.k(sb2, this.value, "]");
        }
    }

    @CalledByNative
    public StatsReport(String str, String str2, double d6, Value[] valueArr) {
        this.f17655id = str;
        this.type = str2;
        this.timestamp = d6;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("id: ");
        sb2.append(this.f17655id);
        sb2.append(", type: ");
        sb2.append(this.type);
        sb2.append(", timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(", values: ");
        int i7 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i7 >= valueArr.length) {
                return sb2.toString();
            }
            sb2.append(valueArr[i7].toString());
            sb2.append(", ");
            i7++;
        }
    }
}
