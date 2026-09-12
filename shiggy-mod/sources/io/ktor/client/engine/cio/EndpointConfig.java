package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: compiled from: CIOEngineConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lio/ktor/client/engine/cio/EndpointConfig;", "", "<init>", "()V", "", "maxConnectionsPerRoute", "I", "getMaxConnectionsPerRoute", "()I", "setMaxConnectionsPerRoute", "(I)V", "", "keepAliveTime", "J", "getKeepAliveTime", "()J", "setKeepAliveTime", "(J)V", "pipelineMaxSize", "getPipelineMaxSize", "setPipelineMaxSize", "connectTimeout", "getConnectTimeout", "setConnectTimeout", "socketTimeout", "getSocketTimeout", "setSocketTimeout", "connectAttempts", "getConnectAttempts", "setConnectAttempts", "", "allowHalfClose", "Z", "getAllowHalfClose", "()Z", "setAllowHalfClose", "(Z)V", "ktor-client-cio"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class EndpointConfig {
    private boolean allowHalfClose;
    private int maxConnectionsPerRoute = 100;
    private long keepAliveTime = 5000;
    private int pipelineMaxSize = 20;
    private long connectTimeout = 5000;
    private long socketTimeout = Long.MAX_VALUE;
    private int connectAttempts = 1;

    public final int getMaxConnectionsPerRoute() {
        return this.maxConnectionsPerRoute;
    }

    public final void setMaxConnectionsPerRoute(int i) {
        this.maxConnectionsPerRoute = i;
    }

    public final long getKeepAliveTime() {
        return this.keepAliveTime;
    }

    public final void setKeepAliveTime(long j) {
        this.keepAliveTime = j;
    }

    public final int getPipelineMaxSize() {
        return this.pipelineMaxSize;
    }

    public final void setPipelineMaxSize(int i) {
        this.pipelineMaxSize = i;
    }

    public final long getConnectTimeout() {
        return this.connectTimeout;
    }

    public final void setConnectTimeout(long j) {
        this.connectTimeout = j;
    }

    public final long getSocketTimeout() {
        return this.socketTimeout;
    }

    public final void setSocketTimeout(long j) {
        this.socketTimeout = j;
    }

    public final int getConnectAttempts() {
        return this.connectAttempts;
    }

    public final void setConnectAttempts(int i) {
        this.connectAttempts = i;
    }

    public final boolean getAllowHalfClose() {
        return this.allowHalfClose;
    }

    @Deprecated(message = "Half closed TCP connection is not supported by all servers, use it at your own risk.")
    public final void setAllowHalfClose(boolean z) {
        this.allowHalfClose = z;
    }
}
