package TP5;

public class MessageCoder {
    public static String encoder(String str){
        String result = str.replace("\\n", "(new_line)");
        result = result.replace("\\t", "(tab)");
        result = result.replace("\\\\", "(slash)");
        result = result.replace("//", "(comment_line)");
        result = result.replace(":)", "(comment_line)");
        System.out.println(result);
        return result;
    }
    public static String decoder(String str){
        String result = str.replace("(new_line)", "\\n");
        result = result.replace("(tab)", "\\t");
        result = result.replace("(slash)", "\\\\");
        result = result.replace("(comment_line)", "//");
        result = result.replace("(comment_line)", ":)");
        System.out.println(result);
        return result;
    }
}
