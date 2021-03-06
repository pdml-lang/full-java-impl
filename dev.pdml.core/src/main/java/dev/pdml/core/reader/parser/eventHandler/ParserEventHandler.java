package dev.pdml.core.reader.parser.eventHandler;

import dev.pdml.core.data.AST.attribute.ASTNodeAttributes;
import dev.pp.text.annotations.NotNull;
import dev.pp.text.token.TextToken;

public interface ParserEventHandler<N, R> {

    void onStart() throws Exception;
    void onEnd () throws Exception;

    @NotNull N onRootNodeStart ( @NotNull NodeStartEvent event ) throws Exception;
    void onRootNodeEnd ( @NotNull NodeEndEvent event, @NotNull N rootNode ) throws Exception;

    @NotNull N onNodeStart ( @NotNull NodeStartEvent event, @NotNull N parentNode ) throws Exception;
    void onNodeEnd ( @NotNull NodeEndEvent event, @NotNull N node ) throws Exception;

// TODO ?
//    void onNamespaces ( @NotNull Namespaces namespaces, @NotNull N parentNode ) throws Exception;

    void onAttributes ( @NotNull ASTNodeAttributes attributes, @NotNull N parentNode ) throws Exception;

    void onText ( @NotNull TextToken text, @NotNull N parentNode ) throws Exception;

    // [- and -] is included in comment
    void onComment ( @NotNull TextToken comment, @NotNull N parentNode ) throws Exception;

    @NotNull R getResult() throws Exception;
}
