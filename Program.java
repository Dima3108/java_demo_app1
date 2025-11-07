import app1.*;

public class Program {
    static final int N = 2;

    public static void main(String[] args) {
        System.out.println("Hellow world!");

        TransDecorator[] transformers = new TransDecorator[7];
        for (int i = 0; i < transformers.length; i++) {
            switch (i % N) {
                case 0:
                    transformers[i] = new Transformer2() {

                    };
                    break;
                case 1:
                    transformers[i] = new Transformer3() {

                    };
                    break;
            }

        }
        for (int i = transformers.length - 1; i >= 1; i--) {
            transformers[i - 1].AddDecor(transformers[i]);
        }
        String inp_v = "12345HellowWorld";
        System.out.println(transformers[0].TransformValue(inp_v));

    }
}
