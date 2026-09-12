package com.discord.media;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.discord.media.react.events.PhotoLibraryChangedEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/discord/media/PhotoLibraryHelperModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getName", "", "listener", "com/discord/media/PhotoLibraryHelperModule$listener$1", "Lcom/discord/media/PhotoLibraryHelperModule$listener$1;", "register", "", "unregister", "registerEventListener", "type", "addListener", "removeListeners", "count", "", "removeEventListener", "doesAttachmentExist", "uri", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPhotoLibraryHelperModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoLibraryHelperModule.kt\ncom/discord/media/PhotoLibraryHelperModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,107:1\n29#2:108\n*S KotlinDebug\n*F\n+ 1 PhotoLibraryHelperModule.kt\ncom/discord/media/PhotoLibraryHelperModule\n*L\n90#1:108\n*E\n"})
public final class PhotoLibraryHelperModule extends ReactContextBaseJavaModule {

    @NotNull
    public static final String PHOTO_LIBRARY_CHANGED = "photoLibraryChanged";

    @NotNull
    private final PhotoLibraryHelperModule$listener$1 listener;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.discord.media.PhotoLibraryHelperModule$listener$1] */
    public PhotoLibraryHelperModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(new Pair(PHOTO_LIBRARY_CHANGED, Reflection.getOrCreateKotlinClass(PhotoLibraryChangedEvent.class)));
        final Handler handler = new Handler(Looper.getMainLooper());
        this.listener = new ContentObserver(handler) { // from class: com.discord.media.PhotoLibraryHelperModule$listener$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                super.onChange(selfChange, uri);
                this.this$0.reactEvents.emitModuleEvent(this.this$0.reactContext, new PhotoLibraryChangedEvent());
            }
        };
    }

    private final void register() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.reactContext.getContentResolver().registerContentObserver(MediaStore.Files.getContentUri("external"), true, this.listener);
        } else {
            this.reactContext.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.listener);
            this.reactContext.getContentResolver().registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.listener);
        }
    }

    private final void unregister() {
        this.reactContext.getContentResolver().unregisterContentObserver(this.listener);
    }

    @ReactMethod
    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, PHOTO_LIBRARY_CHANGED)) {
            register();
        }
    }

    @ReactMethod
    public final void doesAttachmentExist(@NotNull String uri, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Cursor cursorQuery = this.reactContext.getContentResolver().query(Uri.parse(uri), new String[]{"_id"}, null, null, null, null);
        promise.resolve(Boolean.valueOf((cursorQuery != null ? cursorQuery.getCount() : 0) > 0));
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "PhotoLibraryHelper";
    }

    @ReactMethod
    public final void registerEventListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, PHOTO_LIBRARY_CHANGED)) {
            register();
        }
    }

    @ReactMethod
    public final void removeEventListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, PHOTO_LIBRARY_CHANGED)) {
            unregister();
        }
    }

    @ReactMethod
    public final void removeListeners(int count) {
        removeEventListener(PHOTO_LIBRARY_CHANGED);
    }
}
