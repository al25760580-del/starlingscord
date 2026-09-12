package com.discord.chrome_custom_tabs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import b.b;
import b.d;
import com.discord.misc.utilities.activity.ActivityUtilities;
import e4.e;
import java.lang.ref.WeakReference;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import n8.f;
import org.jetbrains.annotations.NotNull;
import q.g;
import q.m;
import q.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0002\u001a\u001e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001FB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\b\u0001\u0010(\u001a\u00020\u00182\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060*2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u0015\u0010+\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000bH\u0001¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000bH\u0001¢\u0006\u0002\b.J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000bH\u0001¢\u0006\u0002\b0J\r\u00101\u001a\u00020\u0006H\u0001¢\u0006\u0002\b2J\r\u00103\u001a\u00020\u0006H\u0001¢\u0006\u0002\b4J\b\u00105\u001a\u00020\u0006H\u0002J\u0010\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000bH\u0003J\u0010\u00108\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H\u0002J6\u00109\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00182\u0014\u0010=\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020\u00060*H\u0002J\u0010\u0010?\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020>H\u0003JP\u0010A\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010:\u001a\u00020;2\b\b\u0001\u0010(\u001a\u00020\u00182\b\u0010@\u001a\u0004\u0018\u00010>2\u0006\u0010<\u001a\u00020\u00182\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060*H\u0002J\u0016\u0010B\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\b\u0010C\u001a\u00020\u0006H\u0002J\b\u0010D\u001a\u00020\u0006H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010\u001c\u0012\u0004\b\u001b\u0010\u0003R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0014\u0010 \u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010E\u001a\u00020;X\u0082T¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/discord/chrome_custom_tabs/TrackedCustomTab;", "", "<init>", "()V", "onClosed", "Lkotlin/Function0;", "", "serviceConnection", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "hostActivity", "Ljava/lang/ref/WeakReference;", "Lcom/discord/chrome_custom_tabs/CustomTabHostActivity;", "callerComponent", "Landroid/content/ComponentName;", "isHostExposed", "", "pendingLaunch", "Lcom/discord/chrome_custom_tabs/TrackedCustomTab$PendingLaunch;", "boundApplication", "Landroid/app/Application;", "isAlive", "hasSessionSignals", "isMinimized", "launchToken", "", "callback", "com/discord/chrome_custom_tabs/TrackedCustomTab$callback$1", "getCallback$annotations", "Lcom/discord/chrome_custom_tabs/TrackedCustomTab$callback$1;", "engagementSignalsCallback", "com/discord/chrome_custom_tabs/TrackedCustomTab$engagementSignalsCallback$1", "Lcom/discord/chrome_custom_tabs/TrackedCustomTab$engagementSignalsCallback$1;", "isTracking", "isTracking$chrome_custom_tabs_release", "()Z", "launch", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "toolbarColor", "onLaunched", "Lkotlin/Function1;", "onHostCreated", "onHostCreated$chrome_custom_tabs_release", "onHostRebuilt", "onHostRebuilt$chrome_custom_tabs_release", "onHostDestroyed", "onHostDestroyed$chrome_custom_tabs_release", "onHostExposed", "onHostExposed$chrome_custom_tabs_release", "onHostConcealed", "onHostConcealed$chrome_custom_tabs_release", "closeHostTask", "returnToCaller", "host", "openPendingTab", "bindSession", "packageName", "", "token", "onSessionReady", "Landroidx/browser/customtabs/CustomTabsSession;", "registerEngagementSignals", "session", "startCustomTab", "reattach", "close", "release", "EXTRA_NO_TASK_SNAPSHOT", "PendingLaunch", "chrome_custom_tabs_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrackedCustomTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackedCustomTab.kt\ncom/discord/chrome_custom_tabs/TrackedCustomTab\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,371:1\n1#2:372\n*E\n"})
public final class TrackedCustomTab {

    @NotNull
    private static final String EXTRA_NO_TASK_SNAPSHOT = "com.discord.chrome_custom_tabs.no_task_snapshot";
    private static Application boundApplication;
    private static ComponentName callerComponent;
    private static boolean hasSessionSignals;
    private static WeakReference<CustomTabHostActivity> hostActivity;
    private static boolean isAlive;
    private static boolean isHostExposed;
    private static boolean isMinimized;
    private static int launchToken;
    private static Function0<Unit> onClosed;
    private static PendingLaunch pendingLaunch;
    private static CustomTabsServiceConnection serviceConnection;

    @NotNull
    public static final TrackedCustomTab INSTANCE = new TrackedCustomTab();

    @NotNull
    private static final TrackedCustomTab$callback$1 callback = new q.a() { // from class: com.discord.chrome_custom_tabs.TrackedCustomTab$callback$1
        @Override // q.a
        public void onMinimized(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            TrackedCustomTab.isMinimized = true;
        }

        @Override // q.a
        public void onUnminimized(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            TrackedCustomTab.isMinimized = false;
        }
    };

    @NotNull
    private static final TrackedCustomTab$engagementSignalsCallback$1 engagementSignalsCallback = new n() { // from class: com.discord.chrome_custom_tabs.TrackedCustomTab$engagementSignalsCallback$1
        @Override // q.n
        public /* bridge */ /* synthetic */ void onGreatestScrollPercentageIncreased(int i7, @NonNull Bundle bundle) {
        }

        @Override // q.n
        public void onSessionEnded(boolean didUserInteract, Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (TrackedCustomTab.isAlive) {
                TrackedCustomTab.INSTANCE.close();
            }
        }

        @Override // q.n
        public /* bridge */ /* synthetic */ void onVerticalScrollEvent(boolean z5, @NonNull Bundle bundle) {
        }
    };

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/discord/chrome_custom_tabs/TrackedCustomTab$PendingLaunch;", "", "uri", "Landroid/net/Uri;", "toolbarColor", "", "packageName", "", "onLaunched", "Lkotlin/Function1;", "", "", "<init>", "(Landroid/net/Uri;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getUri", "()Landroid/net/Uri;", "getToolbarColor", "()I", "getPackageName", "()Ljava/lang/String;", "getOnLaunched", "()Lkotlin/jvm/functions/Function1;", "chrome_custom_tabs_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PendingLaunch {

        @NotNull
        private final Function1<Boolean, Unit> onLaunched;

        @NotNull
        private final String packageName;
        private final int toolbarColor;

        @NotNull
        private final Uri uri;

        /* JADX WARN: Multi-variable type inference failed */
        public PendingLaunch(@NotNull Uri uri, int i7, @NotNull String packageName, @NotNull Function1<? super Boolean, Unit> onLaunched) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(onLaunched, "onLaunched");
            this.uri = uri;
            this.toolbarColor = i7;
            this.packageName = packageName;
            this.onLaunched = onLaunched;
        }

        @NotNull
        public final Function1<Boolean, Unit> getOnLaunched() {
            return this.onLaunched;
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }

        public final int getToolbarColor() {
            return this.toolbarColor;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }
    }

    private TrackedCustomTab() {
    }

    private final boolean bindSession(Activity activity, String packageName, final int token, final Function1<? super CustomTabsSession, Unit> onSessionReady) {
        boolean zBindService;
        Application application = activity.getApplication();
        CustomTabsServiceConnection customTabsServiceConnection = new CustomTabsServiceConnection() { // from class: com.discord.chrome_custom_tabs.TrackedCustomTab$bindSession$connection$1
            @Override // androidx.browser.customtabs.CustomTabsServiceConnection
            public void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
                CustomTabsSession customTabsSession;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(client, "client");
                Function1<CustomTabsSession, Unit> function1 = onSessionReady;
                TrackedCustomTab$callback$1 trackedCustomTab$callback$1 = TrackedCustomTab.callback;
                d dVar = client.f1196a;
                g gVar = new g(trackedCustomTab$callback$1);
                try {
                    customTabsSession = !((b) dVar).k(gVar) ? null : new CustomTabsSession(dVar, gVar, client.f1197b);
                } catch (RemoteException unused) {
                }
                function1.invoke(customTabsSession);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                if (TrackedCustomTab.isAlive && token == TrackedCustomTab.launchToken) {
                    TrackedCustomTab.INSTANCE.close();
                }
            }
        };
        try {
            customTabsServiceConnection.setApplicationContext(application.getApplicationContext());
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(packageName)) {
                intent.setPackage(packageName);
            }
            zBindService = application.bindService(intent, customTabsServiceConnection, 33);
        } catch (SecurityException unused) {
            zBindService = false;
        }
        if (!zBindService) {
            customTabsServiceConnection = null;
        }
        serviceConnection = customTabsServiceConnection;
        if (!zBindService) {
            application = null;
        }
        boundApplication = application;
        return zBindService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        Function0<Unit> function0 = onClosed;
        release();
        closeHostTask();
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void closeHostTask() {
        WeakReference<CustomTabHostActivity> weakReference = hostActivity;
        CustomTabHostActivity customTabHostActivity = weakReference != null ? weakReference.get() : null;
        hostActivity = null;
        if (customTabHostActivity == null || customTabHostActivity.isFinishing() || customTabHostActivity.isDestroyed()) {
            return;
        }
        returnToCaller(customTabHostActivity);
        customTabHostActivity.finishFromTracker$chrome_custom_tabs_release();
        isHostExposed = false;
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$1(Function1 function1, Throwable th2) throws Throwable {
        if (th2 instanceof Error) {
            throw th2;
        }
        INSTANCE.release();
        function1.invoke(Boolean.FALSE);
        return Unit.f14616a;
    }

    private final void openPendingTab(final Activity activity) {
        final PendingLaunch pendingLaunch2 = pendingLaunch;
        if (pendingLaunch2 == null) {
            closeHostTask();
            return;
        }
        pendingLaunch = null;
        final int i7 = launchToken;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Function1<? super CustomTabsSession, Unit> function1 = new Function1() { // from class: com.discord.chrome_custom_tabs.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrackedCustomTab.openPendingTab$lambda$3(booleanRef, i7, activity, pendingLaunch2, (CustomTabsSession) obj);
            }
        };
        if (bindSession(activity, pendingLaunch2.getPackageName(), i7, function1)) {
            return;
        }
        function1.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openPendingTab$lambda$3(Ref.BooleanRef booleanRef, int i7, Activity activity, PendingLaunch pendingLaunch2, CustomTabsSession customTabsSession) {
        if (!booleanRef.element && i7 == launchToken) {
            booleanRef.element = true;
            hasSessionSignals = customTabsSession != null && INSTANCE.registerEngagementSignals(customTabsSession);
            INSTANCE.startCustomTab(activity, pendingLaunch2.getUri(), pendingLaunch2.getPackageName(), pendingLaunch2.getToolbarColor(), customTabsSession, i7, pendingLaunch2.getOnLaunched());
        }
        return Unit.f14616a;
    }

    @SuppressLint({"RequiresFeature"})
    private final boolean registerEngagementSignals(CustomTabsSession session) {
        try {
            Bundle bundle = new Bundle();
            session.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            try {
                g gVar = session.f1199b;
                d dVar = session.f1198a;
                if (!((b) dVar).j(gVar, bundle2)) {
                    return false;
                }
                TrackedCustomTab$engagementSignalsCallback$1 trackedCustomTab$engagementSignalsCallback$1 = engagementSignalsCallback;
                Bundle bundle3 = new Bundle();
                Bundle bundle4 = new Bundle();
                bundle4.putAll(bundle3);
                try {
                    return ((b) dVar).r(gVar, new m(trackedCustomTab$engagementSignalsCallback$1), bundle4);
                } catch (SecurityException e10) {
                    throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
                }
            } catch (SecurityException e11) {
                throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e11);
            }
        } catch (Exception unused) {
            return false;
        }
    }

    private final void release() {
        CustomTabsServiceConnection customTabsServiceConnection = serviceConnection;
        if (customTabsServiceConnection != null) {
            try {
                Application application = boundApplication;
                if (application != null) {
                    application.unbindService(customTabsServiceConnection);
                    Unit unit = Unit.f14616a;
                }
            } catch (IllegalArgumentException unused) {
                Unit unit2 = Unit.f14616a;
            }
        }
        serviceConnection = null;
        boundApplication = null;
        onClosed = null;
        pendingLaunch = null;
        launchToken++;
        isAlive = false;
        hasSessionSignals = false;
        isMinimized = false;
    }

    private final boolean returnToCaller(CustomTabHostActivity host) {
        ComponentName componentName = callerComponent;
        if (componentName == null) {
            return false;
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).addFlags(268435456).putExtra(EXTRA_NO_TASK_SNAPSHOT, true);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        try {
            host.startActivity(intentPutExtra);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void startCustomTab(Activity activity, Uri uri, String packageName, int toolbarColor, CustomTabsSession session, int token, Function1<? super Boolean, Unit> onLaunched) {
        int i7 = (-16777216) | toolbarColor;
        f fVar = new f(Integer.valueOf(i7), Integer.valueOf(toolbarColor), Integer.valueOf(i7), 6);
        Intrinsics.checkNotNullExpressionValue(fVar, "build(...)");
        r9.a aVar = new r9.a(session);
        aVar.f19218e = fVar.j0();
        ((Intent) aVar.f19215b).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        e eVarJ = aVar.j();
        Intrinsics.checkNotNullExpressionValue(eVarJ, "build(...)");
        Intent intent = (Intent) eVarJ.f7971e;
        intent.setPackage(packageName);
        try {
            intent.setData(uri);
            activity.startActivity(intent, (Bundle) eVarJ.f7972i);
            onLaunched.invoke(Boolean.TRUE);
        } catch (Exception unused) {
            if (token == launchToken) {
                release();
            }
            closeHostTask();
            onLaunched.invoke(Boolean.FALSE);
        }
    }

    public final boolean isTracking$chrome_custom_tabs_release() {
        return isAlive;
    }

    public final void launch(@NotNull Activity activity, @NotNull Uri uri, int toolbarColor, @NotNull Function1<? super Boolean, Unit> onLaunched, @NotNull Function0<Unit> onClosed2) {
        CustomTabHostActivity customTabHostActivity;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(onLaunched, "onLaunched");
        Intrinsics.checkNotNullParameter(onClosed2, "onClosed");
        String customTabsDefaultPackage = CustomTabsPackages.INSTANCE.getCustomTabsDefaultPackage(activity);
        if (customTabsDefaultPackage == null) {
            onLaunched.invoke(Boolean.FALSE);
            return;
        }
        release();
        onClosed = onClosed2;
        callerComponent = activity.getComponentName();
        isAlive = true;
        launchToken++;
        pendingLaunch = new PendingLaunch(uri, toolbarColor, customTabsDefaultPackage, onLaunched);
        WeakReference<CustomTabHostActivity> weakReference = hostActivity;
        if (weakReference == null || (customTabHostActivity = weakReference.get()) == null || customTabHostActivity.isFinishing() || customTabHostActivity.isDestroyed()) {
            customTabHostActivity = null;
        }
        if (customTabHostActivity != null) {
            openPendingTab(customTabHostActivity);
        } else {
            hostActivity = null;
            ActivityUtilities.startActivityAsyncWithFuture$default(ActivityUtilities.INSTANCE, activity, CustomTabHostActivity.INSTANCE.intent(activity), null, 4, null).exceptionally((Function) new com.discord.browser_manager.a(onLaunched, 1));
        }
    }

    public final void onHostConcealed$chrome_custom_tabs_release() {
        isHostExposed = false;
    }

    public final void onHostCreated$chrome_custom_tabs_release(@NotNull CustomTabHostActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        hostActivity = new WeakReference<>(activity);
        openPendingTab(activity);
    }

    public final void onHostDestroyed$chrome_custom_tabs_release(@NotNull CustomTabHostActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference<CustomTabHostActivity> weakReference = hostActivity;
        if ((weakReference != null ? weakReference.get() : null) != activity) {
            return;
        }
        hostActivity = null;
        if (isAlive) {
            close();
        }
    }

    public final void onHostExposed$chrome_custom_tabs_release() {
        CustomTabHostActivity customTabHostActivity;
        isHostExposed = true;
        WeakReference<CustomTabHostActivity> weakReference = hostActivity;
        if (weakReference == null || (customTabHostActivity = weakReference.get()) == null) {
            return;
        }
        if (customTabHostActivity.isFinishing() || customTabHostActivity.isDestroyed()) {
            customTabHostActivity = null;
        }
        if (customTabHostActivity == null) {
            return;
        }
        if (isAlive && !hasSessionSignals && !isMinimized) {
            close();
        } else if (isMinimized || !returnToCaller(customTabHostActivity)) {
            customTabHostActivity.moveTaskToBack(true);
        }
    }

    public final void onHostRebuilt$chrome_custom_tabs_release(@NotNull CustomTabHostActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        hostActivity = new WeakReference<>(activity);
    }

    public final boolean reattach(@NotNull Function0<Unit> onClosed2) {
        Intrinsics.checkNotNullParameter(onClosed2, "onClosed");
        if (!isAlive) {
            return false;
        }
        onClosed = onClosed2;
        return true;
    }
}
