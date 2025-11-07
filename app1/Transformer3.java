package app1;

public class Transformer3 extends TransDecorator {
    @Override
    protected String locTransform(String v) {
        char[] tmp = new char[v.length()];
        v.getChars(0, v.length(), tmp, 0);
        char[] tmp2 = new char[tmp.length];
        int _pos = 0;
        for (int i = 0; i < tmp.length / 2; i++) {
            int ind1 = i, ind2 = ((int) (tmp.length / 2)) + i;
            if (ind2 < tmp.length) {
                tmp2[ind2] = tmp[_pos++];
            }
            tmp2[ind1] = tmp[_pos++];

        }
        String r = "";
        for (int h = 0; h < tmp2.length; h++) {
            r += tmp2[h];
        }
        return r;
    }
}
