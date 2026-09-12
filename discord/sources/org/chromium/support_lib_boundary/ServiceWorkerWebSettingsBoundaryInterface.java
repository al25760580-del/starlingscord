package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    void setAllowContentAccess(boolean z5);

    void setAllowFileAccess(boolean z5);

    void setBlockNetworkLoads(boolean z5);

    void setCacheMode(int i7);
}
