package com.discord.crash_reporting.system_logs;

import a3.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.discord.chat.presentation.message.view.z;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.a1;
import kotlin.collections.b;
import kotlin.collections.f;
import kotlin.collections.h;
import kotlin.collections.v0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.m;
import kotlin.text.n;
import kotlin.text.o;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import s0.g;
import w3.q;
import xq.r;
import xq.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u001c\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00170\u001aJ\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001dH\u0002J(\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\"2\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002J,\u0010\u0013\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u000f2\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\"\u0012\u0004\u0012\u00020\u00170\u001aH\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0002J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogUtils;", "", "<init>", "()V", "LOGCAT_PATH", "", "debugPrintables", "Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection;", "MAX_LOG_SIZE", "", "LIBDISCORD_VERSION_CATEGORY", "DEFAULT_TAG", "systemLogCapture", "Lcom/discord/crash_reporting/system_logs/SystemLogCapture;", "regexExtractTombstone", "Lkotlin/text/Regex;", "getRegexExtractTombstone$crash_reporting_release$annotations", "getRegexExtractTombstone$crash_reporting_release", "()Lkotlin/text/Regex;", "fetch", "context", "Landroid/content/Context;", "initSystemLogCapture", "", "fetchLastTombstone", "cb", "Lkotlin/Function1;", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "crashes", "", "processLogs", "reader", "Ljava/io/BufferedReader;", "output", "Ljava/util/LinkedList;", ViewProps.FILTER, "hashString", "input", "waitFor", "process", "Ljava/lang/Process;", "Tombstone", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSystemLogUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemLogUtils.kt\ncom/discord/crash_reporting/system_logs/SystemLogUtils\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,234:1\n127#2,2:235\n461#3,6:237\n13472#4,2:243\n*S KotlinDebug\n*F\n+ 1 SystemLogUtils.kt\ncom/discord/crash_reporting/system_logs/SystemLogUtils\n*L\n118#1:235,2\n149#1:237,6\n206#1:243,2\n*E\n"})
public final class SystemLogUtils {

    @NotNull
    private static final String DEFAULT_TAG = "Discord";

    @NotNull
    private static final String LIBDISCORD_VERSION_CATEGORY = "libdiscord_version";

    @NotNull
    public static final String LOGCAT_PATH = "/system/bin/logcat";
    private static final int MAX_LOG_SIZE = 2500000;

    @NotNull
    private static final Regex regexExtractTombstone;

    @NotNull
    public static final SystemLogUtils INSTANCE = new SystemLogUtils();

    @NotNull
    private static final DebugPrintableCollection debugPrintables = new DebugPrintableCollection();

    @NotNull
    private static final SystemLogCapture systemLogCapture = new SystemLogCapture();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "", "text", "", "cause", "groupBy", "origin", "groupHash", "textHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getCause", "getGroupBy", "getOrigin", "getGroupHash", "getTextHash", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tombstone {
        private final String cause;

        @NotNull
        private final String groupBy;

        @NotNull
        private final String groupHash;

        @NotNull
        private final String origin;

        @NotNull
        private final String text;

        @NotNull
        private final String textHash;

        public Tombstone(@NotNull String text, String str, @NotNull String groupBy, @NotNull String origin, @NotNull String groupHash, @NotNull String textHash) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(groupBy, "groupBy");
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(groupHash, "groupHash");
            Intrinsics.checkNotNullParameter(textHash, "textHash");
            this.text = text;
            this.cause = str;
            this.groupBy = groupBy;
            this.origin = origin;
            this.groupHash = groupHash;
            this.textHash = textHash;
        }

        public static /* synthetic */ Tombstone copy$default(Tombstone tombstone, String str, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = tombstone.text;
            }
            if ((i7 & 2) != 0) {
                str2 = tombstone.cause;
            }
            if ((i7 & 4) != 0) {
                str3 = tombstone.groupBy;
            }
            if ((i7 & 8) != 0) {
                str4 = tombstone.origin;
            }
            if ((i7 & 16) != 0) {
                str5 = tombstone.groupHash;
            }
            if ((i7 & 32) != 0) {
                str6 = tombstone.textHash;
            }
            String str7 = str5;
            String str8 = str6;
            return tombstone.copy(str, str2, str3, str4, str7, str8);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCause() {
            return this.cause;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getGroupBy() {
            return this.groupBy;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getOrigin() {
            return this.origin;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getGroupHash() {
            return this.groupHash;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTextHash() {
            return this.textHash;
        }

        @NotNull
        public final Tombstone copy(@NotNull String text, String cause, @NotNull String groupBy, @NotNull String origin, @NotNull String groupHash, @NotNull String textHash) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(groupBy, "groupBy");
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(groupHash, "groupHash");
            Intrinsics.checkNotNullParameter(textHash, "textHash");
            return new Tombstone(text, cause, groupBy, origin, groupHash, textHash);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tombstone)) {
                return false;
            }
            Tombstone tombstone = (Tombstone) other;
            return Intrinsics.areEqual(this.text, tombstone.text) && Intrinsics.areEqual(this.cause, tombstone.cause) && Intrinsics.areEqual(this.groupBy, tombstone.groupBy) && Intrinsics.areEqual(this.origin, tombstone.origin) && Intrinsics.areEqual(this.groupHash, tombstone.groupHash) && Intrinsics.areEqual(this.textHash, tombstone.textHash);
        }

        public final String getCause() {
            return this.cause;
        }

        @NotNull
        public final String getGroupBy() {
            return this.groupBy;
        }

        @NotNull
        public final String getGroupHash() {
            return this.groupHash;
        }

        @NotNull
        public final String getOrigin() {
            return this.origin;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getTextHash() {
            return this.textHash;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            String str = this.cause;
            return this.textHash.hashCode() + e.d(e.d(e.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.groupBy), 31, this.origin), 31, this.groupHash);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.cause;
            String str3 = this.groupBy;
            String str4 = this.origin;
            String str5 = this.groupHash;
            String str6 = this.textHash;
            StringBuilder sbU = e.u("Tombstone(text=", str, ", cause=", str2, ", groupBy=");
            e.A(sbU, str3, ", origin=", str4, ", groupHash=");
            return com.discord.chat.presentation.list.a.l(sbU, str5, ", textHash=", str6, ")");
        }
    }

    static {
        Regex.f14705e.getClass();
        Intrinsics.checkNotNullParameter(LIBDISCORD_VERSION_CATEGORY, "literal");
        String strQuote = Pattern.quote(LIBDISCORD_VERSION_CATEGORY);
        Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
        regexExtractTombstone = new Regex(g.e("(?:^(?:[^\\s]+\\s+){4}F\\s+DEBUG\\s+:\\s(.+))|(^.+(\\[", strQuote, "\\].+))"));
    }

    private SystemLogUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetch$lambda$6(LinkedList linkedList, Regex regex, boolean z5, Function1 function1) {
        Process processStart = null;
        try {
            try {
                processStart = new ProcessBuilder(LOGCAT_PATH, "-d").redirectErrorStream(true).start();
                SystemLogUtils systemLogUtils = INSTANCE;
                Intrinsics.checkNotNull(processStart);
                systemLogUtils.waitFor(processStart);
                InputStream inputStream = processStart.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                systemLogUtils.processLogs(bufferedReader, linkedList, regex);
                bufferedReader.close();
            } catch (Exception e10) {
                e10.printStackTrace();
                if (z5) {
                    linkedList.add("Exception getting system logs '" + e10 + "'");
                    StackTraceElement[] stackTrace = e10.getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        linkedList.add("    " + stackTraceElement);
                    }
                }
                if (processStart != null) {
                }
                function1.invoke(linkedList);
                return Unit.f14616a;
            }
            processStart.destroy();
            function1.invoke(linkedList);
            return Unit.f14616a;
        } catch (Throwable th2) {
            if (processStart != null) {
                processStart.destroy();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchLastTombstone$lambda$0(Function1 function1, LinkedList crashes) {
        Intrinsics.checkNotNullParameter(crashes, "crashes");
        function1.invoke(INSTANCE.fetchLastTombstone(crashes));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fetchLastTombstone$lambda$2(Regex regex, MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return regex.replace((CharSequence) it.a().get(1), "classesN.dex");
    }

    public static /* synthetic */ void getRegexExtractTombstone$crash_reporting_release$annotations() {
    }

    private final String hashString(String input) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(bArrDigest);
        return y.z(bArrDigest, new com.discord.chat.presentation.list.delegate.a(27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hashString$lambda$7(byte b10) {
        String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final void processLogs(BufferedReader reader, LinkedList<String> output, Regex filter) {
        Object objPrevious;
        int length = 0;
        while (true) {
            try {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                if (filter != null) {
                    n nVar = Regex.f14705e;
                    m mVarB = filter.b(line);
                    if (mVarB != null) {
                        Collection collectionA = mVarB.a();
                        f fVar = new f((h) collectionA, ((b) collectionA).a());
                        do {
                            if (!fVar.hasPrevious()) {
                                throw new NoSuchElementException("List contains no element matching the predicate.");
                            }
                            objPrevious = fVar.previous();
                        } while (((String) objPrevious).length() <= 0);
                        line = (String) objPrevious;
                    }
                }
                if (!StringsKt.K(line) && !StringsKt.D(line, "Accessing hidden method", false)) {
                    length += line.length() + 1;
                    output.add(line);
                    if (length > MAX_LOG_SIZE) {
                        length -= output.pop().length() - 1;
                    }
                }
            } catch (Exception e10) {
                if (filter == null) {
                    output.add("IOException: " + e10);
                }
            }
        }
        if (length > MAX_LOG_SIZE) {
            output.pop().getClass();
        }
    }

    private final void waitFor(Process process) throws InterruptedException {
        long nanos = TimeUnit.SECONDS.toNanos(15L) + System.nanoTime();
        do {
            try {
                process.exitValue();
                return;
            } catch (IllegalThreadStateException unused) {
                Thread.sleep(100L);
            }
        } while (System.nanoTime() < nanos);
    }

    @NotNull
    public final String fetch(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb2 = new StringBuilder();
        debugPrintables.debugPrint(context, sb2);
        systemLogCapture.appendOutput(sb2);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void fetchLastTombstone(@NotNull Function1<? super Tombstone, Unit> cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        fetch(regexExtractTombstone, new z(cb2, 3));
    }

    @NotNull
    public final Regex getRegexExtractTombstone$crash_reporting_release() {
        return regexExtractTombstone;
    }

    @SuppressLint({"LogNotTimber"})
    public final void initSystemLogCapture(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.v("Discord", "[libdiscord_version]: " + DebugPrintableCollection.INSTANCE.libdiscordVersion(context));
        systemLogCapture.startThread(context);
    }

    private final Tombstone fetchLastTombstone(Collection<String> crashes) {
        String str;
        List listA;
        Object objInvoke;
        String str2 = null;
        if (!crashes.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            String str3 = null;
            String str4 = null;
            for (String str5 : crashes) {
                if (StringsKt.D(str5, LIBDISCORD_VERSION_CATEGORY, false)) {
                    str3 = str5;
                } else {
                    if (StringsKt.D(str5, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***", false)) {
                        Intrinsics.checkNotNullParameter(sb2, "<this>");
                        sb2.setLength(0);
                        str4 = str3;
                    }
                    sb2.append(str5);
                    sb2.append('\n');
                }
            }
            if (!StringsKt.K(sb2)) {
                sb2.append('\n');
                sb2.append("Tombstone's libdiscord_version: ");
                if (str4 == null) {
                    str4 = "Unknown libdiscord_version";
                }
                sb2.append(str4);
                sb2.append('\n');
            }
            String input = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(input, "toString(...)");
            if (!StringsKt.K(input)) {
                p pVar = p.MULTILINE;
                Regex regex = new Regex("^Cause: (.+)$", pVar);
                Regex regex2 = new Regex("^\\s+#\\d+ pc .+/(.+? .+?)\\+?[+)]", pVar);
                Regex regex3 = new Regex("classes\\d+.dex");
                Intrinsics.checkNotNullParameter(input, "input");
                if (input.length() < 0) {
                    throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + input.length());
                }
                c6.a seedFunction = new c6.a(28, regex2, input);
                o nextFunction = o.f14738d;
                Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
                Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
                s sVarN = r.n(new xq.e(seedFunction, nextFunction), new co.s(9, regex3));
                String[] elements = {"libc.so (abort", "libart.so (art::Runtime::Abort(char const*", "libbase.so (android::base::LogMessage::~LogMessage("};
                Intrinsics.checkNotNullParameter(elements, "elements");
                HashSet hashSet = new HashSet(v0.a(3));
                y.F(elements, hashSet);
                try {
                    Iterator it = sVarN.f23049a.iterator();
                    do {
                        if (!it.hasNext()) {
                            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                        }
                        objInvoke = sVarN.f23050b.invoke(it.next());
                    } while (hashSet.contains((String) objInvoke));
                    str = (String) objInvoke;
                } catch (NoSuchElementException unused) {
                    str = "Unknown";
                }
                String str6 = str;
                String strM = r.m(sVarN, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                m mVarB = regex.b(input);
                if (mVarB != null && (listA = mVarB.a()) != null) {
                    str2 = (String) ((a1) listA).get(1);
                }
                return new Tombstone(input, str2, strM, str6, hashString(strM), hashString(input));
            }
        }
        return null;
    }

    private final void fetch(final Regex filter, final Function1<? super LinkedList<String>, Unit> cb2) {
        final LinkedList linkedList = new LinkedList();
        final boolean z5 = filter == null;
        if (!new File(LOGCAT_PATH).exists()) {
            if (z5) {
                linkedList.add("Unable to locate '/system/bin/logcat'");
            }
            cb2.invoke(linkedList);
            return;
        }
        q.B(null, 0, new Function0() { // from class: com.discord.crash_reporting.system_logs.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SystemLogUtils.fetch$lambda$6(linkedList, filter, z5, cb2);
            }
        }, 31);
    }
}
