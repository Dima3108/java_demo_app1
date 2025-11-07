package app1;

public class Transformer2 extends TransDecorator {
    @Override
    protected String locTransform(String v) {
        if (v.length() <= 1) {
            return "#" + v;
        }
        String e = v.substring(0, 1);
        String h = v.substring(v.length() - 2, v.length() - 1);
        return h + e + v;
    }

    /*
     * @Override
     * public String TransformValue(String v) {
     * return super.TransformValue((v));
     * }
     */

    /*
     * public void AddDecor(TransDecorator dec) {
     * super.AddDecor(dec);
     * }
     */

    public Transformer2() {
        loc_dec = null;
    }
}
