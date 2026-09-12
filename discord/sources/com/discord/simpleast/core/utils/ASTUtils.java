package com.discord.simpleast.core.utils;

import com.discord.simpleast.core.node.Node;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ASTUtils {
    public static void traversePostOrder(Collection<? extends Node> collection, NodeProcessor nodeProcessor) {
        Iterator<? extends Node> it = collection.iterator();
        while (it.hasNext()) {
            traversePostOrderSubtree(it.next(), nodeProcessor);
        }
    }

    private static void traversePostOrderSubtree(Node node, NodeProcessor nodeProcessor) {
        if (node.hasChildren()) {
            Iterator it = node.getChildren().iterator();
            while (it.hasNext()) {
                traversePostOrderSubtree((Node) it.next(), nodeProcessor);
            }
        }
        nodeProcessor.processNode(node);
    }

    public static void traversePreOrder(Collection<? extends Node> collection, NodeProcessor nodeProcessor) {
        Iterator<? extends Node> it = collection.iterator();
        while (it.hasNext()) {
            traversePreOrderSubtree(it.next(), nodeProcessor);
        }
    }

    private static void traversePreOrderSubtree(Node node, NodeProcessor nodeProcessor) {
        nodeProcessor.processNode(node);
        if (node.hasChildren()) {
            Iterator it = node.getChildren().iterator();
            while (it.hasNext()) {
                traversePreOrderSubtree((Node) it.next(), nodeProcessor);
            }
        }
    }
}
