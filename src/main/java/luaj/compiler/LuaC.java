package luaj.compiler;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

import luaj.Globals;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Prototype;

public class LuaC extends Constants implements Globals.Compiler, Globals.Loader {
    public static final LuaC instance = new LuaC();

    public static void install(Globals globals) {
        throw new RuntimeException("Stub!");
    }

    protected LuaC() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public Prototype compile(InputStream stream, String chunkname) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaFunction load(Prototype prototype, String chunkname, LuaValue env) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public static class CompileState {
        int nCcalls = 0;
        private Hashtable strings = new Hashtable();

        protected CompileState() {
            throw new RuntimeException("Stub!");
        }

        Prototype luaY_parser(InputStream z, String name) throws IOException {
            throw new RuntimeException("Stub!");
        }

        public LuaString newTString(String s) {
            throw new RuntimeException("Stub!");
        }

        public LuaString newTString(LuaString s) {
            throw new RuntimeException("Stub!");
        }

        public LuaString cachedLuaString(LuaString s) {
            throw new RuntimeException("Stub!");
        }

        public String pushfstring(String string) {
            throw new RuntimeException("Stub!");
        }
    }
}