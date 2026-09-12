package r3;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(23, "VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(23, "OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(26, "SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(24, "DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(27, "START_SAFE_BROWSING", "START_SAFE_BROWSING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(27, "SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(27, "SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(27, "SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(27, "SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9(27, "SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10(24, "SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(24, "SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(24, "SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(24, "SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14(24, "SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF16(24, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF16(23, "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17(23, "RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18(24, "SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19(27, "SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF20(24, "WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21(23, "WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF22(23, "WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(27, "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF24(27, "SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25(27, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF26(23, "WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(23, "WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF28(23, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29(23, "CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF30(23, "POST_WEB_MESSAGE", "POST_WEB_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF32(23, "WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF32(26, "GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33(26, "GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF34(29, "GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF35(29, "WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF36(28, "TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37(29, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF38(-1, "PROXY_OVERRIDE", "PROXY_OVERRIDE:3"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39(-1, "SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF40(-1, "MULTI_PROCESS", "MULTI_PROCESS_QUERY"),
    f19190v(-1, "FORCE_DARK", "FORCE_DARK"),
    f19191w(-1, "FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF657(-1, "WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF672(-1, "DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19194e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19195i;

    c(int i7, String str, String str2) {
        this.f19193d = str;
        this.f19194e = str2;
        this.f19195i = i7;
    }

    public final boolean a() {
        HashSet hashSet = b.f19189a;
        String str = this.f19194e;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return hashSet.contains(sb2.toString());
    }
}
