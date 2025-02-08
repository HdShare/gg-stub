package luaj;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;

import luaj.lib.BaseLib;
import luaj.lib.DebugLib;
import luaj.lib.PackageLib;
import luaj.lib.ResourceFinder;

public class Globals extends LuaTable {
    private static final int MAX_OPEN_FILES = 1024;
    private static final long MAX_WRITE_BYTES = 1073741824;
    public BaseLib baselib;
    public Compiler compiler;
    public DebugLib debuglib;
    public ResourceFinder finder;
    public Loader loader;
    public PackageLib package_;
    public Undumper undumper;
    public boolean fullVersion = true;
    public int openFiles = 0;
    private String lastFile = null;
    public long writeBytes = 0;
    public int logMillis = 0;
    public PrintStream STDOUT = System.out;
    public PrintStream STDERR = System.err;
    public LuaThread running = new LuaThread(this);
    private String workDir = null;

    public interface Compiler {
        Prototype compile(InputStream inputStream, String str) throws IOException;
    }

    public interface Loader {
        LuaFunction load(Prototype prototype, String str, LuaValue luaValue) throws IOException;
    }

    public interface Undumper {
        Prototype undump(InputStream inputStream, String str) throws IOException;
    }

    public void addOpenFiles(String filename) {
        throw new RuntimeException("Stub!");
    }

    public void addWriteBytes(long writeBytes) {
        throw new RuntimeException("Stub!");
    }

    public static Globals initTest() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public Globals checkglobals() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue loadfile(String filename) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue load(InputStream is, String chunkname, String mode, LuaValue environment) {
        throw new RuntimeException("Stub!");
    }

    public Prototype loadPrototype(InputStream is, String chunkname, String mode) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public Prototype compilePrototype(InputStream stream, String chunkname) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public static class PbInputStream extends PushbackInputStream {
        static final int SIZE = Print.HEADER.length() + 4;
        boolean skipBOM;

        static PbInputStream wrap(InputStream is) {
            throw new RuntimeException("Stub!");
        }

        private PbInputStream(InputStream in) {
            super(in, SIZE);
            throw new RuntimeException("Stub!");
        }

        @Override
        public int read() throws IOException {
            throw new RuntimeException("Stub!");
        }

        public PbInputStream setSkipBOM(boolean skipBOM) {
            throw new RuntimeException("Stub!");
        }
    }

    public void setWorkDir(String dir) {
        throw new RuntimeException("Stub!");
    }

    public File newFile(String filename) {
        throw new RuntimeException("Stub!");
    }
}