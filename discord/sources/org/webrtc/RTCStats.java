package org.webrtc;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class RTCStats {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f17653id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j;
        this.type = str;
        this.f17653id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb2, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb2.append(obj);
                return;
            }
            sb2.append('\"');
            sb2.append(obj);
            sb2.append('\"');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb2.append('[');
        for (int i7 = 0; i7 < objArr.length; i7++) {
            if (i7 != 0) {
                sb2.append(", ");
            }
            appendValue(sb2, objArr[i7]);
        }
        sb2.append(']');
    }

    @CalledByNative
    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.f17653id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sbN = kk.b.n("{ timestampUs: ");
        sbN.append(this.timestampUs);
        sbN.append(", type: ");
        sbN.append(this.type);
        sbN.append(", id: ");
        sbN.append(this.f17653id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            sbN.append(", ");
            sbN.append(entry.getKey());
            sbN.append(": ");
            appendValue(sbN, entry.getValue());
        }
        sbN.append(" }");
        return sbN.toString();
    }
}
