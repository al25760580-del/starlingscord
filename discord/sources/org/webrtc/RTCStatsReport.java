package org.webrtc;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class RTCStatsReport {
    private final Map<String, RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long j, Map<String, RTCStats> map) {
        this.timestampUs = j;
        this.stats = map;
    }

    @CalledByNative
    private static RTCStatsReport create(long j, Map map) {
        return new RTCStatsReport(j, map);
    }

    public Map<String, RTCStats> getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ timestampUs: ");
        sb2.append(this.timestampUs);
        sb2.append(", stats: [\n");
        boolean z5 = true;
        for (RTCStats rTCStats : this.stats.values()) {
            if (!z5) {
                sb2.append(",\n");
            }
            sb2.append(rTCStats);
            z5 = false;
        }
        sb2.append(" ] }");
        return sb2.toString();
    }
}
