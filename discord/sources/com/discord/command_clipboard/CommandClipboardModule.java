package com.discord.command_clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import com.discord.codegen.NativeCommandClipboardModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"Lcom/discord/command_clipboard/CommandClipboardModule;", "Lcom/discord/codegen/NativeCommandClipboardModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "setItem", "", "item", "", "type", "text", "command_clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommandClipboardModule extends NativeCommandClipboardModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandClipboardModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeCommandClipboardModuleSpec
    public void setItem(String item, String type, String text) {
        ClipboardManager clipboardManager = (ClipboardManager) getReactApplicationContext().getApplicationContext().getSystemService(ClipboardManager.class);
        if (clipboardManager == null || item == null || type == null || text == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("data", item);
        intent.setType(type);
        ClipData clipData = new ClipData(text, new String[]{type}, new ClipData.Item(intent));
        clipData.addItem(new ClipData.Item(text));
        clipboardManager.setPrimaryClip(clipData);
    }
}
