package luaj;

import android.ext.Message;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class LuaString extends LuaValue {
    static final int RECENT_STRINGS_CACHE_SIZE = 128;
    static final int RECENT_STRINGS_MAX_LENGTH = 32;
    private static final boolean[] numeral = new boolean[128];
    public static LuaValue s_metatable;
    public final byte[] m_bytes;
    public final int m_hashcode;
    public final int m_length;
    public final int m_offset;
    private LuaValue numValue;

    public static final class RecentShortStrings {
        static final LuaString[] recent_short_strings = new LuaString[128];

        private RecentShortStrings() {
            throw new RuntimeException("Stub!");
        }
    }

    public static LuaString valueOf(String string) {
        throw new RuntimeException("Stub!");
    }

    private static LuaString getSpecial(String string) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString rawValueOf(String string) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString valueOf(byte[] bytes, int off, int len) {
        throw new RuntimeException("Stub!");
    }

    private static LuaString valueFromCopy(byte[] bytes, int off, int len) {
        throw new RuntimeException("Stub!");
    }

    private static LuaString getSpecial(byte[] bytes, int off, int len) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString valueUsing(byte[] bytes, int off, int len) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString valueOf(char[] bytes) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString valueOf(char[] bytes, int off, int len) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString valueOf(byte[] bytes) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString valueUsing(byte[] bytes) {
        throw new RuntimeException("Stub!");
    }

    private LuaString(byte[] bytes, int offset, int length) {
        throw new RuntimeException("Stub!");
    }

    LuaString(byte[] bArr, int i, int i2, LuaString luaString) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isstring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue getmetatable() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int type() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String typename() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    private LuaValue getNum() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue neg() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue bnot() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue add(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue sub(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue mul(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue pow(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue div(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue idiv(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue mod(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue band(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue bor(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue bxor(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue shl(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue shr(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean lt_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean lteq_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean gt_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean gteq_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue concat(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue concatTo(LuaNumber lhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue concatTo(LuaString lhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int strcmp(LuaValue lhs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int strcmp(LuaString rhs) {
        throw new RuntimeException("Stub!");
    }

    private LuaValue checkarith() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int checkint() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaLong checkinteger() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public long checklong() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public double checkdouble() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaNumber checknumber() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaNumber checknumber(String msg) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isnumber() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isint() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean islong() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean islongnumber() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public byte tobyte() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public char tochar() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public double todouble() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public float tofloat() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int toint() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public long tolong() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public short toshort() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public double optdouble(double defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int optint(int defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaLong optinteger(LuaLong defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public long optlong(long defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaNumber optnumber(LuaNumber defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaString optstring(LuaString defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue tostring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String optjstring(String defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaString strvalue() {
        throw new RuntimeException("Stub!");
    }

    public LuaString substring(int beginIndex, int endIndex) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public static int hashCode(byte[] bytes, int offset, int length) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean eq_b(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean raweq(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean raweq(LuaString s) {
        throw new RuntimeException("Stub!");
    }

    public static boolean equals(LuaString a, int i, LuaString b, int j, int n) {
        throw new RuntimeException("Stub!");
    }

    private boolean byteseq(byte[] bytes, int off, int len) {
        throw new RuntimeException("Stub!");
    }

    public static boolean equals(byte[] a, int i, byte[] b, int j, int n) {
        throw new RuntimeException("Stub!");
    }

    public void write(DataOutputStream writer, int i, int len) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue len() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int length() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int rawlen() {
        throw new RuntimeException("Stub!");
    }

    public int luaByte(int index) {
        throw new RuntimeException("Stub!");
    }

    public int charAt(int index) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String checkjstring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaString checkstring() {
        throw new RuntimeException("Stub!");
    }

    public InputStream toInputStream() {
        throw new RuntimeException("Stub!");
    }

    public void copyInto(int strOffset, byte[] bytes, int arrayOffset, int len) {
        throw new RuntimeException("Stub!");
    }

    public int indexOfAny(LuaString accept) {
        throw new RuntimeException("Stub!");
    }

    public int indexOf(byte b, int start) {
        throw new RuntimeException("Stub!");
    }

    public int indexOf(LuaString s, int start) {
        throw new RuntimeException("Stub!");
    }

    public int lastIndexOf(LuaString s) {
        throw new RuntimeException("Stub!");
    }

    public static String decodeAsUtf8(byte[] bytes, int offset, int length) {
        throw new RuntimeException("Stub!");
    }

    public static int lengthAsUtf8(char[] chars) {
        throw new RuntimeException("Stub!");
    }

    public boolean isValidUtf8() {
        throw new RuntimeException("Stub!");
    }

    static {
        for (byte i = Message.CMD_CS_SET_TEMP_PATH; i <= 57; i = (byte) (i + 1)) {
            numeral[i] = true;
        }
        for (byte i2 = 65; i2 <= 70; i2 = (byte) (i2 + 1)) {
            numeral[i2] = true;
        }
        for (byte i3 = 97; i3 <= 102; i3 = (byte) (i3 + 1)) {
            numeral[i3] = true;
        }
        numeral[13] = true;
        numeral[10] = true;
        numeral[9] = true;
        numeral[32] = true;
        numeral[43] = true;
        numeral[45] = true;
        numeral[46] = true;
        numeral[80] = true;
        numeral[112] = true;
        numeral[88] = true;
        numeral[120] = true;
    }

    @Override
    public LuaValue tonumber() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue tonumber(int radix) {
        throw new RuntimeException("Stub!");
    }

    public LuaString makeDeprecated() {
        throw new RuntimeException("Stub!");
    }

    public static class DeprecatedLuaString extends LuaString {
        public DeprecatedLuaString(byte[] bytes, int offset, int length) {
            super(bytes, offset, length, null);
            throw new RuntimeException("Stub!");
        }

        @Override
        public boolean isDeprecated() {
            throw new RuntimeException("Stub!");
        }
    }
}