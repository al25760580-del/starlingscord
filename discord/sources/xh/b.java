package xh;

import java.util.HashMap;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f22950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f22951b;

    static {
        HashMap map = new HashMap();
        f22950a = map;
        HashMap map2 = new HashMap();
        f22951b = map2;
        Integer numB = g.b(map, -1, "Standard Integrity API is not available.\nStandard Integrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure to be allowlisted to use Standard Integrity API.\n2) Make sure that Integrity API is enabled in Google Play Console.\n3) Ask the user to update Play Store.\n", -2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        Integer numB2 = g.b(map, -3, "Network error: unable to obtain integrity details.\nRecommended actions:\n1) Ask the user to check and enable their network connection.\n2) For a guided user experience to help the user establish a network connection, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n", -5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        Integer numB3 = g.b(map, -6, "Google Play Services is not available or version is too old.\nRecommended actions:\n1) Ask the user to install or update Play Services.\n2) For a guided user experience that helps the user to enable, install or update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n", -7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        Integer numB4 = g.b(map, -8, "The calling app has made too many requests to the API and has been throttled, or your app has exceeded its daily request quota.\nRetry with an exponential backoff. Request an increase to your daily request quota if you're at your daily request limit.\n", -9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        Integer numB5 = g.b(map, -12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", -14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        Integer numB6 = g.b(map, -15, "Play Services needs to be updated.\nRecommended actions:\n1) Ask the user to update Google Play Services.\n2) For a guided user experience that helps the user to update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n", -16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        Integer numB7 = g.b(map, -17, "The provided request hash is too long. The request hash length must be less than 500 bytes.\nRetry with a shorter request hash.", -18, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        Integer numB8 = g.b(map, -19, "The StandardIntegrityTokenProvider is invalid (e.g. it is outdated).\nRequest a new integrity token provider by calling StandardIntegrityManager#prepareIntegrityToken.", -100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        map2.put(-1, "API_NOT_AVAILABLE");
        map2.put(-3, "NETWORK_ERROR");
        map2.put(numB, "PLAY_STORE_NOT_FOUND");
        map2.put(numB5, "PLAY_STORE_VERSION_OUTDATED");
        map2.put(numB2, "APP_NOT_INSTALLED");
        map2.put(-6, "PLAY_SERVICES_NOT_FOUND");
        map2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        map2.put(numB3, "APP_UID_MISMATCH");
        map2.put(-8, "TOO_MANY_REQUESTS");
        map2.put(numB4, "CANNOT_BIND_TO_SERVICE");
        map2.put(numB6, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        map2.put(-17, "REQUEST_HASH_TOO_LONG");
        map2.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
        map2.put(numB7, "CLIENT_TRANSIENT_ERROR");
        map2.put(-19, "INTEGRITY_TOKEN_PROVIDER_INVALID");
        map2.put(numB8, "INTERNAL_ERROR");
    }
}
