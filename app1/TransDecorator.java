package app1;

public abstract class TransDecorator extends AbstractC {
    protected TransDecorator loc_dec = null;

    @Override
    public String TransformValue(String v) {
        String l = "";
        if (loc_dec != null) {
            l += loc_dec.TransformValue((v));
        }
        return "&" + locTransform(v) + l;
    }

    protected abstract String locTransform(String v);

    public void AddDecor(TransDecorator dec) {
        if (loc_dec == null) {
            loc_dec = dec;
        } else {
            loc_dec.AddDecor(dec);
        }
    }
}
