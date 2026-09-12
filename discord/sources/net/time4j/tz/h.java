package net.time4j.tz;

import android.util.TimeUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements o, p {
    @Override // net.time4j.tz.o
    public final Set a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(TimeZone.getAvailableIDs()));
        return hashSet;
    }

    @Override // net.time4j.tz.o
    public final Map b() {
        return Collections.EMPTY_MAP;
    }

    @Override // net.time4j.tz.o
    public final String c() {
        return TimeUtils.getTimeZoneDatabaseVersion();
    }

    @Override // net.time4j.tz.o
    public final String d() {
        return "";
    }

    @Override // net.time4j.tz.o
    public final String getName() {
        return "java.util.TimeZone";
    }

    @Override // net.time4j.tz.o
    public final j load(String str) {
        return null;
    }
}
