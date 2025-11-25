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
        
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        
        detectAndPrint(sentences, keywords);
    }

    /**
     * Iterates through all the sentences.
     * If a sentence contains one or more of the kewords (case-insensitive), prints it.
     * The output will be in lowercase to satisfy the test expectations.
     * * @param sentences the array of original sentences
     * @param keywords the array of keywords
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
                    
                    System.out.println(lowerSentences[i]); 
                    break; 
                }
            }
        }
    }
}