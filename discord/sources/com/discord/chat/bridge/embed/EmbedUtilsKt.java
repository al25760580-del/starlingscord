package com.discord.chat.bridge.embed;

import com.discord.media_player.MediaSource;
import com.discord.media_player.MediaType;
import com.discord.primitives.ChannelId;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a)\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u0002H\u0002\u001a\f\u0010\u0019\u001a\u00020\u001a*\u00020\u0002H\u0002¨\u0006\u001b"}, d2 = {"getTag", "", "Lcom/discord/chat/bridge/embed/Embed;", "toImageMediaSources", "", "Lcom/discord/media_player/MediaSource;", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "toImageMediaSources-SHRpUJI", "(Lcom/discord/chat/bridge/embed/Embed;JLjava/lang/String;)Ljava/util/List;", "toMediaSource", "shouldAutoPlay", "", "portal", "", "toMediaSource-UBIQNlQ", "(Lcom/discord/chat/bridge/embed/Embed;JLjava/lang/String;ZLjava/lang/Double;)Lcom/discord/media_player/MediaSource;", "getTargetDimensions", "Lkotlin/Pair;", "", "isInlineMedia", "getMedia", "Lcom/discord/chat/bridge/embed/EmbedUrlProvider;", "getMediaType", "Lcom/discord/chat/bridge/embed/EmbedMediaType;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmbedUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbedUtils.kt\ncom/discord/chat/bridge/embed/EmbedUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1563#2:154\n1634#2,3:155\n1#3:158\n*S KotlinDebug\n*F\n+ 1 EmbedUtils.kt\ncom/discord/chat/bridge/embed/EmbedUtilsKt\n*L\n22#1:154\n22#1:155,3\n*E\n"})
public final class EmbedUtilsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EmbedMediaType.values().length];
            try {
                iArr[EmbedMediaType.GIFV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmbedMediaType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmbedMediaType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmbedMediaType.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EmbedType.values().length];
            try {
                iArr2[EmbedType.GIFV.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EmbedType.Image.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EmbedType.Video.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EmbedType.Link.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EmbedType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EmbedType.Article.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EmbedType.Rich.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EmbedType.Tweet.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final EmbedUrlProvider getMedia(Embed embed) {
        switch (WhenMappings.$EnumSwitchMapping$1[embed.getType().ordinal()]) {
            case 1:
            case 3:
                EmbedMedia video = embed.getVideo();
                return video != null ? video : embed.getThumbnail();
            case 2:
            case 8:
                EmbedMedia image = embed.getImage();
                return image != null ? image : embed.getThumbnail();
            case 4:
            case 5:
                return null;
            case 6:
            case 7:
                EmbedMedia video2 = embed.getVideo();
                if (video2 != null) {
                    return video2;
                }
                EmbedMedia image2 = embed.getImage();
                return image2 != null ? image2 : embed.getThumbnail();
            default:
                return embed.getImage();
        }
    }

    private static final EmbedMediaType getMediaType(Embed embed) {
        int i7 = WhenMappings.$EnumSwitchMapping$1[embed.getType().ordinal()];
        if (i7 == 1) {
            return EmbedMediaType.GIFV;
        }
        if (i7 == 3) {
            return EmbedMediaType.VIDEO;
        }
        if (i7 == 4 || i7 == 5) {
            return EmbedMediaType.NONE;
        }
        if (i7 != 6 && i7 != 7) {
            return embed.getImage() != null ? EmbedMediaType.IMAGE : EmbedMediaType.NONE;
        }
        if (embed.getVideo() != null) {
            return EmbedMediaType.VIDEO;
        }
        return embed.getImage() != null ? EmbedMediaType.IMAGE : EmbedMediaType.NONE;
    }

    @NotNull
    public static final String getTag(@NotNull Embed embed) {
        Intrinsics.checkNotNullParameter(embed, "<this>");
        return kk.b.k(embed.getClass().getSimpleName(), ": ", embed.getType().name());
    }

    @NotNull
    public static final Pair<Integer, Integer> getTargetDimensions(@NotNull Embed embed) {
        Intrinsics.checkNotNullParameter(embed, "<this>");
        int i7 = WhenMappings.$EnumSwitchMapping$0[getMediaType(embed).ordinal()];
        if (i7 == 1) {
            EmbedThumbnail thumbnail = embed.getThumbnail();
            Integer numValueOf = thumbnail != null ? Integer.valueOf(thumbnail.getWidth()) : null;
            EmbedThumbnail thumbnail2 = embed.getThumbnail();
            return new Pair<>(numValueOf, thumbnail2 != null ? Integer.valueOf(thumbnail2.getHeight()) : null);
        }
        if (i7 != 2) {
            if (i7 == 3) {
                EmbedMedia image = embed.getImage();
                return image != null ? new Pair<>(Integer.valueOf(image.getWidth()), Integer.valueOf(image.getHeight())) : new Pair<>(null, null);
            }
            if (i7 == 4) {
                return new Pair<>(null, null);
            }
            throw new n();
        }
        if (isInlineMedia(embed)) {
            EmbedMedia video = embed.getVideo();
            Integer numValueOf2 = video != null ? Integer.valueOf(video.getWidth()) : null;
            EmbedMedia video2 = embed.getVideo();
            return new Pair<>(numValueOf2, video2 != null ? Integer.valueOf(video2.getHeight()) : null);
        }
        if (embed.getVideo() != null) {
            return new Pair<>(Integer.valueOf(embed.getVideo().getWidth()), Integer.valueOf(embed.getVideo().getHeight()));
        }
        if (embed.getThumbnail() != null) {
            return new Pair<>(Integer.valueOf(embed.getThumbnail().getWidth()), Integer.valueOf(embed.getThumbnail().getHeight()));
        }
        EmbedMedia image2 = embed.getImage();
        Integer numValueOf3 = image2 != null ? Integer.valueOf(image2.getWidth()) : null;
        EmbedMedia image3 = embed.getImage();
        return new Pair<>(numValueOf3, image3 != null ? Integer.valueOf(image3.getHeight()) : null);
    }

    public static final boolean isInlineMedia(@NotNull Embed embed) {
        Intrinsics.checkNotNullParameter(embed, "<this>");
        if (getMedia(embed) == null && embed.getVideo() == null) {
            return false;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$1[embed.getType().ordinal()];
        if (i7 != 1) {
            return (i7 == 2 || i7 == 3) && embed.getAuthor() == null && embed.getTitle() == null;
        }
        return true;
    }

    /* JADX INFO: renamed from: toImageMediaSources-SHRpUJI, reason: not valid java name */
    public static final List<MediaSource> m420toImageMediaSourcesSHRpUJI(@NotNull Embed toImageMediaSources, long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(toImageMediaSources, "$this$toImageMediaSources");
        String messageId = str;
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        List<EmbedMedia> images = toImageMediaSources.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(e0.l(images, 10));
        for (Iterator it = images.iterator(); it.hasNext(); it = it) {
            EmbedMedia embedMedia = (EmbedMedia) it.next();
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new MediaSource(null, embedMedia.getEmbedUrl(), null, null, getTag(toImageMediaSources), MediaType.IMAGE, false, ChannelId.m1130boximpl(j), messageId, null, null, Boolean.valueOf(embedMedia.getSrcIsAnimated()), 1549, null));
            messageId = str;
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: toMediaSource-UBIQNlQ, reason: not valid java name */
    public static final MediaSource m421toMediaSourceUBIQNlQ(@NotNull Embed toMediaSource, long j, @NotNull String messageId, boolean z5, Double d6) {
        Object placeholderVersion;
        Intrinsics.checkNotNullParameter(toMediaSource, "$this$toMediaSource");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        int i7 = WhenMappings.$EnumSwitchMapping$0[getMediaType(toMediaSource).ordinal()];
        if (i7 == 1) {
            EmbedMedia video = toMediaSource.getVideo();
            String embedUrl = video != null ? video.getEmbedUrl() : null;
            EmbedThumbnail thumbnail = toMediaSource.getThumbnail();
            String embedUrl2 = thumbnail != null ? thumbnail.getEmbedUrl() : null;
            String tag = getTag(toMediaSource);
            MediaType mediaType = MediaType.GIFV;
            EmbedMedia video2 = toMediaSource.getVideo();
            String placeholder = video2 != null ? video2.getPlaceholder() : null;
            EmbedMedia video3 = toMediaSource.getVideo();
            placeholderVersion = video3 != null ? video3.getPlaceholderVersion() : null;
            EmbedThumbnail thumbnail2 = toMediaSource.getThumbnail();
            return new MediaSource(embedUrl, embedUrl2, placeholder, placeholderVersion, tag, mediaType, z5, ChannelId.m1130boximpl(j), messageId, null, d6, Boolean.valueOf(thumbnail2 != null ? thumbnail2.getSrcIsAnimated() : false), IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null);
        }
        if (i7 == 2) {
            EmbedMedia video4 = toMediaSource.getVideo();
            String proxyURL = video4 != null ? video4.getProxyURL() : null;
            EmbedThumbnail thumbnail3 = toMediaSource.getThumbnail();
            String embedUrl3 = thumbnail3 != null ? thumbnail3.getEmbedUrl() : null;
            String tag2 = getTag(toMediaSource);
            MediaType mediaType2 = MediaType.VIDEO;
            EmbedMedia video5 = toMediaSource.getVideo();
            String placeholder2 = video5 != null ? video5.getPlaceholder() : null;
            EmbedMedia video6 = toMediaSource.getVideo();
            placeholderVersion = video6 != null ? video6.getPlaceholderVersion() : null;
            EmbedThumbnail thumbnail4 = toMediaSource.getThumbnail();
            return new MediaSource(proxyURL, embedUrl3, placeholder2, placeholderVersion, tag2, mediaType2, false, ChannelId.m1130boximpl(j), messageId, null, d6, Boolean.valueOf(thumbnail4 != null ? thumbnail4.getSrcIsAnimated() : false), IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, null);
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return null;
            }
            throw new n();
        }
        EmbedMedia image = toMediaSource.getImage();
        String embedUrl4 = image != null ? image.getEmbedUrl() : null;
        String tag3 = getTag(toMediaSource);
        MediaType mediaType3 = MediaType.IMAGE;
        EmbedMedia image2 = toMediaSource.getImage();
        String placeholder3 = image2 != null ? image2.getPlaceholder() : null;
        EmbedMedia image3 = toMediaSource.getImage();
        Integer placeholderVersion2 = image3 != null ? image3.getPlaceholderVersion() : null;
        EmbedMedia image4 = toMediaSource.getImage();
        return new MediaSource(null, embedUrl4, placeholder3, placeholderVersion2, tag3, mediaType3, z5, ChannelId.m1130boximpl(j), messageId, null, null, image4 != null ? Boolean.valueOf(image4.getSrcIsAnimated()) : null, 1537, null);
    }
}
