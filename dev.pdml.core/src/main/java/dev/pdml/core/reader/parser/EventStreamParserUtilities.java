package dev.pdml.core.reader.parser;

import dev.pdml.core.data.AST.ASTNode;
import dev.pdml.core.data.formalNode.FormalNodes;
import dev.pp.text.annotations.NotNull;
import dev.pp.text.annotations.Nullable;
import dev.pp.text.error.handler.TextErrorHandler;

import java.io.File;

public class EventStreamParserUtilities {

/*
    public static void logPXMLFileParseEventsToOSOut ( File PXMLFile ) throws Exception {
        logPXMLParserEvents ( new FileReader( PXMLFile ), new PrintWriter( System.out ), PXMLFile.toString() );
    }

    public static void measureParseTimeForPXMLFile ( File PXMLFile ) throws Exception {
        measureParseTime ( new FileReader( PXMLFile ), PXMLFile.toString() );
    }

    public static void logPXMLParserEvents ( Reader PXMLReader, Writer logWriter, Object PXMLResource ) throws Exception {

        DefaultEventStreamParser<String, String> parser = new DefaultEventStreamParser<>();
        ParserEventsHandler<String, String> eventHandler = new Logger_ParserEventHandler( logWriter );
        parser.parseReader ( PXMLReader, PXMLResource, eventHandler, null );
    }

    public static void measureParseTime ( Reader PXMLReader, Object PXMLResource ) throws Exception {

        DefaultEventStreamParser<PXMLNode, String> parser = new DefaultEventStreamParser<>();
        ParserEventsHandler<PXMLNode, String> eventHandler = new Timer_ParserEventHandler();
        parser.parseReader ( PXMLReader, PXMLResource, eventHandler, null );
    }

 */
}
