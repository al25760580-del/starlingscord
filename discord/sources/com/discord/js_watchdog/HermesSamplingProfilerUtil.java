package com.discord.js_watchdog;

import com.discord.crash_reporting.CrashReporting;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.c0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.a;
import ls.d;
import m3.m;
import org.jetbrains.annotations.NotNull;
import pr.h;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/discord/js_watchdog/HermesSamplingProfilerUtil;", "", "<init>", "()V", "findSampleTrace", "", "cacheDir", "Ljava/io/File;", "readFile", "file", "js_watchdog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHermesSamplingProfilerUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HermesSamplingProfilerUtil.kt\ncom/discord/js_watchdog/HermesSamplingProfilerUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,89:1\n1#2:90\n538#3:91\n523#3,6:92\n*S KotlinDebug\n*F\n+ 1 HermesSamplingProfilerUtil.kt\ncom/discord/js_watchdog/HermesSamplingProfilerUtil\n*L\n59#1:91\n59#1:92,6\n*E\n"})
public final class HermesSamplingProfilerUtil {

    @NotNull
    public static final HermesSamplingProfilerUtil INSTANCE = new HermesSamplingProfilerUtil();

    private HermesSamplingProfilerUtil() {
    }

    private final String readFile(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArrK = m.K(fileInputStream);
            fileInputStream.close();
            return x.g(bArrK);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(fileInputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0173  */
    /* JADX WARN: Code duplicated, block: B:98:0x019a  */
    public final String findSampleTrace(@NotNull File cacheDir) throws Throwable {
        File fileCreateTempFile;
        Object objO;
        boolean z5;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        Integer numH;
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        boolean z6 = false;
        File file = null;
        try {
            fileCreateTempFile = File.createTempFile("sampling-profiler-trace", ".cpuprofile", cacheDir);
            try {
                try {
                    HermesSamplingProfiler.enable();
                    HermesSamplingProfiler.disable();
                    String path = fileCreateTempFile.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    HermesSamplingProfiler.dumpSampledTraceToFile(path);
                    Intrinsics.checkNotNull(fileCreateTempFile);
                    JsonElement jsonElementD = Json.f14760d.d(readFile(fileCreateTempFile));
                    JsonElement jsonElement3 = (JsonElement) h.j(jsonElementD).get("samples");
                    a aVarI = jsonElement3 != null ? h.i(jsonElement3) : null;
                    if (aVarI != null) {
                        List list = aVarI.f14768d;
                        if (!list.isEmpty()) {
                            try {
                                q qVar = Result.f14614e;
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        jsonElement = null;
                                        break;
                                    }
                                    jsonElement2 = (JsonElement) it.next();
                                    JsonElement jsonElement4 = (JsonElement) h.j(jsonElement2).get("sf");
                                    if (!(((jsonElement4 == null || (numH = h.h(h.k(jsonElement4))) == null) ? -1 : numH.intValue()) > 1)) {
                                        jsonElement = null;
                                    }
                                    if (jsonElement != null) {
                                        break;
                                    }
                                    jsonElement = jsonElement2;
                                }
                                if (jsonElement == null) {
                                    jsonElement = jsonElement2;
                                    throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
                                }
                                jsonElement = jsonElement2;
                                objO = jsonElement;
                            } catch (Throwable th2) {
                                q qVar2 = Result.f14614e;
                                objO = ib.a.o(th2);
                            }
                            q qVar3 = Result.f14614e;
                            boolean z7 = objO instanceof r;
                            Object obj = objO;
                            if (z7) {
                                obj = null;
                            }
                            JsonElement jsonElement5 = (JsonElement) obj;
                            if (jsonElement5 != null) {
                                LinkedHashMap linkedHashMapN = w0.n(h.j(jsonElementD));
                                linkedHashMapN.put("samples", new a(c0.c(jsonElement5)));
                                JsonElement jsonElement6 = (JsonElement) h.j(jsonElementD).get("stackFrames");
                                if (jsonElement6 != null) {
                                    JsonObject jsonObjectJ = h.j(jsonElement6);
                                    Object obj2 = h.j(jsonElement5).get("sf");
                                    Intrinsics.checkNotNull(obj2);
                                    Integer numH2 = h.h(h.k((JsonElement) obj2));
                                    if (numH2 != null) {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (Map.Entry entry : jsonObjectJ.f14766d.entrySet()) {
                                            Integer intOrNull = StringsKt.toIntOrNull((String) entry.getKey());
                                            if (intOrNull == null) {
                                                z5 = false;
                                            } else if (intOrNull.intValue() <= numH2.intValue()) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5) {
                                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                        linkedHashMapN.put("stackFrames", new JsonObject(linkedHashMap));
                                    }
                                }
                                String strC = Json.f14760d.c(JsonObject.INSTANCE.serializer(), new JsonObject(linkedHashMapN));
                                if (fileCreateTempFile.exists()) {
                                    fileCreateTempFile.delete();
                                }
                                return strC;
                            }
                            if (fileCreateTempFile.exists()) {
                            }
                            fileCreateTempFile.delete();
                        } else if (fileCreateTempFile.exists()) {
                            fileCreateTempFile.delete();
                            return null;
                        }
                    } else if (fileCreateTempFile.exists()) {
                        fileCreateTempFile.delete();
                        return null;
                    }
                } catch (Exception e10) {
                    e = e10;
                    CrashReporting.captureException$default(CrashReporting.INSTANCE, e, false, 2, null);
                    if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                        z6 = true;
                    }
                    if (z6) {
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                file = fileCreateTempFile;
                if (file != null && file.exists()) {
                    z6 = true;
                }
                if (z6) {
                    file.delete();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileCreateTempFile = null;
        } catch (Throwable th4) {
            th = th4;
            if (file != null) {
                z6 = true;
            }
            if (z6) {
                file.delete();
            }
            throw th;
        }
        return null;
    }
}
