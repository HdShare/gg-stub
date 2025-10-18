package luaj.lib;

import luaj.LuaError;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

public class Utf8Lib extends TwoArgFunction {
    private static final int ERROR = 5;
    private static final int MAXUNICODE = 1114111;
    private static final int SHIFT = 28;

    @Override
    public LuaValue call(LuaValue modname, LuaValue env) {
        throw new RuntimeException("Stub!");
    }

    static int getCodePoint(byte[] bytes, int offset2, int len2) {
        throw new RuntimeException("Stub!");
    }

    static final class _char extends VarArgFunction {
        _char() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class codes extends VarArgFunction {
        codes() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static class CodesAux extends VarArgFunction {
        private int offset = 0;
        private final LuaString str;

        public CodesAux(LuaString src) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static LuaError invalidUtf(int at) {
        throw new RuntimeException("Stub!");
    }

    static void out(String name, int n, int val, int len2) {
        throw new RuntimeException("Stub!");
    }

    static void badFinal(String name, int n, int val, int len2) {
        throw new RuntimeException("Stub!");
    }

    static final class codepoint extends VarArgFunction {
        codepoint() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class len extends VarArgFunction {
        len() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class offset extends VarArgFunction {
        offset() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    public static void main(String[] args) throws Throwable {
    }
}