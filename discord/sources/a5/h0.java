package a5;

import com.android.billingclient.api.BillingResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BillingResult f190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BillingResult f191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BillingResult f192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BillingResult f193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BillingResult f194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BillingResult f195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BillingResult f196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BillingResult f197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BillingResult f198i;
    public static final BillingResult j;
    public static final BillingResult k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BillingResult f199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final BillingResult f200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BillingResult f201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final BillingResult f202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final BillingResult f203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BillingResult f204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final BillingResult f205r;

    static {
        g gVarA = BillingResult.a();
        gVarA.f184d = 3;
        gVarA.f186i = "Google Play In-app Billing API version is less than 3";
        gVarA.e();
        g gVarA2 = BillingResult.a();
        gVarA2.f184d = 3;
        gVarA2.f186i = "Google Play In-app Billing API version is less than 9";
        gVarA2.e();
        g gVarA3 = BillingResult.a();
        gVarA3.f184d = 3;
        gVarA3.f186i = "Billing service unavailable on device.";
        f190a = gVarA3.e();
        g gVarA4 = BillingResult.a();
        gVarA4.f184d = 2;
        gVarA4.f186i = "Billing service unavailable on device.";
        f191b = gVarA4.e();
        g gVarA5 = BillingResult.a();
        gVarA5.f184d = 5;
        gVarA5.f186i = "Client is already in the process of connecting to billing service.";
        f192c = gVarA5.e();
        g gVarA6 = BillingResult.a();
        gVarA6.f184d = 5;
        gVarA6.f186i = "The list of SKUs can't be empty.";
        gVarA6.e();
        g gVarA7 = BillingResult.a();
        gVarA7.f184d = 5;
        gVarA7.f186i = "SKU type can't be empty.";
        gVarA7.e();
        g gVarA8 = BillingResult.a();
        gVarA8.f184d = 5;
        gVarA8.f186i = "Product type can't be empty.";
        f193d = gVarA8.e();
        g gVarA9 = BillingResult.a();
        gVarA9.f184d = -2;
        gVarA9.f186i = "Client does not support extra params.";
        f194e = gVarA9.e();
        g gVarA10 = BillingResult.a();
        gVarA10.f184d = 5;
        gVarA10.f186i = "Invalid purchase token.";
        gVarA10.e();
        g gVarA11 = BillingResult.a();
        gVarA11.f184d = 6;
        gVarA11.f186i = "An internal error occurred.";
        f195f = gVarA11.e();
        g gVarA12 = BillingResult.a();
        gVarA12.f184d = 5;
        gVarA12.f186i = "SKU can't be null.";
        gVarA12.e();
        g gVarA13 = BillingResult.a();
        gVarA13.f184d = 0;
        f196g = gVarA13.e();
        g gVarA14 = BillingResult.a();
        gVarA14.f184d = -1;
        gVarA14.f186i = "Service connection is disconnected.";
        f197h = gVarA14.e();
        g gVarA15 = BillingResult.a();
        gVarA15.f184d = 2;
        gVarA15.f186i = "Timeout communicating with service.";
        f198i = gVarA15.e();
        g gVarA16 = BillingResult.a();
        gVarA16.f184d = -2;
        gVarA16.f186i = "Client does not support subscriptions.";
        j = gVarA16.e();
        g gVarA17 = BillingResult.a();
        gVarA17.f184d = -2;
        gVarA17.f186i = "Client does not support subscriptions update.";
        gVarA17.e();
        g gVarA18 = BillingResult.a();
        gVarA18.f184d = -2;
        gVarA18.f186i = "Client does not support get purchase history.";
        gVarA18.e();
        g gVarA19 = BillingResult.a();
        gVarA19.f184d = -2;
        gVarA19.f186i = "Client does not support price change confirmation.";
        gVarA19.e();
        g gVarA20 = BillingResult.a();
        gVarA20.f184d = -2;
        gVarA20.f186i = "Play Store version installed does not support cross selling products.";
        gVarA20.e();
        g gVarA21 = BillingResult.a();
        gVarA21.f184d = -2;
        gVarA21.f186i = "Client does not support multi-item purchases.";
        k = gVarA21.e();
        g gVarA22 = BillingResult.a();
        gVarA22.f184d = -2;
        gVarA22.f186i = "Client does not support offer_id_token.";
        f199l = gVarA22.e();
        g gVarA23 = BillingResult.a();
        gVarA23.f184d = -2;
        gVarA23.f186i = "Play Store version installed does not support gift code purchase.";
        f200m = gVarA23.e();
        g gVarA24 = BillingResult.a();
        gVarA24.f184d = -2;
        gVarA24.f186i = "Client does not support ProductDetails.";
        f201n = gVarA24.e();
        g gVarA25 = BillingResult.a();
        gVarA25.f184d = -2;
        gVarA25.f186i = "Client does not support launching subscription management action flow.";
        gVarA25.e();
        g gVarA26 = BillingResult.a();
        gVarA26.f184d = -2;
        gVarA26.f186i = "Client does not support in-app messages.";
        gVarA26.e();
        g gVarA27 = BillingResult.a();
        gVarA27.f184d = -2;
        gVarA27.f186i = "Client does not support user choice billing.";
        gVarA27.e();
        g gVarA28 = BillingResult.a();
        gVarA28.f184d = -2;
        gVarA28.f186i = "Play Store version installed does not support external offer.";
        gVarA28.e();
        g gVarA29 = BillingResult.a();
        gVarA29.f184d = -2;
        gVarA29.f186i = "Play Store version installed does not support multi-item purchases with season pass in one cart.";
        gVarA29.e();
        g gVarA30 = BillingResult.a();
        gVarA30.f184d = -2;
        gVarA30.f186i = "Play Store version installed does not support querying AutoPay plan purchase.";
        gVarA30.e();
        g gVarA31 = BillingResult.a();
        gVarA31.f184d = -2;
        gVarA31.f186i = "Play Store version installed does not support including suspended subscriptions.";
        gVarA31.e();
        g gVarA32 = BillingResult.a();
        gVarA32.f184d = 5;
        gVarA32.f186i = "Unknown feature";
        gVarA32.e();
        g gVarA33 = BillingResult.a();
        gVarA33.f184d = -2;
        gVarA33.f186i = "Play Store version installed does not support get billing config.";
        f202o = gVarA33.e();
        g gVarA34 = BillingResult.a();
        gVarA34.f184d = -2;
        gVarA34.f186i = "Query product details with serialized docid is not supported.";
        gVarA34.e();
        g gVarA35 = BillingResult.a();
        gVarA35.f184d = -2;
        gVarA35.f186i = "Play Store version installed does not support launching external offer flow.";
        gVarA35.e();
        g gVarA36 = BillingResult.a();
        gVarA36.f184d = 4;
        gVarA36.f186i = "Item is unavailable for purchase.";
        f203p = gVarA36.e();
        g gVarA37 = BillingResult.a();
        gVarA37.f184d = -2;
        gVarA37.f186i = "Query product details with developer specified account is not supported.";
        gVarA37.e();
        g gVarA38 = BillingResult.a();
        gVarA38.f184d = -2;
        gVarA38.f186i = "Play Store version installed does not support alternative billing only.";
        gVarA38.e();
        g gVarA39 = BillingResult.a();
        gVarA39.f184d = 5;
        gVarA39.f186i = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        f204q = gVarA39.e();
        g gVarA40 = BillingResult.a();
        gVarA40.f184d = 6;
        gVarA40.f186i = "An error occurred while retrieving billing override.";
        f205r = gVarA40.e();
        g gVarA41 = BillingResult.a();
        gVarA41.f184d = -2;
        gVarA41.f186i = "Play Store version installed does not support the provided billing program.";
        gVarA41.e();
        g gVarA42 = BillingResult.a();
        gVarA42.f184d = -2;
        gVarA42.f186i = "Play Store version installed does not support launching external links.";
        gVarA42.e();
        g gVarA43 = BillingResult.a();
        gVarA43.f184d = 5;
        gVarA43.f186i = "A DeveloperProvidedBillingListener must be provided when initializing the BillingClient in order to use multiple payment options for this billing program.";
        gVarA43.e();
        g gVarA44 = BillingResult.a();
        gVarA44.f184d = 5;
        gVarA44.f186i = "A listener must be provided calling this method.";
        gVarA44.e();
        g gVarA45 = BillingResult.a();
        gVarA45.f184d = -2;
        gVarA45.f186i = "Play Store version installed does not support show billing program information dialog.";
        gVarA45.e();
        g gVarA46 = BillingResult.a();
        gVarA46.f184d = -2;
        gVarA46.f186i = "Play Store version installed does not support get billing choice info.";
        gVarA46.e();
    }

    public static BillingResult a(int i7, String str) {
        g gVarA = BillingResult.a();
        gVarA.f184d = i7;
        gVarA.f186i = str;
        return gVarA.e();
    }
}
