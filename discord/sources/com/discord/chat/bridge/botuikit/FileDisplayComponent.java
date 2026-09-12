package com.discord.chat.bridge.botuikit;

import a3.e;
import com.discord.chat.bridge.media.UnfurledMediaItem;
import com.discord.chat.bridge.media.UnfurledMediaItem$$serializer;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.a1;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0002;<BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010By\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u000f\u0010\u0017J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J[\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0004HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006="}, d2 = {"Lcom/discord/chat/bridge/botuikit/FileDisplayComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "type", "", StackTraceHelper.ID_KEY, "", "file", "Lcom/discord/chat/bridge/media/UnfurledMediaItem;", StackTraceHelper.NAME_KEY, "size", "isSuspiciousDownload", "", "isSpoiler", "spoilerDescription", "<init>", "(ILjava/lang/String;Lcom/discord/chat/bridge/media/UnfurledMediaItem;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "seen0", "spoilerOrNull", "obscureOrNull", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lcom/discord/chat/bridge/media/UnfurledMediaItem;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Void;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()I", "getId", "()Ljava/lang/String;", "getFile", "()Lcom/discord/chat/bridge/media/UnfurledMediaItem;", "getName", "getSize", "()Z", "getSpoilerDescription", "getSpoilerOrNull", "getObscureOrNull", "()Ljava/lang/Void;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileDisplayComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDisplayComponent.kt\ncom/discord/chat/bridge/botuikit/FileDisplayComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final /* data */ class FileDisplayComponent extends Component implements SpoilerableData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final UnfurledMediaItem file;

    @NotNull
    private final String id;
    private final boolean isSpoiler;
    private final boolean isSuspiciousDownload;

    @NotNull
    private final String name;
    private final Void obscureOrNull;

    @NotNull
    private final String size;
    private final String spoilerDescription;
    private final String spoilerOrNull;
    private final int type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/FileDisplayComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/FileDisplayComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return FileDisplayComponent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileDisplayComponent(int i7, int i10, String str, UnfurledMediaItem unfurledMediaItem, String str2, String str3, boolean z5, boolean z6, String str4, String str5, Void r13, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (223 != (i7 & 223)) {
            e1.l(i7, 223, FileDisplayComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = i10;
        this.id = str;
        this.file = unfurledMediaItem;
        this.name = str2;
        this.size = str3;
        if ((i7 & 32) == 0) {
            this.isSuspiciousDownload = false;
        } else {
            this.isSuspiciousDownload = z5;
        }
        this.isSpoiler = z6;
        this.spoilerDescription = str4;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.spoilerOrNull = str4 == null || StringsKt.K(str4) ? null : str4;
        } else {
            this.spoilerOrNull = str5;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.obscureOrNull = null;
        } else {
            this.obscureOrNull = r13;
        }
    }

    public static /* synthetic */ FileDisplayComponent copy$default(FileDisplayComponent fileDisplayComponent, int i7, String str, UnfurledMediaItem unfurledMediaItem, String str2, String str3, boolean z5, boolean z6, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = fileDisplayComponent.type;
        }
        if ((i10 & 2) != 0) {
            str = fileDisplayComponent.id;
        }
        if ((i10 & 4) != 0) {
            unfurledMediaItem = fileDisplayComponent.file;
        }
        if ((i10 & 8) != 0) {
            str2 = fileDisplayComponent.name;
        }
        if ((i10 & 16) != 0) {
            str3 = fileDisplayComponent.size;
        }
        if ((i10 & 32) != 0) {
            z5 = fileDisplayComponent.isSuspiciousDownload;
        }
        if ((i10 & 64) != 0) {
            z6 = fileDisplayComponent.isSpoiler;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str4 = fileDisplayComponent.spoilerDescription;
        }
        boolean z7 = z6;
        String str5 = str4;
        String str6 = str3;
        boolean z10 = z5;
        return fileDisplayComponent.copy(i7, str, unfurledMediaItem, str2, str6, z10, z7, str5);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    public static final /* synthetic */ void write$Self$chat_release(FileDisplayComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getType(), serialDesc);
        output.q(serialDesc, 1, self.getId());
        output.g(serialDesc, 2, UnfurledMediaItem$$serializer.INSTANCE, self.file);
        output.q(serialDesc, 3, self.name);
        output.q(serialDesc, 4, self.size);
        if (output.u(serialDesc, 5) || self.isSuspiciousDownload) {
            output.p(serialDesc, 5, self.isSuspiciousDownload);
        }
        output.p(serialDesc, 6, self.isSpoiler);
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 7, s1Var, self.spoilerDescription);
        if (output.u(serialDesc, 8)) {
            output.r(serialDesc, 8, s1Var, self.getSpoilerOrNull());
        } else {
            String spoilerOrNull = self.getSpoilerOrNull();
            String str = self.spoilerDescription;
            if (str == null || StringsKt.K(str)) {
                str = null;
            }
            if (!Intrinsics.areEqual(spoilerOrNull, str)) {
                output.r(serialDesc, 8, s1Var, self.getSpoilerOrNull());
            }
        }
        if (!output.u(serialDesc, 9) && self.getObscureOrNull() == null) {
            return;
        }
        output.r(serialDesc, 9, a1.f17502a, self.getObscureOrNull());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UnfurledMediaItem getFile() {
        return this.file;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSuspiciousDownload() {
        return this.isSuspiciousDownload;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSpoiler() {
        return this.isSpoiler;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSpoilerDescription() {
        return this.spoilerDescription;
    }

    @NotNull
    public final FileDisplayComponent copy(int type, @NotNull String id2, @NotNull UnfurledMediaItem file, @NotNull String name, @NotNull String size, boolean isSuspiciousDownload, boolean isSpoiler, String spoilerDescription) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(size, "size");
        return new FileDisplayComponent(type, id2, file, name, size, isSuspiciousDownload, isSpoiler, spoilerDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileDisplayComponent)) {
            return false;
        }
        FileDisplayComponent fileDisplayComponent = (FileDisplayComponent) other;
        return this.type == fileDisplayComponent.type && Intrinsics.areEqual(this.id, fileDisplayComponent.id) && Intrinsics.areEqual(this.file, fileDisplayComponent.file) && Intrinsics.areEqual(this.name, fileDisplayComponent.name) && Intrinsics.areEqual(this.size, fileDisplayComponent.size) && this.isSuspiciousDownload == fileDisplayComponent.isSuspiciousDownload && this.isSpoiler == fileDisplayComponent.isSpoiler && Intrinsics.areEqual(this.spoilerDescription, fileDisplayComponent.spoilerDescription);
    }

    @NotNull
    public final UnfurledMediaItem getFile() {
        return this.file;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public /* bridge */ /* synthetic */ String getObscureOrNull() {
        return (String) getObscureOrNull();
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    public final String getSpoilerDescription() {
        return this.spoilerDescription;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int iG = a.g(a.g(e.d(e.d((this.file.hashCode() + e.d(Integer.hashCode(this.type) * 31, 31, this.id)) * 31, 31, this.name), 31, this.size), 31, this.isSuspiciousDownload), 31, this.isSpoiler);
        String str = this.spoilerDescription;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSpoiler() {
        return this.isSpoiler;
    }

    public final boolean isSuspiciousDownload() {
        return this.isSuspiciousDownload;
    }

    @NotNull
    public String toString() {
        int i7 = this.type;
        String str = this.id;
        UnfurledMediaItem unfurledMediaItem = this.file;
        String str2 = this.name;
        String str3 = this.size;
        boolean z5 = this.isSuspiciousDownload;
        boolean z6 = this.isSpoiler;
        String str4 = this.spoilerDescription;
        StringBuilder sbO = a.o("FileDisplayComponent(type=", ", id=", str, i7, ", file=");
        sbO.append(unfurledMediaItem);
        sbO.append(", name=");
        sbO.append(str2);
        sbO.append(", size=");
        sbO.append(str3);
        sbO.append(", isSuspiciousDownload=");
        sbO.append(z5);
        sbO.append(", isSpoiler=");
        sbO.append(z6);
        sbO.append(", spoilerDescription=");
        sbO.append(str4);
        sbO.append(")");
        return sbO.toString();
    }

    public Void getObscureOrNull() {
        return this.obscureOrNull;
    }

    public /* synthetic */ FileDisplayComponent(int i7, String str, UnfurledMediaItem unfurledMediaItem, String str2, String str3, boolean z5, boolean z6, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, unfurledMediaItem, str2, str3, (i10 & 32) != 0 ? false : z5, z6, str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDisplayComponent(int i7, @NotNull String id2, @NotNull UnfurledMediaItem file, @NotNull String name, @NotNull String size, boolean z5, boolean z6, String str) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(size, "size");
        this.type = i7;
        this.id = id2;
        this.file = file;
        this.name = name;
        this.size = size;
        this.isSuspiciousDownload = z5;
        this.isSpoiler = z6;
        this.spoilerDescription = str;
        this.spoilerOrNull = str == null || StringsKt.K(str) ? null : str;
    }
}
