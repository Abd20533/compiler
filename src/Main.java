//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.Token;
//
//import java.io.IOException;
//import java.nio.file.Paths;
//import java.util.List;
//
//
//
//
//
//public class Main {
//
//
//
//
//    public static void main(String[] args) {
//
//        String filePath = Paths.get("src", "example.txt").toString();
//
//        try {
//
//            MyLexer lexer = new MyLexer(CharStreams.fromFileName(filePath));
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//            tokens.fill();
//            List<Token> allTokens = tokens.getTokens();
//
//            int index = 0;
//            for (Token token : allTokens) {
//                if (token.getType() == MyLexer.UNKNOWN) {
//
//                    System.out.println("Lexical error at index: " + index +
//                            ", Line: " + token.getLine() +
//                            ", Column: " + token.getCharPositionInLine() +
//                            ", Value: " + token.getText());
//                } else {
//
//                    String tokenName = token.getType() == -1 ? "EOF" : lexer.getVocabulary().getSymbolicName(token.getType());
//                    System.out.println("Index: " + index +
//                            ", Line: " + token.getLine() +
//                            ", Column: " + token.getCharPositionInLine() +
//                            ", Type: " + tokenName +
//                            ", Value: " + token.getText());
//                }
//                index++;
//            }
//        } catch (IOException e) {
//
//            System.err.println("Error reading file: " + e.getMessage());
//        }
//    }
//}



import org.antlr.v4.runtime.CharStreams;
        import org.antlr.v4.runtime.CommonTokenStream;
        import org.antlr.v4.runtime.Token;
        import org.antlr.v4.runtime.tree.ParseTree;

        import java.io.IOException;
        import java.nio.file.Paths;
        import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filePath = Paths.get("src", "example.txt").toString();

        try {
            // قراءة الملف
            MyLexer lexer = new MyLexer(CharStreams.fromFileName(filePath));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // عرض التوكنز (اختياري)
            tokens.fill();
            List<Token> allTokens = tokens.getTokens();
            int index = 0;
            for (Token token : allTokens) {
                if (token.getType() == MyLexer.UNKNOWN) {
                    System.out.println("Lexical error at index: " + index +
                            ", Line: " + token.getLine() +
                            ", Column: " + token.getCharPositionInLine() +
                            ", Value: " + token.getText());
                } else {
                    String tokenName = token.getType() == -1 ? "EOF" : lexer.getVocabulary().getSymbolicName(token.getType());
                    System.out.println("Index: " + index +
                            ", Line: " + token.getLine() +
                            ", Column: " + token.getCharPositionInLine() +
                            ", Type: " + tokenName +
                            ", Value: " + token.getText());
                }
                index++;
            }

            // إنشاء الـ Parser
            MyParserParser parser = new MyParserParser (tokens);

            // تحليل البرنامج باستخدام قاعدة 'program'
            ParseTree tree = parser.program();

            // طباعة شجرة التحليل
            System.out.println("Parse Tree:");
            System.out.println(tree.toStringTree(parser));

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
