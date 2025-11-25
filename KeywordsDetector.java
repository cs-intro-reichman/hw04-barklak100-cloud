public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant Paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        
        detectAndPrint(sentences, keywords);
    }

    /**
     * חוזר על כל המשפטים. אם משפט מכיל אחת או יותר ממילות המפתח (ללא תלות ברישיות), מדפיס אותו.
     * @param sentences מערך המשפטים המקורי
     * @param keywords מערך מילות המפתח המקורי
     */
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        String[] lowerSentences = new String[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            lowerSentences[i] = sentences[i].toLowerCase();
        }

        String[] lowerKeywords = new String[keywords.length];
        for (int i = 0; i < keywords.length; i++) {
            lowerKeywords[i] = keywords[i].toLowerCase();
        }

        
        for (int i = 0; i < lowerSentences.length; i++) {
            String lowerCaseSentence = lowerSentences[i];
            
            for (String lowerCaseKeyword : lowerKeywords) {

                if (lowerCaseSentence.contains(lowerCaseKeyword)) {
                    System.out.println(sentences[i]); 
                    break; 
                }
            }
        }
    }
}