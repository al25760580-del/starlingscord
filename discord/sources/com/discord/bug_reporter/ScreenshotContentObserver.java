package com.discord.bug_reporter;

import a3.e;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.discord.logging.Log;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import ls.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0002¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u000f*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/bug_reporter/ScreenshotContentObserver;", "Landroid/database/ContentObserver;", "contentResolver", "Landroid/content/ContentResolver;", "onScreenshot", "Lkotlin/Function0;", "", "<init>", "(Landroid/content/ContentResolver;Lkotlin/jvm/functions/Function0;)V", "lastProcessedPath", "", "connect", "disconnect", "onChange", "selfChange", "", "uri", "Landroid/net/Uri;", "process", "getScreenshotData", "Lcom/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData;", "getProjection", "", "()[Ljava/lang/String;", "isWithinCurrentTimeWindow", "", "window", "ScreenshotData", "Companion", "bug_reporter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenshotContentObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenshotContentObserver.kt\ncom/discord/bug_reporter/ScreenshotContentObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
public final class ScreenshotContentObserver extends ContentObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEFAULT_DETECT_WINDOW_SECONDS = 10;
    public static final int IS_PENDING_TRUE = 1;

    @NotNull
    private static final String SORT_ORDER = "date_added DESC";

    @NotNull
    private final ContentResolver contentResolver;
    private String lastProcessedPath;

    @NotNull
    private final Function0<Unit> onScreenshot;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\n\u001a\u00020\u000b*\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/bug_reporter/ScreenshotContentObserver$Companion;", "", "<init>", "()V", "IS_PENDING_TRUE", "", "DEFAULT_DETECT_WINDOW_SECONDS", "", "SORT_ORDER", "", "isScreenshotPath", "", "bug_reporter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isScreenshotPath(String str) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return StringsKt.D(lowerCase, "screenshots/", false);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\""}, d2 = {"Lcom/discord/bug_reporter/ScreenshotContentObserver$ScreenshotData;", "", StackTraceHelper.ID_KEY, "", "fileName", "", "relativePath", "uri", "Landroid/net/Uri;", "dateAdded", "<init>", "(JLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;J)V", "getId", "()J", "getFileName", "()Ljava/lang/String;", "getRelativePath", "getUri", "()Landroid/net/Uri;", "getDateAdded", "path", "getPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "bug_reporter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ScreenshotData {
        private final long dateAdded;

        @NotNull
        private final String fileName;
        private final long id;

        @NotNull
        private final String path;

        @NotNull
        private final String relativePath;

        @NotNull
        private final Uri uri;

        public ScreenshotData(long j, @NotNull String fileName, @NotNull String relativePath, @NotNull Uri uri, long j5) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(relativePath, "relativePath");
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.id = j;
            this.fileName = fileName;
            this.relativePath = relativePath;
            this.uri = uri;
            this.dateAdded = j5;
            this.path = b.k(relativePath, "/", fileName);
        }

        public static /* synthetic */ ScreenshotData copy$default(ScreenshotData screenshotData, long j, String str, String str2, Uri uri, long j5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j = screenshotData.id;
            }
            long j7 = j;
            if ((i7 & 2) != 0) {
                str = screenshotData.fileName;
            }
            String str3 = str;
            if ((i7 & 4) != 0) {
                str2 = screenshotData.relativePath;
            }
            String str4 = str2;
            if ((i7 & 8) != 0) {
                uri = screenshotData.uri;
            }
            Uri uri2 = uri;
            if ((i7 & 16) != 0) {
                j5 = screenshotData.dateAdded;
            }
            return screenshotData.copy(j7, str3, str4, uri2, j5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRelativePath() {
            return this.relativePath;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getDateAdded() {
            return this.dateAdded;
        }

        @NotNull
        public final ScreenshotData copy(long id2, @NotNull String fileName, @NotNull String relativePath, @NotNull Uri uri, long dateAdded) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(relativePath, "relativePath");
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new ScreenshotData(id2, fileName, relativePath, uri, dateAdded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenshotData)) {
                return false;
            }
            ScreenshotData screenshotData = (ScreenshotData) other;
            return this.id == screenshotData.id && Intrinsics.areEqual(this.fileName, screenshotData.fileName) && Intrinsics.areEqual(this.relativePath, screenshotData.relativePath) && Intrinsics.areEqual(this.uri, screenshotData.uri) && this.dateAdded == screenshotData.dateAdded;
        }

        public final long getDateAdded() {
            return this.dateAdded;
        }

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }

        @NotNull
        public final String getRelativePath() {
            return this.relativePath;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return Long.hashCode(this.dateAdded) + ((this.uri.hashCode() + e.d(e.d(Long.hashCode(this.id) * 31, 31, this.fileName), 31, this.relativePath)) * 31);
        }

        @NotNull
        public String toString() {
            return "ScreenshotData(id=" + this.id + ", fileName=" + this.fileName + ", relativePath=" + this.relativePath + ", uri=" + this.uri + ", dateAdded=" + this.dateAdded + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotContentObserver(@NotNull ContentResolver contentResolver, @NotNull Function0<Unit> onScreenshot) {
        super(null);
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(onScreenshot, "onScreenshot");
        this.contentResolver = contentResolver;
        this.onScreenshot = onScreenshot;
    }

    private final String[] getProjection() {
        int i7 = Build.VERSION.SDK_INT;
        String[] elements = i7 >= 29 ? new String[]{"is_pending", "relative_path"} : new String[0];
        String[] elements2 = i7 >= 29 ? new String[]{"relative_path"} : new String[]{"_data"};
        String[] strArr = {"_display_name", "date_added", "_id"};
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, 3 + length);
        System.arraycopy(elements, 0, objArrCopyOf, 3, length);
        Intrinsics.checkNotNull(objArrCopyOf);
        Intrinsics.checkNotNullParameter(objArrCopyOf, "<this>");
        Intrinsics.checkNotNullParameter(elements2, "elements");
        int length2 = objArrCopyOf.length;
        int length3 = elements2.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length2 + length3);
        System.arraycopy(elements2, 0, objArrCopyOf2, length2, length3);
        Intrinsics.checkNotNull(objArrCopyOf2);
        return (String[]) objArrCopyOf2;
    }

    @SuppressLint({"Range"})
    private final ScreenshotData getScreenshotData(Uri uri) throws IOException {
        String missingDelimiterValue;
        Cursor cursorQuery = this.contentResolver.query(uri, getProjection(), null, null, SORT_ORDER);
        if (cursorQuery != null) {
            try {
                if ((cursorQuery.moveToFirst() ? cursorQuery : null) != null) {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 29) {
                        int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("is_pending"));
                        Integer numValueOf = Integer.valueOf(i10);
                        if (i10 != 1) {
                            numValueOf = null;
                        }
                        if (numValueOf == null) {
                            cursorQuery.close();
                            return null;
                        }
                    }
                    if (i7 >= 29) {
                        missingDelimiterValue = cursorQuery.getString(cursorQuery.getColumnIndex("relative_path"));
                    } else {
                        missingDelimiterValue = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                        Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "getString(...)");
                        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
                        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
                        int iL = StringsKt.L('/', 0, 6, missingDelimiterValue);
                        if (iL != -1) {
                            missingDelimiterValue = missingDelimiterValue.substring(0, iL);
                            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
                        }
                    }
                    String str = missingDelimiterValue;
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    Intrinsics.checkNotNull(str);
                    ScreenshotData screenshotData = new ScreenshotData(j, string, str, uri, cursorQuery.getLong(cursorQuery.getColumnIndex("date_added")));
                    cursorQuery.close();
                    return screenshotData;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    d.k(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        d.k(cursorQuery, null);
        return null;
    }

    private final boolean isWithinCurrentTimeWindow(long j, long j5) {
        return Math.abs((System.currentTimeMillis() / ((long) 1000)) - j) <= j5;
    }

    private final void process(Uri uri) throws IOException {
        ScreenshotData screenshotData = getScreenshotData(uri);
        if (screenshotData == null) {
            return;
        }
        String str = this.lastProcessedPath;
        if ((str == null || !x.i(str, screenshotData.getPath(), false)) && INSTANCE.isScreenshotPath(screenshotData.getPath()) && isWithinCurrentTimeWindow(screenshotData.getDateAdded(), DEFAULT_DETECT_WINDOW_SECONDS)) {
            this.lastProcessedPath = screenshotData.getPath();
            this.onScreenshot.invoke();
        }
    }

    public final void connect() {
        this.contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this);
    }

    public final void disconnect() {
        this.contentResolver.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange, Uri uri) {
        super.onChange(selfChange, uri);
        if (uri == null) {
            return;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (x.o(string, string2, false)) {
            try {
                process(uri);
            } catch (Exception e10) {
                Log.INSTANCE.e("ScreenshotObserver", "Screenshot error", e10);
            }
        }
    }
}
