package dev.pdml.core.reader.exception;

import dev.pp.text.annotations.NotNull;
import dev.pp.text.annotations.Nullable;
import dev.pp.text.reader.exception.TextReaderException;
import dev.pp.text.token.TextToken;

public class MalformedPXMLDocumentException extends TextReaderException {

//    private final PXMLReaderError error;

/*
    public MalformedPXMLDocumentException ( PXMLReaderError error ) {

//        super ( error.getId(), error.getMessage(), error.getLocation() );
        super ( error.getId(), error.getMessage(), error.getLocation(), null );

//        this.error = error;
    }
*/

    public MalformedPXMLDocumentException (
        @Nullable String id,
        @NotNull String message,
        @Nullable TextToken token ) {

        super ( id, message, token, null );
    }
/*
    public String toString() {

        return error.toString();
    }
*/
}
