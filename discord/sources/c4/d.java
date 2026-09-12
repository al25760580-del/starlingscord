package c4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.u;
import fh.s;
import je.e0;
import je.t;
import kotlin.jvm.internal.Intrinsics;
import th.n;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3451b;

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((u) this.f3451b).f6622i.f6532b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f3450a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                a aVar = (a) this.f3451b;
                switch (aVar.f3447g) {
                    case 0:
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        String action = intent.getAction();
                        if (action != null) {
                            q.d().a(b.f3448a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        aVar.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        aVar.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        if (intent.getAction() != null) {
                            q.d().a(c.f3449a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        aVar.b(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.b(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        if (intent.getAction() != null) {
                            q.d().a(k.f3464a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        aVar.b(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.b(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            case 1:
                u uVar = (u) this.f3451b;
                if (uVar != null && uVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    u uVar2 = (u) this.f3451b;
                    uVar2.f6622i.getClass();
                    FirebaseMessaging.b(uVar2, 0L);
                    ((u) this.f3451b).f6622i.f6532b.unregisterReceiver(this);
                    this.f3451b = null;
                }
                break;
            case 2:
                ((s) this.f3451b).j();
                break;
            case 3:
                if (!isInitialStickyBroadcast()) {
                    ic.j.a((ic.j) this.f3451b, ic.f.b(context, intent));
                }
                break;
            case 4:
                je.u uVar3 = (je.u) this.f3451b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i7 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i7 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i7 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i7 = 4;
                                        break;
                                    case 13:
                                        i7 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i7 = 6;
                                        break;
                                    case 18:
                                        i7 = 2;
                                        break;
                                    case 20:
                                        if (e0.f13788a >= 29) {
                                            i7 = 9;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i7 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i7 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i7 = 4;
                                        break;
                                    case 13:
                                        i7 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i7 = 6;
                                        break;
                                    case 18:
                                        i7 = 2;
                                        break;
                                    case 20:
                                        if (e0.f13788a >= 29) {
                                            i7 = 9;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i7 = type != 9 ? 8 : 7;
                            } else {
                                i7 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (e0.f13788a >= 31 && i7 == 5) {
                    t.a(context, uVar3);
                } else {
                    je.u.a(uVar3, i7);
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                Parcelable parcelableExtra = intent.getParcelableExtra("newConfig");
                Intrinsics.checkNotNull(parcelableExtra);
                int i10 = ((Configuration) parcelableExtra).orientation;
                ReactContext reactContext = ((qb.b) this.f3451b).f18680d;
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                if (reactContext.hasActiveReactInstance()) {
                    String str = i10 == 1 ? "PORTRAIT" : "LANDSCAPE";
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("orientation", str);
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
                }
                break;
            default:
                ((n) this.f3451b).b(intent);
                break;
        }
    }

    public /* synthetic */ d(int i7, Object obj) {
        this.f3450a = i7;
        this.f3451b = obj;
    }
}
