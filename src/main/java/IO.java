package com.revol;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

@Platform(include="../../cpp/IO.h")
@Namespace("IO")
public class IO {

    public static class Socket extends Pointer {
        static { Loader.load(); }
        public Socket() { allocate(); }
        private native void allocate();

        public native int send(BytePointer data, int len);

        @Virtual public native int onReceive(BytePointer data, int len);
    }

}
