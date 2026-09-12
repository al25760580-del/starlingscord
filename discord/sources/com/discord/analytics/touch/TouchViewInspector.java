package com.discord.analytics.touch;

import a3.e;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.BuildConfig;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.m;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import rn.n;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005GHIJKB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0015J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010\u001e\u001a\u00020\u00112\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#H\u0002J \u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J0\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\tH\u0002J\u0010\u00101\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015J\u0012\u00102\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J(\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u00010\u00052\b\u00106\u001a\u0004\u0018\u00010\u00052\b\u00107\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0005H\u0002J\u0014\u0010;\u001a\u0004\u0018\u00010\u00052\b\u0010<\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010=\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00052\u0006\u0010>\u001a\u000209H\u0002J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/discord/analytics/touch/TouchViewInspector;", "", "<init>", "()V", "TAG", "", "VERBOSE_LOGGING", "", "tempPoint", "Landroid/graphics/PointF;", "matrixTransformCoords", "", "inverseMatrix", "Landroid/graphics/Matrix;", "viewClassInfoCache", "", "Ljava/lang/Class;", "Lcom/discord/analytics/touch/TouchViewInspector$ViewClassInfo;", "clearCaches", "", "findTouchTargetView", "Landroid/view/View;", "eventCoords", "view", "findTouchTargetChildrenOnly", "findTouchTargetSelfOnly", "findTouchTargetChildrenThenSelf", "findTouchTargetInChildren", "viewGroup", "Landroid/view/ViewGroup;", "getViewClassInfo", "viewClass", "getPointerEvents", "Lcom/discord/analytics/touch/TouchViewInspector$PointerEvents;", "getZIndexMappedChildIndex", "", "reverseIndex", "isTouchPointInView", "x", "", "y", "getHitSlopRect", "Landroid/graphics/Rect;", "getChildPoint", "parentX", "parentY", "parent", "child", "outLocalPoint", "formatViewHierarchy", "getNativeID", "selectEmittedIdentifier", "Lcom/discord/analytics/touch/TouchViewInspector$EmittedIdentifier;", ViewProps.NATIVE_ID, "contentDesc", "tag", "inferConversationMeta", "Lcom/discord/analytics/touch/TouchViewInspector$ConversationMeta;", "identifierValue", "extractSnowflake", "value", "sanitizeIdentifier", "conversationMeta", "isLikelyConversationLabel", "SNOWFLAKE_REGEX", "Lkotlin/text/Regex;", "TEXT_CHANNEL_HINT_REGEX", "VOICE_CHANNEL_HINT_REGEX", "THREAD_HINT_REGEX", "CHANNEL_HINT_REGEX", "DM_HINT_REGEX", "ViewClassInfo", "PointerEvents", "ConversationMeta", "EmittedIdentifierKind", "EmittedIdentifier", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTouchViewInspector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchViewInspector.kt\ncom/discord/analytics/touch/TouchViewInspector\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,554:1\n384#2,7:555\n1#3:562\n*S KotlinDebug\n*F\n+ 1 TouchViewInspector.kt\ncom/discord/analytics/touch/TouchViewInspector\n*L\n178#1:555,7\n*E\n"})
public final class TouchViewInspector {

    @NotNull
    private static final String TAG = "TouchViewInspector";
    private static final boolean VERBOSE_LOGGING = false;

    @NotNull
    public static final TouchViewInspector INSTANCE = new TouchViewInspector();

    @NotNull
    private static final PointF tempPoint = new PointF();

    @NotNull
    private static final float[] matrixTransformCoords = new float[2];

    @NotNull
    private static final Matrix inverseMatrix = new Matrix();

    @NotNull
    private static final Map<Class<?>, ViewClassInfo> viewClassInfoCache = new LinkedHashMap();

    @NotNull
    private static final Regex SNOWFLAKE_REGEX = new Regex("\\b\\d{17,20}\\b");

    @NotNull
    private static final Regex TEXT_CHANNEL_HINT_REGEX = new Regex("\\btext(?:\\s|-)?channel\\b");

    @NotNull
    private static final Regex VOICE_CHANNEL_HINT_REGEX = new Regex("\\bvoice(?:\\s|-)?channel\\b");

    @NotNull
    private static final Regex THREAD_HINT_REGEX = new Regex("\\bthread\\b");

    @NotNull
    private static final Regex CHANNEL_HINT_REGEX = new Regex("(^#\\S+)|(\\b(text|voice)(?:\\s|-)?channel\\b)|(\\bthread\\b)");

    @NotNull
    private static final Regex DM_HINT_REGEX = new Regex("\\b(direct\\s+message|dm)\\b");

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/discord/analytics/touch/TouchViewInspector$ConversationMeta;", "", "type", "", StackTraceHelper.ID_KEY, "kind", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getId", "getKind", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationMeta {
        private final String id;
        private final String kind;
        private final String type;

        public ConversationMeta(String str, String str2, String str3) {
            this.type = str;
            this.id = str2;
            this.kind = str3;
        }

        public static /* synthetic */ ConversationMeta copy$default(ConversationMeta conversationMeta, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = conversationMeta.type;
            }
            if ((i7 & 2) != 0) {
                str2 = conversationMeta.id;
            }
            if ((i7 & 4) != 0) {
                str3 = conversationMeta.kind;
            }
            return conversationMeta.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        @NotNull
        public final ConversationMeta copy(String type, String id2, String kind) {
            return new ConversationMeta(type, id2, kind);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationMeta)) {
                return false;
            }
            ConversationMeta conversationMeta = (ConversationMeta) other;
            return Intrinsics.areEqual(this.type, conversationMeta.type) && Intrinsics.areEqual(this.id, conversationMeta.id) && Intrinsics.areEqual(this.kind, conversationMeta.kind);
        }

        public final String getId() {
            return this.id;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.id;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.kind;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.id;
            return com.discord.chat.presentation.list.a.k(e.u("ConversationMeta(type=", str, ", id=", str2, ", kind="), this.kind, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/discord/analytics/touch/TouchViewInspector$EmittedIdentifier;", "", "kind", "Lcom/discord/analytics/touch/TouchViewInspector$EmittedIdentifierKind;", "value", "", "<init>", "(Lcom/discord/analytics/touch/TouchViewInspector$EmittedIdentifierKind;Ljava/lang/String;)V", "getKind", "()Lcom/discord/analytics/touch/TouchViewInspector$EmittedIdentifierKind;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EmittedIdentifier {

        @NotNull
        private final EmittedIdentifierKind kind;

        @NotNull
        private final String value;

        public EmittedIdentifier(@NotNull EmittedIdentifierKind kind, @NotNull String value) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(value, "value");
            this.kind = kind;
            this.value = value;
        }

        public static /* synthetic */ EmittedIdentifier copy$default(EmittedIdentifier emittedIdentifier, EmittedIdentifierKind emittedIdentifierKind, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                emittedIdentifierKind = emittedIdentifier.kind;
            }
            if ((i7 & 2) != 0) {
                str = emittedIdentifier.value;
            }
            return emittedIdentifier.copy(emittedIdentifierKind, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EmittedIdentifierKind getKind() {
            return this.kind;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final EmittedIdentifier copy(@NotNull EmittedIdentifierKind kind, @NotNull String value) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(value, "value");
            return new EmittedIdentifier(kind, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmittedIdentifier)) {
                return false;
            }
            EmittedIdentifier emittedIdentifier = (EmittedIdentifier) other;
            return this.kind == emittedIdentifier.kind && Intrinsics.areEqual(this.value, emittedIdentifier.value);
        }

        @NotNull
        public final EmittedIdentifierKind getKind() {
            return this.kind;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.kind.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "EmittedIdentifier(kind=" + this.kind + ", value=" + this.value + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/analytics/touch/TouchViewInspector$EmittedIdentifierKind;", "", "<init>", "(Ljava/lang/String;I)V", "NATIVE_ID", "DESC", "TAG", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum EmittedIdentifierKind {
        NATIVE_ID,
        DESC,
        TAG;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/discord/analytics/touch/TouchViewInspector$PointerEvents;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BOX_NONE", "BOX_ONLY", "AUTO", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum PointerEvents {
        NONE,
        BOX_NONE,
        BOX_ONLY,
        AUTO;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jk\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011¨\u0006+"}, d2 = {"Lcom/discord/analytics/touch/TouchViewInspector$ViewClassInfo;", "", "hasGetPointerEvents", "", "getPointerEventsMethod", "Ljava/lang/reflect/Method;", "hasGetZIndexMappedChildIndex", "getZIndexMappedChildIndexMethod", "hasGetHitSlopRect", "getHitSlopRectMethod", "hasNativeIDField", "nativeIDField", "Ljava/lang/reflect/Field;", "isReactView", "<init>", "(ZLjava/lang/reflect/Method;ZLjava/lang/reflect/Method;ZLjava/lang/reflect/Method;ZLjava/lang/reflect/Field;Z)V", "getHasGetPointerEvents", "()Z", "getGetPointerEventsMethod", "()Ljava/lang/reflect/Method;", "getHasGetZIndexMappedChildIndex", "getGetZIndexMappedChildIndexMethod", "getHasGetHitSlopRect", "getGetHitSlopRectMethod", "getHasNativeIDField", "getNativeIDField", "()Ljava/lang/reflect/Field;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewClassInfo {
        private final Method getHitSlopRectMethod;
        private final Method getPointerEventsMethod;
        private final Method getZIndexMappedChildIndexMethod;
        private final boolean hasGetHitSlopRect;
        private final boolean hasGetPointerEvents;
        private final boolean hasGetZIndexMappedChildIndex;
        private final boolean hasNativeIDField;
        private final boolean isReactView;
        private final Field nativeIDField;

        public ViewClassInfo(boolean z5, Method method, boolean z6, Method method2, boolean z7, Method method3, boolean z10, Field field, boolean z11) {
            this.hasGetPointerEvents = z5;
            this.getPointerEventsMethod = method;
            this.hasGetZIndexMappedChildIndex = z6;
            this.getZIndexMappedChildIndexMethod = method2;
            this.hasGetHitSlopRect = z7;
            this.getHitSlopRectMethod = method3;
            this.hasNativeIDField = z10;
            this.nativeIDField = field;
            this.isReactView = z11;
        }

        public static /* synthetic */ ViewClassInfo copy$default(ViewClassInfo viewClassInfo, boolean z5, Method method, boolean z6, Method method2, boolean z7, Method method3, boolean z10, Field field, boolean z11, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z5 = viewClassInfo.hasGetPointerEvents;
            }
            if ((i7 & 2) != 0) {
                method = viewClassInfo.getPointerEventsMethod;
            }
            if ((i7 & 4) != 0) {
                z6 = viewClassInfo.hasGetZIndexMappedChildIndex;
            }
            if ((i7 & 8) != 0) {
                method2 = viewClassInfo.getZIndexMappedChildIndexMethod;
            }
            if ((i7 & 16) != 0) {
                z7 = viewClassInfo.hasGetHitSlopRect;
            }
            if ((i7 & 32) != 0) {
                method3 = viewClassInfo.getHitSlopRectMethod;
            }
            if ((i7 & 64) != 0) {
                z10 = viewClassInfo.hasNativeIDField;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                field = viewClassInfo.nativeIDField;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                z11 = viewClassInfo.isReactView;
            }
            Field field2 = field;
            boolean z12 = z11;
            Method method4 = method3;
            boolean z13 = z10;
            boolean z14 = z7;
            boolean z15 = z6;
            return viewClassInfo.copy(z5, method, z15, method2, z14, method4, z13, field2, z12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getHasGetPointerEvents() {
            return this.hasGetPointerEvents;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Method getGetPointerEventsMethod() {
            return this.getPointerEventsMethod;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getHasGetZIndexMappedChildIndex() {
            return this.hasGetZIndexMappedChildIndex;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Method getGetZIndexMappedChildIndexMethod() {
            return this.getZIndexMappedChildIndexMethod;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getHasGetHitSlopRect() {
            return this.hasGetHitSlopRect;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Method getGetHitSlopRectMethod() {
            return this.getHitSlopRectMethod;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getHasNativeIDField() {
            return this.hasNativeIDField;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Field getNativeIDField() {
            return this.nativeIDField;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsReactView() {
            return this.isReactView;
        }

        @NotNull
        public final ViewClassInfo copy(boolean hasGetPointerEvents, Method getPointerEventsMethod, boolean hasGetZIndexMappedChildIndex, Method getZIndexMappedChildIndexMethod, boolean hasGetHitSlopRect, Method getHitSlopRectMethod, boolean hasNativeIDField, Field nativeIDField, boolean isReactView) {
            return new ViewClassInfo(hasGetPointerEvents, getPointerEventsMethod, hasGetZIndexMappedChildIndex, getZIndexMappedChildIndexMethod, hasGetHitSlopRect, getHitSlopRectMethod, hasNativeIDField, nativeIDField, isReactView);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewClassInfo)) {
                return false;
            }
            ViewClassInfo viewClassInfo = (ViewClassInfo) other;
            return this.hasGetPointerEvents == viewClassInfo.hasGetPointerEvents && Intrinsics.areEqual(this.getPointerEventsMethod, viewClassInfo.getPointerEventsMethod) && this.hasGetZIndexMappedChildIndex == viewClassInfo.hasGetZIndexMappedChildIndex && Intrinsics.areEqual(this.getZIndexMappedChildIndexMethod, viewClassInfo.getZIndexMappedChildIndexMethod) && this.hasGetHitSlopRect == viewClassInfo.hasGetHitSlopRect && Intrinsics.areEqual(this.getHitSlopRectMethod, viewClassInfo.getHitSlopRectMethod) && this.hasNativeIDField == viewClassInfo.hasNativeIDField && Intrinsics.areEqual(this.nativeIDField, viewClassInfo.nativeIDField) && this.isReactView == viewClassInfo.isReactView;
        }

        public final Method getGetHitSlopRectMethod() {
            return this.getHitSlopRectMethod;
        }

        public final Method getGetPointerEventsMethod() {
            return this.getPointerEventsMethod;
        }

        public final Method getGetZIndexMappedChildIndexMethod() {
            return this.getZIndexMappedChildIndexMethod;
        }

        public final boolean getHasGetHitSlopRect() {
            return this.hasGetHitSlopRect;
        }

        public final boolean getHasGetPointerEvents() {
            return this.hasGetPointerEvents;
        }

        public final boolean getHasGetZIndexMappedChildIndex() {
            return this.hasGetZIndexMappedChildIndex;
        }

        public final boolean getHasNativeIDField() {
            return this.hasNativeIDField;
        }

        public final Field getNativeIDField() {
            return this.nativeIDField;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.hasGetPointerEvents) * 31;
            Method method = this.getPointerEventsMethod;
            int iG = com.discord.chat.presentation.list.a.g((iHashCode + (method == null ? 0 : method.hashCode())) * 31, 31, this.hasGetZIndexMappedChildIndex);
            Method method2 = this.getZIndexMappedChildIndexMethod;
            int iG2 = com.discord.chat.presentation.list.a.g((iG + (method2 == null ? 0 : method2.hashCode())) * 31, 31, this.hasGetHitSlopRect);
            Method method3 = this.getHitSlopRectMethod;
            int iG3 = com.discord.chat.presentation.list.a.g((iG2 + (method3 == null ? 0 : method3.hashCode())) * 31, 31, this.hasNativeIDField);
            Field field = this.nativeIDField;
            return Boolean.hashCode(this.isReactView) + ((iG3 + (field != null ? field.hashCode() : 0)) * 31);
        }

        public final boolean isReactView() {
            return this.isReactView;
        }

        @NotNull
        public String toString() {
            boolean z5 = this.hasGetPointerEvents;
            Method method = this.getPointerEventsMethod;
            boolean z6 = this.hasGetZIndexMappedChildIndex;
            Method method2 = this.getZIndexMappedChildIndexMethod;
            boolean z7 = this.hasGetHitSlopRect;
            Method method3 = this.getHitSlopRectMethod;
            boolean z10 = this.hasNativeIDField;
            Field field = this.nativeIDField;
            boolean z11 = this.isReactView;
            StringBuilder sb2 = new StringBuilder("ViewClassInfo(hasGetPointerEvents=");
            sb2.append(z5);
            sb2.append(", getPointerEventsMethod=");
            sb2.append(method);
            sb2.append(", hasGetZIndexMappedChildIndex=");
            sb2.append(z6);
            sb2.append(", getZIndexMappedChildIndexMethod=");
            sb2.append(method2);
            sb2.append(", hasGetHitSlopRect=");
            sb2.append(z7);
            sb2.append(", getHitSlopRectMethod=");
            sb2.append(method3);
            sb2.append(", hasNativeIDField=");
            sb2.append(z10);
            sb2.append(", nativeIDField=");
            sb2.append(field);
            sb2.append(", isReactView=");
            return com.discord.chat.presentation.list.a.m(sb2, z11, ")");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            try {
                iArr[PointerEvents.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEvents.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEvents.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EmittedIdentifierKind.values().length];
            try {
                iArr2[EmittedIdentifierKind.NATIVE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EmittedIdentifierKind.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EmittedIdentifierKind.TAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private TouchViewInspector() {
    }

    private final String extractSnowflake(String value) {
        m mVarB;
        if (value == null || StringsKt.K(value) || (mVarB = SNOWFLAKE_REGEX.b(value)) == null) {
            return null;
        }
        return mVarB.getValue();
    }

    private final View findTouchTargetChildrenOnly(float[] eventCoords, View view) {
        if (view instanceof ViewGroup) {
            return findTouchTargetInChildren(eventCoords, (ViewGroup) view);
        }
        return null;
    }

    private final View findTouchTargetChildrenThenSelf(float[] eventCoords, View view) {
        View viewFindTouchTargetInChildren;
        if ((view instanceof ViewGroup) && (viewFindTouchTargetInChildren = findTouchTargetInChildren(eventCoords, (ViewGroup) view)) != null) {
            return viewFindTouchTargetInChildren;
        }
        if (isTouchPointInView(eventCoords[0], eventCoords[1], view)) {
            return view;
        }
        return null;
    }

    private final View findTouchTargetInChildren(float[] eventCoords, ViewGroup viewGroup) {
        int childCount;
        if ((!isTouchPointInView(eventCoords[0], eventCoords[1], viewGroup) && viewGroup.getClipChildren()) || (childCount = viewGroup.getChildCount()) == 0) {
            return null;
        }
        int i7 = childCount - 1;
        while (-1 < i7) {
            View childAt = viewGroup.getChildAt(getZIndexMappedChildIndex(viewGroup, i7));
            PointF pointF = tempPoint;
            float f2 = eventCoords[0];
            float f7 = eventCoords[1];
            Intrinsics.checkNotNull(childAt);
            ViewGroup viewGroup2 = viewGroup;
            getChildPoint(f2, f7, viewGroup2, childAt, pointF);
            float f10 = eventCoords[0];
            float f11 = eventCoords[1];
            eventCoords[0] = pointF.x;
            eventCoords[1] = pointF.y;
            View viewFindTouchTargetView = findTouchTargetView(eventCoords, childAt);
            if (viewFindTouchTargetView != null) {
                return viewFindTouchTargetView;
            }
            eventCoords[0] = f10;
            eventCoords[1] = f11;
            i7--;
            viewGroup = viewGroup2;
        }
        return null;
    }

    private final View findTouchTargetSelfOnly(float[] eventCoords, View view) {
        if (isTouchPointInView(eventCoords[0], eventCoords[1], view)) {
            return view;
        }
        return null;
    }

    private final void getChildPoint(float parentX, float parentY, ViewGroup parent, View child, PointF outLocalPoint) {
        float scrollX = (parentX + parent.getScrollX()) - child.getLeft();
        float scrollY = (parentY + parent.getScrollY()) - child.getTop();
        Matrix matrix = child.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = matrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = inverseMatrix;
            if (matrix.invert(matrix2)) {
                matrix2.mapPoints(fArr);
                scrollX = fArr[0];
                scrollY = fArr[1];
            }
        }
        outLocalPoint.set(scrollX, scrollY);
    }

    private final Rect getHitSlopRect(View view) throws NoSuchMethodException {
        ViewClassInfo viewClassInfo = getViewClassInfo(view.getClass());
        if (viewClassInfo.getHasGetHitSlopRect() && viewClassInfo.getGetHitSlopRectMethod() != null) {
            try {
                Object objInvoke = viewClassInfo.getGetHitSlopRectMethod().invoke(view, null);
                if (objInvoke instanceof Rect) {
                    return (Rect) objInvoke;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final String getNativeID(View view) throws NoSuchMethodException {
        ViewClassInfo viewClassInfo = getViewClassInfo(view.getClass());
        if (viewClassInfo.getHasNativeIDField() && viewClassInfo.getNativeIDField() != null) {
            try {
                Object obj = viewClassInfo.getNativeIDField().get(view);
                if (obj instanceof String) {
                    return (String) obj;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x0016, B:8:0x0021, B:11:0x0029, B:12:0x002d, B:14:0x0031, B:20:0x0043, B:17:0x003a, B:21:0x0046, B:30:0x0061, B:24:0x004f, B:34:0x006d, B:27:0x0058, B:31:0x0064), top: B:46:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x0016, B:8:0x0021, B:11:0x0029, B:12:0x002d, B:14:0x0031, B:20:0x0043, B:17:0x003a, B:21:0x0046, B:30:0x0061, B:24:0x004f, B:34:0x006d, B:27:0x0058, B:31:0x0064), top: B:46:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x0016, B:8:0x0021, B:11:0x0029, B:12:0x002d, B:14:0x0031, B:20:0x0043, B:17:0x003a, B:21:0x0046, B:30:0x0061, B:24:0x004f, B:34:0x006d, B:27:0x0058, B:31:0x0064), top: B:46:0x0016 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final PointerEvents getPointerEvents(View view) throws NoSuchMethodException {
        String string;
        PointerEvents pointerEvents = PointerEvents.AUTO;
        ViewClassInfo viewClassInfo = getViewClassInfo(view.getClass());
        if (viewClassInfo.getHasGetPointerEvents() && viewClassInfo.getGetPointerEventsMethod() != null) {
            try {
                Object objInvoke = viewClassInfo.getGetPointerEventsMethod().invoke(view, null);
                if (objInvoke == null || (string = objInvoke.toString()) == null) {
                    string = "";
                }
                switch (string.hashCode()) {
                    case -2089141766:
                        if (string.equals(ViewProps.BOX_NONE)) {
                            pointerEvents = PointerEvents.BOX_NONE;
                        }
                        break;
                    case -2089112978:
                        if (string.equals("box-only")) {
                            pointerEvents = PointerEvents.BOX_ONLY;
                        }
                        break;
                    case -1230786228:
                        if (string.equals("BOX_NONE")) {
                            pointerEvents = PointerEvents.BOX_NONE;
                        }
                        break;
                    case -1230757440:
                        if (string.equals("BOX_ONLY")) {
                            pointerEvents = PointerEvents.BOX_ONLY;
                        }
                        break;
                    case 2402104:
                        if (string.equals("NONE")) {
                            pointerEvents = PointerEvents.NONE;
                        }
                        break;
                    case 3387192:
                        if (string.equals(ViewProps.NONE)) {
                            pointerEvents = PointerEvents.NONE;
                        }
                        break;
                }
            } catch (Exception unused) {
            }
        }
        if (view.isEnabled()) {
            return pointerEvents;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[pointerEvents.ordinal()];
        if (i7 != 2) {
            return i7 != 4 ? pointerEvents : PointerEvents.BOX_NONE;
        }
        return PointerEvents.NONE;
    }

    private final ViewClassInfo getViewClassInfo(Class<?> viewClass) throws NoSuchMethodException {
        Method method;
        boolean z5;
        Method method2;
        boolean z6;
        Method method3;
        boolean z7;
        boolean z10;
        Map<Class<?>, ViewClassInfo> map = viewClassInfoCache;
        ViewClassInfo viewClassInfo = map.get(viewClass);
        if (viewClassInfo == null) {
            String name = viewClass.getName();
            Intrinsics.checkNotNull(name);
            boolean zD = StringsKt.D(name, BuildConfig.LIBRARY_PACKAGE_NAME, false);
            Field field = null;
            try {
                z5 = true;
                method = viewClass.getMethod("getPointerEvents", null);
            } catch (Exception unused) {
                method = null;
                z5 = false;
            }
            try {
                z6 = true;
                method2 = viewClass.getMethod("getZIndexMappedChildIndex", Integer.TYPE);
            } catch (Exception unused2) {
                method2 = null;
                z6 = false;
            }
            try {
                z7 = true;
                method3 = viewClass.getMethod("getHitSlopRect", null);
            } catch (Exception unused3) {
                method3 = null;
                z7 = false;
            }
            try {
                field = viewClass.getField(ViewProps.NATIVE_ID);
                z10 = true;
            } catch (Exception unused4) {
                z10 = false;
            }
            ViewClassInfo viewClassInfo2 = new ViewClassInfo(z5, method, z6, method2, z7, method3, z10, field, zD);
            map.put(viewClass, viewClassInfo2);
            viewClassInfo = viewClassInfo2;
        }
        return viewClassInfo;
    }

    private final int getZIndexMappedChildIndex(ViewGroup viewGroup, int reverseIndex) throws NoSuchMethodException {
        ViewClassInfo viewClassInfo = getViewClassInfo(viewGroup.getClass());
        if (viewClassInfo.getHasGetZIndexMappedChildIndex() && viewClassInfo.getGetZIndexMappedChildIndexMethod() != null) {
            try {
                Object objInvoke = viewClassInfo.getGetZIndexMappedChildIndexMethod().invoke(viewGroup, Integer.valueOf(reverseIndex));
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) objInvoke).intValue();
            } catch (Exception unused) {
            }
        }
        return reverseIndex;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    private final ConversationMeta inferConversationMeta(String identifierValue) {
        String str;
        String str2;
        String str3;
        String string = StringsKt.b0(identifierValue).toString();
        Locale locale = Locale.US;
        String strP = e.p(locale, "US", string, locale, "toLowerCase(...)");
        if (!DM_HINT_REGEX.a(strP)) {
            if (TEXT_CHANNEL_HINT_REGEX.a(strP)) {
                str3 = "text";
            } else {
                if (!VOICE_CHANNEL_HINT_REGEX.a(strP)) {
                    if (THREAD_HINT_REGEX.a(strP)) {
                        str3 = "thread";
                    } else if (CHANNEL_HINT_REGEX.a(strP)) {
                        str2 = null;
                    } else {
                        str = null;
                    }
                    str = AppsFlyerProperties.CHANNEL;
                    return str == null ? new ConversationMeta(null, null, null) : new ConversationMeta(str, extractSnowflake(string), str2);
                }
                str3 = "voice";
            }
            str2 = str3;
            str = AppsFlyerProperties.CHANNEL;
            if (str == null) {
            }
        }
        str = "dm";
        str2 = str;
        if (str == null) {
        }
    }

    private final boolean isLikelyConversationLabel(String value) {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = value.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String string = StringsKt.b0(lowerCase).toString();
        return x.o(string, "#", false) || CHANNEL_HINT_REGEX.a(string) || DM_HINT_REGEX.a(string);
    }

    private final boolean isTouchPointInView(float x5, float y5, View view) throws NoSuchMethodException {
        Rect hitSlopRect = getHitSlopRect(view);
        if (hitSlopRect != null) {
            return x5 >= ((float) (-hitSlopRect.left)) && x5 < ((float) (view.getWidth() + hitSlopRect.right)) && y5 >= ((float) (-hitSlopRect.top)) && y5 < ((float) (view.getHeight() + hitSlopRect.bottom));
        }
        return x5 >= 0.0f && x5 < ((float) view.getWidth()) && y5 >= 0.0f && y5 < ((float) view.getHeight());
    }

    private final String sanitizeIdentifier(String value, ConversationMeta conversationMeta) {
        String strConcat;
        String strConcat2;
        String string = StringsKt.b0(value).toString();
        String type = conversationMeta.getType();
        if (type == null || !isLikelyConversationLabel(string)) {
            return string;
        }
        if (Intrinsics.areEqual(type, "dm")) {
            String id2 = conversationMeta.getId();
            return (id2 == null || (strConcat2 = "dm_id:".concat(id2)) == null) ? "dm_redacted" : strConcat2;
        }
        String id3 = conversationMeta.getId();
        return (id3 == null || (strConcat = "channel_id:".concat(id3)) == null) ? "channel_redacted" : strConcat;
    }

    private final EmittedIdentifier selectEmittedIdentifier(String nativeID, String contentDesc, String tag) {
        if (nativeID != null && !StringsKt.K(nativeID)) {
            return new EmittedIdentifier(EmittedIdentifierKind.NATIVE_ID, nativeID);
        }
        if (contentDesc != null && !StringsKt.K(contentDesc)) {
            return new EmittedIdentifier(EmittedIdentifierKind.DESC, contentDesc);
        }
        if (tag == null || StringsKt.K(tag)) {
            return null;
        }
        return new EmittedIdentifier(EmittedIdentifierKind.TAG, tag);
    }

    public final void clearCaches() {
        viewClassInfoCache.clear();
    }

    public final View findTouchTargetView(@NotNull float[] eventCoords, @NotNull View view) {
        Intrinsics.checkNotNullParameter(eventCoords, "eventCoords");
        Intrinsics.checkNotNullParameter(view, "view");
        int i7 = WhenMappings.$EnumSwitchMapping$0[getPointerEvents(view).ordinal()];
        if (i7 == 1) {
            return null;
        }
        if (i7 == 2) {
            return findTouchTargetSelfOnly(eventCoords, view);
        }
        if (i7 == 3) {
            return findTouchTargetChildrenOnly(eventCoords, view);
        }
        if (i7 == 4) {
            return findTouchTargetChildrenThenSelf(eventCoords, view);
        }
        throw new n();
    }

    @NotNull
    public final String formatViewHierarchy(View view) {
        if (view == null) {
            return "  No view found";
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (view != null) {
            String strK = x.k(i7, "  ");
            String simpleName = view.getClass().getSimpleName();
            ArrayList arrayList2 = new ArrayList();
            Intrinsics.checkNotNull(simpleName);
            arrayList2.add(simpleName);
            String name = view.getClass().getName();
            Intrinsics.checkNotNull(name);
            if (StringsKt.D(name, "Portal", false)) {
                arrayList2.add("(Portal)");
            } else if (StringsKt.D(name, "BottomSheet", false) || StringsKt.D(name, "bottomsheet", false)) {
                arrayList2.add("(BottomSheet)");
            }
            if (view.getTranslationX() != 0.0f || view.getTranslationY() != 0.0f) {
                arrayList2.add(g.c((int) view.getTranslationX(), "[tx=", (int) view.getTranslationY(), ", ty=", "]"));
            }
            if (view.getRotation() != 0.0f) {
                arrayList2.add("[rot=" + ((int) view.getRotation()) + "°]");
            }
            if (view.getScaleX() != 1.0f || view.getScaleY() != 1.0f) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                arrayList2.add(g.f("[scale=", e.q(new Object[]{Float.valueOf(view.getScaleX())}, 1, locale, "%.1f", "format(...)"), "x", e.q(new Object[]{Float.valueOf(view.getScaleY())}, 1, locale, "%.1f", "format(...)"), "]"));
            }
            float translationZ = view.getTranslationZ() + view.getElevation();
            if (translationZ != 0.0f) {
                arrayList2.add("[z=" + ((int) translationZ) + "dp]");
            }
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                arrayList2.add(g.c(adapter != null ? adapter.getItemCount() : 0, "[items=", recyclerView.getChildCount(), ", visible=", "]"));
            }
            ViewParent parent = view.getParent();
            if (parent instanceof RecyclerView) {
                try {
                    int bindingAdapterPosition = ((RecyclerView) parent).getChildViewHolder(view).getBindingAdapterPosition();
                    if (bindingAdapterPosition != -1) {
                        arrayList2.add("[position=" + bindingAdapterPosition + "]");
                    }
                } catch (Exception unused) {
                }
            }
            String nativeID = getNativeID(view);
            Object tag = view.getTag();
            String string = tag != null ? tag.toString() : null;
            CharSequence contentDescription = view.getContentDescription();
            EmittedIdentifier emittedIdentifierSelectEmittedIdentifier = selectEmittedIdentifier(nativeID, contentDescription != null ? contentDescription.toString() : null, string);
            if (emittedIdentifierSelectEmittedIdentifier != null) {
                ConversationMeta conversationMetaInferConversationMeta = inferConversationMeta(emittedIdentifierSelectEmittedIdentifier.getValue());
                String strSanitizeIdentifier = sanitizeIdentifier(emittedIdentifierSelectEmittedIdentifier.getValue(), conversationMetaInferConversationMeta);
                int i10 = WhenMappings.$EnumSwitchMapping$1[emittedIdentifierSelectEmittedIdentifier.getKind().ordinal()];
                if (i10 == 1) {
                    arrayList2.add("[nativeID=\"" + strSanitizeIdentifier + "\"]");
                } else if (i10 == 2) {
                    arrayList2.add("[desc=\"" + strSanitizeIdentifier + "\"]");
                } else {
                    if (i10 != 3) {
                        throw new n();
                    }
                    arrayList2.add("[tag=\"" + strSanitizeIdentifier + "\"]");
                }
                if (conversationMetaInferConversationMeta.getType() != null) {
                    arrayList2.add("[conversation=" + conversationMetaInferConversationMeta.getType() + "]");
                    String kind = conversationMetaInferConversationMeta.getKind();
                    if (kind != null) {
                        arrayList2.add("[kind=" + kind + "]");
                    }
                    String id2 = conversationMetaInferConversationMeta.getId();
                    if (id2 != null) {
                        arrayList2.add("[conversation_id=" + id2 + "]");
                    }
                }
            }
            if (getViewClassInfo(view.getClass()).isReactView()) {
                arrayList2.add("(React)");
            }
            PointerEvents pointerEvents = getPointerEvents(view);
            if (pointerEvents != PointerEvents.AUTO) {
                arrayList2.add("[pointerEvents=" + pointerEvents + "]");
            }
            if (!view.isEnabled()) {
                arrayList2.add("[disabled]");
            }
            arrayList.add(strK + CollectionsKt.O(arrayList2, " ", null, null, null, 62));
            Object parent2 = view.getParent();
            view = parent2 instanceof View ? (View) parent2 : null;
            i7++;
        }
        return CollectionsKt.O(arrayList, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, null, 62);
    }
}
