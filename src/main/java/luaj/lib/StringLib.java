package luaj.lib;

import java.nio.ByteBuffer;

import luaj.Buffer;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

public class StringLib extends TwoArgFunction {
    private static final int CAP_POSITION = -2;
    private static final int CAP_UNFINISHED = -1;
    private static final String FLAGS = "-+ #0";
    private static final byte Kchar = 4;
    private static final byte Kdouble = 9;
    private static final byte Kfloat = 3;
    private static final byte Kint = 1;
    private static final byte Klua = 10;
    private static final byte Knop = 0;
    private static final byte Kpaddalign = 8;
    private static final byte Kpadding = 7;
    private static final byte Kstring = 5;
    private static final byte Kuint = 2;
    private static final byte Kzstr = 6;
    private static final int L_ESC = 37;
    private static final byte MASK_ALPHA = 1;
    private static final byte MASK_CONTROL = 64;
    private static final byte MASK_DIGIT = 8;
    private static final byte MASK_HEXDIGIT = Byte.MIN_VALUE;
    private static final byte MASK_LOWERCASE = 2;
    private static final byte MASK_PUNCT = 16;
    private static final byte MASK_SPACE = 32;
    private static final byte MASK_UPPERCASE = 4;
    private static final int MAXCCALLS = 200;
    private static final int MAXINTSIZE = 8;
    private static final int MAX_CAPTURES = 32;
    private static final LuaString SPECIALS = valueOf("^$*+?.([%-");
    static final byte[] CHAR_TABLE = new byte[256];

    @Override
    public LuaValue call(LuaValue modname, LuaValue env) {
        throw new RuntimeException("Stub!");
    }

    static final class _byte extends VarArgFunction {
        _byte() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class _char extends VarArgFunction {
        _char() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class dump extends VarArgFunction {
        dump() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class find extends VarArgFunction {
        find() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class format extends VarArgFunction {
        format() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static void addquoted(Buffer buf, LuaString s) {
        throw new RuntimeException("Stub!");
    }

    static class FormatDesc {
        private static final int MAX_FLAGS = 5;
        private boolean alternateForm;
        public final int conversion;
        private boolean explicitPlus;
        private boolean leftAdjust;
        public final int length;
        int precision;
        private boolean space;
        public final String src;
        private int width;
        private boolean zeroPad;

        public FormatDesc(Varargs args, LuaString strfrmt, int start) {
            throw new RuntimeException("Stub!");
        }

        public void format(Buffer buf, byte c) {
            throw new RuntimeException("Stub!");
        }

        public void format(Buffer buf, long number) {
            throw new RuntimeException("Stub!");
        }

        public void format(Buffer buf, double x) {
            throw new RuntimeException("Stub!");
        }

        public void format(Buffer buf, LuaString s) {
            throw new RuntimeException("Stub!");
        }

        public static final void pad(Buffer buf, char c, int n) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class gmatch extends VarArgFunction {
        gmatch() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static class GMatchAux extends VarArgFunction {
        private final MatchState ms;
        private final int srclen;
        private int soffset = 0;
        private int lastmatch = -1;

        public GMatchAux(Varargs args, LuaString src, LuaString pat) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class gsub extends VarArgFunction {
        gsub() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class len extends OneArgFunction {
        len() {
        }

        @Override
        public LuaValue call(LuaValue arg) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class lower extends OneArgFunction {
        lower() {
        }

        @Override
        public LuaValue call(LuaValue arg) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class match extends VarArgFunction {
        match() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class rep extends VarArgFunction {
        rep() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class reverse extends OneArgFunction {
        reverse() {
        }

        @Override
        public LuaValue call(LuaValue arg) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class sub extends VarArgFunction {
        sub() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class upper extends OneArgFunction {
        upper() {
        }

        @Override
        public LuaValue call(LuaValue arg) {
            throw new RuntimeException("Stub!");
        }
    }

    static Varargs str_find_aux(Varargs args, boolean find2) {
        throw new RuntimeException("Stub!");
    }

    public static int posrelat(int pos, int len2) {
        throw new RuntimeException("Stub!");
    }

    public static class MatchState {
        final Varargs args;
        final LuaString p;
        final LuaString s;
        int level = 0;
        int[] cinit = new int[32];
        int[] clen = new int[32];
        int matchdepth = StringLib.MAXCCALLS;

        MatchState(Varargs args, LuaString s, LuaString pattern) {
            throw new RuntimeException("Stub!");
        }

        void reset() {
            throw new RuntimeException("Stub!");
        }

        private void add_s(Buffer lbuf, LuaString news, int soff, int e) {
            throw new RuntimeException("Stub!");
        }

        public void add_value(Buffer lbuf, int soffset, int end, LuaValue repl) {
            throw new RuntimeException("Stub!");
        }

        Varargs push_captures(boolean wholeMatch, int soff, int end) {
            throw new RuntimeException("Stub!");
        }

        private LuaValue push_onecapture(int i, int soff, int end) {
            throw new RuntimeException("Stub!");
        }

        private int check_capture(int l) {
            throw new RuntimeException("Stub!");
        }

        private int capture_to_close() {
            throw new RuntimeException("Stub!");
        }

        int classend(int poffset) {
            throw new RuntimeException("Stub!");
        }

        static boolean match_class(int c, int cl) {
            throw new RuntimeException("Stub!");
        }

        boolean matchbracketclass(int c, int poff, int ec) {
            throw new RuntimeException("Stub!");
        }

        boolean singlematch(int c, int poff, int ep) {
            throw new RuntimeException("Stub!");
        }

        int match(int soffset, int poffset) {
            throw new RuntimeException("Stub!");
        }

        int max_expand(int soff, int poff, int ep) {
            throw new RuntimeException("Stub!");
        }

        int min_expand(int soff, int poff, int ep) {
            throw new RuntimeException("Stub!");
        }

        int start_capture(int soff, int poff, int what) {
            throw new RuntimeException("Stub!");
        }

        int end_capture(int soff, int poff) {
            throw new RuntimeException("Stub!");
        }

        int match_capture(int soff, int l) {
            throw new RuntimeException("Stub!");
        }

        int matchbalance(int soff, int poff) {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class PackState {
        final String fmt;
        final byte size_t;
        boolean islittle = true;
        int maxalign = 1;
        int pos = 0;
        char last = 0;
        int align = 0;
        int ntoalign = 0;
        int size = 0;
        final byte[] buff = new byte[8];
        final ByteBuffer byteBuffer = ByteBuffer.wrap(this.buff);

        public PackState(String fmt) {
            throw new RuntimeException("Stub!");
        }

        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }

    static int getnum(PackState state, int df, boolean limit) {
        throw new RuntimeException("Stub!");
    }

    static byte getoption(PackState state) {
        throw new RuntimeException("Stub!");
    }

    static byte getdetails(PackState state, int totalsize) {
        throw new RuntimeException("Stub!");
    }

    static void packint(PackState state, Buffer b, long n) {
        throw new RuntimeException("Stub!");
    }

    static final class pack extends VarArgFunction {
        pack() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static final class packsize extends VarArgFunction {
        packsize() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static long unpackint(PackState state, LuaString str, int pos, boolean issigned) {
        throw new RuntimeException("Stub!");
    }

    static final class unpack extends VarArgFunction {
        unpack() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    public static void main(String[] args) throws Throwable {
    }
}